package Repository;

import Model.Vehicles;

import java.util.ArrayList;

public interface CrudRepository<T extends Vehicles> {

     ArrayList<T> getAll();

     T getVehicleById(int id);

     T saveVehicle(T t);

     T deleteVehicle(T t);
}
