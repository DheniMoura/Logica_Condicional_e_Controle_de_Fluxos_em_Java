public class exercicio1 {
    
//Com if, exiba o nome do mês do ano de acordo com o seu número. Evite o efeito flecha.
// Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto "férias". <br>

public static void main (String[] args){


    ifSemFlecha();
    ifFerias();
    switchFerias();


}

private static void ifSemFlecha() {
    int mes = 1;

        if(mes == 1){
            System.out.println("Jan");
        }else if(mes == 2){
            System.out.println("Fev");
        }else if(mes == 3){
            System.out.println("Mar");
        }else if(mes == 4){
            System.out.println("Abr");
        }else if(mes == 5){
            System.out.println("Mai");
        }else if(mes == 6){
            System.out.println("Jun");
        }else if(mes == 7){
            System.out.println("Jul");
        }else if(mes == 8){
            System.out.println("Ago");
        }else if(mes == 9){
            System.out.println("Set");
        }else if(mes == 10){
            System.out.println("Out");
        }else if(mes == 11){
            System.out.println("Nov");
        }else if(mes == 12){
            System.out.println("Dez");
        }else{
            System.out.println("Mês inválido");
        }
}

private static void ifFerias() {
    // Quando apenas uma variável está sendo analisada, o if não é indicado, o melhor é utilizar o switch

    int mes = 7;
    if (mes == 1 || mes == 7 || mes == 12){
        System.out.println("Férias!");
    }
}

private static void switchFerias() {

    String mes = "Dez";
    switch (mes){
        case ("Jan"):
        case ("Jul"):
        case ("Dez"):
            System.out.println("Férias");
            break;
        default:
            System.out.println("Aula normal");
    }
    
}
}
