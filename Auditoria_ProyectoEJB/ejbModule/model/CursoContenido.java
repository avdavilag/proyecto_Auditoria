package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the curso_contenido database table.
 * 
 */
@Entity
@Table(name="curso_contenido")
@NamedQuery(name="CursoContenido.findAll", query="SELECT c FROM CursoContenido c")
public class CursoContenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_curso_contenido", unique=true, nullable=false)
	private Integer idCursoContenido;

	//bi-directional many-to-one association to Contenido
	@ManyToOne
	@JoinColumn(name="id_contenido")
	private Contenido contenido;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	public CursoContenido() {
	}

	public Integer getIdCursoContenido() {
		return this.idCursoContenido;
	}

	public void setIdCursoContenido(Integer idCursoContenido) {
		this.idCursoContenido = idCursoContenido;
	}

	public Contenido getContenido() {
		return this.contenido;
	}

	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}