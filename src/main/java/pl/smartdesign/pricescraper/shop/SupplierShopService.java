package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smartdesign.pricescraper.shop.model.NewSupplierShopRequest;
import pl.smartdesign.pricescraper.shop.model.NewUserShopRequest;
import pl.smartdesign.pricescraper.shop.model.SupplierShop;
import pl.smartdesign.pricescraper.shop.model.UserShop;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SupplierShopService {

    private final SupplierShopRepository supplierShopRepository;

    @Autowired
    public SupplierShopService(SupplierShopRepository supplierShopRepository) {
        this.supplierShopRepository = supplierShopRepository;
    }

    public SupplierShop getSupplierShopById(Long shopId) {
        return supplierShopRepository.findById(shopId).orElseThrow(
                () -> new EntityNotFoundException("Sklep o ID: " + shopId + " Nie Istnieje w Bazie Danych."));
    }

    public List<SupplierShop> getAllSupplierShops() {
        return supplierShopRepository.findAll();
    }

    public SupplierShop addSupplierShop(NewSupplierShopRequest newSupplierShopRequest) {
        SupplierShop supplierShop = new SupplierShop();
        supplierShop.setName(newSupplierShopRequest.getName());
        supplierShop.setUrl(newSupplierShopRequest.getUrl());
        return supplierShopRepository.save(supplierShop);
    }

    public SupplierShop updateSupplierShop(Long supplierShopId, NewSupplierShopRequest updateSupplierShopRequest) {
        SupplierShop supplierShopFromDb = getSupplierShopById(supplierShopId);
        supplierShopFromDb.setName(updateSupplierShopRequest.getName());
        supplierShopFromDb.setUrl(updateSupplierShopRequest.getUrl());
        return supplierShopRepository.save(supplierShopFromDb);
    }

    public void deleteSupplierShop(Long shopId) {
        supplierShopRepository.deleteById(shopId);
    }
}
