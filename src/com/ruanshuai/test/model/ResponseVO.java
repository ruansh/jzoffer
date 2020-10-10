package com.ruanshuai.test.model;

import java.util.List;

/**
 * @author ruanshuai_sx
 * @date 2020/9/29
 */

public class ResponseVO {

    Integer code;

    String message;

    List<UserDO> data;

    public ResponseVO(Integer code, String message, List<UserDO> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserDO> getData() {
        return data;
    }

    public void setData(List<UserDO> data) {
        this.data = data;
    }
}
