package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraAsientosCuentas;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traAsientosCuentasController")
@ViewScoped
public class TraAsientosCuentasController extends AbstractController<TraAsientosCuentas> {

    @Inject
    private MobilePageController mobilePageController;

    public TraAsientosCuentasController() {
        // Inform the Abstract parent controller of the concrete TraAsientosCuentas Entity
        super(TraAsientosCuentas.class);
    }

}
