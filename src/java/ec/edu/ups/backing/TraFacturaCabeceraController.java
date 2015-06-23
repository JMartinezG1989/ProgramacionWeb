package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraFacturaCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traFacturaCabeceraController")
@ViewScoped
public class TraFacturaCabeceraController extends AbstractController<TraFacturaCabecera> {

    @Inject
    private TraFacturaTipoPagoCobroController tpcoIdPkController;
    @Inject
    private TraFacturaIvasController fivIdPkController;
    @Inject
    private MobilePageController mobilePageController;

    public TraFacturaCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraFacturaCabecera Entity
        super(TraFacturaCabecera.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        tpcoIdPkController.setSelected(null);
        fivIdPkController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of TraFacturaEstado entities
     * that are retrieved from TraFacturaCabecera?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraFacturaEstado page
     */
    public String navigateTraFacturaEstadoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraFacturaEstado_items", this.getSelected().getTraFacturaEstadoList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traFacturaEstado/index";
    }

    /**
     * Sets the "selected" attribute of the TraFacturaTipoPagoCobro controller
     * in order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTpcoIdPk(ActionEvent event) {
        if (this.getSelected() != null && tpcoIdPkController.getSelected() == null) {
            tpcoIdPkController.setSelected(this.getSelected().getTpcoIdPk());
        }
    }

    /**
     * Sets the "selected" attribute of the TraFacturaIvas controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareFivIdPk(ActionEvent event) {
        if (this.getSelected() != null && fivIdPkController.getSelected() == null) {
            fivIdPkController.setSelected(this.getSelected().getFivIdPk());
        }
    }

    /**
     * Sets the "items" attribute with a collection of TraFacturaDetalle
     * entities that are retrieved from TraFacturaCabecera?cap_first and returns
     * the navigation outcome.
     *
     * @return navigation outcome for TraFacturaDetalle page
     */
    public String navigateTraFacturaDetalleList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraFacturaDetalle_items", this.getSelected().getTraFacturaDetalleList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traFacturaDetalle/index";
    }

}
