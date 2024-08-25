// 21 June 2024
public class PV_01_CompareTwoFractions{

    static String compareTwoFractions(String str) {

        String[] fractions = str.split(", ");

        String[] fraction1 = fractions[0].split("/");
        String[] fraction2 = fractions[1].split("/");

        System.out.println("Fraction1 is: " + fraction1[0] + "/" + fraction1[1]);
        System.out.println("Fraction2 is: " + fraction2[0] + "/" + fraction2[1]);

        int a = Integer.parseInt(fraction1[0]);
        float b = Integer.parseInt(fraction1[1]);
        int c = Integer.parseInt(fraction2[0]);
        float d = Integer.parseInt(fraction2[1]);

        float lhs = a / b;
        float rhs = c / d;

        
        System.out.println(lhs);
        System.out.println(rhs);

        if(lhs > rhs) return fractions[0];
        else if(rhs > lhs) return fractions[1];
        else return "equal";
    }

    public static void main(String args[]) {

        String str = "10/17, 9/10";

        System.out.println(compareTwoFractions(str));
    }
}