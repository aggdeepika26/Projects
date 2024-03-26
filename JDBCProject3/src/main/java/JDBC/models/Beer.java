package JDBC.models;

public class Beer {
    private int id;
    private String name;
    private int btrewerId;
    private int categoryId;
    private float price;
    private int Stock;
    private int version;
    private float alcohol;

    public Beer()
    {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBtrewerId() {
        return btrewerId;
    }

    public void setBtrewerId(int btrewerId) {
        this.btrewerId = btrewerId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", btrewerId=" + btrewerId +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", Stock=" + Stock +
                ", version=" + version +
                ", alcohol=" + alcohol +
                '}';
    }
}
