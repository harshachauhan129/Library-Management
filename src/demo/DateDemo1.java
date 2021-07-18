/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author pintu
 */
public class DateDemo1
{
    public static void main(String[] args)
    {
        Date d=new Date();
        Calendar c=Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, 7);
        d=c.getTime();
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(d));
    }
}
