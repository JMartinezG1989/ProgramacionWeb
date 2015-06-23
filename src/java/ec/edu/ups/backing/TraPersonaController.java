package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraPersona;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traPersonaController")
@ViewScoped
public class TraPersonaController extends AbstractController<TraPersona> {

    @Inject
    private MobilePageController mobilePageController;

    public TraPersonaController() {
        // Inform the Abstract parent controller of the concrete TraPersona Entity
        super(TraPersona.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraGuiaRemisionCabecera
     * entities that are retrieved from TraPersona?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraGuiaRemisionCabecera page
     */
    public String navigateTraGuiaRemisionCabeceraList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraGuiaRemisionCabecera_items", this.getSelected().getTraGuiaRemisionCabeceraList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traGuiaRemisionCabecera/index";
    }

    /**
     * Sets the "items" attribute with a collection of TraHojaRutaCabecera
     * entities that are retrieved from TraPersona?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraHojaRutaCabecera page
     */
    public String navigateTraHojaRutaCabeceraList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraHojaRutaCabecera_items", this.getSelected().getTraHojaRutaCabeceraList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traHojaRutaCabecera/index";
    }

}
