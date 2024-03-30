package lesson6.task1;

public class Main {
    public static void main(String[] args) {

        Product firstProduct = new Product("Glazed cottage cheese",562, 25, "Vanilla", true);
        System.out.println(firstProduct.getName());
        firstProduct.setName("Salt");
        System.out.println(firstProduct.getName());
        System.out.println(firstProduct.getDescription());
        System.out.println(firstProduct.isAvailable());
        System.out.println(firstProduct.getArticle());
        System.out.println(firstProduct.getPrice());

    }
}
