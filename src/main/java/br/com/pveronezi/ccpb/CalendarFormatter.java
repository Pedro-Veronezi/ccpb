package br.com.pveronezi.ccpb;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by pveronezi on 11/03/16.
 */
public class CalendarFormatter implements Formatter<Calendar> {
    final String defaultDateFormat = "yyyy-MM-dd";

    @Override
    public String print(Calendar object, Locale locale) {
        return new SimpleDateFormat(defaultDateFormat).format(object.getTime());
    }

    @Override
    public Calendar parse(String text, Locale locale) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(defaultDateFormat);
        Date date = sdf.parse(text);
        return sdf.getCalendar();
    }
}
