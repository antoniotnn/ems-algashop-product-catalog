package com.algaworks.algashop.product.catalog.infrastructure.persistence.product;

public class StockUpdateFailedException extends RuntimeException {
    public StockUpdateFailedException() {
    }

    public StockUpdateFailedException(String message) {
        super(message);
    }

    public StockUpdateFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public StockUpdateFailedException(Throwable cause) {
        super(cause);
    }

    public StockUpdateFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
