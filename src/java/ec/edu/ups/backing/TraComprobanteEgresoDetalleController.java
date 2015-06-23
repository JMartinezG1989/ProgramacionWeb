package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraComprobanteEgresoDetalle;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traComprobanteEgresoDetalleController")
@ViewScoped
public class TraComprobanteEgresoDetalleController extends AbstractController<TraComprobanteEgresoDetalle> {

    @Inject
    private MobilePageController mobilePageController;

    public TraComprobanteEgresoDetalleController() {
        // Inform the Abstract parent controller of the concrete TraComprobanteEgresoDetalle Entity
        super(TraComprobanteEgresoDetalle.class);
    }

}
