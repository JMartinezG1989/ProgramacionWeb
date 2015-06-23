package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraLiquidacionDetalle;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traLiquidacionDetalleController")
@ViewScoped
public class TraLiquidacionDetalleController extends AbstractController<TraLiquidacionDetalle> {

    @Inject
    private MobilePageController mobilePageController;

    public TraLiquidacionDetalleController() {
        // Inform the Abstract parent controller of the concrete TraLiquidacionDetalle Entity
        super(TraLiquidacionDetalle.class);
    }

}
