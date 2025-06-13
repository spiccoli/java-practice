import java.math.BigDecimal;

public abstract class Product {

    protected String model;
    protected String price;
    protected String code;
    protected String brand;

    public Product(String model, String price, String code, String brand) {
        this.model = model;
        this.price = price;
        this.code = code;
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
