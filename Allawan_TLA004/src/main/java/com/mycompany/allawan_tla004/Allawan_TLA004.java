/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.allawan_tla004;

/**
 *
 * @author Students Account
 */
import java.util.*;

public class Allawan_TLA004 {

    public static void main(String[] args) {

        Stack<String> actionStack = new Stack<>();

        Scanner jm = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an action (type 'undo' to undo, 'exit' to stop): ");
            String input = jm.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.print("Program Closed... ");
                break;
                
            } else if (input.equalsIgnoreCase("undo")) {
                if (!actionStack.isEmpty()) {
                    String undoo = actionStack.pop();
                    System.out.println("You undid " + undoo);
                    
                } else {
                    System.out.println("There is nothing to undo.");
                }
                
            } else {
                actionStack.push(input);
                System.out.println("You " + input);
            }
        }
    }
}
