package edu.java.anatomiaClasse;

public class MyClass {
    public static void main(String[] args) {
        String primeiroNome = "Kelvin";
        String segundoNome = "Watanabe";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
