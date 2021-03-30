package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nombre_tipo_publicacion database table.
 * 
 */
@Entity
@Table(name="nombre_tipo_publicacion")
@NamedQuery(name="NombreTipoPublicacion.findAll", query="SELECT n FROM NombreTipoPublicacion n")
public class NombreTipoPublicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nombre_id_tipo_publicacion", unique=true, nullable=false)
	private Integer nombreIdTipoPublicacion;

	@Column(length=50)
	private String editorial;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_publicacion")
	private Date fechaPublicacion;

	@Column(name="lugar_publicacion", length=50)
	private String lugarPublicacion;

	@Column(name="palabras_clave", length=50)
	private String palabrasClave;

	@Column(length=50)
	private String url;

	//bi-directional many-to-one association to Publicacione
	@ManyToOne
	@JoinColumn(name="id_publicaciones")
	private Publicacione publicacione;

	public NombreTipoPublicacion() {
	}

	public Integer getNombreIdTipoPublicacion() {
		return this.nombreIdTipoPublicacion;
	}

	public void setNombreIdTipoPublicacion(Integer nombreIdTipoPublicacion) {
		this.nombreIdTipoPublicacion = nombreIdTipoPublicacion;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getLugarPublicacion() {
		return this.lugarPublicacion;
	}

	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}

	public String getPalabrasClave() {
		return this.palabrasClave;
	}

	public void setPalabrasClave(String palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Publicacione getPublicacione() {
		return this.publicacione;
	}

	public void setPublicacione(Publicacione publicacione) {
		this.publicacione = publicacione;
	}

}