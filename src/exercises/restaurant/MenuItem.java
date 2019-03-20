package exercises.restaurant;

import java.util.Date;

public class MenuItem {

    private String itemName;
    private String description;
    private String category;
    private int price;
    private Date dateAdded;

    public MenuItem(String itemName, String description, String category, int price, Date dateAdded) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = dateAdded;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
