
package eco;


public class Piedra extends Peces {
    
    public Piedra(){
        
        Nombre = "Piedra";
        InicialN = "P";
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
    public void GetNombre(){
        System.out.println(Nombre);
    }
    
}
