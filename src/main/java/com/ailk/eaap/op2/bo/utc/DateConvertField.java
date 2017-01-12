package com.ailk.eaap.op2.bo.utc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @ClassName: DateConvertMethod 
 * @Description: 需要进行时间UTC转化的方法注解，Spring拦截器UtcAspectForSpring会根据Bean中的方法是否存在这个注解进行转化
 * @author zhengpeng
 * @date 2014-10-24 下午3:26:53 
 * @version V1.0  
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DateConvertField {

}
