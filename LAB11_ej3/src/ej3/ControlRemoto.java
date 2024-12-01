package ej3;

public class ControlRemoto {
	private Comando ultimoComando;
    public void ejecutarComando(Comando comando) {
        if (comando == null) {
            System.out.println("No se puede ejecutar un comando nulo.");
            return;
        }
        comando.iniciar();
        ultimoComando = comando;
    }
    public void deshacerUltimoComando() {
        if (ultimoComando == null) {
            System.out.println("No hay comandos para deshacer.");
            return;
        }
        ultimoComando.deshacer();
        ultimoComando = null;
    }
}
