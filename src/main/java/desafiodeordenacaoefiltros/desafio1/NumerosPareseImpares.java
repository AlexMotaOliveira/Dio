package desafiodeordenacaoefiltros.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPareseImpares {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List <Integer>listaPar = new ArrayList();
        List <Integer>listaImpar = new ArrayList();
        Integer valor;
        int count = 0;

        while(ler.hasNextInt()){
            if (count == 0){
                ler.nextInt();
                ler.nextLine();
            }

            valor = ler.nextInt();
            ler.nextLine();

            if(valor == null){
                break;
            }
            else if (valor % 2 == 0){
                listaPar.add(valor);
            }
            else {
                listaImpar.add(valor);
            }
            count++;
        }

        for (int finalIndex = listaPar.size() -1; finalIndex > 0; finalIndex--) {
            for (int i = 0; i < finalIndex; i++) {
                if (listaPar.get(i) > listaPar.get(i + 1)){
                    swap(listaPar, i, i+1);
                }

            }
        }

        for (int finalIndex = listaImpar.size() -1; finalIndex > 0; finalIndex--) {
            for (int i = 0; i < finalIndex; i++) {
                if (listaImpar.get(i) < listaImpar.get(i + 1)){
                    swap(listaImpar, i, i+1);
                }

            }
        }

        for (Integer lista : listaImpar){
            listaPar.add(lista);
        }

        for (Integer lista : listaPar){
            System.out.println(lista);
        }


    }

    public static void swap(List <Integer> array, int i, int j){

        if (i == j)
            return;

        Integer temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);

    }
}
