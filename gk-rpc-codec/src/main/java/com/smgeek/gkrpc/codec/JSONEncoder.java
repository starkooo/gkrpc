package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于Json的序列化实现
 */
public class JSONEncoder implements Encoder{

    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
