package Exercice3;

public class Customer {
    private int id;
    private String name;
    public boolean gold,silver;

    public Customer(int id, String name, boolean gold,boolean silver) {
        this.id = id;
        this.name = name;
        this.gold = gold;
        this.silver = silver;
    }

    public void hasMembership(){
        if(this.gold == true || this.silver == true){
            System.out.println("This customer has membership!");
        }
        else
        {
            System.out.println("This customer has NOT membership!");
        }
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public void setSilver(boolean silver) {
        this.silver = silver;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getGold() {
        return gold;
    }

    public boolean getSilver() {
        return silver;
    }
}
