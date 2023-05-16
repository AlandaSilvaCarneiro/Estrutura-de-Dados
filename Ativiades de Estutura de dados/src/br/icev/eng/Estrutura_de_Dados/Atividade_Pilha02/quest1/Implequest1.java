package br.icev.eng.Estrutura_de_Dados.Atividades_Pilha.Atividade_Pilha02.quest1;

public class Implequest1 {
    public static void main(String[] args) {
        Caminhao c1 =new Caminhao("mercedes", "alan", "pedra", 190, 10890);
        Caminhao c2 =new Caminhao("Ferrari", "Frascisco", "pedra", 1807, 20890);
        Caminhao c3 =new Caminhao("mercedes", "Dimmy", "Carregador", 0, 500);
        Caminhao c4 =new Caminhao("Jeep", "alan", "janela", 234, 1000);
        PilhaCaminhao p1 = new PilhaCaminhao(4);
        p1.pushe(c1);
        p1.pushe(c2);
        p1.pushe(c3);
        p1.pushe(c4);
    }
}
