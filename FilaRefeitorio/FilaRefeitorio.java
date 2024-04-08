import java.util.LinkedList;
import java.util.Queue;

class Pessoa {
    String nome;
    Pessoa(String nome) {
        this.nome = nome;
    }
}

class Aluno extends Pessoa {
    int matricula;
    String curso;
    Aluno(String nome, int matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }
}

class Professor extends Pessoa {
    int siape;
    String titulacao;
    Professor(String nome, int siape, String titulacao) {
        super(nome);
        this.siape = siape;
        this.titulacao = titulacao;
    }
}

class terceirizados extends Pessoa {
    int siape;
    terceirizados(String nome, int siape) {
        super(nome);
        this.siape = siape;
    }
}

public class FilaRefeitorio {
    Queue<Pessoa> fila;

    public FilaRefeitorio() {
        fila = new LinkedList<>();
    }

    public void entrarNaFila(Pessoa pessoa) {
        fila.add(pessoa);
        System.out.println(pessoa.nome + " entrou na fila.");
    }

    public void proximoNaFila() {
        if (!fila.isEmpty()) {
            Pessoa pessoa = fila.poll();
            System.out.println("Próximo: " + pessoa.nome);
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public static void main(String[] args) {
        FilaRefeitorio filaRefeitorio = new FilaRefeitorio();

        Aluno aluno1 = new Aluno("João", 123, "Engenharia");
        Professor professor1 = new Professor("Maria", 456, "Doutorado");
        TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo("Pedro", 789);

        filaRefeitorio.entrarNaFila(aluno1);
        filaRefeitorio.entrarNaFila(professor1);
        filaRefeitorio.entrarNaFila(tecnico1);

        filaRefeitorio.proximoNaFila();
        filaRefeitorio.proximoNaFila();
        filaRefeitorio.proximoNaFila();
    }
}
