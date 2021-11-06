package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static com.company.Validation.validateInput;

public class Order
{
    public static ArrayList<String> orderform = new ArrayList<>();
    //public static boolean active = true;

    public static void order(Scanner sc)
    {
        border(50);
        System.out.println("Options");
        System.out.println("1: Select Crust");
        System.out.println("2: Select Sauce");
        System.out.println("3: Select Toppings");
        System.out.println("4: See current Order");

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
                System.out.println(orderform);
                order(sc);
        }
    }

    public static void orderCrust(Scanner sc)
    {
        System.out.println("Please Choose One Crust Option");
        border(50);
        System.out.println("Options");
        System.out.println("1: Regular Crust");
        System.out.println("2: Gluten Free Crust");

        int option = validateInput(sc, 1, 2, "Not an option", "Enter 1 - 2");
        switch(option)
        {
            case 1:
                System.out.println("REGULAR CRUST ADDED");
                orderform.add("Regular Crust");
                break;
            case 2:
                System.out.println("GLUTEN FREE CRUST ADDED");
                orderform.add("Gluten Free Crust");
                break;
        }
    }

    public static void orderSauce(Scanner sc)
    {
        System.out.println("Please Choose One Sauce Option");
        border(50);
        System.out.println("options");
        System.out.println("1: White Sauce");
        System.out.println("2: Tomato Sauce");
        System.out.println("3: Balsamic Vinegar");

        int option = validateInput(sc, 1, 3,"Not an option", "Select between 1 -3");
        switch(option)
        {
            case 1:
                System.out.println("WHITE SAUCE ADDED");
                orderform.add("White Sauce");
                break;
            case 2:
                System.out.println("TOMATO SAUCE ADDED");
                orderform.add("Tomato sauce");
                break;
            case 3:
                System.out.println("BALSAMIC VINEGAR ADDED");
                orderform.add("Balsamic Vinegar");
        }

    }

    public static void orderToppings(Scanner sc)
    {
        boolean contine = true;
        System.out.println("Please choose one ingredient option");
        System.out.println("1: pizza cheese \t 2: Diced onion 3: Diced Green Onion");
        int option = validateInput(sc, 1, 12, "Not an option", "Select between 1 -12");
        switch(option)
        {
            case 1:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("pizza cheese");
                orderform.add("pizza cheese");
                break;
            case 2:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("Diced Onions");
                orderform.add("Diced Onions");
                break;
            case 3:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("Diced Green Onions");
                orderform.add("Diced Green Onions");
                break;
            case 4:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("Pepperoni");
                break;
            case 5:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("Sliced Mushrooms");
                break;
            case 6:
                System.out.println("Please choose one amount\n1: 1/4 cup \t\t 2: 1/2 cup");
                printcup(sc);
                System.out.print("diced jalapenos");
                break;
            case 7:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("sardines");
                break;
            case 8:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("pineapple chuncks");
                break;
            case 9:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("tofu");
                break;
            case 10:
                System.out.println(printChoose());
                printcup(sc);
                System.out.print("Ham Chunks");
                break;
            case 11:
                System.out.println("Please choose one amount\n1: 1/4 cup \t\t 2: 1/2 cup");
                printcup(sc);
                System.out.print("Dry Red pepper");
                break;
            case 12:
                System.out.println("Please choose one amount\n1: 1/4 cup \t\t 2: 1/2 cup");
                printcup(sc);
                System.out.print("dry basil");
                break;


        }
    }

    public static void printcup(Scanner sc)
    {
        int option = validateInput(sc, 1, 2,"Not an option", "Select between 1 -2");
        String cup1 = "1/4 cup";
        String cup2 = "1/2 cup";
        switch(option)
        {
            case 1:
                System.out.print("You choose 1/4 cup of ");
                break;
            case 2:
                System.out.println("You choose 1/2 cup of ");
                break;
        }
    }

    public static String printChoose()
    {
        return "Please choose one amount\n1: 1/4 cup \t\t 2: 1/2 cup";
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
