package pe.edu.upeu.sysventas.repositorio;

import pe.edu.upeu.sysventas.modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
