package desafiodeordenacaoefiltros.desafio2;

import java.util.*;

public class ListaCompras {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int index = ler.nextInt();
        ler.nextLine();


        for(int j=0; j < index; j++){
            Set<String> st = new TreeSet<>();
            st.addAll(Arrays.asList(ler.nextLine().split(" ")));

            for (String lista: st) {
                System.out.print(lista + " ");
            }
            System.out.printf("\n");
        }

    }
}
