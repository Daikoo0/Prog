package eco;

public class Pulpo extends Peces{
        
    public Pulpo(){
        
        Nombre = "Pulpo";
        InicialN = "P";
        Depredar = 3;
        Especie = 3;
        AlimentacionMin = 10;
        AlimentacionMax = 35;
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
}
