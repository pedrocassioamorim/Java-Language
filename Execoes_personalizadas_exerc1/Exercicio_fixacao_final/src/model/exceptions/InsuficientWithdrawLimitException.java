package model.exceptions;

import java.io.Serial;

public class InsuficientWithdrawLimitException extends Exception {
    @Serial
    private static final long serialVersionUED = 1L;

    public InsuficientWithdrawLimitException(String mensagem) {
        super(mensagem);
    }
}
