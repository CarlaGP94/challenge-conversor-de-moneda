import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        while (opcion >= 1 && opcion <= 6) {

            System.out.println("----------------------------------------------\n" +
                    "|     Bienvenido a su conversor de moneda    |\n" +
                    "----------------------------------------------\n");
            System.out.println("Ingresa el tipo de cambio:\n" +
                    "[1] Dólar (USD) ---> Peso argentino (ARS).\n" +
                    "[2] Peso argentino (ARS) ---> Dólar (USD).\n" +
                    "[3] Real brasileño (BRL) ---> Peso argentino.\n" +
                    "[4] Peso argentino (ARS) ---> Real brasileño (BRL) .\n" +
                    "[5] Peso argentino (ARS) ---> Peso uruguayo (UYU).\n" +
                    "[6] Peso uruguayo (UYU) ---> Peso argentino (ARS).\n" +
                    "[7] Salir.");

            opcion = teclado.nextInt();


        }
    }
}
