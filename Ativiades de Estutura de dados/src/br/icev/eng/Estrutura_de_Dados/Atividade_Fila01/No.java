package br.icev.eng.Estrutura_de_Dados.Atividade_Fila01;

public class No {
        private Fila elemento;
        protected No pro;
    

        
        public No(Fila elemento, No pro) {
            this.elemento = elemento;
            this.pro = pro;
        }
        public No(Fila elemento) {
            this.elemento = elemento;
        }
    
        public Fila getElemento() {
            return elemento;
        }
        public void setElemento(Fila elemento) {
            this.elemento = elemento;
        }
        public No getPro() {
            return pro;
        }
        public void setPro(No pro) {
            this.pro = pro;
        }
        @Override
        public String toString() {
            return "No [elemento=" + elemento + ", pro=" + pro + "]";
        }
    }
    

