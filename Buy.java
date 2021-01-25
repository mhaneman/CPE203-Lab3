public class Buy {
    private String product;
    private int price;
    private int quantity;

    public Buy(String product, int price, int quantity)
    {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getProduct() {
        return this.product;
    }


}
