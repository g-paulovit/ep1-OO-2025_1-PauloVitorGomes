import java.util.ArrayList;

    public class Sistema {
        private ArrayList<Aluno> alunos = new ArrayList<>();
        private ArrayList<Disciplina> disciplinas = new ArrayList<>();

        public boolean cadastrarAluno(Aluno aluno) {
            return alunos.add(aluno);
        }

        public void listarAlunos() {
            for (Aluno a : alunos) {
                System.out.println(a);
            }
        }

        public void adicionarDisciplina(Disciplina d) {
            disciplinas.add(d);
        }

        public boolean matricularAluno(String matricula, String codDisc) {
            return true;
        }

        public boolean trancarDisciplina(String matricula, String codDisc) {
            return true;
        }

        public void trancarSemestre(String matricula) {
        }
    }

