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
@Table(name = "tra_liquidacion_fecha_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findAll", query = "SELECT t FROM TraLiquidacionFechaDetalle t"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfcdIdPk", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfcdIdPk = :lfcdIdPk"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByAudEliminado", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByAudFechaInsercion", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByAudFechaModificacion", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByAudUsuarioInserto", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByAudUsuarioModifico", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdCobroRuta", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdCobroRuta = :lfdCobroRuta"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdDescuento1", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdDescuento1 = :lfdDescuento1"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdDescuento2", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdDescuento2 = :lfdDescuento2"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdFecha", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdFecha = :lfdFecha"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdLiquidacion1", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdLiquidacion1 = :lfdLiquidacion1"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdLiquidacion2", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdLiquidacion2 = :lfdLiquidacion2"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdCobroCuenca", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdCobroCuenca = :lfdCobroCuenca"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdNumGuia", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdNumGuia = :lfdNumGuia"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdPago", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdPago = :lfdPago"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdPorcentaje15o12", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdPorcentaje15o12 = :lfdPorcentaje15o12"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdRetencionPorcentaje", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdRetencionPorcentaje = :lfdRetencionPorcentaje"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdTotalFlete", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdTotalFlete = :lfdTotalFlete"),
    @NamedQuery(name = "TraLiquidacionFechaDetalle.findByLfdTotalLiquidacion", query = "SELECT t FROM TraLiquidacionFechaDetalle t WHERE t.lfdTotalLiquidacion = :lfdTotalLiquidacion")})
public class TraLiquidacionFechaDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "lfcd_id_pk")
    private Long lfcdIdPk;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lfd_cobro_ruta")
    private Double lfdCobroRuta;
    @Size(max = 5)
    @Column(name = "lfd_descuento1")
    private String lfdDescuento1;
    @Size(max = 5)
    @Column(name = "lfd_descuento2")
    private String lfdDescuento2;
    @Column(name = "lfd_fecha")
    @Temporal(TemporalType.DATE)
    private Date lfdFecha;
    @Column(name = "lfd_liquidacion1")
    private Double lfdLiquidacion1;
    @Column(name = "lfd_liquidacion2")
    private Double lfdLiquidacion2;
    @Column(name = "lfd_cobro_cuenca")
    private Double lfdCobroCuenca;
    @Column(name = "lfd_num_guia")
    private Double lfdNumGuia;
    @Column(name = "lfd_pago")
    private Double lfdPago;
    @Column(name = "lfd_porcentaje_15o12")
    private Double lfdPorcentaje15o12;
    @Column(name = "lfd_retencion_porcentaje")
    private Double lfdRetencionPorcentaje;
    @Column(name = "lfd_total_flete")
    private Double lfdTotalFlete;
    @Column(name = "lfd_total_liquidacion")
    private Double lfdTotalLiquidacion;

    public TraLiquidacionFechaDetalle() {
    }

    public TraLiquidacionFechaDetalle(Long lfcdIdPk) {
        this.lfcdIdPk = lfcdIdPk;
    }

    public Long getLfcdIdPk() {
        return lfcdIdPk;
    }

    public void setLfcdIdPk(Long lfcdIdPk) {
        this.lfcdIdPk = lfcdIdPk;
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

    public Double getLfdCobroRuta() {
        return lfdCobroRuta;
    }

    public void setLfdCobroRuta(Double lfdCobroRuta) {
        this.lfdCobroRuta = lfdCobroRuta;
    }

    public String getLfdDescuento1() {
        return lfdDescuento1;
    }

    public void setLfdDescuento1(String lfdDescuento1) {
        this.lfdDescuento1 = lfdDescuento1;
    }

    public String getLfdDescuento2() {
        return lfdDescuento2;
    }

    public void setLfdDescuento2(String lfdDescuento2) {
        this.lfdDescuento2 = lfdDescuento2;
    }

    public Date getLfdFecha() {
        return lfdFecha;
    }

    public void setLfdFecha(Date lfdFecha) {
        this.lfdFecha = lfdFecha;
    }

    public Double getLfdLiquidacion1() {
        return lfdLiquidacion1;
    }

    public void setLfdLiquidacion1(Double lfdLiquidacion1) {
        this.lfdLiquidacion1 = lfdLiquidacion1;
    }

    public Double getLfdLiquidacion2() {
        return lfdLiquidacion2;
    }

    public void setLfdLiquidacion2(Double lfdLiquidacion2) {
        this.lfdLiquidacion2 = lfdLiquidacion2;
    }

    public Double getLfdCobroCuenca() {
        return lfdCobroCuenca;
    }

    public void setLfdCobroCuenca(Double lfdCobroCuenca) {
        this.lfdCobroCuenca = lfdCobroCuenca;
    }

    public Double getLfdNumGuia() {
        return lfdNumGuia;
    }

    public void setLfdNumGuia(Double lfdNumGuia) {
        this.lfdNumGuia = lfdNumGuia;
    }

    public Double getLfdPago() {
        return lfdPago;
    }

    public void setLfdPago(Double lfdPago) {
        this.lfdPago = lfdPago;
    }

    public Double getLfdPorcentaje15o12() {
        return lfdPorcentaje15o12;
    }

    public void setLfdPorcentaje15o12(Double lfdPorcentaje15o12) {
        this.lfdPorcentaje15o12 = lfdPorcentaje15o12;
    }

    public Double getLfdRetencionPorcentaje() {
        return lfdRetencionPorcentaje;
    }

    public void setLfdRetencionPorcentaje(Double lfdRetencionPorcentaje) {
        this.lfdRetencionPorcentaje = lfdRetencionPorcentaje;
    }

    public Double getLfdTotalFlete() {
        return lfdTotalFlete;
    }

    public void setLfdTotalFlete(Double lfdTotalFlete) {
        this.lfdTotalFlete = lfdTotalFlete;
    }

    public Double getLfdTotalLiquidacion() {
        return lfdTotalLiquidacion;
    }

    public void setLfdTotalLiquidacion(Double lfdTotalLiquidacion) {
        this.lfdTotalLiquidacion = lfdTotalLiquidacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lfcdIdPk != null ? lfcdIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraLiquidacionFechaDetalle)) {
            return false;
        }
        TraLiquidacionFechaDetalle other = (TraLiquidacionFechaDetalle) object;
        if ((this.lfcdIdPk == null && other.lfcdIdPk != null) || (this.lfcdIdPk != null && !this.lfcdIdPk.equals(other.lfcdIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraLiquidacionFechaDetalle[ lfcdIdPk=" + lfcdIdPk + " ]";
    }
    
}
