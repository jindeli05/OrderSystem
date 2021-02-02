package com.gindeli.ordersystem.util;

import java.util.Scanner;

public class Helper {
    final double BURGUR = 5.00;
    final double FRIES = 3.00;

    public static void displayOrders() {
        Scanner scanner = new Scanner(System.in);
        char quit = 'N';
        double sum = 0;
        int customerId = 0;

        try {
            ++customerId;
            do {
                System.out.println("Please select from the menu ***** 1 => Burgur  |  2 => Fries,  3 => Chicken Wrap ");

                System.out.println("Please select from the list of items and place your order ");
                int orderItem = scanner.nextInt();

                System.out.println("Please select the quantity of item" + orderItem);
                int quantity = scanner.nextInt();

                sum = calcualteOrders(orderItem, quantity, sum);

                System.out.println("Your customerId is item " + customerId + "Your totol cost is " + sum);

                System.out.println("Please type in Y or N");
                quit = scanner.next().trim().charAt(0);

            } while (quit != 'Y');

        } catch (Exception e) {
            System.out.print(e.toString());
        } finally {
            scanner.close();
        }

    }

    private static double calcualteOrders(int orderItem, int quantity, double sum) {
        if (orderItem == 1) {
            sum = sum + quantity * 5.00;
        }
        if (orderItem == 2) {
            sum = sum + quantity * 3.00;
        }
        if (orderItem == 3) {
            sum = sum + quantity * 7.00;
        } else {
            sum = 0;
        }
        return sum;
    }

}