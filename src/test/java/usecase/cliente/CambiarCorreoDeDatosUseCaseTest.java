package usecase.cliente;

import org.junit.jupiter.api.BeforeEach;

public class CambiarCorreoDeDatosUseCaseTest {

    private CambiarCorreoDeDatosUseCaseTest cambiarCorreoDeDatosUseCaseTest;

    @BeforeEach

    public void setup(){
        CambiarCorreoDeDatosUseCaseTest cambiarCorreoDeDatosUseCase = new CambiarCorreoDeDatosUseCaseTest();
    }
/*
    @Test
    void CambiarCorreoDeDatoshappyPath(){
        //arrage
        var command = new CambiarCorreoDeDatos(
                DatosId.of("xxx-xxxx"),
                new Correo("Correo nuevo");
        );

        //act
        var response = UseCaseHandler.getInstance().syncExecutor(
                cambiarCorreoDeDatosUseCase, new RequestCommand<>(command)).orElseThrow();

        var events=response.getDomainEvents();

        //asserts
        CorreoDeDatosCambiado correoDeDatosCambiado = (CorreoDeDatosCambiado) events.get(0);
        Assertions.assertEquals("Correo cambiado", CorreoDeDatosCambiado.getCorreo().value();
    }*/
}