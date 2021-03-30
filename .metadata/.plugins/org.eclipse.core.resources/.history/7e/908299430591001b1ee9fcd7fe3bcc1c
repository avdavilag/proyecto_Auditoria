package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the contenido database table.
 * 
 */
@Entity
@Table(name="contenido")
@NamedQuery(name="Contenido.findAll", query="SELECT c FROM Contenido c")
public class Contenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contenido", unique=true, nullable=false)
	private Integer idContenido;

	@Column(length=1)
	private String descripcion;

	@Column(length=50)
	private String tema;

	@Column(length=70)
	private String url;

	//bi-directional many-to-one association to CursoContenido
	@OneToMany(mappedBy="contenido")
	private List<CursoContenido> cursoContenidos;

	public Contenido() {
	}

	public Integer getIdContenido() {
		return this.idContenido;
	}

	public void setIdContenido(Integer idContenido) {
		this.idContenido = idContenido;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<CursoContenido> getCursoContenidos() {
		return this.cursoContenidos;
	}

	public void setCursoContenidos(List<CursoContenido> cursoContenidos) {
		this.cursoContenidos = cursoContenidos;
	}

	public CursoContenido addCursoContenido(CursoContenido cursoContenido) {
		getCursoContenidos().add(cursoContenido);
		cursoContenido.setContenido(this);

		return cursoContenido;
	}

	public CursoContenido removeCursoContenido(CursoContenido cursoContenido) {
		getCursoContenidos().remove(cursoContenido);
		cursoContenido.setContenido(null);

		return cursoContenido;
	}

}