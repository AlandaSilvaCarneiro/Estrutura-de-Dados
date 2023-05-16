package br.icev.eng.Estrutura_de_Dados.Atividade_Pilha02.quest3;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Nota implements Comparable<Nota> {
    private float nota;
    private Date data;
    
    
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public Nota(float nota, String data_s) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.nota = nota;
        try {
            data = formato.parse(data_s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        }

        public Nota(){
            

        }
   
    public Date getData() {
        return data;    
    }
    @Override
    public String toString() {
        return "Nota [nota=" + nota + ", data=" + data + "]";
    }
    public void setData(Date data) {
        this.data = data;
    }
    
    @Override
    public int compareTo(Nota outraNota) {
        return this.data.compareTo(outraNota.getData());
    }

    
}
