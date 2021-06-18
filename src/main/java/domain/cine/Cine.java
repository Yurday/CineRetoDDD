package domain.cine;

import domain.cine.events.*;
import domain.cine.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Optional;
import java.util.Set;

public class Cine extends AggregateEvent <CineId>{

protected NombreCine nombreCine;
protected Sala sala;
protected Set<Cartelera> carteleras;
protected Tiquete tiquete;

    private Cine(CineId cineId){
        super(cineId);
        subscribe(new CineChange(this));
    }

    public void cambiarNombreDeCine (NombreCine nombreCine){
        appendChange(new NombreDeCineCambiado(nombreCine)).apply();
    }

    public void codificarNombreDeSala (SalaId entityId, NombreSala nombreSala){
        appendChange(new NombreDeSalaModificado(entityId, nombreSala)).apply();
    }

    public void modificarHorarioDeCartelera (CarteleraId entityId, Horario horario){
        appendChange(new HorarioDeCarteleraModificado(entityId, horario)).apply();
    }

    public void modificarPeliculaDeCartelera (CarteleraId entityId, Pelicula pelicula){
        appendChange(new PeliculaDeCarteleraModificada(entityId, pelicula)).apply();
    }

    public void modificarFormatoDePeliculaDeCartelera (CarteleraId entityId, Formato formato){
        appendChange(new FormatoDePeliculaDeCarteleraModificado(entityId, formato)).apply();
    }

    public void modificarPrecioDePeliculaDeCartelera (CarteleraId entityId, Precio precio){
        appendChange(new PrecioDePeliculaDeCarteleraModificado(entityId, precio)).apply();
    }

    public void actualizarNombreDeVendedorDeTiquete (TiqueteId entityId, NombreDeVendedor nombreDeVendedor){
        appendChange(new NombreDeVendedorDeTiqueteActualizado(entityId, nombreDeVendedor)).apply();
    }

    public Optional <Cartelera> getCarteleraId(CarteleraId carteleraId){
        return carteleras.stream().filter(cartelera -> cartelera.identity().equals(carteleraId)).findFirst();
    }

    public NombreCine nombreCine() {
        return nombreCine;
    }

    public Sala sala() {
        return sala;
    }

  /*  public Cartelera cartelera() {
        return cartelera;
    }*/

    public Tiquete tiquete() {
        return tiquete;
    }

}