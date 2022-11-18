package unittests.mockito;

import static org.junit.jupiter.api.Assertions.*;
import com.list.food.foodlist.model.Dish;
import com.list.food.foodlist.repositories.DishRepository;
import com.list.food.foodlist.services.DishService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import unittests.mocks.MockDish;

import java.util.Optional;

import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class DishServiceTest {

    MockDish input;

    @InjectMocks
    private DishService service;

    @Mock
    DishRepository repository;

    @BeforeEach
    void setUpMocks() throws Exception {
        input = new MockDish();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindById() {
        Dish entity = input.mockEntity(1);

        entity.setId(1L);

        when(repository.findById(1L)).thenReturn(Optional.of(entity));

        var result = service.findById(1L);
        assertNotNull(result);
        assertNotNull(result.getId());
//        assertNotNull(result.getLinks());

//        assertTrue(result.toString().contains("links: [</api/person/v1/1>;rel=\"self\"]"));
//        assertEquals("Addres Test1", result.getAddress());
//        assertEquals("First Name Test1", result.getFirstName());
//        assertEquals("Last Name Test1", result.getLastName());
//        assertEquals("Female", result.getGender());
    }

}
