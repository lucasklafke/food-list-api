package unittests.mocks;

import com.list.food.foodlist.model.Dish;
import org.junit.jupiter.api.Test;

public class MockDish {

    public Dish mockEntity(Integer number) {
        Dish dish = new Dish();
        dish.setTimeToPrepare(15);
        dish.setDescription("description");
        return dish;
    }
}
