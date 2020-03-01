package corejava.statements.conditional;

import java.util.Scanner;

public class DaysOfWeekSwitch {

    public static void main(String[] args) {

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Input is not valid");
        }
    }

}

