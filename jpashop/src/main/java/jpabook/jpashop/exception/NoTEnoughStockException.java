package jpabook.jpashop.exception;

public class NoTEnoughStockException extends RuntimeException {
    public NoTEnoughStockException() {
        super();
    }

    public NoTEnoughStockException(String message) {
        super(message);
    }

    public NoTEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoTEnoughStockException(Throwable cause) {
        super(cause);
    }



}

