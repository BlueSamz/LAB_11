package ej3;

public class AireAcondicionado implements Dispositivo{
	private boolean encendido = false;
	@Override
	public void encender() {
        if (encendido) {
            System.out.println("El aire acondicionado ya está encendido.");
        } else {
            encendido = true;
            System.out.println("Aire acondicionado encendido.");
        }
    }
    @Override
    public void apagar() {
        if (!encendido) {
            System.out.println("El aire acondicionado ya está apagado.");
        } else {
            encendido = false;
            System.out.println("Aire acondicionado apagado.");
        }
    }
}
