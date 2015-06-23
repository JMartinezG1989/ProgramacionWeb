package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraNumeroIngresos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traNumeroIngresosController")
@ViewScoped
public class TraNumeroIngresosController extends AbstractController<TraNumeroIngresos> {

    @Inject
    private MobilePageController mobilePageController;

    public TraNumeroIngresosController() {
        // Inform the Abstract parent controller of the concrete TraNumeroIngresos Entity
        super(TraNumeroIngresos.class);
    }

}
