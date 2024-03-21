package dominio;
//import java.util.HashSet;
//import java.util.Set;

import java.util.ArrayList;
import java.util.List;
public class Red { // Clase que representa una red de aparatos y su funcionalidad

    //private Set <aparato> aparatos;

    private final List<Aparato> aparatos; // Guardar los aparatos. Es una lista de Aparatos

    private final int potenciaMaxima; // potencia maxima soportada por la red

    public Red(int potenciaMaxima){ // constructor de la clase - los constructores siempre serán públicos
        //aparatos = neew HashSet<>();
        this.aparatos=new ArrayList<Aparato>();
        this.potenciaMaxima=potenciaMaxima; //potencia maxima de la red
    }

    public void addAparato(Aparato aparato){
        aparatos.add(aparato);
    } //método para añadir un aparato en la red

    public int size(){
        return aparatos.size();
    } //Número de aparatos enchufados en la red

    public int getConsumoActual(){ //método para obtener el consumo actual de la red
        int consumoActual=0;

        for(Aparato aparato: aparatos){
            consumoActual += aparato.getConsumoActual(); //suma el consumo actual de todos los aparatos
        }
        return consumoActual; // va retornar el consumo actual
    }

    public boolean esEstable(){ //método para verificar si la red es estable
        return getConsumoActual() <= potenciaMaxima;} // si es estable retornará true, si no es, retornará false
}
