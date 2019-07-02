package com.zyj.simplejdbcdemo;

import lombok.Builder;
import lombok.Data;
/**
 * 省略get set 方法
 */
@Data
/**
 * 省略构造方法
 */
@Builder
public class Foo {

    private String id;

    private String bar;
}
