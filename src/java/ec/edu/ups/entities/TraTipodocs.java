/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_tipodocs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraTipodocs.findAll", query = "SELECT t FROM TraTipodocs t"),
    @NamedQuery(name = "TraTipodocs.findByTipId", query = "SELECT t FROM TraTipodocs t WHERE t.tipId = :tipId"),
    @NamedQuery(name = "TraTipodocs.findByTipDescripcion", query = "SELECT t FROM TraTipodocs t WHERE t.tipDescripcion = :tipDescripcion"),
    @NamedQuery(name = "TraTipodocs.findByAudEliminado", query = "SELECT t FROM TraTipodocs t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraTipodocs.findByAudFechaInsercion", query = "SELECT t FROM TraTipodocs t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraTipodocs.findByAudFechaModificacion", query = "SELECT t FROM TraTipodocs t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraTipodocs.findByAudUsuarioInserto", query = "SELECT t FROM TraTipodocs t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraTipodocs.findByAudUsuarioModifico", query = "SELECT t FROM TraTipodocs t WHERE t.audUsuarioModifico = :audUsuarioModifico")})
public class TraTipodocs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tip_id")
    private Long tipId;
    @Size(max = 100)
    @Column(name = "tip_descripcion")
    private String tipDescripcion;
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

    public TraTipodocs() {
    }

    public TraTipodocs(Long tipId) {
        this.tipId = tipId;
    }

    public Long getTipId() {
        return tipId;
    }

    public void setTipId(Long tipId) {
        this.tipId = tipId;
    }

    public String getTipDescripcion() {
        return tipDescripcion;
    }

    public void setTipDescripcion(String tipDescripcion) {
        this.tipDescripcion = tipDescripcion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipId != null ? tipId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipodocs)) {
            return false;
        }
        TraTipodocs other = (TraTipodocs) object;
        if ((this.tipId == null && other.tipId != null) || (this.tipId != null && !this.tipId.equals(other.tipId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraTipodocs[ tipId=" + tipId + " ]";
    }
    
}
