package br.icev.eng.Estrutura_de_Dados.Atividade_Fila01;

public class Hosp {
    public void inserir(Paciente elemeto_paciente,Fila fila) {
      fila.inserir(elemeto_paciente);
    }


    public void chamar_paciente(Lista lista) {
        Fila b = lista.perocorelista();
        while(!b.isFull()){
            System.out.println(b.retira());
        }

    }

    public void numero_paciente(Fila fila) {
        System.out.println(fila.total());

    }
}
