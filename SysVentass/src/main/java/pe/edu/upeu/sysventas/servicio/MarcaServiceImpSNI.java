package pe.edu.upeu.sysventas.servicio;

import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.repositorio.MarcaRepositorySIN;

public class MarcaServiceImpSNI implements MarcaServiceISNI{

    MarcaRepositorySIN repository=new MarcaRepositorySIN();

    @Override
    public Marca guardarMarca(Marca marca) {
        return repository.guardarMarca(marca);
    }
}