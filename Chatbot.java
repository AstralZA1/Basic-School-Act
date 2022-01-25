import java.util.ArrayList;
import java.util.Scanner;
public class Chatbot {
    static String choice;
    static String decision;
    static double total = 0;
    static int quantity;
    private static Scanner input;
    public static void main(String[]args)throws InterruptedException{
        Chatbot cb = new Chatbot();
        ArrayList<String> arr_items = new ArrayList<>();
        ArrayList<Integer> arr_quantity = new ArrayList<>();
        input = new Scanner(System.in);
        System.out.println("Good day Shopper! I'm Astral and Welcome to our Department Store :)");
        Thread.sleep(2000);
        do{
        cb.printItems();
        choice = input.next(); quantity = input.nextInt();
        cb.itemChoice();    
        }while(decision.equals("Yes"));
        cb.showTotal();
        System.exit(0);
        }
    public void printItems() throws InterruptedException{
        System.out.println();
        System.out.println("Here is the list of our items:");
        Thread.sleep(1000);
        System.out.println("Shirt - P250.00 ");
        Thread.sleep(1000);
        System.out.println("Pants - P400.00");
        Thread.sleep(1000);
        System.out.println("Shorts - P300.00");
        Thread.sleep(1000);
        System.out.println("Shoes - P1500.00");
        Thread.sleep(1000);
        System.out.println("Cap - P200.00");
        Thread.sleep(1000);
        System.out.print("What would you like to buy? (Enter the item separated by the quantity): ");
    }
    public void itemChoice(ArrayList<String> arr_items, ArrayList<Integer> arr_quantity){
        input = new Scanner(System.in);
        if(choice.equals("Shirt")){
            System.out.print("You will be buying "+quantity+ " of our Shirt that cost P250.00 each.  Would you like to shop more? (Just type Yes or No): ");
            total = 250*quantity+total;
            arr_items.add(choice);
            arr_quantity.add(quantity);
            decision = input.nextLine();    
        }else if(choice.equals("Pants")){
            System.out.print("You will be buying "+quantity+ " of our Pants that cost P400.00 each.  Would you like to shop more? (Just type Yes or No): ");
            total = 400*quantity+total;
            arr_items.add(choice);
            arr_quantity.add(quantity);
            decision = input.nextLine();  
        }else if (choice.equals("Shorts")) {
            System.out.print("You will be buying "+quantity+" of our Shorts that cost P300.00 each.  Would you like to shop more? (Just type Yes or No): ");
            total = 300*quantity+total;
            arr_items.add(choice);
            arr_quantity.add(quantity);
            decision = input.nextLine();  
        }else if(choice.equals("Shoes")){
            System.out.print("You will be buying "+quantity+ " of our Shoes that cost P1500.00 each.  Would you like to shop more? (Just type Yes or No): ");
            total = 1500*quantity+total;
            arr_items.add(choice);
            arr_quantity.add(quantity);
            decision = input.nextLine();  
        }else if(choice.equals("Cap")){
            System.out.print("You will be buying "+quantity+ " of our Cap that cost P200.00 each.  Would you like to shop more? (Just type Yes or No): ");
            total = 200*quantity+total;
            arr_items.add(choice);
            arr_quantity.add(quantity);
            decision = input.nextLine();
        }
    }
    public void showTotal(ArrayList<String> arr_items, ArrayList<Integer> arr_quantity){
        System.out.println();
        System.out.println("Your item list:");
        System.out.println("Hi Shopper your total is: "+"P"+String.format("%.2f", total));
        System.out.println("Thank you for shopping with us!");
        System.out.println("Hope you will shop with us again :)");
    }
        }   
