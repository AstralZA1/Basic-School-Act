import java.util.Scanner;
public class SeatReservation{
    static int num1;
    static int num2;
    private static Scanner input;
    public static void main(String[]args){
        input = new Scanner(System.in);
        System.out.println("Bus Seat Reservation:");
        char Seats [][] = new char [11][10];
        for(int col=1;col<=4;col++){
            System.out.print("\t Col "+(col)+"\t");
        }
        System.out.println();
        for(int row=1;row<=10;row++){
            System.out.print("Row "+(row)+"|\t");
            for(int col2=1;col2<=4;col2++){
                Seats[row][col2]='*';
                System.out.print(Seats[row][col2]+"\t\t");
            }
            System.out.println();
        }
        while(true){
            System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if(num1>0&&num2>0){
                System.out.println();
                System.out.println("Bus Seat Reservation:");
            for(int col=1;col<=4;col++){
                System.out.print("\t Col "+(col)+"\t");
            }
            System.out.println();
            for(int row=1;row<=10;row++){
                System.out.print("Row "+(row)+"|\t");
                for(int col2=1;col2<=4;col2++){
                    Seats[num1][num2]='X';
                    System.out.print(Seats[row][col2]+"\t\t");
                }
                System.out.println();
                 }
             }else{
                 System.out.println("Program exit!");
                 break;
             }
        }
    }
}