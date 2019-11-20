package com.anthony1314.dto;

import com.anthony1314.entity.SuccessKilled;
import com.anthony1314.enums.SeckillStatEnum;

/**
 * @program: seckill
 * @description: 用于判断秒杀是否成功，成功就返回秒杀成功的所有信息(包括秒杀的商品id、秒杀成功状态、成功信息、用户明细)，失败就抛出一个我们允许的异常(重复秒杀异常、秒杀结束异常)
 * @author: anthony1314
 * @create: 2019-11-20 15:47
 **/

public class SeckillExecution {
    private long seckillId;

    //秒杀执行结果的状态
    private int state;

    //状态的明文标识
    private String stateInfo;

    //当秒杀成功时，需要传递秒杀成功的对象回去
    private SuccessKilled successKilled;

//    //秒杀成功返回所有信息
//    public SeckillExecution(long seckillId, int state, String stateInfo, SuccessKilled successKilled) {
//        this.seckillId = seckillId;
//        this.state = state;
//        this.stateInfo = stateInfo;
//        this.successKilled = successKilled;
//    }
//
//    //秒杀失败
//    public SeckillExecution(long seckillId, int state, String stateInfo) {
//        this.seckillId = seckillId;
//        this.state = state;
//        this.stateInfo = stateInfo;
//    }

    //秒杀成功返回所有信息
    public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getInfo();
        this.successKilled = successKilled;
    }

    //秒杀失败
    public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getInfo();
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }
}
