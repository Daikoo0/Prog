
package eco;

public class Awa extends Peces{
    public Awa(){
        
        Nombre = "Awa";
        InicialN = "n";
        Depredar = 0;
        Especie = 0;
        AlimentacionMin = 0;
        AlimentacionMax = 0;
        Reproduccion = 0;
        EsperanzaVida = 0;
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
