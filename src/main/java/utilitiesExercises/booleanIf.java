package utilitiesExercises;

public class booleanIf {

public static void main(String[] args) {


    int salarioMensal = 200;
    int mediasalario = 190;
    int quantidadeDependentes = 2;
    int mediaDependentes = 1;

    boolean salarioBaixo = salarioMensal < mediasalario;
    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
    if ((salarioBaixo) && (muitosDependentes)) {
        System.out.println("Funcionário deve receber auxilio.");
    }
    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    if (recebeAuxilio){
        System.out.println("Funcionário deve receber auxilio.");
    } else{
        System.out.println("Funcionário não deve receber auxilio.");
    }
}
}
