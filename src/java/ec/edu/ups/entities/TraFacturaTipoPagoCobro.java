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
@Table(name = "tra_factura_tipo_pago_cobro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findAll", query = "SELECT t FROM TraFacturaTipoPagoCobro t"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByTpcoIdPk", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.tpcoIdPk = :tpcoIdPk"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByAudEliminado", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByAudFechaInsercion", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByAudFechaModificacion", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByAudUsuarioInserto", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByAudUsuarioModifico", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraFacturaTipoPagoCobro.findByTpcoDescripcion", query = "SELECT t FROM TraFacturaTipoPagoCobro t WHERE t.tpcoDescripcion = :tpcoDescripcion")})
public class TraFacturaTipoPagoCobro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpco_id_pk")
    private Long tpcoIdPk;
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
    @Size(min = 1, max = 100)
    @Column(name = "tpco_descripcion")
    private String tpcoDescripcion;
    @OneToMany(mappedBy = "tpcoIdPk")
    private List<TraFacturaCabecera> traFacturaCabeceraList;

    public TraFacturaTipoPagoCobro() {
    }

    public TraFacturaTipoPagoCobro(Long tpcoIdPk) {
        this.tpcoIdPk = tpcoIdPk;
    }

    public TraFacturaTipoPagoCobro(Long tpcoIdPk, String tpcoDescripcion) {
        this.tpcoIdPk = tpcoIdPk;
        this.tpcoDescripcion = tpcoDescripcion;
    }

    public Long getTpcoIdPk() {
        return tpcoIdPk;
    }

    public void setTpcoIdPk(Long tpcoIdPk) {
        this.tpcoIdPk = tpcoIdPk;
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

    public String getTpcoDescripcion() {
        return tpcoDescripcion;
    }

    public void setTpcoDescripcion(String tpcoDescripcion) {
        this.tpcoDescripcion = tpcoDescripcion;
    }

    @XmlTransient
    public List<TraFacturaCabecera> getTraFacturaCabeceraList() {
        return traFacturaCabeceraList;
    }

    public void setTraFacturaCabeceraList(List<TraFacturaCabecera> traFacturaCabeceraList) {
        this.traFacturaCabeceraList = traFacturaCabeceraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpcoIdPk != null ? tpcoIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraFacturaTipoPagoCobro)) {
            return false;
        }
        TraFacturaTipoPagoCobro other = (TraFacturaTipoPagoCobro) object;
        if ((this.tpcoIdPk == null && other.tpcoIdPk != null) || (this.tpcoIdPk != null && !this.tpcoIdPk.equals(other.tpcoIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraFacturaTipoPagoCobro[ tpcoIdPk=" + tpcoIdPk + " ]";
    }
    
}
