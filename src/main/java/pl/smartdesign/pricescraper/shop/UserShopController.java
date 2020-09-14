package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.smartdesign.pricescraper.shop.model.NewUserShopRequest;
import pl.smartdesign.pricescraper.shop.model.UserShop;

import java.util.List;

@RestController
@RequestMapping("/users-shops")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserShopController {

    private final UserShopService userShopService;

    @Autowired
    public UserShopController(UserShopService userShopService) {
        this.userShopService = userShopService;
    }

    @GetMapping("/{userShopId}")
    @ResponseStatus(HttpStatus.OK)
    public UserShop getUserShopById(@PathVariable("userShopId") Long userShopId) {
        return userShopService.getUserShopById(userShopId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserShop> getAllUserShops() {
        return userShopService.getAllUserShops();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserShop addUserShop(@RequestBody NewUserShopRequest newUserShopRequest) {
        return userShopService.addUserShop(newUserShopRequest);
    }

    @PutMapping("/{userShopId}")
    @ResponseStatus(HttpStatus.OK)
    public UserShop updateUserShop(@PathVariable("userShopId") Long userShopId, @RequestBody NewUserShopRequest updateUserShopRequest) {
        return userShopService.updateUserShop(userShopId, updateUserShopRequest);
    }

    @DeleteMapping("/{userShopId}")
    public void deleteUserShop(@PathVariable("userShopId") Long userShopId) {
        userShopService.deleteUserShop(userShopId);
    }

}
