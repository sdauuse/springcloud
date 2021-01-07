package com.miao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author miaoyin
 * @date 2021/1/6 - 20:54
 * @commet:
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
//T可以装Payment
//前端通过code判断是不是200（成功）
public class CommonResult<T> {


        private Integer code;
        private String message;
        private T data;
        public CommonResult(Integer code, String message) {
            this.code = code;
            this.message = message;
            this.data = null;
        }
}
