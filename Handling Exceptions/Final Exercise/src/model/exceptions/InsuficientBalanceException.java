package model.exceptions;

import java.io.Serial;

public class InsuficientBalanceException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public InsuficientBalanceException (String mensagem) {
        super(mensagem);
    }
}
