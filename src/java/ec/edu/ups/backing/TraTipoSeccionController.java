package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraTipoSeccion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traTipoSeccionController")
@ViewScoped
public class TraTipoSeccionController extends AbstractController<TraTipoSeccion> {

    @Inject
    private MobilePageController mobilePageController;

    public TraTipoSeccionController() {
        // Inform the Abstract parent controller of the concrete TraTipoSeccion Entity
        super(TraTipoSeccion.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraSeccion entities that
     * are retrieved from TraTipoSeccion?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for TraSeccion page
     */
    public String navigateTraSeccionList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraSeccion_items", this.getSelected().getTraSeccionList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traSeccion/index";
    }

}
