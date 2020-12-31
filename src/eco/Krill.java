package eco;

public class Krill extends Peces {
    
    public Krill(){
        
        Nombre = "Krill";
        InicialN = "K";
        Depredar = 1;
        Especie = 1;
        AlimentacionMin = 9999;
        AlimentacionMax = 9999;
        Reproduccion = 4;
        EsperanzaVida = 25;
        HambreAct = 0;
        VidaAct = 0;
        ReproduccionAct = 0;
    }
     @Override
    public void DarReproAct(){
        this.ReproduccionAct++;
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
    public void VidaA() {
        this.VidaAct++;
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
    public int GetAlimentacionMax(){
        return AlimentacionMax;
    }
    
    @Override
    public int GetEsperanzaVida(){
        return EsperanzaVida;
    }
    
    @Override
    public int GetVidaAct(){
        return VidaAct;
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
