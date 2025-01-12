package com.example.springboot.common;

import java.util.UUID;

/**
 * 这个类和方法的作用是生成一个没有分隔符 - 的、符合 UUID 标准的唯一标识符，通常用于需要唯一标识的场景。
 */
public class UID {
    public String produceUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
