package ex_05_jan_2025;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        // And Operator
        int age = 25;
        boolean hasdrivinglicence = true;
        boolean DrinkswhenDriving = false;
        if (age > 18 && hasdrivinglicence) {
            System.out.println("Elgible to drive");
        } else {
            System.out.println("Not Elgible");
        }

        // logical OR operator
        if (age < 18 || !hasdrivinglicence){
            System.out.println("Need to met any of the criteria to drive car");
        }else{
        System.out.println("one of the criteria has to met");
        }

        //logical Not
        if( !DrinkswhenDriving ){
            System.out.println("not fit for drive");
        }else{
            System.out.println("good to drive");
        }
}


}
