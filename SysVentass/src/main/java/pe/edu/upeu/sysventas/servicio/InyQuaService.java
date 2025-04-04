package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.repositorio.MyRepository;

@Service
public class InyQuaService {
    @Qualifier("myRegularRepository")
    @Autowired
    private MyRepository repository;

    /*public InyQuaService(@Qualifier("mySpecialRepository") MyRepository repository){
        this.repository=repository;
    }*/
    public Marca guardarEntidad(Marca m){
        return repository.guardar(m);
    }
}
