package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraHojaRutaDetalle;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traHojaRutaDetalleController")
@ViewScoped
public class TraHojaRutaDetalleController extends AbstractController<TraHojaRutaDetalle> {

    @Inject
    private TraHojaRutaCabeceraController hrcHrdFkController;
    @Inject
    private MobilePageController mobilePageController;

    public TraHojaRutaDetalleController() {
        // Inform the Abstract parent controller of the concrete TraHojaRutaDetalle Entity
        super(TraHojaRutaDetalle.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        hrcHrdFkController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraHojaRutaCabecera controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareHrcHrdFk(ActionEvent event) {
        if (this.getSelected() != null && hrcHrdFkController.getSelected() == null) {
            hrcHrdFkController.setSelected(this.getSelected().getHrcHrdFk());
        }
    }
}
