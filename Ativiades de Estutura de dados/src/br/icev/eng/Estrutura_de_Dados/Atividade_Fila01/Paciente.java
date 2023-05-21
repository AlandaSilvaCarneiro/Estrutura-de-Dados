package br.icev.eng.Estrutura_de_Dados.Atividade_Fila01;

public class Paciente {

    private String nome_paciente;
    private int idade_paciende;
 



    public Paciente(String nome_paciente, int idade_paciende) {
        this.nome_paciente = nome_paciente;
        this.idade_paciende = idade_paciende;

    }
    
    public String getNome_paciente() {
        return nome_paciente;
    }
    public int getIdade_paciende() {
        return idade_paciende;
    }

    @Override
    public String toString() {
        return "Paciente [nome_paciente=" + nome_paciente + ", idade_paciende=" + idade_paciende + "]";
    }
  

}
