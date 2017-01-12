package com.ailk.eaap.op2.bo.i18n;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @ClassName: ProvideI18NData 
 * @Description: 
 * @author zhengpeng
 * @date 2014-11-3 下午3:47:43 
 * @version V1.0  
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface ProvideI18NData {
	
	/**
	 * 需要国际化的表名   tableName = "main_data"
	 * @return
	 */
	public abstract String tableName();
	/**
	 * 需要国际化的表字段名,如果多字段可A,B,C  columnNames = "CEP_NAME"
	 * @return
	 */
	public abstract String columnNames();
	/**
	 * 在JavaBean里的属性名或Map key名，如果和表字段名相同，可以不填,如果多字段可A,B,C propertyNames = "CEPNAME"
	 * @return
	 */
	public abstract String propertyNames();
	/**
	 * 主键值在在JavaBean里的属性名或Map key名,  idName = "maindId"
	 * @return
	 */
	public abstract String idName();
	
}
