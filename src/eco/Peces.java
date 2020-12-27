package eco;

public abstract class Peces {
    
    protected String Nombre;
    protected String InicialN;
    protected int Depredar;
    protected int Especie;
    protected int AlimentacionMin;
    protected int AlimentacionMax;
    protected int Reproduccion;
    protected int EsperanzaVida;
    
    
    // Funciones //
    
    public abstract void Mover();
    public abstract void Comer();
    public abstract void Reproducir();
    public abstract void Muerte();
    public abstract void GetNombre();
    
       
}
