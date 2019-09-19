package cn.wlcloudy.java.core.eight.annotations;

import java.lang.annotation.Repeatable;

/**
 * @author datamesh
 */
@Repeatable(Hints.class)
public @interface Hint {
    String value();
}
