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
        int i = 0;
        int o = 0;
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
                
                int posAleatoria1 = r.nextInt(ancho);
                int posAleatoria2 = r.nextInt(largo);
                int temp = valores[o][i];
                valores[o][i] = valores[posAleatoria1][posAleatoria2];
                valores[posAleatoria1][posAleatoria2] = temp;
                
            }
        }
        
    }
    
    public int GetValue(int x, int y){
        return valores[x][y];
    }
        
}
        
    

