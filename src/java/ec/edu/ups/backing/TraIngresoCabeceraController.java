package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraIngresoCabecera;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traIngresoCabeceraController")
@ViewScoped
public class TraIngresoCabeceraController extends AbstractController<TraIngresoCabecera> {

    @Inject
    private MobilePageController mobilePageController;

    public TraIngresoCabeceraController() {
        // Inform the Abstract parent controller of the concrete TraIngresoCabecera Entity
        super(TraIngresoCabecera.class);
    }

}
