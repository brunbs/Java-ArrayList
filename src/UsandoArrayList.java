import java.util.ArrayList;
import java.util.List;

/* MÉTODOS DE ARRAYLIST NESTE ARQUIVO:

add() : adiciona um novo valor (retorna true / false) ou adiciona um novo valor na posição específica
remove() : retira o primeiro elemento encontrado (retorna true/false) ou remove o elemento que está em um índice específico
set() : muda um elemento sem alterar o tamanho do arrayList
isEmpty() : retorna true / false dependendo se o arrayList está vazio ou não
size() : retorna quantos elementos estão no arrayList
clear() : limpa o ArrayList
contains() : checa se um certo valor está no ArrayList
equals() : compara duas listas para saber se tem os mesmos elementos e na mesma ordem

 */
public class UsandoArrayList {

    public static void main(String[] args) {


        // Método add() : utilizado para adicionar elementos no ArrayList

        ArrayList lista = new ArrayList();
        lista.add("falcao"); //adiciona falcao na posição 0
        lista.add(Boolean.TRUE); //adiciona true na posição 1
        System.out.println(lista); //printa [falcao, true]

                //Utilizando generics:
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        // safer.add(Boolean.TRUE); este comando não compila pois este ArrayList espera receber apenas Strings e não booleanos

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); //ele "empurra" os outros pra frente => [blue jay, hawk, robin]
        birds.add(1, "cardinal"); //[blue jay, cardinal, hawk, robin]
        System.out.println(birds);

        System.out.println("############################");


        // Método remove(): remove o primeiro valor encontrado ou remove o elemento em um índice específico
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk"); // [hawk]
        birds2.add("hawk"); // [hawk, hawk]
        System.out.println(birds2.remove("cardinal")); //print FALSE pois não removeu
        System.out.println(birds2.remove("hawk")); //print TRUE pois removeu
        System.out.println(birds2.remove(0)); //printa "hawk" --> elemento que foi removido
        System.out.println(birds2); // []

        System.out.println("############################");

        // Método set(): troca um dos elementos do ArrayList sem trocar seu tamanho

        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk"); // [hawk]
        System.out.println(birds3.size()); // [1]
        birds3.set(0, "robin"); // [robin]
        System.out.println(birds3.size()); // [1]
        // birds3.set(1, "robin"); IndexOutOfBoundsException pois só tem um elemento, de índice 0

        System.out.println("############################");

        // Método isEmpty() e size(): dizem quantos slots estão em uso
        /*
        Assinaturas:

        boolean isEmpty()  --> retorna um true ou false
        int size() --> retorna um inteiro com o tamanho
         */

        List<String> birds4 = new ArrayList<>();
        System.out.println(birds4.isEmpty()); // true
        System.out.println(birds4.size()); //0
        birds4.add("hawk"); // [hawk]
        birds4.add("hawk"); // [hawk, hawk]
        System.out.println(birds4.isEmpty()); // false
        System.out.println(birds4.size()); // 2

        System.out.println("############################");


        /* Método clear(): descarta todos os elementos do ArrayList
        Assinatura:
        void clear()
         */

        List<String> birds5 = new ArrayList<>();
        birds5.add("hawk"); // [hawk]
        birds5.add("hawk"); // [hawk, hawk]
        System.out.println(birds5.isEmpty()); //false
        System.out.println(birds5.size()); // 2
        birds5.clear(); //[]
        System.out.println(birds5.isEmpty()); //true
        System.out.println(birds5.size()); //0

        System.out.println("############################");

        /* Método contains(): checa se um certo valor está dentro do ArrayList. Assinatura:
        boolean contains(Object object)
        Ele chama equals() para cada elemento do array
        */

        List<String> birds6 = new ArrayList<>();
        birds6.add("hawk");
        System.out.println(birds6.contains("hawk")); // true
        System.out.println(birds6.contains(("robin"))); // false

        System.out.println("############################");

        /* Método equals(): o ArrayList possui uma implementação própria do método equals()
        Este método compara duas listas para saber se elas possuem os mesmos elementos na mesma ordem!
        Assinatura:
        boolean equals(Objetc object)
        */

        List<String> um = new ArrayList<>();
        List<String> dois = new ArrayList<>();
        System.out.println(um.equals(dois)); // true
        um.add("a"); // [a]
        System.out.println(um.equals(dois)); // false
        dois.add("a"); // [a]
        System.out.println(um.equals(dois)); // true
        um.add("b"); // [a,b]
        dois.add(0, "b"); //[b,a]
        System.out.println(um.equals(dois)); //false


    }
}
