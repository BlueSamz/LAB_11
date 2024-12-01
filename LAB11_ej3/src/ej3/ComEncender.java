package ej3;

public class ComEncender implements Comando{
	private final Dispositivo dispositivo;

    public ComEncender(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void iniciar() {
        dispositivo.encender();
    }

    @Override
    public void deshacer() {
        dispositivo.apagar();
    }
}
