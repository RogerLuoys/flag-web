package com.luoys.upgrade.flagweb.util;
import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private boolean success;
    private String message;
    private T data;

    Result (int code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> Result success (T data) {
        Result<T> result = new Result(0, true, "成功", data);
        return result;
    }

    public static <T> Result success (T data, String message) {
        Result<T> result = new Result(0, true, message, data);
        return result;
    }

    public static <T> Result error (T data) {
        Result<T> result = new Result(4, false, "未知错误", data);
        return result;
    }

    public static <T> Result error (T data, int code) {
        Result<T> result = new Result(code, false, "失败", data);
        return result;
    }
}