package br.com.pveronezi.ccpb.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by pveronezi on 04/01/16.
 */
public class DomainUtil {

    public static String getFormattedStringDate(Calendar calendar) {
        return new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
    }
}
