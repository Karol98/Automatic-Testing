import Model.Cars;
import Model.Ships;
import Service.CrudService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CrudServiceCarsTest {

    @Mock
    CrudService<Cars> carsCrudService;

    @Test
    void should_check_if_car_is_saved() {
        Cars car = new Cars.Builder("Polonez").build();
        when(carsCrudService.saveVehicle(car)).thenReturn(car);
        Assert.assertThat(carsCrudService.saveVehicle(car), Matchers.is(car));
    }

    @Test
    public void should_check_if_list_size_is_2() {
        when(carsCrudService.getAll()).thenReturn(prepareMockData());
        Assert.assertThat(carsCrudService.getAll(), Matchers.hasSize(2));
    }

    @Test
    public void should_check_if_car_model_is_qashqai() {
        when(carsCrudService.getVehicleById(0)).thenReturn(new Cars.Builder("Nissan").setModel("qashqai").build());
        Assert.assertEquals("qashqai", carsCrudService.getVehicleById(0).getModel());
    }

    @Test
    public void should_check_if_shiplist_sieze_is_2() {
        CrudService<Ships> crudService = mock(CrudService.class);
        given(crudService.getAll()).willReturn(prepareMockDataShips());
        Assert.assertThat(crudService.getAll(), Matchers.hasSize(2));
    }


    public ArrayList<Cars> prepareMockData() {
        ArrayList<Cars> carList = new ArrayList<>();
        Cars audi = new Cars.Builder("Audi")
                .setModel("A8")
                .build();
        Cars BMW = new Cars.Builder("BMW")
                .setModel("X5")
                .build();
        carList.add(audi);
        carList.add(BMW);
        return carList;
    }

    public ArrayList<Ships> prepareMockDataShips() {
        ArrayList<Ships> shipsArrayList = new ArrayList<>();
        Ships Qeen = new Ships.Builder("Qeen Marry 2")
                .build();
        Ships Tytanic = new Ships.Builder("Tytanic")
                .build();
        shipsArrayList.add(Qeen);
        shipsArrayList.add(Tytanic);
        return shipsArrayList;
    }
}