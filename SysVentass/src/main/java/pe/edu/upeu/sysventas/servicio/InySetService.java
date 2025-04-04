package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.repositorio.MarcaRepository;

import java.util.List;

@Service
public class InySetService {
    private MarcaRepository repository;

    @Autowired
    public void setMarcaRepository(MarcaRepository repository) {
        this.repository = repository;
    }

    public Marca guardarEntidad(Marca m) {
        return repository.save(m);
    }
    public List<Marca> listar(){
        return repository.findAll();
    }
}
