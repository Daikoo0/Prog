package eco;

import java.util.Random;

public class Orca extends Peces {
    
    public Orca(){
        
        Nombre = "Orca";
        InicialN = "O";
        Depredar = 6;
        Especie = 6;
        AlimentacionMin = 20;
        AlimentacionMax = 30;
        Reproduccion = 240;
        EsperanzaVida = 300;
        
        
    }
    Random r = new Random();

    public int GetDepredar() {
        return Depredar;
    }
    
    @Override
    public void Mover(){
        int R1 = r.nextInt(2);
        
    }

    @Override
    public void Comer() {    
    }

    @Override
    public void Reproducir() {
    }

    @Override
    public void Muerte() {
    }
    
    @Override
    public String GetNombre(){
        return Nombre;
    }
}