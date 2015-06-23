package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraContaMayorDetalles;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traContaMayorDetallesController")
@ViewScoped
public class TraContaMayorDetallesController extends AbstractController<TraContaMayorDetalles> {

    @Inject
    private MobilePageController mobilePageController;

    public TraContaMayorDetallesController() {
        // Inform the Abstract parent controller of the concrete TraContaMayorDetalles Entity
        super(TraContaMayorDetalles.class);
    }

}
