package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraMotivoTraslados;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traMotivoTrasladosController")
@ViewScoped
public class TraMotivoTrasladosController extends AbstractController<TraMotivoTraslados> {

    @Inject
    private MobilePageController mobilePageController;

    public TraMotivoTrasladosController() {
        // Inform the Abstract parent controller of the concrete TraMotivoTraslados Entity
        super(TraMotivoTraslados.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraGuiaRemisionCabecera
     * entities that are retrieved from TraMotivoTraslados?cap_first and returns
     * the navigation outcome.
     *
     * @return navigation outcome for TraGuiaRemisionCabecera page
     */
    public String navigateTraGuiaRemisionCabeceraList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraGuiaRemisionCabecera_items", this.getSelected().getTraGuiaRemisionCabeceraList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traGuiaRemisionCabecera/index";
    }

}
