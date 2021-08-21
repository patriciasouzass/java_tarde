package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = teclado.nextDouble();

        System.out.println("Digite seu RH: ");
        long docIdentidade = teclado.nextLong();

        if (salario <= 20000){
            salario += salario*0.20;
            System.out.println("Seu salário foi reajustado com 20% e a partir de agora será R$"+df.format(salario));
        } else if (salario > 20000 && salario <= 45000){
            salario += salario*0.10;
            System.out.println("Seu salário foi reajustado com 10% e a partir de agora será R$"+df.format(salario));
        } else {
            salario += salario*0.05;
            System.out.println("Seu salário foi reajustado com 5% e a partir de agora será R$"+df.format(salario));
        }

    }
}
