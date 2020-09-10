package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShopService {

    private final UserShopRepository userShopRepository;

    @Autowired
    public UserShopService(UserShopRepository userShopRepository) {
        this.userShopRepository = userShopRepository;
    }
}
