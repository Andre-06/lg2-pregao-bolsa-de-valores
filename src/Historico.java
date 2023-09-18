import java.time.LocalDateTime;

public class Historico {
    private final Id id;
    private Ativo ativo;
    private int quantidade;
    private double valor;
    private int tipo; // Pode ser Compra = 0 ou Venda = 1;
    private final LocalDateTime horarioDaTransacao;
    private Investidor investidor;
    private Corretora corretora;

    public Historico() {
        horarioDaTransacao = LocalDateTime.now();
        id = new Id(Type.HISTORICO);
    }

    public Historico(Ativo ativo, int quantidade, double valor, int tipo, Investidor investidor, Corretora corretora) {
        this.ativo = ativo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipo = tipo;
        this.investidor = investidor;
        this.corretora = corretora;
        horarioDaTransacao = LocalDateTime.now();
        id = new Id(Type.HISTORICO);
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getHorarioDaTransacao() {
        return horarioDaTransacao;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }

    public Id getId() {
        return id;
    }
}