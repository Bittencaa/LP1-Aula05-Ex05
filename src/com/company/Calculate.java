package com.company;

import java.util.Scanner;

public class Calculate {

    double soma = 0;
    double resultado;
    double media;
    int contador = 0;
    boolean check = true;
    Scanner scan = new Scanner(System.in);

    public void somarNumeros(){
        do{
            check = true;
            if(soma <= 100){
                try{
                    resultado = soma;
                    System.out.println("Entre com um número: ");
                    soma = soma + scan.nextDouble();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                contador++;
            }else{
                System.out.println("A soma total não pode ser maior que 100");
                contador--;
                media = resultado / contador;
                check = false;
            }
        }while(check != false);
    }
    public void imprimirResultado(){
        System.out.println("O valor somado é: " + resultado);
        System.out.println("Foram somados " + contador + " números");
        System.out.println("A média dos números somados é: " + media);
    }
}
