package cine;

import cine.events.*;
import cine.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Cine extends AggregateEvent <CineId>{

protected NombreCine nombreCine;
protected SalaId salaId;
protected CarteleraId carteleraId;
protected TiqueteId tiqueteId;

    public Cine(CineId entityId) {
        super(entityId);
    }

    public void cambiarNombreDeCine (CineId entityId, NombreCine nombreCine){
        appendChange(new NombreDeCineCambiado(entityId, nombreCine)).apply();
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

}