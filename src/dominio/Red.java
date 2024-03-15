package dominio;
//import java.util.HashSet;
//import java.util.Set;

import java.util.ArrayList;
import java.util.List;
public class Red {
    //private Set <aparato> aparatos;

    private final List<Aparato> aparatos;

    private final int potenciaMaxima;

    public Red(int potenciaMaxima){
        //aparatos = neew HashSet<>();
        this.aparatos=new ArrayList<Aparato>();
        this.potenciaMaxima=potenciaMaxima;
    }

    public void addAparato(Aparato aparato){
        aparatos.add(aparato);
    }

    public int size(){
        return aparatos.size();
    }

    public int getConsumoActual(){
        int consumoActual=0;

        for(Aparato aparato: aparatos){
            consumoActual += aparato.getConsumoActual();
        }
        return consumoActual;
    }

    public boolean esEstable(){
        return getConsumoActual() <= potenciaMaxima;
    }
}
