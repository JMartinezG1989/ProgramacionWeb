package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraBancos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traBancosController")
@ViewScoped
public class TraBancosController extends AbstractController<TraBancos> {

    @Inject
    private MobilePageController mobilePageController;

    public TraBancosController() {
        // Inform the Abstract parent controller of the concrete TraBancos Entity
        super(TraBancos.class);
    }

}
