package pl.smartdesign.pricescraper.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smartdesign.pricescraper.shop.model.NewUserShopRequest;
import pl.smartdesign.pricescraper.shop.model.UserShop;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserShopService {

    private final UserShopRepository userShopRepository;

    @Autowired
    public UserShopService(UserShopRepository userShopRepository) {
        this.userShopRepository = userShopRepository;
    }

    public UserShop getUserShopById(Long shopId) {
        return userShopRepository.findById(shopId).orElseThrow(
                () -> new EntityNotFoundException("Sklep o ID: " + shopId + " Nie Istnieje w Bazie Danych."));
    }

    public List<UserShop> getAllUserShops() {
        return userShopRepository.findAll();
    }

    public UserShop addUserShop(NewUserShopRequest newUserShopRequest) {
        UserShop userShop = new UserShop();
        userShop.setName(newUserShopRequest.getName());
        userShop.setUrl(newUserShopRequest.getUrl());
        return userShopRepository.save(userShop);
    }

    public UserShop updateUserShop(Long userShopId, NewUserShopRequest updateUserShopRequest) {
        UserShop userShopFromDb = getUserShopById(userShopId);
        userShopFromDb.setName(updateUserShopRequest.getName());
        userShopFromDb.setUrl(updateUserShopRequest.getUrl());
        return userShopRepository.save(userShopFromDb);
    }

    public void deleteUserShop(Long shopId) {
        userShopRepository.deleteById(shopId);
    }
}
