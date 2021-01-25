public class View {
    private String product;
    private int price;

    public View(String product, int price)
    {
        this.product = product;
        this.price = price;
    }

    public String getProduct()
    {
        return this.product;
    }

    public int getPrice() {
        return this.price;
    }

}
