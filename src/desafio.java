import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuneta = "Corriente";
        double saldo = 1599.99;
        int opcion =0;

        System.out.println("************************");
        System.out.println("\nNombre de cliente: "+nombre);
        System.out.println("Eltipo de cuenta es: "+tipoDeCuneta);
        System.out.println("Su saldo disponible es: "+saldo);
        System.out.println("\n************************");

        String menu = """
                **** Escriba en numero de la opción deseada ****
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: "+saldo+ "$");
                    break;

                case 2:
                    System.out.println("¿Cúal esl el valor que deea retirar?");
                    double valorARetirar = teclado.nextDouble();

                    if (valorARetirar > saldo) {
                        System.out.println("Saldo no disponible");
                        }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actual es: "+saldo);

                    }
                    break;

                case 3:
                    System.out.println("¿Cúal esl el valor que deea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actual es: "+saldo);
                    break;

                case 9:
                    System.out.println("Saliendo, gracias");
                    break;

                default:
                    System.out.println("Opción NO válida");
            }

        }




    }
}
