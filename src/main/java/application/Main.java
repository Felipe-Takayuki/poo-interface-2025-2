package application;

import java.util.ArrayList;
import java.util.List;

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
        objPriorizavel = new NotificacaoEmail("Beltrano", "beltrano@email.com", "Teste", "Olá Mundo", 3); 
        Arquivavel objArquivavel = new NotificacaoEmail("Felipe", "felipe@email.com", "Novo Teste", "Olá Mundo", 3);
        ((Notificacao) objArquivavel).enviar();
        
        System.out.println("================");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();
        objetos.add(new NotificacaoSms("Ciclano", "134344567", "Novo Teste", 2));
        objetos.add(new NotificacaoSms("Maria", "1343234567", "Testando", 4));

        for(Priorizavel item: objetos) {
            System.out.println(item.obterNivelPrioridade());
        }
    }
}

