package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static com.company.Print.*;
import static com.company.Validation.validateInput;
import static java.lang.System.*;

public class Order
{
    public static ArrayList<String> orderform = new ArrayList<>();
    public static void orderCrust(Scanner sc)
    {
        border(75);
        for (String s : Arrays.asList("Please Choose One Crust Option", "Options", "1: Regular Crust", "2: Gluten Free Crust"))
        {
            out.println(s);
        }

        var option = validateInput(sc, 1, 2, "Not an option", "Choose either 1 or 2");
        switch(option)
        {
            case 1:
                out.println("REGULAR CRUST ADDED");
                orderform.add("Regular Crust");
                break;
            case 2:
                out.println("GLUTEN FREE CRUST ADDED");
                orderform.add("Gluten Free Crust");
                break;
        }
    }

    public static void orderSauce(Scanner sc)
    {
        border(75);
        for (String s : Arrays.asList("Please Choose One Sauce Option", "1: White Sauce 2: Tomato Sauce 3: Balsamic Vinegar"))
        {
            out.println(s);
        }

        var option = validateInput(sc, 1, 3,"Not an option", "Select between 1-3");
        switch(option)
        {
            case 1:
                out.println("WHITE SAUCE ADDED");
                orderform.add("White Sauce");
                border(75);
                break;
            case 2:
                out.println("TOMATO SAUCE ADDED");
                orderform.add("Tomato Sauce");
                border(75);
                break;
            case 3:
                out.println("BALSAMIC VINEGAR ADDED");
                orderform.add("Balsamic Vinegar");
                border(75);
                break;
        }

    }

    public static void orderToppings(Scanner sc)
    {
        boolean keepGoing = true;
        String userInput;
        while(keepGoing)
        {
            for (String s : Arrays.asList("Please choose one ingredient option", "1: pizza cheese \t 2: Diced onion \t   3: Diced Green pepper\n4: Pepperoni \t     5: Sliced mushroom    6: Diced jalapenos \n7: Sardines \t \t 8: Pineapple Chunks   9: Tofu \n10: Ham Chunks \t \t 11: Dry red pepper    12: Dried Basil"))
            {
                out.println(s);
            }

            var option = validateInput(sc, 1, 12, "Not an option select either 1 to 12", "Select between 1-12");
            switch(option)
            {
                case 1:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Pizza Cheese")) {
                        out.println("\n");
                        orderform.add("Pizza Cheese");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR PIZZA CHEESE\n");
                    }
                    border(75);
                    break;
                case 2:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Diced Onions")) {
                        out.println("\n");
                        orderform.add("Diced Onions");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR DICED ONIONS\n");
                    }
                    border(75);
                    break;
                case 3:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Diced Green Onions")) {
                        out.println("\n");
                        orderform.add("Diced Green Onions");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR DICED GREEN ONIONS\n");
                    }
                    border(75);
                    break;
                case 4:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Pepperoni")) {
                        out.println("\n");
                        orderform.add("Pepperoni");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR PEPPERONI \n");
                    }
                    border(75);
                    break;
                case 5:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Sliced Mushrooms")) {
                        out.println("\n");
                        orderform.add("Sliced Mushrooms");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR SLICED MUSHROOMS\n");
                    }
                    border(75);
                    break;
                case 6:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Diced Jalapenos")) {
                        out.println("\n");
                        orderform.add("Diced Jalapenos");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR DICED JALAPENOS\n");
                    }
                    border(75);
                    break;
                case 7:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Sardines")) {
                        out.println("\n");
                        orderform.add("Sardines");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR SARDINES\n");
                    }
                    border(75);
                    break;
                case 8:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Pineapple Chunks")) {
                        out.println("\n");
                        orderform.add("Pineapple Chunks");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR PINEAPPLE CHUNKS\n");
                    }
                    border(75);
                    break;
                case 9:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Tofu")) {
                        out.println("\n");
                        orderform.add("Tofu");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR TOFU\n");
                    }
                    border(75);
                    break;
                case 10:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Ham Chunks")) {
                        out.println("\n");
                        orderform.add("Ham Chunks");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR HAM CHUNKS\n");
                    }
                    border(75);
                    break;
                case 11:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Dry Red Pepper"))
                    {
                        out.println("\n");
                        orderform.add("Dry Red Pepper");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR DRY RED PEPPER\n");
                    }
                    border(75);
                    break;
                case 12:
                    out.println(printChoose());
                    printcup(sc);
                    if (Check.checkifavaliable("Dry Basil")) {
                        out.println("\n");
                        orderform.add("Dry Basil");
                    }else {
                        out.println("REACHED MAX INGREDIENTS FOR DRY BASIL\n");
                    }
                    border(75);
                    break;

            }
            out.println("\nDo you want to keep going? (yes or no)");
            userInput = sc.next();
            keepGoing = userInput.equalsIgnoreCase("yes");
        }
    }
}
