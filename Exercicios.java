package Prova;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe seu 1º numero:");
        int n1 = sc.nextInt();
        System.out.println("Infome seu 2º numero:");
        int n2 = sc.nextInt();
        System.out.println("Qual operação deseja utilizar? 1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão");
        int operacao = sc.nextInt();
        if (operacao == 1) {
            System.out.println("O Valor da adição é:" + (n1 + n2));
        }
        if (operacao == 2) {
            System.out.println("O valor da operação é" + (n1 - n2));
        }
        if (operacao == 3) {
            System.out.println("O valor da operação é" + (n1 * n2));
        }
        if (operacao == 4) {
            System.out.println("O valor da operação é" + (n1 / n2));
        }
    }

    public void exercicio2() {
        System.out.println("Informe o numero da sua matricula de 1 a 20");
        int matricula = sc.nextInt();
        if(matricula <=5){
            System.out.println("Time do Chris");

        }else if (matricula <=10) {
            System.out.println("Time do Greg" );
        
        }else if (matricula <=15) {
            System.out.println("Time do Caruso" );

        }else if (matricula <=20) {
            System.out.println("Time do Jerome" );

        }else System.out.println("Numero invalido" );    
        

    }

    public void exercicio3() {
        System.out.println("Informe a quantidade em kg de morangos:");
        double morango = sc.nextDouble();
        System.out.println("Informe a quantidade em kg de maças:");
        double maca = sc.nextDouble();
        System.out.println("Informe a quantidade em kg de bananas:");
        double bananas = sc.nextDouble();
        double precomorango = (morango*2.50);
        double precomaca = (maca*1.80);
        double precobanana = (bananas*1.30);
        double precocompra = precobanana+precomaca+precomorango;
        if(precocompra >=25 ){
            System.out.println("Você ganhou 10% de desconto:"+(precocompra*0.1)+ precocompra);
        }else 
        System.out.println("Sua compra não recebeu desconto"+ precocompra);

}
}
   

