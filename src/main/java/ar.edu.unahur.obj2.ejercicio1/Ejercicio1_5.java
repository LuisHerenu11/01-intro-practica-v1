package ar.edu.unahur.obj2.ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {
        String texto;
        Analizador analizar;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el texto a analizar: ");
        texto = lector.nextLine();
        analizar = new Analizador(texto);
        analizar.contarLetras();
    }

    public static class Analizador {
        private String unTexto;
        List<Integer> recuento;

        public List<Integer> getRecuento() {
            return recuento;
        }

        public void setRecuento(List<Integer> recuento) {
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

            char[] letrasEncontradas = new char[27];
            int[] cantidades = new int[27];
            int punteroLetras = 0;

            String letras = "abcdefghijklmnñopqrstuvwxyz 1234567890";

            for (int i = 0; i < letras.length(); i++) {
                for(int j=0; j < unTexto.length(); j++) {
                    if (letras.charAt(i) == unTexto.charAt(j))
                    {
                        contador++;
                    }
                }

                if (contador > 0) {
                    letrasEncontradas[punteroLetras] = letras.charAt(i);
                    cantidades[punteroLetras] = contador;
                    contador = 0;
                    punteroLetras++;
                }
            }
            for(int i = 0;i < letrasEncontradas.length && (cantidades[i]>0);i++){
                System.out.println(letrasEncontradas[i]+" = "+cantidades[i]);
            }
        }
//        public void visualizarRecuento(){
//
//            for(int j=0; j <recuento.size(); j++){
//               System.out.print(recuento.get(j));
//                //System.out.println(Integer j+" "+ recuento.get(j)"\n");
//            }
//            return recuento;
//        }
    }
}
