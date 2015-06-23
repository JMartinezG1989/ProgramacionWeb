package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraLiquidacionCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traLiquidacionCabeceraController")
@ViewScoped
public class TraLiquidacionCabeceraController extends AbstractController<TraLiquidacionCabecera> {

    @Inject
    private MobilePageController mobilePageController;

    public TraLiquidacionCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraLiquidacionCabecera Entity
        super(TraLiquidacionCabecera.class);
    }

}
