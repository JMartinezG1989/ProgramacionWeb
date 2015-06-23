package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraTipoLugares;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traTipoLugaresController")
@ViewScoped
public class TraTipoLugaresController extends AbstractController<TraTipoLugares> {

    @Inject
    private MobilePageController mobilePageController;

    public TraTipoLugaresController() {
        // Inform the Abstract parent controller of the concrete TraTipoLugares Entity
        super(TraTipoLugares.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraLugares entities that
     * are retrieved from TraTipoLugares?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for TraLugares page
     */
    public String navigateTraLugaresList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraLugares_items", this.getSelected().getTraLugaresList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traLugares/index";
    }

}
