import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("****Aplicacion Dalculadora****");
        //Mostramos el menu
        //System.out.println("1.Suma \n2.Resta \n3.Multiplicacion\n4.Division");
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salir
                """);
        System.out.println("Operacion a realizar?:");
        var operacion=Integer.parseInt(consola.nextLine());
        //Revisar que se encuentre dentro de las opciones mencionadas
        if(operacion>=1 && operacion<=4){
            System.out.print("Proporciona valor operando1: ");
            var operando1=Integer.parseInt(consola.nextLine());
            System.out.print("Proporciona valor operando2: ");
            var operando2=Integer.parseInt(consola.nextLine());
            int resultado;
            switch (operacion){
                case 1->{//Suma
                    resultado=operando1+operando2;
                    System.out.println("Resultado de la Suma es: "+resultado);
                }
                case 2->{//Resta
                    resultado=operando1-operando2;
                    System.out.println("Resultado de la Resta es: "+resultado);
                }
                case 3->{//Multiplicacion
                    resultado=operando1*operando2;
                    System.out.println("Resultado de la multiplicacion es: "+resultado);
                }
                case 4->{//Division
                    resultado=operando1/operando2;
                    System.out.println("Resultado de la Division es: "+resultado);
                }
                default -> System.out.println("Opcion erronea: "+operacion);

            }

        }
        else if(operacion==5){//Salir
            System.out.println("Hasta pronto...");
        }
        else{
            System.out.println("Opcion erronea: "+operacion);
        }

    }
}
