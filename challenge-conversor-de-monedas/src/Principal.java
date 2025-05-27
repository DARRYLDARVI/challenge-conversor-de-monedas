import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        while (true){


            //Creacion metodo input
            Scanner escribir = new Scanner(System.in);
            System.out.println("""
                *******************************************
                Bienvenido al conversor de monedas
                
                1- DOLLAR (USD) ==> PESO MEXICANO (MXN)
                2- PESO MEXICANO MXN (MXN) ==> DOLLAR (USD)
                3- DOLLAR (USD) ==> JAPON YEN (JPY)
                4- JAPON YEN (JPY) ==> DOLLAR (USD)
                5- DOLLAR (USD) ==> EURO (EUR)
                6- EURO (EUR) ==> DOLLAR (USD)
                7- DOLLAR (USD) ==> REAL BRASILEÑO (BRL)
                8- REAL BRASILEÑO (BRL) ==> DOLLAR (USD)
                9- SALIR
                
                Seleccione la opcion deseada:
                *******************************************
                """);

            int opcion = escribir.nextInt();

            if(opcion == 9){ break;}

            switch (opcion){
                case 1:
                    //entrar en clase ConsultaMoneda
                    ConsultaMoneda  consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    double cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    Moneda conversion = consulta.buscarMoneda("USD", "MXN", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 2:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("MXN", "USD", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 3:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("USD", "JPY", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 4:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("JPY", "USD", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 5:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("USD", "EUR", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 6:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("EUR", "USD", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 7:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("USD", "BRL", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;
                case 8:
                    //entrar en clase ConsultaMoneda
                    consulta = new ConsultaMoneda();

                    System.out.println("ingrese cantidad a convertir: ");
                    cantidad = escribir.nextDouble();

                    //crear variable que almacene la conversion
                    conversion = consulta.buscarMoneda("BRL", "USD", cantidad);

                    System.out.println("La conversion de " + cantidad + conversion.base_code() + " a "
                            + conversion.target_code() + " es: " +  conversion.conversion_result());
                    break;

                default:
                    System.out.println("Opción no valida, intentelo nuevamente");
            }
        }


    }
}
