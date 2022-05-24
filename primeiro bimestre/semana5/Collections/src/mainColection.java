public class mainColection {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Colection vetores = new Colection();
        vetores.printArrays();
        vetores.printEquals();

        int location = vetores.searchForInt(5);
        if (location >= 0) 
            System.out.printf("\nEncontrado o elemento na posição %d do array!", location);
        else
            System.out.println("\nNão encontrado o elemento no array!");

        location = vetores.searchForInt(8765);
        if (location >= 0) 
            System.out.printf("\nEncontrado o elemento na posição %d do array!", location);
        else
            System.out.println("\nNão encontrado o elemento no array!");

        System.out.println("\n\n");

        Tabela t = new Tabela();

        t.adicionarElemento(0, "elemento0");
        t.adicionarElemento(1, "elemento1");
        t.adicionarElemento(2, "elemento2");
        t.adicionarElemento(3, "elemento3");

        t.removerElemento(1);

        t.existeElemento("elemento1");

        System.out.println(t.encontrarElemento("elemento0"));

        t.listarElementos();
    }
}
