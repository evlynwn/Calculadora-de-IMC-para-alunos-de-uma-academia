package br.senai.jandira.ds1t.calculadora.model;

import java.util.Scanner;

public class CalculadoraApp {

    String nomeDoAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imc;
    String situacao;


    public void ColetarDados(){
        Scanner scanner = new Scanner(System.in);

        // obtendo os dados do aluno
        System.out.println("---------------------------");
        System.out.println("*** CALCULADORA DE IMC ***");
        System.out.println("---------------------------");
        System.out.println("Digite o nome do aluno: ");
        nomeDoAluno = scanner.nextLine();
        System.out.println("Digite o peso (em kg): ");
        pesoDoAluno = scanner.nextDouble();
        System.out.println("Digite a altura (em metros): ");
        alturaDoAluno = scanner.nextDouble();

        calcularMedia();



    }

    public void calcularMedia(){
        imc= pesoDoAluno / (alturaDoAluno * alturaDoAluno);

        determinarSituacao();
    }
    public void determinarSituacao(){
        if (imc < 18.6){
            situacao = "Abaixo do peso";
        }else if (imc >= 18.6 && imc < 25.0){
            situacao = "Peso ideal(parabéns)";
        }else if (imc >= 25.0 && imc < 30.0){
            situacao = "Levemente acima do peso";
        }else if (imc >= 30.0 && imc < 35.0){
            situacao = "Obsedade grau 1";
        }else if (imc >= 35.0 && imc < 40.0){
            situacao = "Obesidade grau 2(severa)";
        }else {
            situacao = "Obesidade grau 3";
        }
        mostrarResultados();

    }
    public void mostrarResultados(){
        String imcDoisDecimais = String.format("%.2f",imc);
        System.out.println();
        System.out.println("-----RESULTADO------");
        System.out.println("Aluno:" + nomeDoAluno);
        System.out.println("IMC calculado: " + imcDoisDecimais);
        System.out.println("Status: " + situacao);
        System.out.println("-----------------------");
    }



}
