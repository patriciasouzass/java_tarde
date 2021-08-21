package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // fabrica 1 - distancia sede principal 500km - custo de envio 7%
        // fabrica 2 - distancia sede principal 780km - custo de envio 15%
        // fabrica 3 - distancia sede principal 1200km - custo de envio 22%
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        Scanner teclado = new Scanner(System.in);
        double pVenda = 0;

        System.out.println("Qual o preço de custo? ");
        double pCusto = teclado.nextDouble();

        System.out.println("Qual fábrica? (1, 2 ou 3) ");
        int fabrica = teclado.nextInt();

        if (fabrica == 1){
            pVenda = pCusto + (pCusto*0.07);
            pVenda = pVenda + (pVenda*0.25);
            System.out.println("O preço de venda é R$" + df.format(pVenda));
        } else if (fabrica == 2){
            pVenda = pCusto + (pCusto*0.15);
            pVenda = pVenda + (pVenda*0.25);
            System.out.println("O preço de venda é R$" + df.format(pVenda));
        } else {
            pVenda = pCusto + (pCusto*0.22);
            pVenda = pVenda + (pVenda*0.25);
            System.out.println("O preço de venda é R$" + df.format(pVenda));
        }

    }
}