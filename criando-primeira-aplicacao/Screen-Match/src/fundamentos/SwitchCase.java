package fundamentos;

public class SwitchCase {
    public static void main(String[] args) {

        String diaSemana = "segunda";

        switch (diaSemana) {
            case "segunda":
                System.out.println("Início da semana");
                break;
            case "sexta":
                System.out.println("Fim da semana");
                break;
            case "sábado":
            case "domingo":
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Meio da semana");
        }
    }
}
