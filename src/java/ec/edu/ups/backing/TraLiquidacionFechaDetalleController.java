package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraLiquidacionFechaDetalle;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traLiquidacionFechaDetalleController")
@ViewScoped
public class TraLiquidacionFechaDetalleController extends AbstractController<TraLiquidacionFechaDetalle> {

    @Inject
    private MobilePageController mobilePageController;

    public TraLiquidacionFechaDetalleController() {
        // Inform the Abstract parent controller of the concrete TraLiquidacionFechaDetalle Entity
        super(TraLiquidacionFechaDetalle.class);
    }

}
