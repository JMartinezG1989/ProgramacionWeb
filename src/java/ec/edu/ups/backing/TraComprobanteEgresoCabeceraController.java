package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraComprobanteEgresoCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traComprobanteEgresoCabeceraController")
@ViewScoped
public class TraComprobanteEgresoCabeceraController extends AbstractController<TraComprobanteEgresoCabecera> {

    @Inject
    private MobilePageController mobilePageController;

    public TraComprobanteEgresoCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraComprobanteEgresoCabecera Entity
        super(TraComprobanteEgresoCabecera.class);
    }

}
