package br.com.ghdpreto.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException {
    
    public JobNotFoundException() {
        super("Job não encontrada.");
    }
}
