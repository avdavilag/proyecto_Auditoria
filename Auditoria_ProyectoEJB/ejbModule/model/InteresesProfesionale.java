package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the intereses_profesionales database table.
 * 
 */
@Entity
@Table(name="intereses_profesionales")
@NamedQuery(name="InteresesProfesionale.findAll", query="SELECT i FROM InteresesProfesionale i")
public class InteresesProfesionale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_intereses_profesionales", unique=true, nullable=false)
	private Integer idInteresesProfesionales;

	@Column(length=1)
	private String descripcion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuarios")
	private Usuario usuario;

	public InteresesProfesionale() {
	}

	public Integer getIdInteresesProfesionales() {
		return this.idInteresesProfesionales;
	}

	public void setIdInteresesProfesionales(Integer idInteresesProfesionales) {
		this.idInteresesProfesionales = idInteresesProfesionales;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}