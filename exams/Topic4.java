package exams;
import java.util.*;
public class Topic4 {
    public static void main(String[] args) {
        //Exam topic 4
        Scanner ed = new Scanner(System.in);
        Random azar = new Random();

        int sumaPun=0, sumaTim=0, novato=0, avanzado=0, experto=0;
        

        System.out.println("Ingrese el numero de jugadores: ");
        int numJ = ed.nextInt();
        
        for(int i = 1; i <= numJ; i++){
            //numero aleatorios
            int puntaje = azar.nextInt(1500001);
            int tiempo = azar.nextInt((600-30)+1)+30; //(max - min + 1) + min

            //Acumuladores de puntaje y tiempo
            sumaPun = sumaPun + puntaje;
            sumaTim = sumaTim + tiempo;

            //Clasificacion y acumuladores
            if( puntaje < 200000 ) novato++; 
            if( puntaje > 200000 && puntaje < 900000) avanzado++;
            if( puntaje > 900000 ) experto++;
         
        }// fin de for

        //Promedios de Puntaje y Tiempo
        float promedioP = sumaPun / numJ;
        float promedioT = sumaTim /numJ;

        //Mostrar resultados
        System.out.println("Puntaje promedio del torneo: "+promedioP);
        System.out.println("Puntaje promedio de tiempo: "+promedioT);
        System.out.println("Novatos: "+novato);
        System.out.println("Avanzados: "+avanzado);
        System.out.println("Expertos: "+experto);



        ed.close();
    }
    
}
