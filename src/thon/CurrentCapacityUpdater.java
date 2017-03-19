/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.time.*;

/**
 *
 * @author Gisward
 */
public class CurrentCapacityUpdater 
{
    LocalTime time;
    LocalDate date;
    DayOfWeek day;
    String theDay;
    
    public CurrentCapacityUpdater()
    {
        getCurrentSystemTime();
        getCurrentSystemDayNumber();
        convertDateToDay();
    }
    public void getCurrentSystemTime()
    {
        time = LocalTime.now();
        System.out.println(time);
    }
    
    public void getCurrentSystemDayNumber()
    {
        date = LocalDate.now();
        System.out.println(date);
    }
    
    public String convertDateToDay()
    {
        day = date.getDayOfWeek();
        System.out.println(day);
        if(day == DayOfWeek.FRIDAY)
        {
            theDay = "Friday";
            return theDay;
        }
        else if(day == DayOfWeek.SATURDAY)
        {
            theDay = "Saturday";
            return theDay;
        }
        else if(day == DayOfWeek.SUNDAY)
        {
            theDay = "Sunday";
            return theDay;
        }
        else
        {
            return "THON is not currently happening.";
        }
    }
}
