package fundamentos;

public class Condicional {
    public static void main(String[] args) {
        String nomeFilme = "Top Gun";
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = false;
        Double notaDoFilme = 8.0;
        String tipoPlano = "plus";

        // condicional simples (if - else)
        if (anoDeLancamento >= 2000) {
            System.out.println("Lançamento!");
        } else {
            System.out.println("Fime retrô que vale a pena assistir!");
        }

        //usando (condicionais) com operadores (lógicos)
        // && - as duas condições devem ser verdadeiras.
        // || => uma das condiçoes deve ser (verdadeira).

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Você pode assistir o filme " + nomeFilme);
        }else {
            System.out.println("Infelizmente você não pode assistir. Deseja alugar ou comprar?");
        }
    }
}
