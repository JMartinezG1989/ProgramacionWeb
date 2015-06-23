package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraNumeroGuias;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traNumeroGuiasController")
@ViewScoped
public class TraNumeroGuiasController extends AbstractController<TraNumeroGuias> {

    @Inject
    private MobilePageController mobilePageController;

    public TraNumeroGuiasController() {
        // Inform the Abstract parent controller of the concrete TraNumeroGuias Entity
        super(TraNumeroGuias.class);
    }

}
