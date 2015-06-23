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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tra_factura_estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraFacturaEstado.findAll", query = "SELECT t FROM TraFacturaEstado t"),
    @NamedQuery(name = "TraFacturaEstado.findByFesIdPk", query = "SELECT t FROM TraFacturaEstado t WHERE t.fesIdPk = :fesIdPk"),
    @NamedQuery(name = "TraFacturaEstado.findByAudEliminado", query = "SELECT t FROM TraFacturaEstado t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraFacturaEstado.findByAudFechaInsercion", query = "SELECT t FROM TraFacturaEstado t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraFacturaEstado.findByAudFechaModificacion", query = "SELECT t FROM TraFacturaEstado t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraFacturaEstado.findByAudUsuarioInserto", query = "SELECT t FROM TraFacturaEstado t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraFacturaEstado.findByAudUsuarioModifico", query = "SELECT t FROM TraFacturaEstado t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraFacturaEstado.findByFesDescripcion", query = "SELECT t FROM TraFacturaEstado t WHERE t.fesDescripcion = :fesDescripcion")})
public class TraFacturaEstado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fes_id_pk")
    private Long fesIdPk;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "fes_descripcion")
    private String fesDescripcion;
    @JoinColumn(name = "fca_id_pk", referencedColumnName = "fca_id_pk")
    @ManyToOne
    private TraFacturaCabecera fcaIdPk;

    public TraFacturaEstado() {
    }

    public TraFacturaEstado(Long fesIdPk) {
        this.fesIdPk = fesIdPk;
    }

    public TraFacturaEstado(Long fesIdPk, String fesDescripcion) {
        this.fesIdPk = fesIdPk;
        this.fesDescripcion = fesDescripcion;
    }

    public Long getFesIdPk() {
        return fesIdPk;
    }

    public void setFesIdPk(Long fesIdPk) {
        this.fesIdPk = fesIdPk;
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

    public String getFesDescripcion() {
        return fesDescripcion;
    }

    public void setFesDescripcion(String fesDescripcion) {
        this.fesDescripcion = fesDescripcion;
    }

    public TraFacturaCabecera getFcaIdPk() {
        return fcaIdPk;
    }

    public void setFcaIdPk(TraFacturaCabecera fcaIdPk) {
        this.fcaIdPk = fcaIdPk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fesIdPk != null ? fesIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraFacturaEstado)) {
            return false;
        }
        TraFacturaEstado other = (TraFacturaEstado) object;
        if ((this.fesIdPk == null && other.fesIdPk != null) || (this.fesIdPk != null && !this.fesIdPk.equals(other.fesIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraFacturaEstado[ fesIdPk=" + fesIdPk + " ]";
    }
    
}
