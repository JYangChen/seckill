package com.anthony1314.exception;

/**
 * @program: seckill
 * @description: 重复秒杀异常，是一个运行期异常，不需要我们手动try catch
 *              * Mysql只支持运行期异常的回滚操作
 * @author: anthony1314
 * @create: 2019-11-20 15:51
 **/

public class RepeatKillException extends SeckillException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
