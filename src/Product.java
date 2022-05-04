public class Product {
    private String Name;
    private int ID;
    private double price;

    public Product ( String Name, int ID,double price){
        this.Name= Name;
        this.ID= ID;
        this.price=price;
    }
    public String getName(){
        return Name;
    }
    public int getID (){
        return ID;
    }
    public String toString () {
        return " Name: " + Name + "," + "ID: " + ID + ",Price: " + price;
    }
}
