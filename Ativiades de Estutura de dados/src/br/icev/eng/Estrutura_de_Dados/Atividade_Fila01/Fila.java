package br.icev.eng.Estrutura_de_Dados.Atividade_Fila01;
 
public class Fila {
    private int total;
    private int primeiro;
    private int ultimo;
    protected Paciente[] lista_paciente ;


    public Fila(){
        lista_paciente= new Paciente[10];
        this.primeiro=0;
        this.ultimo =0;
        total=0;

    }

    public void inserir(Paciente elemento){
        if(isFull()){
            System.out.println("Fila cheia");
        }else{
            lista_paciente[ultimo]=elemento;
            ultimo=(ultimo+1) % lista_paciente.length;
            total++;
        }


    }



    public Paciente retira(){
            Paciente elemento = lista_paciente[primeiro];
            primeiro = (this.primeiro+1) % lista_paciente.length;
            this.total--;
            return elemento;
        
    }

    public boolean isFull(){
        if( total==lista_paciente.length){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        return total==0;
    }
    
     public int total(){
        return this.total;
     }
   

  


}


