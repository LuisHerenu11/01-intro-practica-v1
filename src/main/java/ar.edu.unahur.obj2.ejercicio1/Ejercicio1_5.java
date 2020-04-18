package ar.edu.unahur.obj2.ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {
        String texto;
        Analizador analizar;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el texto a analizar: ");
        texto = lector.next();
        analizar = new Analizador(texto);
        analizar.contarLetras();
        analizar.visualizarRecuento();
    }

    public static class Analizador {
        private String unTexto;
        ArrayList<Integer> recuento;

        public ArrayList<Integer> getRecuento() {
            return recuento;
        }

        public void setRecuento(ArrayList<Integer> recuento) {
            this.recuento = recuento;
        }


        public Analizador(String algunTexto) {
            this.setUnTexto(algunTexto);
        }

        public void setUnTexto(String unTexto) {
            this.unTexto = unTexto;
        }

        public String getUnTexto() {
            return unTexto;
        }

        public void contarLetras() {
            char letra;
            int contador = 0;
            this.recuento = new ArrayList<>();

            for (int i = 0; i < unTexto.length(); i++) {
                for(int j=0; j < unTexto.length(); j++) {
                    if (unTexto.charAt(i) == unTexto.charAt(j)) {
                        contador++;
                    }
                }
                recuento.add(contador);
                contador = 0;
            }
        }
        public ArrayList<Integer> visualizarRecuento(){

            for(int j=0; j <recuento.size(); j++){
               System.out.print(recuento.get(j));
                //System.out.println(Integer j+" "+ recuento.get(j)"\n");
            }
            /*return recuento;*/
        }
    }
}
