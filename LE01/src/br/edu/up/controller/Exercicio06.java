package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio06 {
    // 6. Ler uma temperatura em graus Celsius e apresentá-la convertida em
    // graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5

    public static void CastTemperatura() {
        PrintController.ExibirNaTela(06);

        System.out.println("6. Ler uma temperatura em graus Celsius e apresentá-la convertida em\n" +
                "graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Informe a temperatura atual(em Celsius): ");

        int Celsius = scanner.nextInt();

        System.out.println("A temperatura em Fahrenheit é de: " + (9 * Celsius + 160) / 5);
    }
}
