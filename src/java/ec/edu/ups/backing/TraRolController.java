package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraRol;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traRolController")
@ViewScoped
public class TraRolController extends AbstractController<TraRol> {

    @Inject
    private MobilePageController mobilePageController;

    public TraRolController() {
        // Inform the Abstract parent controller of the concrete TraRol Entity
        super(TraRol.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraUsuarioRol entities
     * that are retrieved from TraRol?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for TraUsuarioRol page
     */
    public String navigateTraUsuarioRolList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraUsuarioRol_items", this.getSelected().getTraUsuarioRolList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traUsuarioRol/index";
    }

    /**
     * Sets the "items" attribute with a collection of TraPermiso entities that
     * are retrieved from TraRol?cap_first and returns the navigation outcome.
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
