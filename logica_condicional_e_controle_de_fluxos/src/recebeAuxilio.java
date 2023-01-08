public class recebeAuxilio {
    public static void main(String[] args) throws Exception {
        double salarioMensal = 2893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 7;
        int mediaDependentes = 2;

        boolean salarioBaix0 = (salarioMensal < mediaSalario);
        boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);

        boolean recebeAuxilio = (salarioBaix0) && (muitosDependentes);
        System.out.println("Recebe auxílio: " + recebeAuxilio);
    }
}