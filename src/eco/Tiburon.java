package eco;

public class Tiburon extends Peces{
    
    public Tiburon(){
        
        Nombre = "Tiburon";
        InicialN = "T";
        Depredar = 5;
        Especie = 5;
        AlimentacionMin = 2;
        AlimentacionMax = 25;
        Reproduccion = 360;
        EsperanzaVida = 480;
        HambreAct = 0;
        
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
    
    @Override
    public int GetAlimentacionMax(){
        return AlimentacionMax;
    }
    
    @Override
    public int GetAlimentacionMin(){
        return AlimentacionMin;
    }
    
    @Override
    public int GetHambreAct(){
        return HambreAct;
    }
    
    @Override
    public void DarHambre(){
        this.HambreAct++;
    }
    
    @Override
    public void RestHambre(){
        this.HambreAct = 0;
    }
}
