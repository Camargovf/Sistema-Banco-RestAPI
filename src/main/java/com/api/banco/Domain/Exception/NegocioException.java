package com.api.banco.Domain.Exception;

/**
 * @Api implementacao para tratar erros transacionais.
 */

public class NegocioException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NegocioException(String message){
        super(message);
    }
}
