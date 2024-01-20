package Proyecto;

import java.util.Scanner;

public class circunferencia {
    public static void main(String[] args) {
        // Definir el valor de PI
        final double PI = 3.14159265359;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio de la circunferencia
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular el área de la circunferencia
        double area = PI * Math.pow(radio, 2);

        // Calcular el perímetro de la circunferencia
        double perimetro = 2 * PI * radio;

        // Mostrar los resultados
        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}