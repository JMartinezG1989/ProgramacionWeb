package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraUsuario;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traUsuarioController")
@ViewScoped
public class TraUsuarioController extends AbstractController<TraUsuario> {

    @Inject
    private MobilePageController mobilePageController;

    public TraUsuarioController() {
        // Inform the Abstract parent controller of the concrete TraUsuario Entity
        super(TraUsuario.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraUsuarioRol entities
     * that are retrieved from TraUsuario?cap_first and returns the navigation
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

}
