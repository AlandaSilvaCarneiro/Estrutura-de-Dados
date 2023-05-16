package br.icev.eng.Estrutura_de_Dados.Atividade_Pilha02.quest2;

import java.util.ArrayList;

public class PilhaAcao {
    private ArrayList<Acao> lista_acao;

    public PilhaAcao() {
        this.lista_acao = new ArrayList<Acao>();
    }

    public void pushe(Acao acao) {
        lista_acao.add(acao);
        System.out.println("adicionado" + acao);

    }

    @Override
    public String toString() {
        return "PilhaAcao [lista_acao " + lista_acao + "]";
    }

    public boolean isEmpty() {
        if (lista_acao.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void pop(int quant) {
        if (quant <= 16) {
            Acao notapop;
            for (int c = 0; c < quant; c++) {
                if (isEmpty()) {
                    System.out.println("pilha esta vazaia");
                } else {
                    notapop = lista_acao.get((lista_acao.size()) - 1);
                    lista_acao.remove((lista_acao.size()) - 1);
                    System.out.println("removido =" + notapop);
                }
            }
        } else {
            System.out.println("o sistema só supota desfazer no máximo 16 ações  ");
        }
    }

}
