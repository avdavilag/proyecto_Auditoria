package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the publicaciones database table.
 * 
 */
@Entity
@Table(name="publicaciones")
@NamedQuery(name="Publicacione.findAll", query="SELECT p FROM Publicacione p")
public class Publicacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_publicaciones", unique=true, nullable=false)
	private Integer idPublicaciones;

	@Column(name="tipo_publicacion", length=1)
	private String tipoPublicacion;

	//bi-directional many-to-one association to NombreTipoPublicacion
	@OneToMany(mappedBy="publicacione")
	private List<NombreTipoPublicacion> nombreTipoPublicacions;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuarios")
	private Usuario usuario;

	public Publicacione() {
	}

	public Integer getIdPublicaciones() {
		return this.idPublicaciones;
	}

	public void setIdPublicaciones(Integer idPublicaciones) {
		this.idPublicaciones = idPublicaciones;
	}

	public String getTipoPublicacion() {
		return this.tipoPublicacion;
	}

	public void setTipoPublicacion(String tipoPublicacion) {
		this.tipoPublicacion = tipoPublicacion;
	}

	public List<NombreTipoPublicacion> getNombreTipoPublicacions() {
		return this.nombreTipoPublicacions;
	}

	public void setNombreTipoPublicacions(List<NombreTipoPublicacion> nombreTipoPublicacions) {
		this.nombreTipoPublicacions = nombreTipoPublicacions;
	}

	public NombreTipoPublicacion addNombreTipoPublicacion(NombreTipoPublicacion nombreTipoPublicacion) {
		getNombreTipoPublicacions().add(nombreTipoPublicacion);
		nombreTipoPublicacion.setPublicacione(this);

		return nombreTipoPublicacion;
	}

	public NombreTipoPublicacion removeNombreTipoPublicacion(NombreTipoPublicacion nombreTipoPublicacion) {
		getNombreTipoPublicacions().remove(nombreTipoPublicacion);
		nombreTipoPublicacion.setPublicacione(null);

		return nombreTipoPublicacion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}