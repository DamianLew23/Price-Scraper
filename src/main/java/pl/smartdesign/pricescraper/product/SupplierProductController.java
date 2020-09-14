package pl.smartdesign.pricescraper.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.smartdesign.pricescraper.product.model.NewSupplierProductRequest;
import pl.smartdesign.pricescraper.product.model.SupplierProduct;

import java.util.List;

@RestController
@RequestMapping("/suppliers-products")
public class SupplierProductController {

    private final SupplierProductService supplierProductService;

    @Autowired
    public SupplierProductController(SupplierProductService supplierProductService) {
        this.supplierProductService = supplierProductService;
    }

    @GetMapping("/{supplierProductId}")
    @ResponseStatus(HttpStatus.OK)
    public SupplierProduct getSupplierProductById(@PathVariable("supplierProductId") Long supplierProductId) {
        return supplierProductService.getProductById(supplierProductId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SupplierProduct> getAllSuppliersProducts() {
        return supplierProductService.getAllSuppliersProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SupplierProduct addSupplierProduct(@RequestBody NewSupplierProductRequest newSupplierProductRequest) {
        return supplierProductService.addSupplierProduct(newSupplierProductRequest);
    }

    @PutMapping("/{supplierProductId}")
    @ResponseStatus(HttpStatus.OK)
    public SupplierProduct updateSupplierProduct(@PathVariable("supplierProductId") Long supplierProductId, @RequestBody NewSupplierProductRequest updateSupplierProductRequest) {
        return supplierProductService.updateSupplierProduct(supplierProductId, updateSupplierProductRequest);
    }

    @DeleteMapping("/{supplierProductId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSupplierProduct(@PathVariable("supplierProductId") Long supplierProductId) {
        supplierProductService.deleteSupplierProductById(supplierProductId);
    }
}
