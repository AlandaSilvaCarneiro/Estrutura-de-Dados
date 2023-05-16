package br.icev.eng.Estrutura_de_Dados.Atividade_Pilha02.quest2;

public class Implemques2 {
    public static void main(String[] args) {
        Acao a1 = new Acao(" abri cmd");
        Acao a2 = new Acao(" roda jogo");
        Acao a3 = new Acao("pesquisa");
        Acao a4= new Acao(" abri cmd");
        Acao a5= new Acao(" roda jogo");
        Acao a6= new Acao(" roda jogo");
        Acao a7 = new Acao("pesquisa");
        PilhaAcao p1 = new PilhaAcao();
        p1.pushe(a3);
        p1.pushe(a2);
        p1.pushe(a1);
        p1.pushe(a4);
        p1.pushe(a2);
        p1.pushe(a5);
        p1.pushe(a6);
        p1.pushe(a3);
        p1.pushe(a2);
        p1.pushe(a1);
        p1.pushe(a4);
        p1.pushe(a2);
        p1.pushe(a5);
        p1.pushe(a6);
        p1.pushe(a3);
        p1.pushe(a2);
        p1.pushe(a1);
        p1.pushe(a4);
        p1.pushe(a4);
        p1.pushe(a2);
        p1.pushe(a5);
        p1.pushe(a6);
        p1.pushe(a3);
        p1.pushe(a2);
        p1.pushe(a1);
        p1.pushe(a4);

        p1.pop(17);



   

    }
}
