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
public class DateDemo2
{
    public static void main(String[] args)
    {
        String mydate="20-07-2017";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date d = null;
        try
        {
            d=sdf.parse(mydate);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        Calendar c=Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, 7);
        d=c.getTime();
        
        System.out.println(sdf.format(d));
    }
}
