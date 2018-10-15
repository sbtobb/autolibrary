package com.cyouguang.autolibrary.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author CyouGuang
 * @date 2018/9/20
 */
public class TimeUtil {
    public static Date setTimeEnd(Date date)
    {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        return c.getTime();
    }
    public static Date setTimeBegin(Date date)
    {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        return c.getTime();
    }
    public static Date strToDate(String str) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date time;
        try {
            time = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            time = new Date();
        }
        return time;
    }
}
