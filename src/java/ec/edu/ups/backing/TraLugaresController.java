package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraLugares;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "traLugaresController")
@ViewScoped
public class TraLugaresController extends AbstractController<TraLugares> {

    @Inject
    private TraTipoLugaresController hrcHrdFkController;
    @Inject
    private TraLugaresController lugPadreIdController;
    @Inject
    private MobilePageController mobilePageController;

    public TraLugaresController() {
        // Inform the Abstract parent controller of the concrete TraLugares Entity
        super(TraLugares.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        hrcHrdFkController.setSelected(null);
        lugPadreIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the TraTipoLugares controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareHrcHrdFk(ActionEvent event) {
        if (this.getSelected() != null && hrcHrdFkController.getSelected() == null) {
            hrcHrdFkController.setSelected(this.getSelected().getHrcHrdFk());
        }
    }

    /**
     * Sets the "items" attribute with a collection of TraLugares entities that
     * are retrieved from TraLugares?cap_first and returns the navigation
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

    /**
     * Sets the "selected" attribute of the TraLugares controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareLugPadreId(ActionEvent event) {
        if (this.getSelected() != null && lugPadreIdController.getSelected() == null) {
            lugPadreIdController.setSelected(this.getSelected().getLugPadreId());
        }
    }

    /**
     * Sets the "items" attribute with a collection of TraGuiaRemisionCabecera
     * entities that are retrieved from TraLugares?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraGuiaRemisionCabecera page
     */
    public String navigateTraGuiaRemisionCabeceraList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraGuiaRemisionCabecera_items", this.getSelected().getTraGuiaRemisionCabeceraList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traGuiaRemisionCabecera/index";
    }

    /**
     * Sets the "items" attribute with a collection of TraGuiaRemisionCabecera
     * entities that are retrieved from TraLugares?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for TraGuiaRemisionCabecera page
     */
    public String navigateTraGuiaRemisionCabeceraList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraGuiaRemisionCabecera_items", this.getSelected().getTraGuiaRemisionCabeceraList1());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traGuiaRemisionCabecera/index";
    }

}
