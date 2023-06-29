package mate.jdbc;

import java.util.List;
import mate.jdbc.dao.ManufacturerDaoImpl;
import mate.jdbc.model.Manufacturer;

public class Main {
    public static void main(String[] args) {
        ManufacturerDaoImpl manufacturerDao = new ManufacturerDaoImpl();
        List<Manufacturer> manufacturerList = manufacturerDao.getAll();
        for (Manufacturer manufacturer : manufacturerList) {
            System.out.println(manufacturer);
        }
    }
}
