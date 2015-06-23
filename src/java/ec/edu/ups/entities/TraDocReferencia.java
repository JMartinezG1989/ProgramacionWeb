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
@Table(name = "tra_doc_referencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraDocReferencia.findAll", query = "SELECT t FROM TraDocReferencia t"),
    @NamedQuery(name = "TraDocReferencia.findByDorId", query = "SELECT t FROM TraDocReferencia t WHERE t.dorId = :dorId"),
    @NamedQuery(name = "TraDocReferencia.findByDorDescripcionDocreferencia", query = "SELECT t FROM TraDocReferencia t WHERE t.dorDescripcionDocreferencia = :dorDescripcionDocreferencia"),
    @NamedQuery(name = "TraDocReferencia.findByDorNumDocreferencia", query = "SELECT t FROM TraDocReferencia t WHERE t.dorNumDocreferencia = :dorNumDocreferencia"),
    @NamedQuery(name = "TraDocReferencia.findByAudEliminado", query = "SELECT t FROM TraDocReferencia t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraDocReferencia.findByAudFechaInsercion", query = "SELECT t FROM TraDocReferencia t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraDocReferencia.findByAudFechaModificacion", query = "SELECT t FROM TraDocReferencia t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraDocReferencia.findByAudUsuarioInserto", query = "SELECT t FROM TraDocReferencia t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraDocReferencia.findByAudUsuarioModifico", query = "SELECT t FROM TraDocReferencia t WHERE t.audUsuarioModifico = :audUsuarioModifico")})
public class TraDocReferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "dor_id")
    private Long dorId;
    @Size(max = 100)
    @Column(name = "dor_descripcion_docreferencia")
    private String dorDescripcionDocreferencia;
    @Size(max = 100)
    @Column(name = "dor_num_docreferencia")
    private String dorNumDocreferencia;
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

    public TraDocReferencia() {
    }

    public TraDocReferencia(Long dorId) {
        this.dorId = dorId;
    }

    public Long getDorId() {
        return dorId;
    }

    public void setDorId(Long dorId) {
        this.dorId = dorId;
    }

    public String getDorDescripcionDocreferencia() {
        return dorDescripcionDocreferencia;
    }

    public void setDorDescripcionDocreferencia(String dorDescripcionDocreferencia) {
        this.dorDescripcionDocreferencia = dorDescripcionDocreferencia;
    }

    public String getDorNumDocreferencia() {
        return dorNumDocreferencia;
    }

    public void setDorNumDocreferencia(String dorNumDocreferencia) {
        this.dorNumDocreferencia = dorNumDocreferencia;
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
        hash += (dorId != null ? dorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraDocReferencia)) {
            return false;
        }
        TraDocReferencia other = (TraDocReferencia) object;
        if ((this.dorId == null && other.dorId != null) || (this.dorId != null && !this.dorId.equals(other.dorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraDocReferencia[ dorId=" + dorId + " ]";
    }
    
}
