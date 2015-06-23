package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraPermiso;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traPermisoController")
@ViewScoped
public class TraPermisoController extends AbstractController<TraPermiso> {

    @Inject
    private TraSeccionController secIdController;
    @Inject
    private TraRolController rolIdController;
    @Inject
    private TraOperacionController opeIdController;
    @Inject
    private MobilePageController mobilePageController;

    public TraPermisoController() {
        // Inform the Abstract parent controller of the concrete TraPermiso Entity
        super(TraPermiso.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        secIdController.setSelected(null);
        rolIdController.setSelected(null);
        opeIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraSeccion controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSecId(ActionEvent event) {
        if (this.getSelected() != null && secIdController.getSelected() == null) {
            secIdController.setSelected(this.getSelected().getSecId());
        }
    }

    /**
     * Sets the "selected" attribute of the TraRol controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareRolId(ActionEvent event) {
        if (this.getSelected() != null && rolIdController.getSelected() == null) {
            rolIdController.setSelected(this.getSelected().getRolId());
        }
    }

    /**
     * Sets the "selected" attribute of the TraOperacion controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareOpeId(ActionEvent event) {
        if (this.getSelected() != null && opeIdController.getSelected() == null) {
            opeIdController.setSelected(this.getSelected().getOpeId());
        }
    }
}
