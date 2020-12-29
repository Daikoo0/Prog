package eco;

public class LoboMarino extends Peces {
    
    public LoboMarino(){
        
        Nombre = "LoboMarino";
        InicialN = "L";
        Depredar = 4;
        Especie = 4;
        AlimentacionMin = 15;
        AlimentacionMax = 25;
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
