package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
@Table(name="curso")
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_curso", unique=true, nullable=false)
	private Integer idCurso;

	@Column(length=1)
	private String descripcion;

	@Column(length=50)
	private String nombre;

	//bi-directional many-to-one association to CursoContenido
	@OneToMany(mappedBy="curso")
	private List<CursoContenido> cursoContenidos;

	//bi-directional many-to-one association to UsuariosCurso
	@OneToMany(mappedBy="curso")
	private List<UsuariosCurso> usuariosCursos;

	public Curso() {
	}

	public Integer getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CursoContenido> getCursoContenidos() {
		return this.cursoContenidos;
	}

	public void setCursoContenidos(List<CursoContenido> cursoContenidos) {
		this.cursoContenidos = cursoContenidos;
	}

	public CursoContenido addCursoContenido(CursoContenido cursoContenido) {
		getCursoContenidos().add(cursoContenido);
		cursoContenido.setCurso(this);

		return cursoContenido;
	}

	public CursoContenido removeCursoContenido(CursoContenido cursoContenido) {
		getCursoContenidos().remove(cursoContenido);
		cursoContenido.setCurso(null);

		return cursoContenido;
	}

	public List<UsuariosCurso> getUsuariosCursos() {
		return this.usuariosCursos;
	}

	public void setUsuariosCursos(List<UsuariosCurso> usuariosCursos) {
		this.usuariosCursos = usuariosCursos;
	}

	public UsuariosCurso addUsuariosCurso(UsuariosCurso usuariosCurso) {
		getUsuariosCursos().add(usuariosCurso);
		usuariosCurso.setCurso(this);

		return usuariosCurso;
	}

	public UsuariosCurso removeUsuariosCurso(UsuariosCurso usuariosCurso) {
		getUsuariosCursos().remove(usuariosCurso);
		usuariosCurso.setCurso(null);

		return usuariosCurso;
	}

}