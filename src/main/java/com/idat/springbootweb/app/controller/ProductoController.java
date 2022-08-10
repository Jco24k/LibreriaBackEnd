package com.idat.springbootweb.app.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.springbootweb.app.entity.Almacen;
import com.idat.springbootweb.app.entity.Producto;
import com.idat.springbootweb.app.service.IAlmacenService;
import com.idat.springbootweb.app.service.IProductoService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = {"http://localhost:4200"})
@Slf4j
@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	private IProductoService productoDao;
    @Autowired
    private IAlmacenService almacenDao;
	
	@GetMapping("/productos")
	public List<Producto> index(){
		return productoDao.listarProducto();
	}
	
	@GetMapping("/productos/{id}")
	public Producto buscar(@PathVariable Long id){
		return productoDao.editarProducto(id);
	}
	@GetMapping("/productos/nombre/{marca}")
	public List<Producto> buscar_nombre(@PathVariable String marca){
		return productoDao.buscar_x_marca(marca);
	}
	
	@GetMapping("/productos/almacen/{nombre}")
	public List<Producto> buscar_almacen(@PathVariable String nombre){
		Almacen almacenBuscado =  almacenDao.buscar_x_nombre(nombre);
		return productoDao.buscar_x_almacen(almacenBuscado.getId());
	}
	@CrossOrigin(origins = {"http://localhost:4200"})
	@PutMapping("/productos/{id}")
	public Producto actualizar(@RequestBody Producto producto,@PathVariable Long id){
		Producto encontradoCliente = productoDao.editarProducto(id);
		encontradoCliente.setStock(producto.getStock());
		return productoDao.crearProducto(encontradoCliente);
	}
	
	/*
	@PutMapping("/usuarios/{id}")
	public Usuario actualizar(@RequestBody Usuario usuario,@PathVariable Long id){
		Usuario encontradoUsuario = usuarioDao.editarUsuario(id);
		encontradoUsuario.setApm(usuario.getApm());
		encontradoUsuario.setApp(usuario.getApp());
		encontradoUsuario.setNombres(usuario.getNombres());
		encontradoUsuario.setCorreo(usuario.getCorreo());
		encontradoUsuario.setFoto(usuario.getFoto());
		encontradoUsuario.setDni(usuario.getDni());
		encontradoUsuario.setFecha(usuario.getFecha());
		encontradoUsuario.setUsername(usuario.getUsername());
		encontradoUsuario.setPassword(usuario.getPassword());
		encontradoUsuario.setTel(usuario.getTel());
		encontradoUsuario.setRol(usuario.getRol());
		return usuarioDao.crearUsuario(encontradoUsuario);
	}
	
	@CrossOrigin(origins = {"http://localhost:4200"})
	@DeleteMapping("/usuarios/{id}")
	public void eliminar(@PathVariable Long id){
		usuarioDao.eliminarUsuario(id);
	}
	
	@GetMapping("/roles")
	public List<Rol> listar_rol(){
		return rolDao.listarRol();
	}
	@GetMapping("/roles/{id}")
	public Rol buscar_rol(@PathVariable Long id){
		return rolDao.editarRol(id);
	}
	*/
	/*
	@GetMapping("/formulario/usuario")
	public String registrar_usuario(Model model) {
		model.addAttribute("titulo", "Registrar Usuario");
		model.addAttribute("usuario",new Usuario());
		model.addAttribute("roles", rolDao.listarRol());
		return "usuario/formulario";
	}
	
	
	@PostMapping("/formulario/usuario")
	public String guardar_usuario(Model model,@Valid Usuario usuario,Errors errores,
			@RequestParam String rol,
			 @RequestParam("file") MultipartFile foto,BindingResult result) throws IOException {
		
		model.addAttribute("titulo", "Registrar Usuario");
		model.addAttribute("roles", rolDao.listarRol());
		if(usuarioDao.buscar_x_dni(usuario.getDni()) == null) {
			if(errores.hasErrors()) {
				model.addAttribute("titulo", "Registrar Usuario");
				return "usuario/formulario";
			}
			if(result.hasErrors()) {
				model.addAttribute("usuario",usuario);
				model.addAttribute("titulo", "Error Usuario");
				return "usuario/formulario";
			}
			if(!foto.isEmpty()) {

				if(foto.getContentType().toString().equalsIgnoreCase("image/png")|| 
						foto.getContentType().toString().equalsIgnoreCase("image/jpg") ||
						foto.getContentType().toString().equalsIgnoreCase("image/jpeg")) {
					Path directorioRecursos = Paths.get("src//main//resources//static/uploads");	
					String rootPath = directorioRecursos.toFile().getAbsolutePath();
					Path p = Paths.get(rootPath);
					Files.createDirectories(p.getParent());
					log.info(foto.getContentType());
					try {
						byte[] bytes = foto.getBytes();
						Path rutaCompleta=Paths.get(rootPath+"//"+foto.getOriginalFilename());
						Files.createDirectories(rutaCompleta.getParent());
						Files.write(rutaCompleta,bytes);
						usuario.setFoto(foto.getOriginalFilename());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else {
					model.addAttribute("tipo_foto","La foto tiene que ser extension (png, jpg, jpeg)");
					return "usuario/formulario";
				}
			}
			var rol_encontrado = rolDao.editarRol(Long.valueOf(rol));
			usuario.setRol(rol_encontrado);
			if(usuarioDao.crearUsuario(usuario) == 1) {
				model.addAttribute("mensaje", "(Usuario Registro Correctamente)");
			}else {
				model.addAttribute("mensaje", "(Error al registrar)");
			}
			
			model.addAttribute("usuario",new Usuario());
			return "usuario/formulario";
		}
			
		else {
			model.addAttribute("dni_existente","DNI EXISTENTE, DIGITE OTRO DNI");
			model.addAttribute("usuario", usuario);
			return "usuario/formulario";
		}
		
	}
	
	
	*/
	
}
