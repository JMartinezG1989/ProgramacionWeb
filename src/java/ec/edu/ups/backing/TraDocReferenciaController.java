package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraDocReferencia;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traDocReferenciaController")
@ViewScoped
public class TraDocReferenciaController extends AbstractController<TraDocReferencia> {

    @Inject
    private MobilePageController mobilePageController;

    public TraDocReferenciaController() {
        // Inform the Abstract parent controller of the concrete TraDocReferencia Entity
        super(TraDocReferencia.class);
    }

}
