/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 *
 * @author Gisward
 */
public class CurrentCapacityUpdater 
{
    //LocalDateTime currentTime;
    //LocalDateTime fromTime;
    LocalTime systemTime;
    LocalDate date;
    DayOfWeek day;
    String theDay;
    int minSinceTHONStart;
    int hourSinceTHONStart;
    int currentHour;
    int currentMin;
    int bjcCapacity = 15261;
    int uniqueCnt = 45000;
    int currentCnt;
    
    public CurrentCapacityUpdater()
    {
        getCurrentSystemTime();
        getCurrentSystemDayNumber();
        theDay = convertDayToString();
        calculateCurrentCapacity(theDay);
        //calculateElapsedTime();
    }
    public void getCurrentSystemTime()
    {
        systemTime = LocalTime.now();
        //System.out.println(systemTime);
    }
    
    public void getCurrentSystemDayNumber()
    {
        date = LocalDate.now();
        //System.out.println(date);
    }
    
    public String convertDayToString()
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
            if(day == DayOfWeek.MONDAY || day == DayOfWeek.TUESDAY)
            {
                theDay = "Saturday";
                return theDay;
            }
            else
            {
                theDay = "Sunday";
                return theDay;
            }
        }
    }
    
    public void calculateCurrentCapacity(String theDay)
    {
        int maxDay = 15000;
        int maxNight = 12000;
        int minDay = 12000;
        int minNight = 8000;
        int maxCommitteeCnt = 2000;
        int minCommitteeCnt = 200;
        Random random = new Random();       
        currentHour = systemTime.getHour();
        currentMin = systemTime.getMinute();
        
        switch(theDay)
        {
            case "Friday":
                if(currentHour > 16 && currentHour < 20)
                {
                    currentCnt = random.nextInt((maxDay - minDay) + 1) + minDay;
                }
                else if(currentHour == 20)
                {
                    currentCnt = bjcCapacity; //returns 15261
                }
                else
                {
                    currentCnt = maxCommitteeCnt; //approx. 2000
                }
                break;
            case "Saturday":
                if(currentHour > 8 && currentHour < 20)
                {
                    currentCnt = random.nextInt((maxDay - minDay) + 1) + minDay;
                }
                else
                {
                    currentCnt = random.nextInt((maxNight - minNight) + 1) + minNight;
                }
                break;
            case "Sunday":
                if (currentHour <= 8) 
                {
                    currentCnt = random.nextInt((maxDay - minDay) + 1) + minDay;
                } 
                else if (currentHour > 8 && currentHour <= 16) 
                {
                    currentCnt = bjcCapacity;
                } else 
                {
                     currentCnt = random.nextInt((maxCommitteeCnt - minCommitteeCnt) + 1) + minCommitteeCnt;
                }
                break;
            default:
                break;
        }
    }
    
    public int getCurrentCapacity()
    {
        return this.currentCnt;
    }
    
    /*
    public int calculateElapsedTime()
    {
        fromTime = LocalDateTime.of(2017, 3, 17, 16, 0, 0);
        
        long minutes = ChronoUnit.MINUTES.between(fromTime, currentTime);
        System.out.println(minutes);
        long hours = ChronoUnit.HOURS.between(fromTime, currentTime);
        System.out.println(hours);
        long days = ChronoUnit.DAYS.between(fromTime, currentTime);
        System.out.println(days);
        
        return (int) minutes;
    }
    */
}
