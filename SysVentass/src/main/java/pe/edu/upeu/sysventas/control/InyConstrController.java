package pe.edu.upeu.sysventas.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.servicio.InyConstrService;

import java.util.List;

@RestController
@RequestMapping("/marcaics")

public class InyConstrController {
    private final InyConstrService ms;
    public InyConstrController(InyConstrService ms) {
        this.ms = ms;
    }

    @GetMapping("/g")
    public Marca guardar(){
    return ms.guardarEntidad(new Marca(1,"Adidas"));
    }

    @GetMapping
    public List<Marca> listar() {
        return ms.listar();
    }
}
