package eco;
import java.util.ArrayList;
import java.util.Scanner;

public class Eco {

    public static void main(String[] args) {
        int salmonsito;
        int pulpitos;
        int i;
        
        ArrayList<Peces> pescados = new ArrayList<>();
        
        Scanner datos = new Scanner(System.in); 
        
        System.out.println("Ingresa cantidad de Salmones a crear");
        salmonsito = datos.nextInt();
        
        for(i=1; i<=salmonsito; i++ ){
            pescados.add(new Salmon());
        }
        
        System.out.println("Ingresa cantidad de Pulpos a crear");
        pulpitos = datos.nextInt();
        
        for(i=1; i<=pulpitos; i++ ){
            pescados.add(new Pulpo());
        }
        
        System.out.println("////////////////////");
        
        for(Peces a : pescados){
            System.out.print(a.Nombre);
   
        }
        
        System.out.println("////////////////////");
        
    }
    
}
