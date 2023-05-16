package br.icev.eng.Estrutura_de_Dados.Atividade_Pilha02.quest3;

public class Implequest03 {
    public static void main(String[] args) {
     
        Nota n1 = new Nota(7, "12/04/2003");
        Nota n2 = new Nota(9, "01/06/2004");
        Nota n3 = new Nota(10, "24/09/2005");
        Nota n4 = new Nota(10, "25/09/2006");
        PilhaNotas p1 =new PilhaNotas(3);
         p1.pushe(n1);
         p1.pushe(n2);
         p1.pushe(n3);
        // p1.pushe(n4);
       p1.mostraLista();

    }
}
