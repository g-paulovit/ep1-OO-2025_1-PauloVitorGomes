import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA ACADÊMICO ===");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Criar disciplina");
            System.out.println("4. Matricular aluno em disciplina");
            System.out.println("5. Trancar disciplina");
            System.out.println("6. Trancar semestre");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n--- Cadastro de Aluno ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("É aluno especial? (s/n): ");
                    boolean especial = scanner.nextLine().equalsIgnoreCase("s");

                    Aluno novo = new Aluno(nome, matricula, curso, email, especial);
                    if (sistema.cadastrarAluno(novo)) {
                        System.out.println("Aluno cadastrado com sucesso!");
                    }
                }

                case 2 -> {
                    System.out.println("\n--- Lista de Alunos ---");
                    sistema.listarAlunos();
                }

                case 3 -> {
                    System.out.println("\n--- Criar Disciplina ---");
                    System.out.print("Código da disciplina: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nome da disciplina: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número de vagas: ");
                    int vagas = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer

                    Disciplina d = new Disciplina(codigo, nome, vagas);
                    sistema.adicionarDisciplina(d);
                    System.out.println("Disciplina criada com sucesso!");
                }

                case 4 -> {
                    System.out.println("\n--- Matrícula em Disciplina ---");
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Código da disciplina: ");
                    String codDisc = scanner.nextLine();

                    if (sistema.matricularAluno(matricula, codDisc)) {
                        System.out.println("Aluno matriculado com sucesso!");
                    } else {
                        System.out.println("Erro na matrícula.");
                    }
                }

                case 5 -> {
                    System.out.println("\n--- Trancar Disciplina ---");
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Código da disciplina: ");
                    String codDisc = scanner.nextLine();

                    if (sistema.trancarDisciplina(matricula, codDisc)) {
                        System.out.println("Disciplina trancada com sucesso.");
                    } else {
                        System.out.println("Erro ao trancar disciplina.");
                    }
                }

                case 6 -> {
                    System.out.println("\n--- Trancar Semestre ---");
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    sistema.trancarSemestre(matricula);
                    System.out.println("Semestre trancado com sucesso.");
                }

                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
