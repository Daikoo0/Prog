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
    protected int HambreAct;
    
    
    // Funciones //
    
    public abstract void Mover();
    public abstract void Comer();
    public abstract void Reproducir();
    public abstract void Muerte();
    public abstract void DarHambre();
    public abstract void RestHambre();
    public abstract String GetNombre();
    public abstract int GetDepredar();
    public abstract int GetAlimentacionMin();
    public abstract int GetAlimentacionMax();
    public abstract int GetHambreAct();
       
}
