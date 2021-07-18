/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pintu
 */
public class DateDifference {

    public static void main(String[] args) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
        String inputString1 = "22-07-2017";
        String inputString2 = "29-07-2017";

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
