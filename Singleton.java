package singleton_aleatorio;

public class Singleton {
    
// número generado de forma aleatoria
    private int numAleatorio;

    // sumador de número de aciertos
    private int numAciertos;
       
    // contador número de intentos
    private int numIntentos;
      
    // selección numero 1-10
    private int seleccion;
       
    // número más alto de aciertos
    private int puntuacion;
       
    // número máximo de intentos
    private int intentosMax;

    // nombre de la persona que tiene el record
    private String alias;
       
    // número máximo de rondas
    private int rondasPartida;
       
    // ronda actual en la que estamos
    private int rondaActual;    

    // instancia
    private static Singleton instance = null;
       
    // Constructor bloqueado con private
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}