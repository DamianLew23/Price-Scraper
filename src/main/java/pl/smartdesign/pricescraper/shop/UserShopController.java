package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users-shops")
public class UserShopController {

    private final UserShopService userShopService;

    @Autowired
    public UserShopController(UserShopService userShopService) {
        this.userShopService = userShopService;
    }
}
