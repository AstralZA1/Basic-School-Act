import java.util.Scanner;
    class Quadrilateral{
        public void showDescription(){
            System.out.println("- is quadrilateral");
        }
    }
     class Rectangle extends Parallelogram{
        public void showDescription(){
            System.out.println("- has 4 right angles");
            super.showDescription();
            }
    }
     class Square extends Rectangle {
        public void showDescription(){
            System.out.println("- has 4 equal sides");
            super.showDescription();
        }
    }
    class Parallelogram extends Quadrilateral{
        public void showDescription(){
            System.out.println("- has 2 pairs of parallel sides");
            super.showDescription();
        }
    }
    class Rhombus extends Parallelogram{
        public void showDescription(){
            System.out.println("- has 4 congruent sides");
            super.showDescription();
        }
    }
    class Trapezoid extends Quadrilateral{
        public void showDescription(){
            System.out.println("- has 1 pair of parallel sides");
            super.showDescription();
        }
    }
    public class RunQuad{
        public static void printshape(){
        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        }
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        printshape();
        String shape = input.nextLine();
        if(shape.equalsIgnoreCase("R")){
            System.out.println("A Rectangle:");
            new Rectangle().showDescription();
            }else if(shape.equalsIgnoreCase("S")){
                System.out.println("A Square:");
                new Square().showDescription();
            }else if(shape.equalsIgnoreCase("P")){
                System.out.println("A Parallelogram:");
                new Parallelogram().showDescription();
            }else if(shape.equalsIgnoreCase("H")){
                System.out.println("A Rhombus:");
                new Rhombus().showDescription();
            }else if(shape.equalsIgnoreCase("T")){
                System.out.println("A Trapezoid:");
                new Trapezoid().showDescription();
            }else{
                System.out.println("Invalid Shape!");
            }
        }
    }
