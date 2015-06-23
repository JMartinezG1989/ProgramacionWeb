package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraTipoAsientos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traTipoAsientosController")
@ViewScoped
public class TraTipoAsientosController extends AbstractController<TraTipoAsientos> {

    @Inject
    private MobilePageController mobilePageController;

    public TraTipoAsientosController() {
        // Inform the Abstract parent controller of the concrete TraTipoAsientos Entity
        super(TraTipoAsientos.class);
    }

}
