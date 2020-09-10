package pl.smartdesign.pricescraper.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierProductService {

    private final SupplierProductRepository supplierProductRepository;

    @Autowired
    public SupplierProductService(SupplierProductRepository supplierProductRepository) {
        this.supplierProductRepository = supplierProductRepository;
    }
}
