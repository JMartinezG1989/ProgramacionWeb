package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraTipoCuentas;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traTipoCuentasController")
@ViewScoped
public class TraTipoCuentasController extends AbstractController<TraTipoCuentas> {

    @Inject
    private MobilePageController mobilePageController;

    public TraTipoCuentasController() {
        // Inform the Abstract parent controller of the concrete TraTipoCuentas Entity
        super(TraTipoCuentas.class);
    }

}
