package lesson6.task1;

public class Product {
    private String name;
    private int article;
    private double price;
    private String description;
    private boolean available;

    public Product(String name, int article, double price, String description, boolean available) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.description = description;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}



