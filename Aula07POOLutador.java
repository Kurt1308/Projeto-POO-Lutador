
package aula07poolutador;

public class Aula07POOLutador {

    public static void main(String[] args) {
       /*
        Lutador l = new Lutador("Lucas", "Brasileiro", 33, 1.73f, 
       81.2f, 11, 2, 1);
        De acordo com a forma acima, precisamos criar um por um.
        Vamos fazer o mesmo usando vetores.
        */
       Lutador l[] = new Lutador[6];
       l[0] = new Lutador("Lucas", "Brasileiro", 33, 1.73f, 
                          81.2f, 11, 2, 1);
       l[1] = new Lutador("Luiza", "Brasileiro", 30, 1.63f, 
                          53.2f, 15, 4, 3);
       l[2] = new Lutador("Gabriel", "Brasileiro", 14, 1.83f, 
                          60.2f, 11, 2, 1);
       l[3] = new Lutador("Ana Lúcia", "Francessa", 65, 1.53f, 
                          52.2f, 12, 24, 7);
       l[4] = new Lutador("Marcos", "Alemão", 39, 1.80f, 
                          91.2f, 16, 6, 3);
       l[5] = new Lutador("Bruno", "Brasileiro", 36, 1.81f, 
                          102.2f, 19, 5, 2);
       
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[1], l[3]);
       UEC01.lutar();
       
    }
    
}
