package com.pluralsight;

public class Demo1 {
    public static void main(String[] args){
        //User name
        String name = "Iftekar";
        //User greetings
        String greetings = "Hello " + name;

        
        int numberOfWeeksWatchTV = 2;
        int minutesPerDayWatchedOnAverage = 10;

        int minutePerWeekWatchTV = numberOfWeeksWatchTV * minutesPerDayWatchedOnAverage;
        int minutePerYearWatchTV = minutePerWeekWatchTV * 52;

        int hourPerYear = minutePerYearWatchTV / 60;
        int hourInWorkWeek = 35;

        int numberOfHoursSpendWatchingTVInWorkWeek = hourPerYear / hourInWorkWeek;


        System.out.println("If " + name + " did not watch TV, it would be like a " + numberOfHoursSpendWatchingTVInWorkWeek + " week vication every year.");

        System.out.println(greetings);
    }
}
