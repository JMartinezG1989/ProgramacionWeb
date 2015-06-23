package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraTipodocs;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traTipodocsController")
@ViewScoped
public class TraTipodocsController extends AbstractController<TraTipodocs> {

    @Inject
    private MobilePageController mobilePageController;

    public TraTipodocsController() {
        // Inform the Abstract parent controller of the concrete TraTipodocs Entity
        super(TraTipodocs.class);
    }

}
