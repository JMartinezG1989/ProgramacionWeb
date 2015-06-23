package ec.edu.ups.backing;

import ec.edu.ups.backing.util.MobilePageController;
import ec.edu.ups.entities.TraContabilidadRetenciones;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "traContabilidadRetencionesController")
@ViewScoped
public class TraContabilidadRetencionesController extends AbstractController<TraContabilidadRetenciones> {

    @Inject
    private MobilePageController mobilePageController;

    public TraContabilidadRetencionesController() {
        // Inform the Abstract parent controller of the concrete TraContabilidadRetenciones Entity
        super(TraContabilidadRetenciones.class);
    }

}
