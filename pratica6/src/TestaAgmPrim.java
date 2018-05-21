import java.io.*;
import Grafos.JGrafo; /*-- vide Programa@{\it ~\ref{prog:estruturaslistaap}@ --*/
import Grafos.JAGM; /*-- vide Programa@{\it ~\ref{prog:estruturaslistaap}@ --*//*-- vide Programa@{\it ~\ref{prog:estruturaslistaap}@ --*//*-- vide Programa@{\it ~\ref{prog:estruturaslistaap}@ --*//*-- vide Programa@{\it ~\ref{prog:estruturaslistaap}@ --*/

public class TestaAgmPrim {
  static BufferedReader in = new BufferedReader (
                             new InputStreamReader (System.in));
  public static JGrafo.Aresta lerAresta () throws Exception {
    System.out.println ("Aresta:");
    System.out.print ("  V1:");
    int v1 = Integer.parseInt (in.readLine());
    System.out.print ("  V2:");
    int v2 = Integer.parseInt (in.readLine());
    System.out.print ("  Peso:");
    int peso = Integer.parseInt (in.readLine());
    return new JGrafo.Aresta (v1, v2, peso);
  }
  public static JGrafo.Aresta lerAresta (int u, int v, int p) {
    int v1 = u, v2 = v, peso = p;
    return new JGrafo.Aresta (v1, v2, peso);
  }

  public static void main (String[] args) throws Exception {
    System.out.print ("No. vertices:"); 
    int nVertices = Integer.parseInt (in.readLine());
//    System.out.print ("No. arestas:"); 
//    int nArestas = Integer.parseInt (in.readLine());
    System.out.print ("Raiz da AGM:"); 
    int raiz = Integer.parseInt (in.readLine());
    JGrafo grafo = new JGrafo (nVertices);
//    for (int i = 0; i < nArestas; i++) {
//      JGrafo.Aresta a = lerAresta ();
//      // @{\it Duas chamadas porque o grafo \'e n\~ao direcionado}@
//      grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
//      grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
//    }
    JGrafo.Aresta a = null; 
    a = lerAresta (0, 1, 6);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (0, 2, 1);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (0, 3, 5);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (1, 2, 2);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (1, 4, 5);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (2, 3, 2);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (2, 4, 6);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (2, 5, 4);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (3, 5, 3);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     
    a = lerAresta (4, 5, 4);
    grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); grafo.insereAresta (a.v2 (), a.v1 (), a.peso ());     

    grafo.imprime ();
    JAGM agm = new JAGM (grafo);
    agm.obterAgm (raiz);
    agm.imprime ();
  }
  
}
