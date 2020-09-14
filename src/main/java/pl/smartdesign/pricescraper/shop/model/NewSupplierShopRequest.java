package pl.smartdesign.pricescraper.shop.model;

public class NewSupplierShopRequest {

    private String name;
    private String url;

    public NewSupplierShopRequest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
