public class exercicio2 {
    // Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o text "Certo". Se for 4 exibir "Errado", se for 5 exibir "Talvez". Pra demais valores exibir "Valor indefinido".
    public static void main (String[] args) {

        switchDiaSemana();
        switchNumero();
    }
    
    private static void switchDiaSemana() {
        String dia = "Ter";
        
        switch(dia){
            case "Seg":
                System.out.println(2);
                break;  
            case "Ter":
                System.out.println(3);
                break;
            case "Qua":
                System.out.println(4);
                break;
            case "Qui":
                System.out.println(5);
                break;
            case "Sex":
                System.out.println(6);
                break;
            case "Sab":
                System.out.println(7);
                break;
            case "Dom":
                System.out.println(1);
                break;
        }
    }

    private static void switchNumero() {
        int numero = 4;

        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}
