import Exercice1.*;
import Exercice2.bankAccount;
import Exercice3.Basket;
import Exercice3.Book;
import Exercice3.Candy;
import Exercice3.Customer;
import Exercice4.Board;
import Exercice4.User;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle (5);
        System.out.println("--------------------------Exercice 1--------------------------");
        System.out.println("Resulting area of circle -> "+circle.area() + "\nResulting perimeter of circle -> "+circle.perimeter()+"\n");


        Shape triangle = new Triangle(6.7,4,2.5);
        System.out.println("Resulting area of triangle -> "+triangle.area()+"\nResulting perimeter of triangle -> "+triangle.perimeter()+"\n");

        Shape rectangle = new Rectangle(7.8,3.2);
        System.out.println("Resulting area of rectangle -> "+rectangle.area()+"\nResulting perimeter of rectangle -> "+rectangle.perimeter()+"\n");

        Shape square = new Square(5.7);
        System.out.println("Resulting area of square -> "+square.area()+"\nResulting perimeter of square -> "+square.perimeter()+"\n");



        System.out.println("--------------------------Exercice 2--------------------------");


        bankAccount person1 = new bankAccount();
        System.out.println("Default bank account: "+"\t*deposit: "+person1.getAmount());

        person1 = new bankAccount(20);
        System.out.println("Current deposit: "+person1.getAmount());
        person1.setAmount(1000);
        System.out.println("Current deposit: "+person1.getAmount());
        person1.withdraw(20);

        System.out.println("--------------------------Exercice 3--------------------------");


        Customer customerOne = new Customer(1,"Jane",true,false);
        Book bookOne = new Book(23,14.5,"S.F.","Arthur");
        Book bookTwo = new Book(50,34,"The Little Prince","Antoine");
        Candy candyOne = new Candy(2,5,"Sequoia","18.5 g");
        Candy candyTwo =new Candy(45,7.8,"Sweetie","10.6 g");
        Basket basket = new Basket(1,"Jane",true,false,0);

        customerOne.hasMembership();
        basket.updatePrice(14.5);
        basket.updatePrice(5);
        basket.updatePrice(34);
        System.out.println("Order: "+bookOne.getName()+" , "+bookTwo.getName()+" , "+candyOne.getName());
        System.out.println("Total price is: "+basket.getTotalPrice());

        customerOne.setGold(false);
        customerOne.setSilver(false);
        basket.updatePrice(14.5);
        basket.updatePrice(5);
        basket.updatePrice(34);
        System.out.println("Order: "+bookOne.getName()+" , "+bookTwo.getName()+" , "+candyOne.getName());
        System.out.println("Total price is: "+basket.getTotalPrice());


        System.out.println("--------------------------Exercice 4--------------------------");
        User user = new User("Jhon","jhon@gmail.com");
        Board board = new Board("message","Jhon");
        System.out.println("New user: name -> "+user.getName()+" and "+" email -> "+user.getEmail());
        System.out.println("Description: " + board.getDescription()+" The author of message: "+board.getAuthor());
        System.out.println("Message: "+board.message());








    }
}
