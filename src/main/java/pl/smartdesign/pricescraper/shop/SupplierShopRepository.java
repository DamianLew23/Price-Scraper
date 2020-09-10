package pl.smartdesign.pricescraper.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.smartdesign.pricescraper.shop.model.SupplierShop;

@Repository
public interface SupplierShopRepository extends JpaRepository<SupplierShop, Long> {
}
