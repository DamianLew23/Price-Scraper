package pl.smartdesign.pricescraper.product.model;

import pl.smartdesign.pricescraper.shop.model.UserShop;

import javax.persistence.*;

@Entity
@Table(name = "users_products")
public class UserProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String externalId;
    private String url;
    @ManyToOne
    @JoinColumn(name = "shop_id")
    private UserShop userShop;
    @OneToOne
    @JoinColumn(name = "supplier_product_id")
    private SupplierProduct supplierProduct;


    public UserProduct() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UserShop getUserShop() {
        return userShop;
    }

    public void setUserShop(UserShop userShop) {
        this.userShop = userShop;
    }

    public SupplierProduct getSupplierProduct() {
        return supplierProduct;
    }

    public void setSupplierProduct(SupplierProduct supplierProduct) {
        this.supplierProduct = supplierProduct;
    }
}
