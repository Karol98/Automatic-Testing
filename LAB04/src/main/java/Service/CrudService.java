package Service;

import Model.Vehicles;
import Repository.CrudRepository;

import java.util.ArrayList;

public class CrudService<T extends Vehicles> implements CrudRepository<T> {
    ArrayList<T> vehicleList = new ArrayList<>();

    @Override
    public ArrayList<T> getAll() {
        return vehicleList;
    }

    @Override
    public T getVehicleById(int id) {
        return vehicleList.get(id);
    }

    @Override
    public T saveVehicle(T t) {
        vehicleList.add(t);
        return t;
    }

    @Override
    public T deleteVehicle(T t) {
        vehicleList.remove(t);
        return t;
    }

}
