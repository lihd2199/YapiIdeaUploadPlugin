package com.qbb.util;

import com.google.common.base.CaseFormat;

public class CaseFormatUtil {

    public static final ThreadLocal<Boolean> underLine = new ThreadLocal<>();

    public static String format(String text) {
        if (underLine.get()) {
            return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, text);
        } else {
            return text;
        }
    }
}
