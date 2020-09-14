package pl.smartdesign.pricescraper.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smartdesign.pricescraper.product.model.NewUserProductRequest;
import pl.smartdesign.pricescraper.product.model.UserProduct;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserProductService {

    private final UserProductRepository userProductRepository;

    @Autowired
    public UserProductService(UserProductRepository userProductRepository) {
        this.userProductRepository = userProductRepository;
    }

    public UserProduct getProductById(Long userProductId) {
        return userProductRepository.findById(userProductId).orElseThrow(
                () -> new EntityNotFoundException("Produkt o ID: " + userProductId + " Nie Istnieje w Bazie Danych."));
    }

    public List<UserProduct> getAllUsersProducts() {
        return userProductRepository.findAll();
    }

    public UserProduct addUserProduct(NewUserProductRequest newUserProductRequest) {
        UserProduct userProduct = new UserProduct();
        userProduct.setName(newUserProductRequest.getName());
        userProduct.setExternalId(newUserProductRequest.getExternalId());
        userProduct.setUrl(newUserProductRequest.getUrl());
        return userProductRepository.save(userProduct);
    }

    public UserProduct updateUserProduct(Long userProductId, NewUserProductRequest updateUserProductRequest) {
        UserProduct userProduct = getProductById(userProductId);
        userProduct.setName(updateUserProductRequest.getName());
        userProduct.setExternalId(updateUserProductRequest.getExternalId());
        userProduct.setUrl(updateUserProductRequest.getUrl());
        return userProductRepository.save(userProduct);
    }

    public void deleteUserProductById(Long userProductId) {
        userProductRepository.deleteById(userProductId);
    }
}
