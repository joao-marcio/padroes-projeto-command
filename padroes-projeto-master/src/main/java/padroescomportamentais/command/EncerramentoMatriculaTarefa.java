package padroescomportamentais.command;

public class EncerramentoMatriculaTarefa implements Tarefa {

    private Matricula matricula;

    public EncerramentoMatriculaTarefa(Matricula matricula) {
        this.matricula = matricula;
    }

    public void executar() {
        this.matricula.encerrarMatricula();
    }

    public void cancelar() {
        this.matricula.abrirMatricula();
    }
}
