package Exercice3;

public class Basket extends Customer{
    private double totalPrice;

    public Basket(int id, String name, boolean gold, boolean silver, double totalPrice) {
        super(id, name, gold, silver);
        this.totalPrice = totalPrice;
    }
   public void updatePrice(double price){
        this.totalPrice += price;
   }

   public double getTotalPrice(){
        if(super.gold == true ){
            return this.totalPrice * 0.2;
        }
        else{
            if(super.silver == true){
                return this.totalPrice * 0.1;
            }
        }
        return this.totalPrice;

   }
}
