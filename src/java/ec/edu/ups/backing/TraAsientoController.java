package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraAsiento;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traAsientoController")
@ViewScoped
public class TraAsientoController extends AbstractController<TraAsiento> {

    @Inject
    private MobilePageController mobilePageController;

    public TraAsientoController() {
        // Inform the Abstract parent controller of the concrete TraAsiento Entity
        super(TraAsiento.class);
    }

}
