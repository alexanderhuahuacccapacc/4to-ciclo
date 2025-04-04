package pe.edu.upeu.sysventas.repositorio;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysventas.modelo.Marca;

@Repository("MySpecialRepository")
public class MySpecialRepository implements MyRepository {
        @Override
        public Marca guardar (Marca to){
            System.out.println("Marca Guardado Especial");
            return to;
        }

}
