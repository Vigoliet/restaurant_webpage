import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.models.Restaurant;
import com.example.restaurant_webpage.services.RestaurantService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class RestaurantServiceTests {

    @Test
    public void testGetRestaurantsByCity() {
        City mockCity = new City();
        Restaurant mockRestaurant = new Restaurant();
        Restaurant mockRestaurant2 = new Restaurant();
        List<Restaurant> mockRestaurants = Arrays.asList(mockRestaurant, mockRestaurant2);

        RestaurantService restaurantService = Mockito.mock(RestaurantService.class);
        when(restaurantService.getResturantsByCity(mockCity)).thenReturn(mockRestaurants);

        List<Restaurant> returnedRestaurants = restaurantService.getResturantsByCity(mockCity);

        assertEquals(mockRestaurants, returnedRestaurants);


    }
}
