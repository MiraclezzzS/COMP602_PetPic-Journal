package com.annotation;

import java.lang.annotation.*;

/**
 *   Token  
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {

}
