import Model.Ships;
import Model.Vehicles;
import Service.CrudService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class VehicleSorterTest<T extends Vehicles> {

    @Mock
    CrudService<Ships> crudService;

    @InjectMocks
    VehicleSorter<Ships> vehicleSorter;

    @Test
    public void should_check_names_of_cars() {
        when(crudService.getAll()).thenReturn(prepareMockData());
        ArrayList<String> names = vehicleSorter.getVehicleNames();
        Assert.assertThat(names, Matchers.hasSize(3));
    }

    @Test
    public void should_check_if_list_is_sorted() {
        when(crudService.getAll()).thenReturn(prepareMockData());
        ArrayList<String> names = vehicleSorter.sortVehiclesNames();
        Assert.assertEquals(names.get(0), "Qeen Merry 2");
    }

    @Test
    public void should_check_if_list_is_sorted_reverse() {
        when(crudService.getAll()).thenReturn(prepareMockData());
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
