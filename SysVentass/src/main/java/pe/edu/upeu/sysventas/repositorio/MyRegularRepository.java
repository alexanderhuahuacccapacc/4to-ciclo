package pe.edu.upeu.sysventas.repositorio;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysventas.modelo.Marca;


@Primary
@Repository("myRegularRepository")
public class MyRegularRepository implements MyRepository {
    @Override
    public Marca guardar(Marca to) {
        System.out.println("Guardado Marca Regular");
        return to;
    }
}