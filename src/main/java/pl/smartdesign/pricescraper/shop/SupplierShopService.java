package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierShopService {

    private final SupplierShopRepository supplierShopRepository;

    @Autowired
    public SupplierShopService(SupplierShopRepository supplierShopRepository) {
        this.supplierShopRepository = supplierShopRepository;
    }
}
