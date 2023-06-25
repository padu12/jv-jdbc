package mate.jdbc;

import mate.jdbc.dao.ManufacturerDao;
import mate.jdbc.dao.ManufacturerDaoImpl;
import mate.jdbc.lib.Injector;
import mate.jdbc.model.Manufacturer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManufacturerDaoImpl manufacturerDao = new ManufacturerDaoImpl();
        List<Manufacturer> manufacturerList = manufacturerDao.getAll();
        for (Manufacturer manufacturer : manufacturerList) {
            System.out.println(manufacturer);
        }
    }
}
