/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Gu
 */
public class Calculadora_Juros {
        public static void main(String[] args) {
        // Declaração de Variaveis
        double juros, capital, taxa, prazo;
        int op;
        
        //Código foi feito só por mim mesmo, num consegui achar alguém kskskks
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            //Apresentação
            System.out.println("\n\t\t\t -- Calculadora de Juros 2.0 --\n");
        
            //Menu 
            System.out.println("1. Capital");
            System.out.println("2. Juros");
            System.out.println("3. Prazo");
            System.out.println("4. Taxa");
            System.out.println("5. Sair");
            
            //Opção do usuário
            System.out.print("\n\tOpção: ");
            op = entrada.nextInt();
            
            switch (op) {
                 case 1:
                    //Apresentação
                    System.out.println("\n\t\t\t -- Cálculo do Capital -- \n");
                    //Entradas
                    
                    System.out.print("Informe a taxa [%]: ");
                    taxa = entrada.nextDouble();
                    System.out.print("Informe o prazo: ");
                    prazo = entrada.nextDouble();
                    System.out.print("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    capital = juros / (taxa / 100 * prazo);
                    //saída
                    System.out.printf("\n Capital [R$ %.2f]", capital);
                    break;
                 case 2:
                    //Apresentação
                    System.out.println("\n\t\t\t -- Cálculo do Juros -- \n");
                    //Entradas
                    System.out.print("Informe o capital [R$]: ");
                    capital = entrada.nextDouble();
                    System.out.print("Informe a taxa [%]: ");
                    taxa = entrada.nextDouble();
                    System.out.print("Informe o prazo: ");
                    prazo = entrada.nextDouble();
                    //Processamento
                    juros = capital * taxa * prazo / 100;
                    //Saída
                    System.out.printf("\n Juros [R$ %.2f]\n\n", juros);
                    break;
                case 3:
                    //Apresentação
                    System.out.println("\n\t\t\t -- Cálculo do Prazo -- \n");
                    //Entradas
                    
                    System.out.print("Informe o capital [R$]: ");
                    capital = entrada.nextDouble();
                    System.out.print("Informe a taxa [%]: ");
                    taxa = entrada.nextDouble();
                    System.out.print("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    prazo = juros/(capital*taxa/100);
                    //saída
                    System.out.printf("\n Prazo [%.0f períodos]", prazo);
                    break;
                case 4:
                    //Apresentação
                    System.out.println("\n\t\t\t -- Cálculo do Taxa -- \n");
                    //Entradas
                    
                    System.out.print("Informe o capital [R$]: ");
                    capital = entrada.nextDouble();
                    System.out.print("Informe o prazo: ");
                    prazo = entrada.nextDouble();
                    System.out.print("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    taxa = juros / (capital * prazo) * 100;
                    //saída
                    System.out.printf("\n Taxa [%.0f", taxa);
                    System.out.print("%]");
                    break;
                case 5:
                    System.out.println("Valeu, Forte abraço!");
                    break;
                default:
                    System.out.println("A opção está incorreta!");
                    break;
            }
            
        }while(op != 5);
                
                
    }
    
}
