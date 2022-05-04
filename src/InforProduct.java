public class InforProduct extends Product {
    private double height;
    public InforProduct(String Name, int ID,double price,double height) {
        super(Name, ID,price);
        this.height=height;
    }
    public double getHeight () {
        return height;
    }
    @Override
    public String toString () {
        return "Information Product {" + super.toString() +"," + " Height: " + height + " }";
    }

}
