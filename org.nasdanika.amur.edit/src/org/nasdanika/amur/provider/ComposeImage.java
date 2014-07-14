package org.nasdanika.amur.provider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If implementation type provider getImage() method has this annotation then implementation type image is composed
 * with the element image instead of replacing it.
 * @author Pavel
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ComposeImage {

}
