package store;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.model.Image;
import store.model.Product;
import store.model.Review;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fein on 6/27/2015.
 */
@RestController
public class StoreController {

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public List<Product> findAllProducts() {
        List<Product> result = new ArrayList<>();
        List<Image> images = new ArrayList<>();
        images.add(new Image(1, "../images/1.jpg"));
        List<Review> reviews = new ArrayList<>();
        result.add(new Product("Product1", new BigDecimal(12.54), "Description", "Specs", images, reviews));

        return result;
    }
}
