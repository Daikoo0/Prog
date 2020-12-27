package eco;

import java.util.Random;


public class Eco {
        
    private int[][] valores;
    private int Orca;
    private int Tiburon;
    private int LoboMarino;
    private int Pulpo;
    private int Salmon;
    private int Krill;
    
    private int ancho;
    private int largo;
    
    public Eco(int filas, int columnas, int Orca, int Tiburon, int LoboMarino, int Pulpo, int Salmon, int Krill){
        
        this.Orca = Orca;
        this.Tiburon = Tiburon;
        this.LoboMarino = LoboMarino;
        this.Pulpo = Pulpo;
        this.Salmon = Salmon;
        this.Krill = Krill;
        
        this.ancho = filas;
        this.largo = columnas;
        
        valores = new int[filas][columnas];
        
        LlenarMatriz();
        
    }
    
    private void LlenarMatriz(){
        int x = 0;
        int y = 0;
        int i,o = 0;
        int q =0;
        
        Random r = new Random();
        
        for(q=0; q<2; q++){
                
            valores[x][y] = 7;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        q=0;
        
        for(q=0; q<Orca; q++){
                
            valores[x][y] = 6;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        
        q=0;
        
        for(q=0; q<Tiburon; q++){
                
            valores[x][y] = 5;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        
        q=0;
        
        for(q=0; q<LoboMarino; q++){
                
            valores[x][y] = 4;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        q=0;
        
        for(q=0; q<Pulpo; q++){
                
            valores[x][y] = 3;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        q=0;
        
        for(q=0; q<Salmon; q++){
                
            valores[x][y] = 2;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        q=0;
        
        for(q=0; q<Krill; q++){
                
            valores[x][y] = 1;
            y = y+1;
                
            if(y == largo ){
                x = x +1;
                y=0;
            }
        }
        q=0;
        
        for(o=0; o<valores.length; o++ ){
            for (i=0; i<valores[0].length; i++) {
                int posAleatoria = r.nextInt(valores.length);
                int temp = valores[i][o];
                valores[i][o] = valores[posAleatoria][posAleatoria];
                valores[posAleatoria][posAleatoria] = temp;
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
    

