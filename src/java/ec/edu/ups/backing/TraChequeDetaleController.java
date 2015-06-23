package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraChequeDetale;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traChequeDetaleController")
@ViewScoped
public class TraChequeDetaleController extends AbstractController<TraChequeDetale> {

    @Inject
    private MobilePageController mobilePageController;

    public TraChequeDetaleController() {
        // Inform the Abstract parent controller of the concrete TraChequeDetale Entity
        super(TraChequeDetale.class);
    }

}
