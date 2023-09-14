package com.zx.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultData <T>{

    private Integer code;

    public ResultData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String msg;
    private T data;
}
