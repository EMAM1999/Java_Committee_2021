
package Projects.A33;


public class product {
    int id;
    String name;
    float price;

    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void print()
    {
        System.out.println("date of product is: "+getName()+" "+getId()+" "+getPrice());
    }
}
