package datas;

import java.util.Calendar;
import java.util.TimeZone;

public class DateManipulator {
    public int day;
    public int month;
    public int year;
    private char separator = '/';

    public  DateManipulator(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public void insertDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if (this.validator() == 0) {
            System.out.println("Data Invalida");
            System.exit(0);
        } else {
            System.out.println("Data Aceita");
        }
    }

    public void nextDay(){
        this.day += 1;
        if (this.validator() == 0){
            this.nextMonth();
        }
    }

    private void nextMonth(){
        if (this.month + 1 <= 12 ){
            this.month += 1;
            this.day = 1;
        }
        else{
            this.month = 1;
            this.day = 1;
            this.year += 1;
        }

    }

    private void nextYear(){
        this.month += 1;
    }

    @Override
    public String toString() {
        return "DateManipulator{" +
                day + separator +
                month + separator +
                year +
                '}';
    }

    private int validator() {

        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day > 31) {
                    return 0;
                } else {
                    return 1;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day > 30) {
                    return 0;
                } else {
                    return 1;
                }
            case 2:
                if (this.year % 2 == 0 && this.year % 100 != 0) {
                    if (this.day > 29) {
                        return 0;
                    } else {
                       return 1;
                    }
                }
                else{
                    if (this.day > 28) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
        }
        return 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
