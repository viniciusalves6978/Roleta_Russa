package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta desenvolvida em aula
 * Data: 17/08/23
 * Autor: Vitor de Jesus
 */


public class Roleta {
    public static void main(String[] args) {

        int number;
        int random;
        boolean continuar = true;

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        while (continuar){

            System.out.println("#########################################");
            System.out.println("============= Bem vindo/a! =============");
            System.out.println("============ Teste sua sorte! ==========");
            System.out.println("Digite um número: ");
            number = teclado.nextInt();

            random = aleatorio.nextInt(10);

            if (random == number){
                continuar = false;

            }

        }
        System.out.println("=========== Parabéns, você ganhou! ==============");

    }

}
