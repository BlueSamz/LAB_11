package ej3;

public class ComApagar implements Comando {
	private final Dispositivo dispositivo;

    public ComApagar(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void iniciar() {
        dispositivo.apagar();
    }

    @Override
    public void deshacer() {
        dispositivo.encender();
    }
}
