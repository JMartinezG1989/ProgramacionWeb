package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraNumeroLiquidacion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traNumeroLiquidacionController")
@ViewScoped
public class TraNumeroLiquidacionController extends AbstractController<TraNumeroLiquidacion> {

    @Inject
    private MobilePageController mobilePageController;

    public TraNumeroLiquidacionController() {
        // Inform the Abstract parent controller of the concrete TraNumeroLiquidacion Entity
        super(TraNumeroLiquidacion.class);
    }

}
