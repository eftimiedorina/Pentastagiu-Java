package Exercice3;

public class Candy extends Product {
    private String quantityCandy;


    public Candy(int id, double price, String name, String quantityCandy) {
        super(id, price, name);
        this.quantityCandy = quantityCandy;

    }

    public void setQuantityCandy(String quantityCandy) {
        this.quantityCandy = quantityCandy;
    }



    public String getQuantityCandy() {
        return quantityCandy;
    }


}
