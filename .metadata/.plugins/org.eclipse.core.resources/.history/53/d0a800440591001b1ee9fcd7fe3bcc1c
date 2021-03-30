package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuarios", unique=true, nullable=false)
	private Integer idUsuarios;

	@Column(length=3)
	private String activo;

	@Column(length=50)
	private String apellidos;

	@Column(length=100)
	private String clave;

	@Column(length=100)
	private String correo;

	@Column(length=1)
	private String descripcion;

	@Column(length=50)
	private String direccion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(length=50)
	private String grado;

	@Column(length=50)
	private String nombres;

	@Column(length=10)
	private String telefono;

	//bi-directional many-to-one association to InteresesProfesionale
	@OneToMany(mappedBy="usuario")
	private List<InteresesProfesionale> interesesProfesionales;

	//bi-directional many-to-one association to Publicacione
	@OneToMany(mappedBy="usuario")
	private List<Publicacione> publicaciones;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol rol;

	//bi-directional many-to-one association to UsuariosCurso
	@OneToMany(mappedBy="usuario")
	private List<UsuariosCurso> usuariosCursos;

	public Usuario() {
	}

	public Integer getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGrado() {
		return this.grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<InteresesProfesionale> getInteresesProfesionales() {
		return this.interesesProfesionales;
	}

	public void setInteresesProfesionales(List<InteresesProfesionale> interesesProfesionales) {
		this.interesesProfesionales = interesesProfesionales;
	}

	public InteresesProfesionale addInteresesProfesionale(InteresesProfesionale interesesProfesionale) {
		getInteresesProfesionales().add(interesesProfesionale);
		interesesProfesionale.setUsuario(this);

		return interesesProfesionale;
	}

	public InteresesProfesionale removeInteresesProfesionale(InteresesProfesionale interesesProfesionale) {
		getInteresesProfesionales().remove(interesesProfesionale);
		interesesProfesionale.setUsuario(null);

		return interesesProfesionale;
	}

	public List<Publicacione> getPublicaciones() {
		return this.publicaciones;
	}

	public void setPublicaciones(List<Publicacione> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public Publicacione addPublicacione(Publicacione publicacione) {
		getPublicaciones().add(publicacione);
		publicacione.setUsuario(this);

		return publicacione;
	}

	public Publicacione removePublicacione(Publicacione publicacione) {
		getPublicaciones().remove(publicacione);
		publicacione.setUsuario(null);

		return publicacione;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<UsuariosCurso> getUsuariosCursos() {
		return this.usuariosCursos;
	}

	public void setUsuariosCursos(List<UsuariosCurso> usuariosCursos) {
		this.usuariosCursos = usuariosCursos;
	}

	public UsuariosCurso addUsuariosCurso(UsuariosCurso usuariosCurso) {
		getUsuariosCursos().add(usuariosCurso);
		usuariosCurso.setUsuario(this);

		return usuariosCurso;
	}

	public UsuariosCurso removeUsuariosCurso(UsuariosCurso usuariosCurso) {
		getUsuariosCursos().remove(usuariosCurso);
		usuariosCurso.setUsuario(null);

		return usuariosCurso;
	}

}