/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica6;

import Grafos.JAGM;
import Grafos.JGrafo;

/**
 *
 * @author arthur
 */
public class Pratica6 {
    public static final byte A  = 0;
    public static final byte B  = 1;
    public static final byte C  = 2;
    public static final byte D  = 3;
    public static final byte E  = 4;
    public static final byte F  = 5;
    public static final byte G  = 6;
    public static final byte H  = 7;
    public static final byte K  = 8;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        JGrafo g1 = new JGrafo(9);
        
        g1.insereAresta(A, B, 5);
        g1.insereAresta(A, H, 10);
        g1.insereAresta(A, E, 5);
        g1.insereAresta(A, D, 10);
        g1.insereAresta(A, G, 10);
        
        g1.insereAresta(B, H, 5);
        g1.insereAresta(B, K, 10);
        g1.insereAresta(B, F, 5);
        
        g1.insereAresta(H, K, 20);
        g1.insereAresta(E, K, 10);
        g1.insereAresta(E, D, 5);
        g1.insereAresta(E, C, 10);
        
        g1.insereAresta(C, D, 5);
        g1.insereAresta(C, G, 5);
        g1.insereAresta(D, G, 10);
        
        g1.insereAresta(G, F, 15);
        
        JAGM jagm = new JAGM(g1);
        jagm.obterAgm(A);
        
        // Descobrindo o antecessor
        System.out.println("B - " + jagm.antecessor(B));
        System.out.println("C - " + jagm.antecessor(C));
        System.out.println("D - " + jagm.antecessor(D));
        System.out.println("E - " + jagm.antecessor(E));
        System.out.println("F - " + jagm.antecessor(F));
        System.out.println("G - " + jagm.antecessor(G));
        System.out.println("H - " + jagm.antecessor(H));
        System.out.println("K - " + jagm.antecessor(K));
        
        // Calculando o peso de cada aresta
        System.out.println("Peso de A-B: " + jagm.peso(B));
        System.out.println("Peso de A-E: " + jagm.peso(E));
        System.out.println("Peso de A-G: " + jagm.peso(G));
        System.out.println("Peso de B-F: " + jagm.peso(F));
        System.out.println("Peso de B-H: " + jagm.peso(H));
        System.out.println("Peso de E-C: " + jagm.peso(C));
        System.out.println("Peso de E-D: " + jagm.peso(D));
        System.out.println("Peso de E-K: " + jagm.peso(K));
        
        
        
        
        // Exemplo 2
        System.out.println("\n------------------\nExemplo 2");
        JGrafo g2 = new JGrafo(9);
        
        g2.insereAresta(1, 2, 8);
        g2.insereAresta(1, 3, 2);
        g2.insereAresta(1, 7, 9);
        g2.insereAresta(1, 7, 9);
        
        g2.insereAresta(3, 2, 3);
        g2.insereAresta(3, 4, 9);
        g2.insereAresta(3, 7, 6);
        
        g2.insereAresta(4, 2, 2);
        g2.insereAresta(4, 5, 6);
        g2.insereAresta(4, 7, 2);
        
        g2.insereAresta(5, 2, 7);
        g2.insereAresta(5, 6, 5);
        g2.insereAresta(5, 7, 4);
        
        g2.insereAresta(6, 2, 5);
        g2.insereAresta(6, 8, 6);
        g2.insereAresta(6, 7, 4);
        
        g2.insereAresta(8, 2, 6);
        g2.insereAresta(8, 7, 3);
        
        JAGM jagm2 = new JAGM(g2);
        jagm2.obterAgm(1);
        
        // Descobrindo o antecessor
        System.out.println("2 - " + jagm2.antecessor(2));
        System.out.println("3 - " + jagm2.antecessor(3));
        System.out.println("4 - " + jagm2.antecessor(4));
        System.out.println("5 - " + jagm2.antecessor(5));
        System.out.println("6 - " + jagm2.antecessor(6));
        System.out.println("7 - " + jagm2.antecessor(7));
        System.out.println("8 - " + jagm2.antecessor(8));
        
        // Calculando o peso de cada aresta
        System.out.println("Peso de 1-3: " + jagm2.peso(3));
        System.out.println("Peso de 3-2: " + jagm2.peso(2));
        System.out.println("Peso de 3-4: " + jagm2.peso(4));
        System.out.println("Peso de 3-7: " + jagm2.peso(7));
        System.out.println("Peso de 4-5: " + jagm2.peso(5));
        System.out.println("Peso de 5-6: " + jagm2.peso(6));
        System.out.println("Peso de 6-8: " + jagm2.peso(8));
    }    
}






















