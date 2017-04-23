package thon.models;

import java.time.*;
import java.util.Random;

/**
 *
 * @author Gisward
 */
public class CurrentCapacityUpdater 
{
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
        getCurrentSystemDate();
        theDay = convertDayToString();
        calculateCurrentCapacity(theDay);
    }
    public void getCurrentSystemTime()
    {
        systemTime = LocalTime.now();
    }
    
    public void getCurrentSystemDate()
    {
        date = LocalDate.now();
    }
    
    public String convertDayToString()
    {
        day = date.getDayOfWeek();
        
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
}
