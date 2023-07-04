package Shop;

public class Product {
    private String titleName;
    private double prise;

    public Product(String titleName, double prise) {
        this.titleName = titleName;
        this.prise = prise;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

}
