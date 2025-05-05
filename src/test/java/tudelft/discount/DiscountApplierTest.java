package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountApplierTest {

    @Test
    public void testApplyDiscountsToProducts() {
        Product p1 = new Product("Laptop", 1000.0, "BUSINESS");
        Product p2 = new Product("Silla", 100.0, "HOME");
        Product p3 = new Product("Borrador", 5.0, "OTHER");

        ProductDao dao = Mockito.mock(ProductDao.class);
        List<Product> mockProducts = Arrays.asList(p1, p2, p3);
        Mockito.when(dao.all()).thenReturn(mockProducts);

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(900.0, p1.getPrice(), 0.01);
        assertEquals(110.0, p2.getPrice(), 0.01);
        assertEquals(5.0, p3.getPrice(), 0.01);
    }
}
