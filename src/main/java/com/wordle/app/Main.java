package com.wordle.app;

import java.util.Scanner;

/**
 * Wordle in Java
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        int retries = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("WORDLE: adivina la palabra de 5 letras.");
        System.out.println("Tenes 5 intentos.");

        while (retries > 0) {

            String input = sc.nextLine();
            String target = "avion";

            System.out.println(checkString(input, target));    

            if (input.equalsIgnoreCase(target)) {
                System.out.println("FELICIDADES! Acertaste la palabra.");
                break;
            }

            retries --;
            System.out.println("Te quedan " + retries + " intentos.");
        }

        sc.close();
    }

    public static String checkString(String input, String target) {
        StringBuilder sb = new StringBuilder();

        if (input.length()!=5){
            sb.append("Debes ingresar una palabra de 5 letras.");
            return sb.toString();
        }

        for (char c : input.toCharArray()){
            String currentChar = String.valueOf(c);
            if (target.contains(currentChar)) {
                if (input.indexOf(currentChar) == target.indexOf(currentChar)) {
                    sb.append("{").append(currentChar).append("}");
                }
                else {
                    sb.append("(").append(currentChar).append(")");
                }
            }
            else {
                sb.append(currentChar);
            }

        }
        return sb.toString();
    }
}
