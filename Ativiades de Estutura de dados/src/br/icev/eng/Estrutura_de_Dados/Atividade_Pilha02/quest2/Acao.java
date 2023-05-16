package br.icev.eng.Estrutura_de_Dados.Atividade_Pilha02.quest2;

public class Acao {
    private String comando;

    public Acao(String comando) {
        this.comando = comando;
    }
    public String getComando() {
        return comando;
    }

    @Override
    public String toString() {
        return "Acao [comando=" + comando + "]";
    }
    public void setComando(String comando) {
        this.comando = comando;
    }
}
