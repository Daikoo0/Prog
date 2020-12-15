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
        Vivo = true;
        
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
    
    /*public String GetNombre(){
        return Nombre;
    }
    
    public int GetDepreder(){
        return Depredar;
    }
    
    public int GetEspecie(){
        return Especie;
    }
    
    public int GetAlimentacionMin(){
        return AlimentacionMin;
    }
    
    public int GetAlimentacionMax(){
        return AlimentacionMax;
    }
    
    public int GetReproduccion(){
        return Reproduccion;
    }*/
    
    
}
