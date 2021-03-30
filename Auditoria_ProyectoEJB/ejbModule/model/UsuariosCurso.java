package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios_curso database table.
 * 
 */
@Entity
@Table(name="usuarios_curso")
@NamedQuery(name="UsuariosCurso.findAll", query="SELECT u FROM UsuariosCurso u")
public class UsuariosCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuarios_curso", unique=true, nullable=false)
	private Integer idUsuariosCurso;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuarios")
	private Usuario usuario;

	public UsuariosCurso() {
	}

	public Integer getIdUsuariosCurso() {
		return this.idUsuariosCurso;
	}

	public void setIdUsuariosCurso(Integer idUsuariosCurso) {
		this.idUsuariosCurso = idUsuariosCurso;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}