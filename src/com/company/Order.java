package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static com.company.Validation.validateInput;

public class Order
{
    public static ArrayList<String> orderform = new ArrayList<>();
    public static boolean active = true;

    public static void order(Scanner sc)
    {
        border(50);
        System.out.println("Options");
        System.out.println("1: Select Crust");
        System.out.println("2: Select Sause");
        System.out.println("3: Select Toppings");
        System.out.println("4: Exit");

        int option = validateInput(sc, 1, 4,"Not an option", "Select Between 1-4");
        switch(option)
        {
            case 1:
                orderCrust(sc);
                break;
            case 2:
                orderSauce(sc);
                break;
            case 3:
                orderToppings(sc);
                break;
            case 4:
                active = false;
                break;
        }
    }
    public static void orderCrust(Scanner sc)
    {
        System.out.println("Entered Crust");
        border(50);
        System.out.println("Options");
        System.out.println("1: Regular Crust");
        System.out.println("2: Gluten Free Crust");
        System.out.println("3: Return to order menu");
        System.out.println("4: exit");

        int option = validateInput(sc, 1, 4, "Not an option", "Enter 1 - 4");
        switch(option)
        {
            case 1:
                System.out.println("Regular Crust Added");
                orderform.add("Regular Crust");
                break;
            case 2:
                System.out.println("Gluten Free Crust Added");
                orderform.add("Gluten Free Crust");
                break;
            case 3:
                order(sc);
            case 4:
                active = false;
                break;
        }
    }

    public static void orderSauce(Scanner sc)
    {
        System.out.println("Entered Sauce");
        border(50);
        System.out.println("options");
        System.out.println("1: White Sauce");
        System.out.println("2:Tomato Sause");
        System.out.println("3: Return to Order Menu");
        System.out.println("4: Exit");

        int option = validateInput(sc, 1, 4,"Not an option", "Select between 1 -4");

        switch(option)
        {
            case 1:
                System.out.println("White sause added");
                orderform.add("White Sauce");
                break;
            case 2:
                System.out.println("Tomato Sauce Added");
                orderform.add("Tomato Sause");
                break;
            case 3:
                order(sc);
                break;
            case 4:
                active = false;
                break;
        }

    }

    public static void orderToppings(Scanner sc)
    {
        System.out.println("Entered Toppings");


    }

    public static void border (int length)
    {
        for (int i = 0; i < length; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}