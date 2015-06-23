package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraIngresoDetalle;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traIngresoDetalleController")
@ViewScoped
public class TraIngresoDetalleController extends AbstractController<TraIngresoDetalle> {

    @Inject
    private MobilePageController mobilePageController;

    public TraIngresoDetalleController() {
        // Inform the Abstract parent controller of the concrete TraIngresoDetalle Entity
        super(TraIngresoDetalle.class);
    }

}
