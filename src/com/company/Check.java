package com.company;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Check
{
    public static int count = 0;
    public static Map<String, Integer> othermap = Collections.unmodifiableMap(new HashMap<>()
    {
        {
            put("Pizza Cheese", 2);
            put("Diced Onions", 2);
            put("Diced Green Onions", 2);
            put("Pepperoni", 4);
            put("Sliced Mushrooms", 2);
            put("Diced Jalapenos", 2);
            put("Sardines", 4);
            put("Pineapple Chunks", 4);
            put("Tofu", 2);
            put("Ham Chunks", 4);
            put("Dry Red pepper", 4);
            put("Dry Basil", 2);
        }
    });

    public static boolean checkifavaliable(String input)
    {
        boolean result = false;
        if (othermap.containsKey(input))
        {
            if (othermap.get(input) > 0)
            {
                count += 1;
                if (count > 6)
                {
                    System.out.println("You have reached the max of toppings of 6");
                }
                else
                {
                    System.out.print(input);
                    int value = othermap.get(input);
                    othermap.replace(input, value - 1);
                    result = true;
                }
            }
            else
            {
                System.out.println(input);
            }
        }
        return result;
    }
}
