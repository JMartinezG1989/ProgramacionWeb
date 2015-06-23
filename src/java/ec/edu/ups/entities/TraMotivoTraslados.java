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
@Table(name = "tra_motivo_traslados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraMotivoTraslados.findAll", query = "SELECT t FROM TraMotivoTraslados t"),
    @NamedQuery(name = "TraMotivoTraslados.findByMtrIdPk", query = "SELECT t FROM TraMotivoTraslados t WHERE t.mtrIdPk = :mtrIdPk"),
    @NamedQuery(name = "TraMotivoTraslados.findByAudEliminado", query = "SELECT t FROM TraMotivoTraslados t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraMotivoTraslados.findByAudFechaInsercion", query = "SELECT t FROM TraMotivoTraslados t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraMotivoTraslados.findByAudFechaModificacion", query = "SELECT t FROM TraMotivoTraslados t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraMotivoTraslados.findByAudUsuarioInserto", query = "SELECT t FROM TraMotivoTraslados t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraMotivoTraslados.findByAudUsuarioModifico", query = "SELECT t FROM TraMotivoTraslados t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraMotivoTraslados.findByMtrDescripcion", query = "SELECT t FROM TraMotivoTraslados t WHERE t.mtrDescripcion = :mtrDescripcion")})
public class TraMotivoTraslados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mtr_id_pk")
    private Long mtrIdPk;
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
    @Column(name = "mtr_descripcion")
    private String mtrDescripcion;
    @OneToMany(mappedBy = "mtrGrcFk")
    private List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList;

    public TraMotivoTraslados() {
    }

    public TraMotivoTraslados(Long mtrIdPk) {
        this.mtrIdPk = mtrIdPk;
    }

    public Long getMtrIdPk() {
        return mtrIdPk;
    }

    public void setMtrIdPk(Long mtrIdPk) {
        this.mtrIdPk = mtrIdPk;
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

    public String getMtrDescripcion() {
        return mtrDescripcion;
    }

    public void setMtrDescripcion(String mtrDescripcion) {
        this.mtrDescripcion = mtrDescripcion;
    }

    @XmlTransient
    public List<TraGuiaRemisionCabecera> getTraGuiaRemisionCabeceraList() {
        return traGuiaRemisionCabeceraList;
    }

    public void setTraGuiaRemisionCabeceraList(List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList) {
        this.traGuiaRemisionCabeceraList = traGuiaRemisionCabeceraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtrIdPk != null ? mtrIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraMotivoTraslados)) {
            return false;
        }
        TraMotivoTraslados other = (TraMotivoTraslados) object;
        if ((this.mtrIdPk == null && other.mtrIdPk != null) || (this.mtrIdPk != null && !this.mtrIdPk.equals(other.mtrIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraMotivoTraslados[ mtrIdPk=" + mtrIdPk + " ]";
    }
    
}
