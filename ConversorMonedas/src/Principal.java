import java.util.Scanner;

public class Principal {
    public static  void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 8){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                    "Conversor de monedas\n\n");
            System.out.println("Ingrese una opción\n" +
                    "1. Dolar a peso argentino\n" +
                            "2. Peso argentino a dolar\n" +
                            "3. Dolar a real brasilero\n" +
                            "4. Real brasilero a dolar\n" +
                            "5. Dolar a peso colombiano\n" +
                            "6. Peso colombiano a dolar\n" +
                            "7. Convertir otra moneda\n" +
                            "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del menú.....");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        }
    }
}
