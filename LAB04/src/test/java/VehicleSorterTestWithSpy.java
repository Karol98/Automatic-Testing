import Model.Ships;
import Model.Vehicles;
import Service.CrudService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VehicleSorterTestWithSpy<T extends Vehicles> {

    @Test
    public void should_check_names_of_cars() {
        CrudService<Ships> crudService = mock(CrudService.class);
        when(crudService.getAll()).thenReturn(prepareMockData());
        VehicleSorter<Ships> vehicleSorter = new VehicleSorter<>(crudService);
        ArrayList<String> names = vehicleSorter.getVehicleNames();
        Assert.assertThat(names, Matchers.hasSize(3));
    }


    @Test
    public void should_check_if_list_is_sorted() {
        CrudService<Ships> crudService = mock(CrudService.class);
        when(crudService.getAll()).thenReturn(prepareMockData());
        VehicleSorter<Ships> vehicleSorter = new VehicleSorter<>(crudService);
        ArrayList<String> names = vehicleSorter.sortVehiclesNames();
        Assert.assertEquals(names.get(0), "Qeen Merry 2");
    }

    @Test
    public void should_check_if_list_is_sorted_reverse() {
        CrudService<Ships> crudService = mock(CrudService.class);
        when(crudService.getAll()).thenReturn(prepareMockData());
        VehicleSorter<Ships> vehicleSorter = new VehicleSorter<>(crudService);
        ArrayList<String> names = vehicleSorter.sortVehiclesNamesReverse();
        Assert.assertEquals(names.get(0), "Tytanic");
        Assert.assertEquals(names.get(names.size()-1), "Qeen Merry 2");
    }


    public ArrayList<Ships> prepareMockData() {
        ArrayList<Ships> carList = new ArrayList<>();
        ArrayList<String> sortedNames = new ArrayList<>();
        Ships Qeen2 = new Ships.Builder("Qeen Merry 2")
                .build();
        Ships Tytanic = new Ships.Builder("Tytanic")
                .build();
        Ships Symphony = new Ships.Builder("Symphony of the Seas")
                .build();
        carList.add(Qeen2);
        carList.add(Tytanic);
        carList.add(Symphony);
     //   carList.forEach(x -> sortedNames.add(x.getName()));
        return carList;
    }
}
