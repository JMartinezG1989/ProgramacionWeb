package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraOperacion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traOperacionController")
@ViewScoped
public class TraOperacionController extends AbstractController<TraOperacion> {

    @Inject
    private MobilePageController mobilePageController;

    public TraOperacionController() {
        // Inform the Abstract parent controller of the concrete TraOperacion Entity
        super(TraOperacion.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraPermiso entities that
     * are retrieved from TraOperacion?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for TraPermiso page
     */
    public String navigateTraPermisoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraPermiso_items", this.getSelected().getTraPermisoList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traPermiso/index";
    }

}
