package Ejercicio20_torreControl;

public class Main {
    public static void main(String[] args) {
        TorreControl torre = new TorreControl();
        Avion av1 = new Avion("AR1500", "Aerolíneas Argentinas");
        Avion av2 = new Avion("LA8040", "LATAM");
        Avion av3 = new Avion("FB0210", "Flybondi");

        av1.solicitarAterrizaje(torre);
        av2.solicitarAterrizaje(torre);
        av3.solicitarAterrizaje(torre);

        torre.liberarPista(av1);

        av2.solicitarAterrizaje(torre);
        av3.solicitarAterrizaje(torre);
    }
}
