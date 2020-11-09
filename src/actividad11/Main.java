/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import java.util.Scanner;

/**
 *
 * @author melissa.a.lopez
 */
public class Main {

    public static void verMenu() {

        Scanner input = new Scanner(System.in);
        float param1, param2;
        String figura = "";
        boolean resValida = false;

        while (!resValida) {

            System.out.println("1. Circulo");
            System.out.println("2. Triangulo Isosceles");
            System.out.println("3. Cuadrado");
            System.out.println("Escoge una figura:");
            figura = input.nextLine();
            System.out.println("-----------------------------------------------------------------------");

            switch (figura) {
                case "1":
                    System.out.println("Escogiste Circulo");
                    resValida = true;
                    break;

                case "2":
                    System.out.println("Escogiste Triangulo Isosceles");
                    resValida = true;
                    break;
                case "3":
                    System.out.println("Escogiste Cuadrado");
                    resValida = true;
                    break;

                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("**Opcion NO valida**");
                    System.out.println("Introduzca una opcion VALIDA");
                    System.out.println("-----------------------------------------------------------");

            }

        }
        resValida = false;
        while (!resValida) {

            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("Escoge una operacion:");
            String operacion = input.nextLine();
            System.out.println("-----------------------------------------------------------------------");

            switch (operacion) {
                case "1":

                    if ("1".equals(figura)) {

                        System.out.println("Circulo");
                        System.out.println("Introduce el valor del radio:");
                        param1 = input.nextFloat();
                        System.out.println("Introduce el valor de PI:");
                        param2 = input.nextFloat();
                        System.out.println("Area de circulo: " + new Circle().getArea(param1, param2));
                        System.out.println("-----------------------------------------------------------------------");

                    } else if ("2".equals(figura)) {
                        System.out.println("Triangulo Isosceles");
                        System.out.println("Introduce el valor de la base:");
                        param1 = input.nextFloat();
                        System.out.println("Introduce el valor del la altura:");
                        param2 = input.nextFloat();
                        System.out.println("Area de triangulo: " + new Triangle().getArea(param1, param2));

                    } else {
                        System.out.println("Cuadrado");
                        System.out.println("Introduce el valor de la altura:");
                        param1 = input.nextFloat();
                        System.out.println("Introduce el valor del la anchura:");
                        param2 = input.nextFloat();
                        System.out.println("Area de cuadrado: " + new Square().getArea(param1, param2));

                    }
                    resValida = true;
                    break;

                case "2":

                    if ("1".equals(figura)) {

                        System.out.println("Circulo");
                        System.out.println("Introduce el valor del radio:");
                        param1 = input.nextFloat();
                        System.out.println("Introduce el valor de PI:");
                        param2 = input.nextFloat();
                        System.out.println("Perimetro de circulo: " + new Circle().getPerimeter(param1, param2));
                        System.out.println("-----------------------------------------------------------------------");

                    } else if ("2".equals(figura)) {
                        System.out.println("Triangulo Isosceles ");
                        System.out.println("Introduce el valor de la base:");
                        param1 = input.nextFloat();
                        System.out.println("Introduce el valor del la altura:");
                        param2 = input.nextFloat();
                        System.out.println("Perimetro de triangulo: " + new Triangle().getPerimeter(param1, param2));

                    } else {
                        System.out.println("Cuadrado");
                        System.out.println("Introduce el valor de la altura:");
                        param1 = input.nextFloat();
                        System.out.println("Introduce el valor del la anchura:");
                        param2 = input.nextFloat();
                        System.out.println("Perimetro de cuadrado: " + new Square().getPerimeter(param1, param2));

                    }
                    resValida = true;
                    break;
                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("**Opcion NO valida**");
                    System.out.println("Introduzca una opcion VALIDA");
                    System.out.println("-----------------------------------------------------------");

            }

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        verMenu();
    }

}
