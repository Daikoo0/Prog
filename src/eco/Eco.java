package eco;

import java.util.Random;


public class Eco {
        
    private int[][] valores;
    
    public Eco(int filas, int columnas){
        
        valores = new int[filas][columnas];
        LlenarMatriz(6);
        
    }
    
    private void LlenarMatriz(int bound){
        
        Random r = new Random();
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                valores[i][j] = r.nextInt(bound);
            }
        }
        
    }
    public int GetValue(int x, int y){
        return valores[x][y];
    }
        
}
        /*int salmonsito;
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
            
            System.out.println(a.Nombre);
          
            
   
        }
        
        System.out.println(pescados.get(0));
        System.out.println(pescados.remove(2));
        System.out.println("////////////////////");
        
        for(Peces a : pescados){
            
            System.out.println(a.Nombre);
   
        }
        
    }*/
    

