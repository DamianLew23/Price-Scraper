package pl.smartdesign.pricescraper.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.smartdesign.pricescraper.product.model.UserProduct;

@Repository
public interface UserProductRepository extends JpaRepository<UserProduct, Long> {
}
