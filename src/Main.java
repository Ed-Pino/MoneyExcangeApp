import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String apiKey = ""; // Reemplazala con la tuya  si es necesario

        String menu = """
                *******************************************
                
                🌎 Bienvenido al Conversor de Moneda:
                
                     Quieres convertir❔
                     
                1) Dólar => Peso Argentino
                2) Peso Argentino => Dólar
                3) Dólar => Real Brasileño
                4) Real Brasileño => Dólar
                5) Dólar => Peso Colombiano
                6) Peso Colombiano => Dólar
                7) Salir
                """;

        int opcion = 0;
        while (opcion != 7) {
            System.out.println(menu);
            System.out.print("Elija una opción validad!: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion >= 1 && opcion <= 6) {
                    System.out.print(" 🤑 Ingrese el valor a convertir: ");
                    double cantidad = Double.parseDouble(scanner.nextLine());
                    String from = "", to = "";

                    switch (opcion) {
                        case 1 -> { from = "USD"; to = "ARS"; }
                        case 2 -> { from = "ARS"; to = "USD"; }
                        case 3 -> { from = "USD"; to = "BRL"; }
                        case 4 -> { from = "BRL"; to = "USD"; }
                        case 5 -> { from = "USD"; to = "COP"; }
                        case 6 -> { from = "COP"; to = "USD"; }
                    }

                    ConsultaMoneda conversor = new ConsultaMoneda(apiKey);
                    try {
                        double resultado = conversor.obtenerConversion(from, to, cantidad);
                        if (resultado != -1) {
                            System.out.printf("%.2f %s = %.2f %s\n", cantidad, from, resultado, to);
                        } else {
                            System.out.println("Error al obtener los datos de conversión.");
                        }
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                } else if (opcion != 7) {
                    System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
        System.out.println("Gracias por usar el conversor de moneda 🌎.");
    }
}
