package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraHojaRutaCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traHojaRutaCabeceraController")
@ViewScoped
public class TraHojaRutaCabeceraController extends AbstractController<TraHojaRutaCabecera> {

    @Inject
    private TraPersonaController perHrcFkController;
    @Inject
    private MobilePageController mobilePageController;

    public TraHojaRutaCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraHojaRutaCabecera Entity
        super(TraHojaRutaCabecera.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        perHrcFkController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of TraHojaRutaDetalle
     * entities that are retrieved from TraHojaRutaCabecera?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for TraHojaRutaDetalle page
     */
    public String navigateTraHojaRutaDetalleList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraHojaRutaDetalle_items", this.getSelected().getTraHojaRutaDetalleList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traHojaRutaDetalle/index";
    }

    /**
     * Sets the "selected" attribute of the TraPersona controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePerHrcFk(ActionEvent event) {
        if (this.getSelected() != null && perHrcFkController.getSelected() == null) {
            perHrcFkController.setSelected(this.getSelected().getPerHrcFk());
        }
    }
}
