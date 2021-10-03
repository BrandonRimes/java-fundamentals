package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest
{
    @Test void testaurant()
    {
        Restaurant testings = new Restaurant("Testings", 1);
        String expected = "Testings";
        String actual = testings.name;
        assertEquals(expected, actual);
    }
}
