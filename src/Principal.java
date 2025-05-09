import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarCambio consulta = new ConsultarCambio();

        System.out.println("----------------------------------------------\n" +
                "|     Bienvenido a su conversor de moneda    |\n" +
                "----------------------------------------------\n");

        while (true) {
            // Loop para menú de opciones.
            System.out.println("Ingresa la opción (n°) para el tipo de cambio: (ej.: 1)\n\n" +
                    "[1] Dólar (USD) ---> Peso argentino (ARS).\n" +
                    "[2] Peso argentino (ARS) ---> Dólar (USD).\n" +
                    "[3] Real brasileño (BRL) ---> Peso argentino.\n" +
                    "[4] Peso argentino (ARS) ---> Real brasileño (BRL) .\n" +
                    "[5] Peso argentino (ARS) ---> Peso uruguayo (UYU).\n" +
                    "[6] Peso uruguayo (UYU) ---> Peso argentino (ARS).\n" +
                    "[7] Salir.");

            var opcion = teclado.nextInt();
            var montoUsuario = 0.0;

            // Mensajes en caso de ingresar una opción por fuera del rango del menú.
            if (opcion == 7){
                System.out.println("Gracias por usar la app.");
                break;
            } else if (opcion <= 0 || opcion >= 8) {
                System.out.println("Opción inválida.");
            } else {
                System.out.println("Ingrese el monto: (ej.: 150,45)");
                montoUsuario = teclado.nextDouble();
            }

            // Conversión de moneda:
            switch (opcion) {
                case 1 -> {
                    Moneda monedaUsuario = consulta.cambio("USD", "ARS", montoUsuario);
                    System.out.println("$ " + montoUsuario + " dólares corresponden a $ " +
                            monedaUsuario.conversion_result() + " pesos argentinos.\n");
                }
                case 2 -> {
                    Moneda monedaUsuario = consulta.cambio("ARS", "USD", montoUsuario);
                    System.out.println("$ " + montoUsuario + " pesos argentinos corresponden a $ " +
                            monedaUsuario.conversion_result() + " dólares.\n");
                }
                case 3 -> {
                    Moneda monedaUsuario = consulta.cambio("BRL", "ARS", montoUsuario);
                    System.out.println("$ " + montoUsuario + " reales corresponden a $ " +
                            monedaUsuario.conversion_result() + " pesos argentinos.\n");
                }
                case 4 -> {
                    Moneda monedaUsuario = consulta.cambio("ARS", "BRL", montoUsuario);
                    System.out.println("$ " + montoUsuario + " pesos argentinos corresponden a $ " +
                            monedaUsuario.conversion_result() + " reales.\n");
                }
                case 5 -> {
                    Moneda monedaUsuario = consulta.cambio("ARS", "UYU", montoUsuario);
                    System.out.println("$ " + montoUsuario + " pesos argentinos corresponden a $ " +
                            monedaUsuario.conversion_result() + " pesos uruguayos.\n");
                }
                case 6 -> {
                    Moneda monedaUsuario = consulta.cambio("UYU", "ARS", montoUsuario);
                    System.out.println("$ " + montoUsuario + " pesos uruguayos corresponden a $ " +
                            monedaUsuario.conversion_result() + " pesos argentinos.\n");
                }
            }
        }
    }
}
