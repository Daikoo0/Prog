package eco;

public class Salmon extends Peces{
    
    public Salmon(){
        
        Nombre = "Salmon";
        InicialN = "S";
        Depredar = 2;
        Especie = 2;
        AlimentacionMin = 3;
        AlimentacionMax = 10;
        Reproduccion = 5;
        EsperanzaVida = 30;
        HambreAct = 0;
        VidaAct = 0;
        ReproduccionAct = 0;
    }
    @Override
    public int GetReproduccionAct(){
        return ReproduccionAct;
       }
    @Override
    public int GetReproduccion(){
        return Reproduccion;
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
