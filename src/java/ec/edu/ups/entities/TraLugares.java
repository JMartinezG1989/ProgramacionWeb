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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tra_lugares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraLugares.findAll", query = "SELECT t FROM TraLugares t"),
    @NamedQuery(name = "TraLugares.findByLugIdPk", query = "SELECT t FROM TraLugares t WHERE t.lugIdPk = :lugIdPk"),
    @NamedQuery(name = "TraLugares.findByAudEliminado", query = "SELECT t FROM TraLugares t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraLugares.findByAudFechaInsercion", query = "SELECT t FROM TraLugares t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraLugares.findByAudFechaModificacion", query = "SELECT t FROM TraLugares t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraLugares.findByAudUsuarioInserto", query = "SELECT t FROM TraLugares t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraLugares.findByAudUsuarioModifico", query = "SELECT t FROM TraLugares t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraLugares.findByLugDescripcion", query = "SELECT t FROM TraLugares t WHERE t.lugDescripcion = :lugDescripcion")})
public class TraLugares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "lug_id_pk")
    private Long lugIdPk;
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
    @Column(name = "lug_descripcion")
    private String lugDescripcion;
    @JoinColumn(name = "hrc_hrd_fk", referencedColumnName = "tlu_id_pk")
    @ManyToOne
    private TraTipoLugares hrcHrdFk;
    @OneToMany(mappedBy = "lugPadreId")
    private List<TraLugares> traLugaresList;
    @JoinColumn(name = "lug_padre_id", referencedColumnName = "lug_id_pk")
    @ManyToOne
    private TraLugares lugPadreId;
    @OneToMany(mappedBy = "lugGrcOrigenFk")
    private List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList;
    @OneToMany(mappedBy = "lugGrcDestinoFk")
    private List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList1;

    public TraLugares() {
    }

    public TraLugares(Long lugIdPk) {
        this.lugIdPk = lugIdPk;
    }

    public Long getLugIdPk() {
        return lugIdPk;
    }

    public void setLugIdPk(Long lugIdPk) {
        this.lugIdPk = lugIdPk;
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

    public String getLugDescripcion() {
        return lugDescripcion;
    }

    public void setLugDescripcion(String lugDescripcion) {
        this.lugDescripcion = lugDescripcion;
    }

    public TraTipoLugares getHrcHrdFk() {
        return hrcHrdFk;
    }

    public void setHrcHrdFk(TraTipoLugares hrcHrdFk) {
        this.hrcHrdFk = hrcHrdFk;
    }

    @XmlTransient
    public List<TraLugares> getTraLugaresList() {
        return traLugaresList;
    }

    public void setTraLugaresList(List<TraLugares> traLugaresList) {
        this.traLugaresList = traLugaresList;
    }

    public TraLugares getLugPadreId() {
        return lugPadreId;
    }

    public void setLugPadreId(TraLugares lugPadreId) {
        this.lugPadreId = lugPadreId;
    }

    @XmlTransient
    public List<TraGuiaRemisionCabecera> getTraGuiaRemisionCabeceraList() {
        return traGuiaRemisionCabeceraList;
    }

    public void setTraGuiaRemisionCabeceraList(List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList) {
        this.traGuiaRemisionCabeceraList = traGuiaRemisionCabeceraList;
    }

    @XmlTransient
    public List<TraGuiaRemisionCabecera> getTraGuiaRemisionCabeceraList1() {
        return traGuiaRemisionCabeceraList1;
    }

    public void setTraGuiaRemisionCabeceraList1(List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList1) {
        this.traGuiaRemisionCabeceraList1 = traGuiaRemisionCabeceraList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lugIdPk != null ? lugIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraLugares)) {
            return false;
        }
        TraLugares other = (TraLugares) object;
        if ((this.lugIdPk == null && other.lugIdPk != null) || (this.lugIdPk != null && !this.lugIdPk.equals(other.lugIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraLugares[ lugIdPk=" + lugIdPk + " ]";
    }
    
}
