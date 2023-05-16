package br.icev.eng.Estrutura_de_Dados.Atividade_Pilha02.quest3;

import java.sql.Date;
import java.util.Arrays;

import java.util.ArrayList;

public class PilhaNotas {
    private ArrayList<Nota> lista_Notas;
    private int tamannho;

    public PilhaNotas(int tamanho) {
        this.lista_Notas = new ArrayList<Nota>();
        this.tamannho = tamanho;
    }

    public void pushe(Nota nota) {
        if (isFull()) {
            System.out.println("Pilha cheia");
        } else {
            lista_Notas.add(nota);
            organizadata();

        }

    }

    public boolean isEmpty() {
        if (lista_Notas.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("pilha esta vazaia");
        } else {
            Nota notapop = lista_Notas.get((lista_Notas.size()) - 1);
            lista_Notas.remove((lista_Notas.size()) - 1);
            System.out.println(notapop);
        }

    }

    public boolean isFull() {
        if (lista_Notas.size() == tamannho) {
            return true;
        } else {
            return false;
        }
    }

    public void organizadata() {
        if (isEmpty()) {
                Nota anintiga = lista_Notas.get((lista_Notas.size()) - 1);
                int j=0;
                int k=0;
                int m=0;
                Nota[] troca = new Nota[tamannho];
                while ((lista_Notas.size())!=0) {
                    for(Nota c : lista_Notas){
                        if(j ==0 || c.getData().before(anintiga.getData()) ){
                            anintiga = c;

                        }
                        j++;
                    }
                    troca[k]=anintiga;
                    k++;
                }
            for(Nota c : troca){
                lista_Notas.add(m , c);
                m++;
            }
        }
    }

    public void mostraLista(){
        for(Nota c : lista_Notas){
                System.out.println(c);
        }
    }

}
