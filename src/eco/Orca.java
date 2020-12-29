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
    
    @Override
    public int GetDepredar() {
        return Depredar;
    }
    
    @Override
    public void Mover(){
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