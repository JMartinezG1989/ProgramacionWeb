package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraRutas;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traRutasController")
@ViewScoped
public class TraRutasController extends AbstractController<TraRutas> {

    @Inject
    private MobilePageController mobilePageController;

    public TraRutasController() {
        // Inform the Abstract parent controller of the concrete TraRutas Entity
        super(TraRutas.class);
    }

}
