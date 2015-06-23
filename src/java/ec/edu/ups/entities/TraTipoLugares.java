/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_tipo_lugares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraTipoLugares.findAll", query = "SELECT t FROM TraTipoLugares t"),
    @NamedQuery(name = "TraTipoLugares.findByTluIdPk", query = "SELECT t FROM TraTipoLugares t WHERE t.tluIdPk = :tluIdPk"),
    @NamedQuery(name = "TraTipoLugares.findByAudEliminado", query = "SELECT t FROM TraTipoLugares t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraTipoLugares.findByAudFechaInsercion", query = "SELECT t FROM TraTipoLugares t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraTipoLugares.findByAudFechaModificacion", query = "SELECT t FROM TraTipoLugares t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraTipoLugares.findByAudUsuarioInserto", query = "SELECT t FROM TraTipoLugares t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraTipoLugares.findByAudUsuarioModifico", query = "SELECT t FROM TraTipoLugares t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraTipoLugares.findByTluDescripcion", query = "SELECT t FROM TraTipoLugares t WHERE t.tluDescripcion = :tluDescripcion")})
public class TraTipoLugares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tlu_id_pk")
    private Long tluIdPk;
    @Size(max = 1)
    @Column(name = "aud_eliminado")
    private String audEliminado;
    @Column(name = "aud_fecha_insercion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaInsercion;
    @Column(name = "aud_fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaModificacion;
    @Size(max = 255)
    @Column(name = "aud_usuario_inserto")
    private String audUsuarioInserto;
    @Size(max = 255)
    @Column(name = "aud_usuario_modifico")
    private String audUsuarioModifico;
    @Size(max = 100)
    @Column(name = "tlu_descripcion")
    private String tluDescripcion;
    @OneToMany(mappedBy = "hrcHrdFk")
    private List<TraLugares> traLugaresList;

    public TraTipoLugares() {
    }

    public TraTipoLugares(Long tluIdPk) {
        this.tluIdPk = tluIdPk;
    }

    public Long getTluIdPk() {
        return tluIdPk;
    }

    public void setTluIdPk(Long tluIdPk) {
        this.tluIdPk = tluIdPk;
    }

    public String getAudEliminado() {
        return audEliminado;
    }

    public void setAudEliminado(String audEliminado) {
        this.audEliminado = audEliminado;
    }

    public Date getAudFechaInsercion() {
        return audFechaInsercion;
    }

    public void setAudFechaInsercion(Date audFechaInsercion) {
        this.audFechaInsercion = audFechaInsercion;
    }

    public Date getAudFechaModificacion() {
        return audFechaModificacion;
    }

    public void setAudFechaModificacion(Date audFechaModificacion) {
        this.audFechaModificacion = audFechaModificacion;
    }

    public String getAudUsuarioInserto() {
        return audUsuarioInserto;
    }

    public void setAudUsuarioInserto(String audUsuarioInserto) {
        this.audUsuarioInserto = audUsuarioInserto;
    }

    public String getAudUsuarioModifico() {
        return audUsuarioModifico;
    }

    public void setAudUsuarioModifico(String audUsuarioModifico) {
        this.audUsuarioModifico = audUsuarioModifico;
    }

    public String getTluDescripcion() {
        return tluDescripcion;
    }

    public void setTluDescripcion(String tluDescripcion) {
        this.tluDescripcion = tluDescripcion;
    }

    @XmlTransient
    public List<TraLugares> getTraLugaresList() {
        return traLugaresList;
    }

    public void setTraLugaresList(List<TraLugares> traLugaresList) {
        this.traLugaresList = traLugaresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tluIdPk != null ? tluIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipoLugares)) {
            return false;
        }
        TraTipoLugares other = (TraTipoLugares) object;
        if ((this.tluIdPk == null && other.tluIdPk != null) || (this.tluIdPk != null && !this.tluIdPk.equals(other.tluIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraTipoLugares[ tluIdPk=" + tluIdPk + " ]";
    }
    
}
