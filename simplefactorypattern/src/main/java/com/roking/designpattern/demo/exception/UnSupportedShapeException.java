package com.roking.designpattern.demo.exception;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/9.
 */
public class UnSupportedShapeException extends Exception {
    public UnSupportedShapeException() {
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }

    public UnSupportedShapeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnSupportedShapeException(Throwable cause) {
        super(cause);
    }

    public UnSupportedShapeException(String message, Throwable cause, boolean enableSuppression, boolean
            writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
