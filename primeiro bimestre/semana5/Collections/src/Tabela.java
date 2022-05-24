import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;

public class Tabela {
    private List<String> arrayList;
    // private List<String> linkedList;

    public Tabela() {
        arrayList = new ArrayList<String>();
        // linkedList = new LinkedList<String>();

        arrayList.add(null);
        // linkedList.addAll(null);
    }

    public void listarElementos() {
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
    }

    public void adicionarElemento(int index, String elemento) {
        arrayList.add(index, elemento);
    }

    public void removerElemento(int index) {
        arrayList.remove(index);
    }

    public boolean existeElemento(String elemento) {
        boolean b = arrayList.contains(elemento);
        System.out.println(b);
        return b;
    }

    public int encontrarElemento(String elemento) {
        return arrayList.indexOf(elemento);
    }
}

//Primeiro elemento
//último elemento
//Adicionar elemento
//remover elemento
//ordenar por ordem alfabética e ou por números
//Encontrar por index e por elemento
//java util
//lista, array, colection e vector
