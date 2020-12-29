package eco;

public class Salmon extends Peces{
    
    public Salmon(){
        
        Nombre = "Salmon";
        InicialN = "S";
        Depredar = 2;
        Especie = 2;
        AlimentacionMin = 10;
        AlimentacionMax = 35;
        Reproduccion = 180;
        EsperanzaVida = 360;
        
        
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
