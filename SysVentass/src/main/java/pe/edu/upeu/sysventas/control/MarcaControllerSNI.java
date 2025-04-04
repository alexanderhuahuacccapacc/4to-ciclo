package pe.edu.upeu.sysventas.control;

import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.servicio.MarcaServiceImpSNI;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/marcassid")
public class MarcaControllerSNI {
    MarcaServiceImpSNI repository = new MarcaServiceImpSNI();

    @GetMapping
    public Marca getMarcas(){
        //Marca dd= new Marca("1", sdass);
        //return repository.guardarMarca(dd);
        return null;
    }
}
