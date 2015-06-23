package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraChequeCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traChequeCabeceraController")
@ViewScoped
public class TraChequeCabeceraController extends AbstractController<TraChequeCabecera> {

    @Inject
    private MobilePageController mobilePageController;

    public TraChequeCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraChequeCabecera Entity
        super(TraChequeCabecera.class);
    }

}
