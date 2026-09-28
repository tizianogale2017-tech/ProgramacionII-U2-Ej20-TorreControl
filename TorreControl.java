package Ejercicio20_torreControl;

public class TorreControl {
    private boolean pistaOcupada = false;

    public boolean autorizarAterrizaje(Avion avion) {
        if (pistaOcupada) {
            return false;
        }
        pistaOcupada = true;
        avion.cambiarEstado("Aterrizando");
        return true;
    }

    public void liberarPista(Avion avion) {
        avion.cambiarEstado("En tierra");
        pistaOcupada = false;
        System.out.println("[Torre] " + avion.getCodigoVuelo() + " ya está en tierra. Pista liberada.");
    }
}
