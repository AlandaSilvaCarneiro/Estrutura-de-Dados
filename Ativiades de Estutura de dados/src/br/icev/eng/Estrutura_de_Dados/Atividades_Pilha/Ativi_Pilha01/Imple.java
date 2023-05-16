package br.icev.eng.Estrutura_de_Dados.Atividades_Pilha.Ativi_Pilha01;

public class Imple {
    public static void main(String[] args) {
            Pilha p1 = new Pilha(6);
            p1.pushe("1");
            p1.pushe("*");
            p1.pushe(")");
            p1.pushe("4");
            p1.pushe("+");
            p1.pushe("(");

        while (!p1.isEmpty()){
            System.out.println(p1.pop()); 

        }
        p1.veriEprex();
    }
}
