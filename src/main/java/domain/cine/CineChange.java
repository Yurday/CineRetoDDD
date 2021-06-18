package domain.cine;

import domain.cine.events.*;
import co.com.sofka.domain.generic.EventChange;

public class CineChange extends EventChange {

    public CineChange(Cine cine){
        apply((FormatoDePeliculaDeCarteleraModificado event) -> {
            var cartelera = cine.getCarteleraId(event.carteleraId())
                    .orElseThrow(()->new IllegalArgumentException("Cartelera no existe"));
            cartelera.modificarFormatoDePelicula(event.formato());
        });
/*
        apply((HorarioDeCarteleraModificado event) -> {
            domain.cine.getCarteleraId = event.horario();
        });

        apply((NombreDeCineCambiado event) -> {
            domain.cine.nombreCine = event.nombreCine();
        });

        apply((NombreDeSalaModificado event) -> {
            domain.cine.salaId = event.nombreSala();
        });

        apply((NombreDeVendedorDeTiqueteActualizado event) -> {
            domain.cine.cartelera = event.nombreDeVendedor();
        });

        apply((PeliculaDeCarteleraModificada event) -> {
            domain.cine.cartelera = event.pelicula();
        });

        apply((PrecioDePeliculaDeCarteleraModificado event) -> {
            domain.cine.cartelera = event.precio();
        });
        */

    }
}
