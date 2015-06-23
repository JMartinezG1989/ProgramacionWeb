package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraFacturaTipoPagoCobro;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "traFacturaTipoPagoCobroController")
@ViewScoped
public class TraFacturaTipoPagoCobroController extends AbstractController<TraFacturaTipoPagoCobro> {

    @Inject
    private MobilePageController mobilePageController;

    public TraFacturaTipoPagoCobroController() {
        // Inform the Abstract parent controller of the concrete TraFacturaTipoPagoCobro Entity
        super(TraFacturaTipoPagoCobro.class);
    }

    /**
     * Sets the "items" attribute with a collection of TraFacturaCabecera
     * entities that are retrieved from TraFacturaTipoPagoCobro?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for TraFacturaCabecera page
     */
    public String navigateTraFacturaCabeceraList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("TraFacturaCabecera_items", this.getSelected().getTraFacturaCabeceraList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/traFacturaCabecera/index";
    }

}
