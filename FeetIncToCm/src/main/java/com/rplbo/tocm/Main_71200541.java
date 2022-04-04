package com.rplbo.tocm;

public class Main_71200541
{

    public static double FeetIncToCm(double feet,double inch){
        if (feet > 0 && inch > 0 ) {
            inch=(inch+(feet*12))*2.54;
            System.out.println("Nilai dalam centimeter: " + inch + " cm");
            return inch;
        }
        else {
            return -1;
        }
    }
    public static double FeetIncToCm(int inch) {
        if (inch > 0) {
            double a = inch / 12;
            double b = inch % 12;
            System.out.println(inch + " inc = " + a + " feet " +b + " inc");
            return FeetIncToCm(a, b);
        }
        else {
            return -1;
        }
    }
    public static void main( String[] args ) {
//        test case 1
        FeetIncToCm(1, 3);
        FeetIncToCm(15);

//        test case 2
//        double feet2 = FeetIncToCm(12, 5);
//        double feet = FeetIncToCm(30);
    }
}

