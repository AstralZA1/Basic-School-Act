import java.util.Scanner;
public class Quiz{
    static int i;
    static int correct;
    static int questions = 5;   
    private static Scanner input;
public static void main(String[]args){
    input = new Scanner(System.in);
    System.out.println("Welcome to the Straw Hat Pirates Multiple Choice Quiz!");
    System.out.println("Please answer in CAPITAL LETTERS ONLY!");
    System.out.println("-------------------------------------------------------------");
    String[][] Ques = {
        {"1. Who is the first member of the Straw Hat Pirates?","\n A. Tony Tony Chopper \n B. Roronoa Zoro \n C. Big Mom \n", "B"},
        {"2. What is the name of the first ship of the Straw Hat Pirates?","\n A. Going Merry \n B. Thousand Sunny \n C. Moby Dick \n", "A"},
        {"3. Who is the cook of the Straw Hat Pirates?","\n A. Nami \n B. Sanji \n C. Luffy \n", "B"},
        {"4. What is the name of Luffy's Devil Fruit?","\n A. Gura Gura no Mi \n B. Mera Mera no Mi \n C. Gomu Gomu no Mi \n", "C"},
        {"5. Who is the shipwright of the Straw Hat Pirates?","\n A. Franky \n B. Brook \n C. Nico Robin \n", "A"},
};
    String [] ans = new String[(int)questions];
    i = 0;
    do{
        System.out.print(Ques[i][0]+"   "+Ques[i][1]);
        ans[i] = String.valueOf(input.next().charAt(0));
        if(Ques[i][2].equals(ans[i])){
            System.out.println("Your answer is Correct!");
            correct++;
        }else{
            System.out.println("Incorrect! The correct answer is "+Ques[i][2]);
        }
        System.out.println("");
        i++;
    }while(i<questions);
        System.out.println("Number of correct answers: "+correct);
        if(correct>=3){
            System.out.println("Congratulations. You are a true member of the Straw Hat Pirates!");
        }else{
            System.out.println("You are not a true member of the Straw Hat Pirates!");
        }
        System.exit(0);
    }
         }