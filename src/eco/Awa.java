
package eco;

public class Awa extends Peces{
    public Awa(){
        
        Nombre = "nada";
        InicialN = "n";
        Depredar = 0;
        Especie = 0;
        AlimentacionMin = 0;
        AlimentacionMax = 0;
        Reproduccion = 0;
        EsperanzaVida = 0;
       
        
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
