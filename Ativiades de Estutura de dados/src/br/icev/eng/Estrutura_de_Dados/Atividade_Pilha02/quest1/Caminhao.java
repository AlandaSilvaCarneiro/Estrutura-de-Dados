package br.icev.eng.Estrutura_de_Dados.Atividades_Pilha.Atividade_Pilha02.quest1;

public class Caminhao {
   private String marca;
   private String motorista_nome;
   private String tipo_material_trasporte;
   private double quilometro_rodados ;
   private double peso_suporta;
public String getMarca() {
    return marca;
}
@Override
public String toString() {
    return "Caminhao [marca=" + marca + ", motorista_nome=" + motorista_nome + ", tipo_material_trasporte="
            + tipo_material_trasporte + ", quilometro_rodados=" + quilometro_rodados + ", peso_suporta=" + peso_suporta
            + "]";
}
public Caminhao(String marca, String motorista_nome, String tipo_material_trasporte, double quilometro_rodados,
        double peso_suporta) {
    this.marca = marca;
    this.motorista_nome = motorista_nome;
    this.tipo_material_trasporte = tipo_material_trasporte;
    this.quilometro_rodados = quilometro_rodados;
    this.peso_suporta = peso_suporta;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getMotorista_nome() {
    return motorista_nome;
}
public void setMotorista_nome(String motorista_nome) {
    this.motorista_nome = motorista_nome;
}
public String getTipo_material_trasporte() {
    return tipo_material_trasporte;
}
public void setTipo_material_trasporte(String tipo_material_trasporte) {
    this.tipo_material_trasporte = tipo_material_trasporte;
}
public double getQuilometro_rodados() {
    return quilometro_rodados;
}
public void setQuilometro_rodados(double quilometro_rodados) {
    this.quilometro_rodados = quilometro_rodados;
}
public double getPeso_suporta() {
    return peso_suporta;
}
public void setPeso_suporta(double peso_suporta) {
    this.peso_suporta = peso_suporta;
}

}
