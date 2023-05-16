package br.icev.eng.Estrutura_de_Dados.Atividades_Pilha.Ativi_Pilha01;

public class Pilha {
    private int topo = -1;
    private String exepre_mate[];

    public Pilha(int tamanho) {
        int tamanho_pilha = tamanho;
        this.exepre_mate = new String[tamanho_pilha];

    }

    public void pushe(String expre) {
        if (isFull() || topo == 0 && expre == ")") {
            System.out.println("A pilha já esta cheia");
        } else {
            this.topo++;
            this.exepre_mate[topo] = expre;
        }

    }

    public String pop() {
        String eleme;
        eleme = exepre_mate[topo];
        topo--;
        return eleme;

    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int topo() {
        return topo;
    }

    public void veriEprex() {
        String par1 = "(";
        String par2 = ")";
        int[] quantpares = new int[2];
        for (String c : this.exepre_mate) {
            int j = 0;
            int i = 0;

            if (isEmpty()){
                if (c == par1) {
                    quantpares[0]++;
                    i++;
                }
                if (c == par2) {
                quantpares[1]++;
                }

            }

            j++;

        }
        if (quantpares[0] == quantpares[1]) {
            System.out.println("expressao correta");
        } else {
            System.out.println("exrepasoo incorreta");
            }


    }

    public boolean isFull() {
        if (topo == ((this.exepre_mate.length) - 1)) {
            return true;
        } else {
            return false;
        }

    }
}
