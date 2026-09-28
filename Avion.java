package Ejercicio20_torreControl;

public class Avion {
    private String codigoVuelo;
    private String aerolinea;
    private String estadoVuelo;

    public Avion(String codigoVuelo, String aerolinea) {
        this.codigoVuelo = codigoVuelo;
        this.aerolinea = aerolinea;
        this.estadoVuelo = "En vuelo";
    }

    public void cambiarEstado(String nuevoEstado) {
        estadoVuelo = nuevoEstado;
    }

    public void solicitarAterrizaje(TorreControl torre) {
        System.out.println(codigoVuelo + " (" + aerolinea + ") solicita pista para aterrizar.");
        if (torre.autorizarAterrizaje(this)) {
            System.out.println("  -> Torre: aterrizaje AUTORIZADO. Estado: " + estadoVuelo);
        } else {
            System.out.println("  -> Torre: aterrizaje DENEGADO, pista ocupada. Debe mantener la espera. Estado: " + estadoVuelo);
        }
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }
}
