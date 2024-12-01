package ej3;

public class Luz implements Dispositivo {
	private boolean encendida = false;
	@Override
	public void encender() {
        if (encendida) {
            System.out.println("La luz ya está encendida.");
        } else {
            encendida = true;
            System.out.println("Luz encendida.");
        }
    }

    @Override
    public void apagar() {
        if (!encendida) {
            System.out.println("La luz ya está apagada.");
        } else {
            encendida = false;
            System.out.println("Luz apagada.");
        }
    }
}

