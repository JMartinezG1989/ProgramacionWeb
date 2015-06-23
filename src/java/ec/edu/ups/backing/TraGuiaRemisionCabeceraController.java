package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraGuiaRemisionCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traGuiaRemisionCabeceraController")
@ViewScoped
public class TraGuiaRemisionCabeceraController extends AbstractController<TraGuiaRemisionCabecera> {

    @Inject
    private TraPersonaController tpeGrcFkController;
    @Inject
    private TraMotivoTrasladosController mtrGrcFkController;
    @Inject
    private TraLugaresController lugGrcOrigenFkController;
    @Inject
    private TraLugaresController lugGrcDestinoFkController;
    @Inject
    private TraFacturaIvasController tfiGrcFkController;
    @Inject
    private MobilePageController mobilePageController;

    public TraGuiaRemisionCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraGuiaRemisionCabecera Entity
        super(TraGuiaRemisionCabecera.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        tpeGrcFkController.setSelected(null);
        mtrGrcFkController.setSelected(null);
        lugGrcOrigenFkController.setSelected(null);
        lugGrcDestinoFkController.setSelected(null);
        tfiGrcFkController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraPersona controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTpeGrcFk(ActionEvent event) {
        if (this.getSelected() != null && tpeGrcFkController.getSelected() == null) {
            tpeGrcFkController.setSelected(this.getSelected().getTpeGrcFk());
        }
    }

    /**
     * Sets the "selected" attribute of the TraMotivoTraslados controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareMtrGrcFk(ActionEvent event) {
        if (this.getSelected() != null && mtrGrcFkController.getSelected() == null) {
            mtrGrcFkController.setSelected(this.getSelected().getMtrGrcFk());
        }
    }

    /**
     * Sets the "selected" attribute of the TraLugares controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareLugGrcOrigenFk(ActionEvent event) {
        if (this.getSelected() != null && lugGrcOrigenFkController.getSelected() == null) {
            lugGrcOrigenFkController.setSelected(this.getSelected().getLugGrcOrigenFk());
        }
    }

    /**
     * Sets the "selected" attribute of the TraLugares controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareLugGrcDestinoFk(ActionEvent event) {
        if (this.getSelected() != null && lugGrcDestinoFkController.getSelected() == null) {
            lugGrcDestinoFkController.setSelected(this.getSelected().getLugGrcDestinoFk());
        }
    }

    /**
     * Sets the "selected" attribute of the TraFacturaIvas controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTfiGrcFk(ActionEvent event) {
        if (this.getSelected() != null && tfiGrcFkController.getSelected() == null) {
            tfiGrcFkController.setSelected(this.getSelected().getTfiGrcFk());
        }
    }

    /**
     * Sets the "items" attribute with a collection of TraDetallesGuia entities
     * that are retrieved from TraGuiaRemisionCabecera?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraDetallesGuia page
     */
    public String navigateTraDetallesGuiaList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraDetallesGuia_items", this.getSelected().getTraDetallesGuiaList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traDetallesGuia/index";
    }

}
