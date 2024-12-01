package ej3;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();
        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        ControlRemoto control = new ControlRemoto();

        while (true) {
        	System.out.println("\nControl de Dispositivos:");
            System.out.println("1. Luz");
            System.out.println("2. Ventilador");
            System.out.println("3. Aire Acondicionado");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            
            int opcion;

            try {
            	opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }
            
            if (opcion == 4) {
                System.out.println("Saliendo del sistema de control.");
                break;
            }

            Dispositivo dispositivo;
            switch (opcion) {
                case 1 -> dispositivo = luz;
                case 2 -> dispositivo = ventilador;
                case 3 -> dispositivo = aireAcondicionado;
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
                }
            }

            System.out.println("\nElija que accion desea realizar");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.print("Opción: ");

            int accionSeleccionada;
            try {
                accionSeleccionada = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (accionSeleccionada) {
            case 1: {
                Comando encenderComando = new ComEncender(dispositivo);
                control.ejecutarComando(encenderComando);
                break;
            }
            case 2: {
                Comando apagarComando = new ComApagar(dispositivo);
                control.ejecutarComando(apagarComando);
                break;
            }
            default:
                System.out.println("Opción inválida");
                break;
        }
        }

        scanner.close();
    }
}
