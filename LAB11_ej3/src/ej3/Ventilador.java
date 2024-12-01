package ej3;

public class Ventilador implements Dispositivo {
	private boolean encendido = false;
	@Override
	public void encender() {
        if (encendido) {
            System.out.println("El ventilador ya está encendido.");
        } else {
            encendido = true;
            System.out.println("Ventilador encendido.");
        }
    }
    @Override
    public void apagar() {
        if (!encendido) {
            System.out.println("El ventilador ya está apagado.");
        } else {
            encendido = false;
            System.out.println("Ventilador apagado.");
        }
    }
}
