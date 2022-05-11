public class UsedProduct extends Product{
    private String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), manufactureDate);
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }
}
