package pe.edu.upeu.sysventas.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.repositorio.MyRepository;

@RestController
@RequestMapping("/primero")
public class PrimeroController {
    @Autowired
    private MyRepository repository;

    @GetMapping
    public Marca listar(){
        Marca marca = new Marca();
        marca.setNombre("Primero Prueba");
        marca.setIdMarca(1);
        return repository.guardar(marca);
    }
}
