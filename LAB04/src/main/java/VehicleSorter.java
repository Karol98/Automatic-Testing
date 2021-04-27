import Model.Vehicles;
import Service.CrudService;

import java.util.ArrayList;
import java.util.Collections;

public class VehicleSorter<T extends Vehicles> {

    CrudService<T> crudService;

    public VehicleSorter(CrudService<T> crudService) {
        this.crudService = crudService;
    }

    public ArrayList<String> getVehicleNames() {
        ArrayList<T> vehiclesList = crudService.getAll();
        ArrayList<String> namesList = new ArrayList<>();
        vehiclesList.forEach(x -> namesList.add(x.getName()));
        return namesList;
    }

    public ArrayList<String> sortVehiclesNames() {
        ArrayList<String> sortedVehicleNames = getVehicleNames();
        Collections.sort(sortedVehicleNames);
        return sortedVehicleNames;
    }

    public ArrayList<String> sortVehiclesNamesReverse() {
        ArrayList<String> sortedVehicleNames = getVehicleNames();
        Collections.sort(sortedVehicleNames);
        Collections.reverse(sortedVehicleNames);
        return sortedVehicleNames;
    }
}
