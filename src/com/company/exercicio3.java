package com.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner servico = new Scanner(System.in);

        for (int i=0 ; i<=7; i++){
            System.out.println("Qual o serviço contratado? ");
            int tipoServico = servico.nextInt();

            if(tipoServico == 1){
                System.out.println("Serviço 1: Segurança com cameras - Preço fixo de R$1.500,00 por mes");
            } else if (tipoServico == 2){
                System.out.println("Serviço 2: Camera de segurança + Patrulha - Preço de R$1.500,00 + R$700,00 para serviço de patrulha");
            } else {
                System.out.println("Serviço inexistente");
            }
        }

    }
}
