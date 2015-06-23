package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraFacturaIvas;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traFacturaIvasController")
@ViewScoped
public class TraFacturaIvasController extends AbstractController<TraFacturaIvas> {

    @Inject
    private MobilePageController mobilePageController;

    public TraFacturaIvasController() {
        // Inform the Abstract parent controller of the concrete TraFacturaIvas Entity
        super(TraFacturaIvas.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraGuiaRemisionCabecera
     * entities that are retrieved from TraFacturaIvas?cap_first and returns the
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
     * Sets the "items" attribute with a collection of TraFacturaCabecera
     * entities that are retrieved from TraFacturaIvas?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraFacturaCabecera page
     */
    public String navigateTraFacturaCabeceraList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraFacturaCabecera_items", this.getSelected().getTraFacturaCabeceraList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traFacturaCabecera/index";
    }

}
