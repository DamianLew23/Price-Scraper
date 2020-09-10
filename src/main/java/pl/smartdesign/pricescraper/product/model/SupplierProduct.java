package pl.smartdesign.pricescraper.product.model;

import pl.smartdesign.pricescraper.shop.model.SupplierShop;

import javax.persistence.*;

@Entity
@Table(name = "suppliers_products")
public class SupplierProduct {

    @Id
    private Long id;
    private String name;
    private String externalId;
    private String url;
    @ManyToOne
    @JoinColumn(name = "shop_id")
    private SupplierShop supplierShop;


    public SupplierProduct() {}

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

    public SupplierShop getSupplierShop() {
        return supplierShop;
    }

    public void setSupplierShop(SupplierShop supplierShop) {
        this.supplierShop = supplierShop;
    }
}
