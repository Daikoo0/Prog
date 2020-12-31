package eco;

public class LoboMarino extends Peces {
    
    public LoboMarino(){
        
        Nombre = "LoboMarino";
        InicialN = "L";
        Depredar = 4;
        Especie = 4;
        AlimentacionMin = 5;
        AlimentacionMax = 12;
        Reproduccion = 8;
        EsperanzaVida = 35;
        HambreAct = 0;
        VidaAct = 0;
        ReproduccionAct = 0; 
    }
     @Override
    public void DarReproAct(){
        this.ReproduccionAct++;
    }
    @Override
    public void VidaA() {
        this.VidaAct++;
    }
    
    @Override
    public int GetVidaAct(){
        return VidaAct;
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
    public int GetAlimentacionMax(){
        return AlimentacionMax;
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
    public int GetEsperanzaVida(){
        return EsperanzaVida;
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
