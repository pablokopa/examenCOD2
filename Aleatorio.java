package singleton_aleatorio;

public class Aleatorio {
    /**
     * Genera un número aleatorio entre dos valores previamente asignados, en este caso entre 0 y 10
     * 
     * @param 
     * @return número generado de forma aleatorio
     */
    public int generarAleatorio(){
        return numAleatorio;
    }
    
    /**
     * Indica y actualiza el número de rondas del juego
     * 
     * @param rP: número máximo de rondas
     * @return ronda actual en la que se encuentra el jugador
     */
    public int actualizarRonda(int rP){
        rondasPartida=10;
        rP=rondasPartida;
        return rondaActual;
    }
    
    /**
     * Obtiene un valor introducido por el usuario, indica si es igual al número aleatorio y modifica la puntuación (si es correcto)
     * 
     * @param opcion: opción introducida por el usuario para intentar adivinar el número
     * @return puntuación total actualizada
     */
    public int adivinarNumero(int opcion){ 
        opcion=seleccion; 
        return puntuacion;
    }
   
    /**
     * Fija una cantidad de intentos máxima, actualiza la cantidad de intentos que utiliza el usuario para adivinar el número
     * 
     * @param intent: número de intentos utilizados por el usuario
     * @param int_max: cantidad máxima de intentos que puede utilizar el usuario
     * @return número actualizado de intentos hechos por el usuario
     */    
    public int contadorIntentos(int intent, int int_max){ 
        intentosMax=10;
        int_max=intentosMax;
        intent=numIntentos;
        return numIntentos;
    }
    
    /**
     * Suma la cantidad de aciertos
     * 
     * @param aciert: número de aciertos del usuario
     * @return número actualizado de aciertos del usuario
     */
    public int contadorAciertos(int aciert){ 
        aciert=numAciertos;
        return numAciertos;
    }
    
    /**
     * Modifica el nombre de usuario del jugador
     * 
     * @param al: obtiene el nombre actual del usuario
     * @return nuevo nombre actualizado por el usuario
     */    
    public String cambiarAlias(String al){ 
        al=alias;
        return alias;
    }
}
