package padroescomportamentais.command;

public class AberturaMatriculaTarefa implements Tarefa {

    private Matricula matricula;

    public AberturaMatriculaTarefa(Matricula matricula) {
        this.matricula = matricula;
    }

    public void executar() {
        this.matricula.abrirMatricula();
    }

    public void cancelar() {
        this.matricula.encerrarMatricula();
    }
}
