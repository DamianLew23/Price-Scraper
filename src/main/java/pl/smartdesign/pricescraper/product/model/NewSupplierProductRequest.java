package pl.smartdesign.pricescraper.product.model;

public class NewSupplierProductRequest {

    private String name;
    private String externalId;
    private String url;
    private Long supplierShopId;

    public NewSupplierProductRequest() {}

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

    public Long getSupplierShopId() {
        return supplierShopId;
    }

    public void setSupplierShopId(Long supplierShopId) {
        this.supplierShopId = supplierShopId;
    }
}
