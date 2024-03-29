package com.gdy.graduate.service.ex;

import com.gdy.graduate.service.ex.ServiceException;

public class StudentPwdEx extends ServiceException {
    public StudentPwdEx() {
        super();
    }

    public StudentPwdEx(String message) {
        super(message);
    }

    public StudentPwdEx(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentPwdEx(Throwable cause) {
        super(cause);
    }

    protected StudentPwdEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
