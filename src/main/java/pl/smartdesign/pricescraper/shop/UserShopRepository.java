package pl.smartdesign.pricescraper.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.smartdesign.pricescraper.shop.model.UserShop;

@Repository
public interface UserShopRepository extends JpaRepository<UserShop, Long> {
}
