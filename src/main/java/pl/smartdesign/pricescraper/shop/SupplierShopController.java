package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.smartdesign.pricescraper.shop.model.NewSupplierShopRequest;
import pl.smartdesign.pricescraper.shop.model.NewUserShopRequest;
import pl.smartdesign.pricescraper.shop.model.SupplierShop;
import pl.smartdesign.pricescraper.shop.model.UserShop;

import java.util.List;
import java.util.function.Supplier;

@RestController
@RequestMapping("/suppliers-shops")
public class SupplierShopController {

    private final SupplierShopService supplierShopService;

    @Autowired
    public SupplierShopController(SupplierShopService supplierShopService) {
        this.supplierShopService = supplierShopService;
    }

    @GetMapping("/{supplierShopId}")
    @ResponseStatus(HttpStatus.OK)
    public SupplierShop getUserShopById(@PathVariable("supplierShopId") Long supplierShopId) {
        return supplierShopService.getSupplierShopById(supplierShopId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SupplierShop> getAllSupplierShops() {
        return supplierShopService.getAllSupplierShops();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SupplierShop addSuppliersShop(@RequestBody NewSupplierShopRequest newSupplierShopRequest) {
        return supplierShopService.addSupplierShop(newSupplierShopRequest);
    }

    @PutMapping("/{supplierShopId}")
    @ResponseStatus(HttpStatus.OK)
    public SupplierShop updateUserShop(@PathVariable("supplierShopId") Long supplierShopId, @RequestBody NewSupplierShopRequest updateSupplierShopRequest) {
        return supplierShopService.updateSupplierShop(supplierShopId, updateSupplierShopRequest);
    }

    @DeleteMapping("/{supplierShopId}")
    public void deleteUserShop(@PathVariable("supplierShopId") Long supplierShopId) {
        supplierShopService.deleteSupplierShop(supplierShopId);
    }

}
