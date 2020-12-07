package medlk.exceptions;

import java.io.IOException;

public class InternalException extends IOException {

    private ExceptionList error;

    public ExceptionList getError() {
        return error;
    }

    public InternalException(ExceptionList error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "InternalError ".concat(error.code.toString()).concat(". ").concat(error.description);
    }

    @Override
    public void printStackTrace(){
        System.out.println(this.toString());
    }
}
