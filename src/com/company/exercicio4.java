package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner assinantes = new Scanner(System.in);

        int contAbc = 0, contAc = 0, contAb = 0, contBc = 0, contA = 0, contSemJornal = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Voce é assinante de Jornal Digital? (s ou n) ");
            String resposta = assinantes.next();

            if (resposta.equals("s") || resposta.equals("S")) {
                System.out.println("Voce é assinante do Diário A, B e C? (s ou n) ");
                String respostaAbc = assinantes.next();
                if (respostaAbc.equals("s") || respostaAbc.equals("S")) {
                    contAbc++;
                } else {
                    System.out.println("Voce é assinante dos Diários A e C? (s ou n) ");
                    String respostaAc = assinantes.next();
                    if (respostaAc.equals("s") || respostaAc.equals("S")) {
                        contAc++;
                    } else {
                        System.out.println("Voce é assinante dos Diários A e B? (s ou n) ");
                        String respostaAb = assinantes.next();
                        if (respostaAb.equals("s") || respostaAb.equals("S")) {
                            contAb++;
                        } else {
                            System.out.println("Voce é assinante dos Diários B e C? (s ou n) ");
                            String respostaBc = assinantes.next();
                            if (respostaBc.equals("s") || respostaBc.equals("S")) {
                                contBc++;
                            } else {
                                System.out.println("Voce é assinante do Diário A? (s ou n) ");
                                String respostaA = assinantes.next();
                                if (respostaA.equals("s") || respostaA.equals("S")) {
                                    contA++;
                                }
                            }
                        }
                    }
                }
            } else {
                contSemJornal++;
            }

        }
        System.out.println("Assinantes dos 3 Jornais: " + contAbc);
        System.out.println("Assinantes dos Diários A e C: " + contAc);
        System.out.println("Assinantes dos Diários A e B: " + contAb);
        System.out.println("Assinantes dos Diários B e C: " + contBc);
        System.out.println("Assinantes do Diário A: " + contA);
        System.out.println("Nao assinates: " + contSemJornal);
    }
}