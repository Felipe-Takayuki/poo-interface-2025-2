package application;

public final class NotificacaoPush extends Notificacao {

    public NotificacaoPush(String remetente) {
        super(remetente);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação");
    }

    @Override
    public void registrarLog() {
        System.out.println("");
    }

   
    
}
