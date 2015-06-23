package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraContaCuenta;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traContaCuentaController")
@ViewScoped
public class TraContaCuentaController extends AbstractController<TraContaCuenta> {

    @Inject
    private MobilePageController mobilePageController;

    public TraContaCuentaController() {
        // Inform the Abstract parent controller of the concrete TraContaCuenta Entity
        super(TraContaCuenta.class);
    }

}
