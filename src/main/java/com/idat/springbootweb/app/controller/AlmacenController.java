package com.idat.springbootweb.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.idat.springbootweb.app.entity.Almacen;
import com.idat.springbootweb.app.entity.DetalleAlmacen;
import com.idat.springbootweb.app.entity.Usuario;
import com.idat.springbootweb.app.service.IAlmacenService;
import com.idat.springbootweb.app.service.IDetalleAlmacenService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api") @CrossOrigin(origins = {"http://localhost:4200"})
public class AlmacenController {
    @Autowired
    private IDetalleAlmacenService repository;
    @Autowired
    private IAlmacenService almacenDao;
    @GetMapping("/almacen")
    public List<DetalleAlmacen> getAlmacenes(){
        return repository.listarDetVenta();
    }
    
    @GetMapping("/almacen/productos/nombre/{nombre}")
	public List<DetalleAlmacen> buscar_username(@PathVariable String nombre){
    	Almacen almacenBuscado =  almacenDao.buscar_x_nombre(nombre);
		return repository.buscar_x_nombre(almacenBuscado.getId());
	}
    @CrossOrigin(origins = {"http://localhost:4200"})
	@PutMapping("/almacen/{nombre_almacen}/{id_producto}")
	public DetalleAlmacen actualizar(@RequestBody DetalleAlmacen usuario,@PathVariable String nombre_almacen,@PathVariable Long id_producto){
    	Almacen almacenBuscado =  almacenDao.buscar_x_nombre(nombre_almacen);
    	DetalleAlmacen det= repository.actualizarDetVenta(almacenBuscado.getId(),id_producto);
    	det.setCantidad(usuario.getCantidad());
    	return repository.crearDetVenta(det);
	}
    /*
    @GetMapping("/{id}")
    public ResponseEntity<Almacen> getById(@PathVariable int id){
        Almacen almacen = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe el almacen con el ID: " + id));
        return ResponseEntity.ok(almacen);
    }
    @PostMapping
    public Almacen saveAlmacen(@RequestBody Almacen almacen){
        return repository.save(almacen);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Almacen> updateAlmacen(@PathVariable int id, @RequestBody Almacen n_almacen){
        Almacen almacen = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe el almacen con el ID : " + id));
        almacen.setNombre(n_almacen.getNombre());
        almacen.setUbicacion(n_almacen.getUbicacion());
        almacen.setEstado(n_almacen.isEstado());
        return ResponseEntity.ok(repository.save(almacen));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarAlmacen(@PathVariable int id){
        Almacen almacen = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el almacen con el ID : " + id));
        repository.delete(almacen);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
    */
}
