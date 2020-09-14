package pl.smartdesign.pricescraper.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.smartdesign.pricescraper.product.model.NewUserProductRequest;
import pl.smartdesign.pricescraper.product.model.UserProduct;

import java.util.List;

@RestController
@RequestMapping("/users-products")
public class UserProductController {

    private final UserProductService userProductService;

    @Autowired
    public UserProductController(UserProductService userProductService) {
        this.userProductService = userProductService;
    }

    @GetMapping("/{userProductId}")
    @ResponseStatus(HttpStatus.OK)
    public UserProduct getUserProductById(@PathVariable("userProductId") Long userProductId) {
        return userProductService.getProductById(userProductId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserProduct> getAllUsersProducts() {
        return userProductService.getAllUsersProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserProduct addUserProduct(@RequestBody NewUserProductRequest newUserProductRequest) {
        return userProductService.addUserProduct(newUserProductRequest);
    }

    @PutMapping("/{userProductId}")
    @ResponseStatus(HttpStatus.OK)
    public UserProduct updateUserProduct(@PathVariable("userProductId") Long userProductId, @RequestBody NewUserProductRequest updateUserProductRequest) {
        return userProductService.updateUserProduct(userProductId, updateUserProductRequest);
    }

    @DeleteMapping("/{userProductId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserProduct(@PathVariable("userProductId") Long userProductId) {
        userProductService.deleteUserProductById(userProductId);
    }
}
