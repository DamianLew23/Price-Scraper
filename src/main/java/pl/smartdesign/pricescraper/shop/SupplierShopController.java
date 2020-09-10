package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suppliers-shops")
public class SupplierShopController {

    private final SupplierShopService supplierShopService;

    @Autowired
    public SupplierShopController(SupplierShopService supplierShopService) {
        this.supplierShopService = supplierShopService;
    }
}
