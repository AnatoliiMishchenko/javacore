package Shop;

public class Oder {
    private Custemer custemer;
    private Product product;
    private int amount;
    private double prise;
    Sale sale;

    public Oder(Custemer custemer, Product product, int amount, double prise) {
        this.custemer = custemer;
        this.product = product;
        this.amount = amount;
        this.prise = prise;
        this.sale = sale;

    }

    public Custemer getCustemer() {
        return custemer;
        }

    public void setCustemer(Custemer custemer) {
        this.custemer = custemer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
