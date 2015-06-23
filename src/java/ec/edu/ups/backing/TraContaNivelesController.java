package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraContaNiveles;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traContaNivelesController")
@ViewScoped
public class TraContaNivelesController extends AbstractController<TraContaNiveles> {

    @Inject
    private MobilePageController mobilePageController;

    public TraContaNivelesController() {
        // Inform the Abstract parent controller of the concrete TraContaNiveles Entity
        super(TraContaNiveles.class);
    }

}
