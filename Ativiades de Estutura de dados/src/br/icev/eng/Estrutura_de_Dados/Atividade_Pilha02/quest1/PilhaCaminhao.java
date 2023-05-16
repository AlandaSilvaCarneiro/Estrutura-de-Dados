package br.icev.eng.Estrutura_de_Dados.Atividades_Pilha.Atividade_Pilha02.quest1;

import java.util.Arrays;

import javax.swing.text.html.parser.Element;

public class PilhaCaminhao {
    private Caminhao lista_Caminhaos[];
    private int top =-1;



    public PilhaCaminhao(int tamanho){
        this.lista_Caminhaos= new Caminhao[tamanho];

    }

    @Override
    public String toString() {
        return "PilhaCaminhao [lista_Caminhaos=" + Arrays.toString(lista_Caminhaos) + "]";
    }

    public void pushe(Caminhao caminhao){
        top++;
        this.lista_Caminhaos[top]= caminhao;

    }

    public boolean isEmpty(){
            if(top==-1){
                return true;
            }else{
                return false;
            }
    }

    public boolean isFull(){
        if(top==((this.lista_Caminhaos.length)-1)){
            return true;
        }else{
            return false;
        }
    }


    public Caminhao pop(){
        Caminhao caminhao1=this.lista_Caminhaos[top];
        top--;
        return caminhao1;
    }
}
