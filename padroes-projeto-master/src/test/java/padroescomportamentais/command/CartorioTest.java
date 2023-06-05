package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartorioTest {

    SistemaCartorio sistemaCartorio;
    Matricula matricula;

    @BeforeEach
    void setUp() {
        sistemaCartorio = new SistemaCartorio();
        matricula = new Matricula(1999, 288);
    }

    @Test
    void deveAbrirMatricula() {
        Tarefa aberturaMatricula = new AberturaMatriculaTarefa(matricula);
        sistemaCartorio.executarTarefa(aberturaMatricula);

        assertEquals("Matricula aberta", matricula.getSituacao());
    }

    @Test
    void deveEncerrarMatricula() {
        Tarefa encerramentoMatricula = new EncerramentoMatriculaTarefa(matricula);
        sistemaCartorio.executarTarefa(encerramentoMatricula);

        assertEquals("Matricula encerrada", matricula.getSituacao());
    }

    @Test
    void deveCancelarEncerramentoMatricula() {
        Tarefa aberturaMatricula = new AberturaMatriculaTarefa(matricula);
        Tarefa encerramentoMatricula = new EncerramentoMatriculaTarefa(matricula);

        sistemaCartorio.executarTarefa(aberturaMatricula);
        sistemaCartorio.executarTarefa(encerramentoMatricula);

        sistemaCartorio.cancelarUltimaTarefa();

        assertEquals("Matricula aberta", matricula.getSituacao());
    }

}