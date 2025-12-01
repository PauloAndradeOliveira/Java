public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Screen Match");
        System.out.println("Filme: Top Gun");

        // declarando variáveis.
        int anoDeLancamento = 2024;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false; // Tipo Booleano
        Double notaDoFilme = 8.0;// Nota do filme, usamos o Double => Ponto flutuante.

        double media = (9.0 + 8.0 + 3.0)/3;
        System.out.println(media);

        // Formatação com String block.
        String sinopse = """
                Filme: Top Gun
                Filme de ação estrelado por Ton Cruise.
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        // Utilizando um (casting => Explícito).
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);




    }
}
