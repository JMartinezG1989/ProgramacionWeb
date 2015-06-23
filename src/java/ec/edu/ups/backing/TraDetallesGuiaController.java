package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraDetallesGuia;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traDetallesGuiaController")
@ViewScoped
public class TraDetallesGuiaController extends AbstractController<TraDetallesGuia> {

    @Inject
    private TraGuiaRemisionCabeceraController grcDguFkController;
    @Inject
    private MobilePageController mobilePageController;

    public TraDetallesGuiaController() {
        // Inform the Abstract parent controller of the concrete TraDetallesGuia Entity
        super(TraDetallesGuia.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        grcDguFkController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraGuiaRemisionCabecera controller
     * in order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareGrcDguFk(ActionEvent event) {
        if (this.getSelected() != null && grcDguFkController.getSelected() == null) {
            grcDguFkController.setSelected(this.getSelected().getGrcDguFk());
        }
    }
}
