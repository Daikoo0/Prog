package eco;

public class Krill extends Peces {
    
    public Krill(){
        
        Nombre = "Krill";
        InicialN = "K";
        Depredar = 1;
        Especie = 1;
        AlimentacionMin = 6;
        AlimentacionMax = 35;
        Reproduccion = 180;
        EsperanzaVida = 360;
        Vivo  = true;
        
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
    
}
