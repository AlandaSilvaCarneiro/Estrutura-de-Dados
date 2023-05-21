package br.icev.eng.Estrutura_de_Dados.Atividade_Fila01;

public class Lista {
    protected No cabeca;
    protected No calda;
    private int tama = 0;

    public void adicionarNo(Fila fila) {
        No celula = new No(fila);
        if (this.tama == 0) {
            this.cabeca = celula;
        } else {
            this.calda.setPro(celula);
        }
        this.calda = celula;
        tama++;

    }

    public int getTama() {
        return tama;
    }

    public Lista() {
    }

    public void setTama(int tama) {
        this.tama = tama;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [cabeca=" + cabeca + "]";
    }

    public Fila perocorelista() {
        No a = cabeca;
        Fila b;
        Fila fila_final = new FilaChamada();
        while (a != null) {
            b = a.getElemento();
            if(b!=null){
            fila_final.inserir(b.retira());
            } 
            a = a.getPro();

        }
        return fila_final;
    }
}
