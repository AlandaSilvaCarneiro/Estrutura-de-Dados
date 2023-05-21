package br.icev.eng.Estrutura_de_Dados.Atividade_Fila01;


public class Imple {
   public static void main(String[] args) {
    Fila fila_severo = new FilaPacienSevero();
    Fila fila_moderado = new FilaPacienModerado();
    Fila fila_leve = new FilaPacienLeve();
    Fila fila_normal = new FilaPacienNormal();
        Paciente p1 = new Paciente("Alan", 10);
        Paciente p2 = new Paciente("Alan", 10);
        Paciente p3 = new Paciente("Alan-moderado", 10 );
        Paciente p4 = new Paciente("Alan-severo", 10 );
        Hosp g1 = new Hosp();
        Lista lista = new Lista();
        lista.adicionarNo(fila_severo);
        lista.adicionarNo(fila_moderado);
        lista.adicionarNo(fila_leve);
        lista.adicionarNo(fila_severo);
        lista.adicionarNo(fila_moderado);
        lista.adicionarNo(fila_severo);
        lista.adicionarNo(fila_normal);
        g1.inserir(p3, fila_moderado);
        g1.inserir(p2, fila_leve);
        g1.inserir(p4, fila_severo);
        g1.inserir(p2, fila_leve);
        g1.numero_paciente(fila_leve);
        g1.chamar_paciente(lista);
        g1.chamar_paciente(lista);


        
    
    }

   
}
