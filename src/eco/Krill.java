package eco;

public class Krill extends Peces {
    
    public Krill(){
        
        Nombre = "Krill";
        InicialN = "K";
        Depredar = 1;
        Especie = 1;
        AlimentacionMin = 2;
        AlimentacionMax = 35;
        Reproduccion = 180;
        EsperanzaVida = 360;
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
