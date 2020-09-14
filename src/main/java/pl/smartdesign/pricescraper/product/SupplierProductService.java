package pl.smartdesign.pricescraper.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smartdesign.pricescraper.product.model.NewSupplierProductRequest;
import pl.smartdesign.pricescraper.product.model.SupplierProduct;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SupplierProductService {

    private final SupplierProductRepository supplierProductRepository;

    @Autowired
    public SupplierProductService(SupplierProductRepository supplierProductRepository) {
        this.supplierProductRepository = supplierProductRepository;
    }

    public SupplierProduct getProductById(Long supplierProductId) {
        return supplierProductRepository.findById(supplierProductId).orElseThrow(
                () -> new EntityNotFoundException("Produkt o ID: " + supplierProductId + " Nie Istnieje w Bazie Danych."));
    }

    public List<SupplierProduct> getAllSuppliersProducts() {
        return supplierProductRepository.findAll();
    }

    public SupplierProduct addSupplierProduct(NewSupplierProductRequest newSupplierProductRequest) {
        SupplierProduct supplierProduct = new SupplierProduct();
        supplierProduct.setName(newSupplierProductRequest.getName());
        supplierProduct.setExternalId(newSupplierProductRequest.getExternalId());
        supplierProduct.setUrl(newSupplierProductRequest.getUrl());
        return supplierProductRepository.save(supplierProduct);
    }

    public SupplierProduct updateSupplierProduct(Long supplierProductId, NewSupplierProductRequest updateSupplierProductRequest) {
        SupplierProduct supplierProduct = new SupplierProduct();
        supplierProduct.setName(updateSupplierProductRequest.getName());
        supplierProduct.setExternalId(updateSupplierProductRequest.getExternalId());
        supplierProduct.setUrl(updateSupplierProductRequest.getUrl());
        return supplierProductRepository.save(supplierProduct);
    }

    public void deleteSupplierProductById(Long supplierProductId) {
        supplierProductRepository.deleteById(supplierProductId);
    }
}
