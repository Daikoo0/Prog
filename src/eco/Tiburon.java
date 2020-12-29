package eco;

public class Tiburon extends Peces{
    
    public Tiburon(){
        
        Nombre = "Tiburon";
        InicialN = "T";
        Depredar = 5;
        Especie = 5;
        AlimentacionMin = 15;
        AlimentacionMax = 25;
        Reproduccion = 360;
        EsperanzaVida = 480;
        
        
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
    @Override
    public int GetDepredar() {
        return Depredar;
    }
}
