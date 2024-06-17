import javax.swing.plaf.TreeUI;

public class FirstClass {
    public static void main(String[] args) {

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over 18" : "Still a kid";
        System.out.println("Our client is " + ageText);
        System.out.println("______________________________________");

// task N1
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some Remainder");
        }

// task N2


    }
}
