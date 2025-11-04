package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notifSMS = new NotificacaoSms("Felipe", "14999999999", "Mensagem de Teste", 1); 
        notifSMS.exibirInformacoesRemetente();
        notifSMS.enviar();
        notifSMS.registrarLog(); 
        notifSMS.definirPrioridade(8);
        notifSMS.obterNivelPrioridade(); 
        notifSMS.definirPrioridade(0);
        Notificacao notif = new NotificacaoSms("Fulano", "14131312412412", "Testando", 3);
        notif.exibirInformacoesRemetente();
        notif.enviar();
        Priorizavel objPriorizavel = new NotificacaoSms("Ciclano", "148109481094812904", "Olá", 8);
        
        
    }
}

