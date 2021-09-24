import java.util.ArrayList;
import java.util.List;

//Um arrayList pode mudar seu tamanho quando necessário

public class CriandoArrayList {
    public static void main(String[] args) {

    ArrayList lista1 = new ArrayList();
    ArrayList lista2 = new ArrayList(10); //capacidade inicial: 10
    ArrayList lista3 = new ArrayList(lista2); //faz uma cópia do lista2 (tamanho e elementos)

    //O Java 5 introduziu Generics, que permite especificar o tipo de classe que o ArrayList terá
    //Java 7 permitiu omitir o tipo no lado direito do comando = operador diamante <>

    ArrayList<String> lista4 = new ArrayList<String>();
    ArrayList<String> lista5 = new ArrayList<>();

    //Usando var:

        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s : strings) {
            System.out.println(s);
        }

    //Um ArrayList implementa uma interface List, que não pode ser instanciada:

    List<String> lista6 = new ArrayList<>();
    // ArrayList<String> lista7 = new List<>(); //este comando não compila pois não pode ser criado um objeto do tipo List pois é uma interface

    }
}
