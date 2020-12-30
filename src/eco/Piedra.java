
package eco;


public class Piedra extends Peces {
    
    public Piedra(){
        
        Nombre = "Piedra";
        InicialN = "P";
        Depredar = 7;
        Especie = 0;
        AlimentacionMin = 99999;
        AlimentacionMax = 99999;
        Reproduccion = 0;
        EsperanzaVida = 99999;
        HambreAct = 0;
        VidaAct = 0;
        
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
