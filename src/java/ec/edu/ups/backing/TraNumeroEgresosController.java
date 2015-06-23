package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraNumeroEgresos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traNumeroEgresosController")
@ViewScoped
public class TraNumeroEgresosController extends AbstractController<TraNumeroEgresos> {

    @Inject
    private MobilePageController mobilePageController;

    public TraNumeroEgresosController() {
        // Inform the Abstract parent controller of the concrete TraNumeroEgresos Entity
        super(TraNumeroEgresos.class);
    }

}
