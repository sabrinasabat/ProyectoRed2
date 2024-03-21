package dominio;

public class Aparato { // clase que representa aparato y su funcionalidad basico

    private boolean encendido;
    private final int consumo; /* final = inmutable, constante
    Al hacer una clase final me asegura de que no me equivoque haciendo modificaciones en
    variables que no hace falta modificar = Práctica defensiva */


    public Aparato(int consumo){ // constructor de la clase aparato
        this.consumo=consumo;
    } // Constructor

    public boolean getEncendido(){ // método para obtener el estado de encendido del aparato
        return encendido; // true si está encendido y false si está apagado
    }

    public void apagar(){ // método para apagar el aparato
        encendido=false;
    }

    public void encender(){ // método para encender el aparato
        encendido=true;
    }

    public int getConsumo(){
        return consumo;
    } /* Siempre que tengo una propiedad, tengo que tener su get:
                                                   propiedad: private final int consumo; */

    public int getConsumoActual(){ // método para obtener el consumo actual del aparato.
        if(encendido){
            return consumo; // retorna el consumo si está encendido
        }
        return 0; // retorna zero si esta apagado
    }
}
