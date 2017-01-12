package com.ailk.eaap.op2.bo.i18n;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @ClassName: ProvideI18NDatas 
 * @Description: 
 * @author zhengpeng
 * @date 2014-11-3 下午3:54:25 
 * @version V1.0  
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD,java.lang.annotation.ElementType.TYPE})
public @interface ProvideI18NDatas {
	
	public abstract ProvideI18NData[] values();

}
