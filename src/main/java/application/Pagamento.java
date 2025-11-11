package application;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Pagamento {
    private String idTransacao; 
    private double valor; 
    private LocalDateTime dataHora; 
    private String descricao; 
    @Setter
    private String status;
    Pagamento(double valor, String descricao) {
        this.valor = valor; 
        this.descricao = descricao; 
    }

    void exibirDetalhesPagamento() {}

    public abstract void autenticar();
    public abstract void validarDados();

    public String gerarIdUnico(){
        return ""; 
    }*
}
