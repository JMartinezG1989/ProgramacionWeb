package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraUsuarioRol;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traUsuarioRolController")
@ViewScoped
public class TraUsuarioRolController extends AbstractController<TraUsuarioRol> {

    @Inject
    private TraUsuarioController usuIdController;
    @Inject
    private TraRolController rolIdController;
    @Inject
    private MobilePageController mobilePageController;

    public TraUsuarioRolController() {
        // Inform the Abstract parent controller of the concrete TraUsuarioRol Entity
        super(TraUsuarioRol.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        usuIdController.setSelected(null);
        rolIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraUsuario controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareUsuId(ActionEvent event) {
        if (this.getSelected() != null && usuIdController.getSelected() == null) {
            usuIdController.setSelected(this.getSelected().getUsuId());
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
}
