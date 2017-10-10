package com.roking.designpattern.demo.exception;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/10.
 */
public class UnSupporteTypeException extends Exception {
    public UnSupporteTypeException() {
    }

    public UnSupporteTypeException(String message) {
        super(message);
    }

    public UnSupporteTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnSupporteTypeException(Throwable cause) {
        super(cause);
    }

    public UnSupporteTypeException(String message, Throwable cause, boolean enableSuppression, boolean
            writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
