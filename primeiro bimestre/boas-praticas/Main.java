public class Main {
    public static void main(String[] args) {
        Time1 tempo = new Time1();
        Time2 tempo1 = new Time2();

        System.out.println("Classe 2 construída!");
        System.out.println(tempo.toUniveString());
        System.out.println(tempo.toString());

        // System.out.printf("%s\n", tempo.toUniveString());
        // System.out.printf("%s\n", tempo.toString());

        int h;
        tempo.setTime(2, 2, 2);
        h = tempo.hour;

        Time2 tempo2 = new Time2(h);
        System.out.println("Hora atribuida ao construtor: " + tempo2.getHour());

        tempo1.setTime(tempo.hour, tempo.minute, tempo.second);

        System.out.println("\nClasse com parâmetro construído!");
        System.out.println(tempo.toUniveString());
        System.out.println(tempo.toString());

        // System.out.printf("%s\n", tempo.toUniveString());
        // System.out.printf("%s\n", tempo.toString());

        // tempo.setTime(20, 53, 11);

        // System.out.println(tempo.toUniveString());
        // System.out.println(tempo.toString());

        // int resto = 13 % 12;

        // System.out.println(resto);

        // System.out.println("");
    }
}
