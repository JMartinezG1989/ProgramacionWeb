package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraNumeroFacturas;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traNumeroFacturasController")
@ViewScoped
public class TraNumeroFacturasController extends AbstractController<TraNumeroFacturas> {

    @Inject
    private MobilePageController mobilePageController;

    public TraNumeroFacturasController() {
        // Inform the Abstract parent controller of the concrete TraNumeroFacturas Entity
        super(TraNumeroFacturas.class);
    }

}
