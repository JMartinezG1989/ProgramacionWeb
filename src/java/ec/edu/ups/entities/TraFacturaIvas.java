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
@Table(name = "tra_factura_ivas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraFacturaIvas.findAll", query = "SELECT t FROM TraFacturaIvas t"),
    @NamedQuery(name = "TraFacturaIvas.findByFivIdPk", query = "SELECT t FROM TraFacturaIvas t WHERE t.fivIdPk = :fivIdPk"),
    @NamedQuery(name = "TraFacturaIvas.findByAudEliminado", query = "SELECT t FROM TraFacturaIvas t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraFacturaIvas.findByAudFechaInsercion", query = "SELECT t FROM TraFacturaIvas t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraFacturaIvas.findByAudFechaModificacion", query = "SELECT t FROM TraFacturaIvas t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraFacturaIvas.findByAudUsuarioInserto", query = "SELECT t FROM TraFacturaIvas t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraFacturaIvas.findByAudUsuarioModifico", query = "SELECT t FROM TraFacturaIvas t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraFacturaIvas.findByFivValor", query = "SELECT t FROM TraFacturaIvas t WHERE t.fivValor = :fivValor")})
public class TraFacturaIvas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fiv_id_pk")
    private Long fivIdPk;
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
    @Column(name = "fiv_valor")
    private int fivValor;
    @OneToMany(mappedBy = "tfiGrcFk")
    private List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList;
    @OneToMany(mappedBy = "fivIdPk")
    private List<TraFacturaCabecera> traFacturaCabeceraList;

    public TraFacturaIvas() {
    }

    public TraFacturaIvas(Long fivIdPk) {
        this.fivIdPk = fivIdPk;
    }

    public TraFacturaIvas(Long fivIdPk, int fivValor) {
        this.fivIdPk = fivIdPk;
        this.fivValor = fivValor;
    }

    public Long getFivIdPk() {
        return fivIdPk;
    }

    public void setFivIdPk(Long fivIdPk) {
        this.fivIdPk = fivIdPk;
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

    public int getFivValor() {
        return fivValor;
    }

    public void setFivValor(int fivValor) {
        this.fivValor = fivValor;
    }

    @XmlTransient
    public List<TraGuiaRemisionCabecera> getTraGuiaRemisionCabeceraList() {
        return traGuiaRemisionCabeceraList;
    }

    public void setTraGuiaRemisionCabeceraList(List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList) {
        this.traGuiaRemisionCabeceraList = traGuiaRemisionCabeceraList;
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
        hash += (fivIdPk != null ? fivIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraFacturaIvas)) {
            return false;
        }
        TraFacturaIvas other = (TraFacturaIvas) object;
        if ((this.fivIdPk == null && other.fivIdPk != null) || (this.fivIdPk != null && !this.fivIdPk.equals(other.fivIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraFacturaIvas[ fivIdPk=" + fivIdPk + " ]";
    }
    
}
