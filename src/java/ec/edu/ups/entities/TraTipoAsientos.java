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
@Table(name = "tra_tipo_asientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraTipoAsientos.findAll", query = "SELECT t FROM TraTipoAsientos t"),
    @NamedQuery(name = "TraTipoAsientos.findByTiaId", query = "SELECT t FROM TraTipoAsientos t WHERE t.tiaId = :tiaId"),
    @NamedQuery(name = "TraTipoAsientos.findByTiaDescripcion", query = "SELECT t FROM TraTipoAsientos t WHERE t.tiaDescripcion = :tiaDescripcion"),
    @NamedQuery(name = "TraTipoAsientos.findByAudEliminado", query = "SELECT t FROM TraTipoAsientos t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraTipoAsientos.findByAudFechaInsercion", query = "SELECT t FROM TraTipoAsientos t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraTipoAsientos.findByAudFechaModificacion", query = "SELECT t FROM TraTipoAsientos t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraTipoAsientos.findByAudUsuarioInserto", query = "SELECT t FROM TraTipoAsientos t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraTipoAsientos.findByAudUsuarioModifico", query = "SELECT t FROM TraTipoAsientos t WHERE t.audUsuarioModifico = :audUsuarioModifico")})
public class TraTipoAsientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tia_id")
    private Long tiaId;
    @Size(max = 100)
    @Column(name = "tia_descripcion")
    private String tiaDescripcion;
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

    public TraTipoAsientos() {
    }

    public TraTipoAsientos(Long tiaId) {
        this.tiaId = tiaId;
    }

    public Long getTiaId() {
        return tiaId;
    }

    public void setTiaId(Long tiaId) {
        this.tiaId = tiaId;
    }

    public String getTiaDescripcion() {
        return tiaDescripcion;
    }

    public void setTiaDescripcion(String tiaDescripcion) {
        this.tiaDescripcion = tiaDescripcion;
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
        hash += (tiaId != null ? tiaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipoAsientos)) {
            return false;
        }
        TraTipoAsientos other = (TraTipoAsientos) object;
        if ((this.tiaId == null && other.tiaId != null) || (this.tiaId != null && !this.tiaId.equals(other.tiaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraTipoAsientos[ tiaId=" + tiaId + " ]";
    }
    
}
