import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("== SISTEMA ACADÊMICO == ");
            System.out.println("Selecione o respectivo número da opção do menu que deseja acessar: ");
            System.out.println("1 - Modo Aluno");
            System.out.println("2 - Modo Disciplina/Turma");
            System.out.println("3 - Modo Avaliacao/Frequência");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();
            switch(opcao){
                case 1: menuAluno(); break;
                case 2: menuDisciplina(); break;
                case 3: menuAvaliacao(); break;
                case 0: System.exit(0);
                default: System.out.println("Opção inválida!");
            }

        }
    }
}