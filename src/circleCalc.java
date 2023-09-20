/*
Author: Richard Sharp
 * Date: 09-20-2023
 *
*/

import java.util.Scanner;

public class circleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        double area;
        double diameter;
        double circumference;

        System.out.print("Enter the radius of a circle: ");

        radius = input.nextDouble();

        if (radius > 0) {
            area = Math.PI * radius * radius;
            diameter = radius * 2;
            circumference = 2 * Math.PI * radius;

            System.out.println("The area of the circle is: " + area);
            System.out.println("The circumference of the circle is: " + circumference);
            System.out.println("The diameter of the circle is: " + diameter);
        } else {

            System.out.println("Invalid radius. Radius must be a positive number.");//if the radius input was less than 0
            System.out.print("Enter a valid radius: ");//telling user to enter a valid number if they enter less than 0


            radius = input.nextDouble(); //our radius input

            area = Math.PI * radius * radius; //area calculation

            diameter = radius * 2;//diameter calculation

            circumference = 2 * Math.PI * radius;//circumference calculation

            //comment break


            System.out.println("The area of the circle is: " + area);//area calculation output


            System.out.println("The circumference of the circle is: " + circumference);//circumference output


            System.out.println("The diameter of the circle is: " + diameter);//diameter output


                    input.close();


                }

            }
        }

