package mate.jdbc.dao;

import mate.jdbc.lib.Dao;
import mate.jdbc.model.Manufacturer;
import java.util.List;
import java.util.Optional;

public interface ManufacturerDao extends Dao {
    Manufacturer create(Manufacturer manufacturer);
    Optional<Manufacturer> get(Long id);
    List<Manufacturer> getAll();
    Manufacturer update(Manufacturer manufacturer);
    boolean delete(Long id);
}
