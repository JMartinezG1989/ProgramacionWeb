package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraTipoPersona;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traTipoPersonaController")
@ViewScoped
public class TraTipoPersonaController extends AbstractController<TraTipoPersona> {

    @Inject
    private MobilePageController mobilePageController;

    public TraTipoPersonaController() {
        // Inform the Abstract parent controller of the concrete TraTipoPersona Entity
        super(TraTipoPersona.class);
    }

}
