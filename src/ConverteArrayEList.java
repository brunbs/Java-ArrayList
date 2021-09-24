import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverteArrayEList {
    public static void main(String[] args) {

        //Convertendo Lista em Array

        List<String> lista = new ArrayList<>(); // cria o array
        lista.add("hawk"); // adiciona no arrayList
        lista.add("robin"); // adiciona no arrayList
        Object[] objectArray = lista.toArray(); //aqui a lista está se convertendo em um array de classe Objeto
        String[] stringArray = lista.toArray(new String[0]); //aqui a lista está se convertendo em um array de classe String.
        // O tamanho zero significa que irá criar um array do tamanho exato necessário, mas este valor pode ser mudado
        // caso haja necessidade
        lista.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2

        System.out.println("####################");

        /* Convertendo Array em Lista
        # método 1 - criar uma lista que está linkada ao array, mudanças no primeiro são refletidas no segundo
         */

        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> lista2 = Arrays.asList(array); // retorna uma lista de tamanho fixo
        System.out.println(lista2.size()); // retorna 2
        lista2.set(1, "teste"); // [hawk, teste] atualiza tanto o array quanto a lista pois apontam para o mesmo lugar
        array[0] = "novo"; // [novo, teste] também atualiza o array e a lista
        System.out.println(Arrays.toString(array)); // [novo, teste]
        System.out.println(lista2);
        // lista2.remove(1); lança UnsupportedOperationException pois a lista tem tamanho fixo, não podemos alterar seu tamanho, e deletar um elemento é alterar o tamanho da lista

        System.out.println("####################");

        //# método 2 - criar uma lista imutável, não podendo alterar seu tamanho ou valores. Alterações no array original não mudarão a lista

        String[] array2 = {"hawk", "robin"}; // [hawk,robin]
        List<String> lista3 = List.of(array2); // retorna uma lista imutável
        System.out.println(lista3.size()); // 2
        array2[0] = "novo";
        System.out.println(Arrays.toString((array2))); // [novo, robin]
        System.out.println(lista3); // [hawk, robin] pois alterações no array não refletem mais na lista
        // lista3.set(1, "teste"); lança UnsupportedOperationException pois não pode alterar o tamanho ou valores

        System.out.println("####################");



    }

}
