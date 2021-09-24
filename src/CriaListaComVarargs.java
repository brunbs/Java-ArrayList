import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriaListaComVarargs {

    public static void main(String[] args) {

        //ambos os métodos criam arrays de tamanhos fixos já populados
        List<String> lista1 = Arrays.asList("um", "dois");
        List<String> lista2 = List.of("um", "dois");

        /*

                                                        toArray()       Arrays.asList()         List.of()

        Tipo sendo convertido                           List              Array(ou varargs)       List

        Tipo criado                                     Array               List                   List

        Pode remover valores do objeto criado?          Não                 Não                     Não

        Pode mudar valores do objeto criado?            Sim                 Sim                     Não

        Mudar valores do objeto criado irá              Não                 Sim                     N/A
        afetar o original e vice e versa


        Nenhuma das formas permite alterar o tamanho (número de elementos), caso seja necessário isso deve-se
        implementar uma lógica para criar um novo objeto:
        */

        List<String> ListaTamanhoFixo = Arrays.asList("a", "b", "c");
        List<String> ListaExpansivel = new ArrayList<>(ListaTamanhoFixo);

    }
}
