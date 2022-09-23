/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista08;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo de Paula
 */
public class Lista08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" .::Exercicio 1::.");
        double[][] matriz1 = new double[4][4];
        int maiorQ10 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("\nLinha " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("-Coluna " + (j + 1) + ":");
                matriz1[i][j] = sc.nextInt();
                if (matriz1[i][j] > 10) {
                    maiorQ10++;
                }
            }
        }
        System.out.println("\nValores maiores que 10:\n" + maiorQ10);

        System.out.println("\n .::Exercicio 2::.\n");
        int[][] matriz2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            matriz2[i][i] = 1;
        }
        System.out.println("Matriz de identidade:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  " + matriz2[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n .::Exercicio 3::.\n");
        int[][] matriz3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = (i + 1) * (j + 1);
                if (matriz3[i][j] < 10) {
                System.out.print("   " + matriz3[i][j]);
                } else {
                System.out.print("  " + matriz3[i][j]);
                }
            }
            System.out.println();
        }
        
        System.out.println("\n .::Exercicio 4::.");
        int[][] matriz4 = new int[4][4];
        int maiorValor = 0;
        int maiorI = 0;
        int maiorJ = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("\nLinha " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("-Coluna " + (j + 1) + ":");
                matriz4[i][j] = sc.nextInt();
                if (matriz4[i][j] > maiorValor) {
                    maiorValor = matriz4[i][j];
                    maiorI = i + 1;
                    maiorJ = j + 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz4[i][j] < 10) {
                System.out.print("   " + matriz4[i][j]);
                } else {
                System.out.print("  " + matriz4[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("\nLocalizacao do maior valor:");
        System.out.println(" " + maiorI + "º linha " + maiorJ + "º coluna");
        
        System.out.println("\n .::Exercicio 5::.");
        int[][] matriz5 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.println("\nLinha " + (i + 1));
            for (int j = 0; j < 5; j++) {
               System.out.println("-Coluna " + (j + 1) + ":");
               matriz5[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEntre com o valor que deseja buscar:");
        int xBusca = sc.nextInt();
        boolean mensagem = true;
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (xBusca == matriz5[i][j]) {
                    if (mensagem == true) {
                    System.out.println("O valor foi encontrado na posicao:");
                    System.out.println(" Linha " + (i + 1) + " Coluna " + (j + 1));
                    mensagem = false;
                    } else {
                    System.out.println(" Linha " + (i + 1) + " Coluna " + (j + 1));    
                    }
                }
            }
        }
        if (mensagem == true) {
            System.out.println("O valor nao foi encontrado!");
        }
    }
}
