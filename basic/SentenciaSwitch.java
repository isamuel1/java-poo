package basic;
import java.util.Scanner;
public class SentenciaSwitch {
    public static void main(String[] args) {

        Scanner ed = new Scanner(System.in);

        /*
        Sintaxis
        
        switch (opcion) {
            case value:
                
                break;
        
            default:
                break;
        }
        */
        System.out.println("Ingrese un numero del 1-5: ");
       int dato = ed.nextInt();
       ed.close();

       switch (dato) {
        case 1:
           System.out.println("El numero es 1");
            break;
        case 2:
            System.out.println("El numero es 2");
            break;
        case 3:
            System.out.println("El numero es 3");
            break;
        case 4:
            System.out.println("El numero es 4");
            break;
        case 5:
            System.out.println("El numero es 5");
            break;
       
        default:
             System.out.println("El numero no existe");
            break;
       }
    }
}

