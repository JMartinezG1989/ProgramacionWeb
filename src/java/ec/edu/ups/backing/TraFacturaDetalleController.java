package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraFacturaDetalle;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traFacturaDetalleController")
@ViewScoped
public class TraFacturaDetalleController extends AbstractController<TraFacturaDetalle> {

    @Inject
    private TraFacturaCabeceraController fcaIdPkController;
    @Inject
    private MobilePageController mobilePageController;

    public TraFacturaDetalleController() {
        // Inform the Abstract parent controller of the concrete TraFacturaDetalle Entity
        super(TraFacturaDetalle.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        fcaIdPkController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraFacturaCabecera controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareFcaIdPk(ActionEvent event) {
        if (this.getSelected() != null && fcaIdPkController.getSelected() == null) {
            fcaIdPkController.setSelected(this.getSelected().getFcaIdPk());
        }
    }
}
