package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraSeccion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traSeccionController")
@ViewScoped
public class TraSeccionController extends AbstractController<TraSeccion> {

    @Inject
    private TraTipoSeccionController tisIdController;
    @Inject
    private MobilePageController mobilePageController;

    public TraSeccionController() {
        // Inform the Abstract parent controller of the concrete TraSeccion Entity
        super(TraSeccion.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        tisIdController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of TraPermiso entities that
     * are retrieved from TraSeccion?cap_first and returns the navigation
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

    /**
     * Sets the "selected" attribute of the TraTipoSeccion controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTisId(ActionEvent event) {
        if (this.getSelected() != null && tisIdController.getSelected() == null) {
            tisIdController.setSelected(this.getSelected().getTisId());
        }
    }
}
