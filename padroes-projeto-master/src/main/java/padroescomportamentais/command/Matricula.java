package padroescomportamentais.command;

public class Matricula {

    private int ano;
    private int registro;
    private String situacao;

    public Matricula(int ano, int registro) {
        this.ano = ano;
        this.registro = registro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirMatricula() {
        this.situacao = "Matricula aberta";
    }

    public void encerrarMatricula() {
        this.situacao = "Matricula encerrada";
    }
}
