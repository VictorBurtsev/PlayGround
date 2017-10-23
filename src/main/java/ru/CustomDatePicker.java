package ru;

/**
 * Created by victor.burtsev@gmail.com on 10/21/17.
 */

public class CustomDatePicker {
    private int day;
    private int month;
    private int year;

    public CustomDatePicker(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDayOfTheWeekByDate() {
        int a = (14 - this.month) / 12;
        this.year = this.year - a;
        int month = this.month + 12 * a - 2;
        return (7000 + (this.day + this.year + this.year / 4 - this.year / 100 + this.year / 400 + (31 * month) / 12)) % 7;
    }

    public String dayOfTheWeekPrinter() {
        String day = "";

        switch (this.getDayOfTheWeekByDate()) {
            case 0:
                day = "Воскресенье";
                break;
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            default:
        }
        return day;
    }

    public int dayNumPositionForDatePicker() {
        int dayOfTheWeekByDate = this.getDayOfTheWeekByDate();
        dayOfTheWeekByDate++;

        switch (new CustomDatePicker(1, this.month, this.year).getDayOfTheWeekByDate()) {
            case 0:
                if (this.day < 8) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 8 && this.day < 15) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 15 && this.day < 22) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 22 && this.day < 29) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 29 && this.day < 36) {
                    dayOfTheWeekByDate += 35;
                }
                return dayOfTheWeekByDate;
            case 1:
                if (this.day < 7) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 7 && this.day < 14) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 14 && this.day < 21) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 21 && this.day < 28) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 28 && this.day < 35) {
                    dayOfTheWeekByDate += 35;
                }
                return dayOfTheWeekByDate;
            case 2:
                if (this.day < 6) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 6 && this.day < 13) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 13 && this.day < 20) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 20 && this.day < 27) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 27 && this.day < 34) {
                    dayOfTheWeekByDate += 35;
                }
                return dayOfTheWeekByDate;
            case 3:
                if (this.day < 5) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 5 && this.day < 12) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 12 && this.day < 19) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 19 && this.day < 26) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 26 && this.day < 33) {
                    dayOfTheWeekByDate += 35;
                }
                return dayOfTheWeekByDate;
            case 4:
                if (this.day < 4) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 4 && this.day < 11) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 11 && this.day < 18) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 18 && this.day < 25) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 25 && this.day < 32) {
                    dayOfTheWeekByDate += 35;
                }
                return dayOfTheWeekByDate;
            case 5:
                if (this.day < 3) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 3 && this.day < 10) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 10 && this.day < 17) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 17 && this.day < 24) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 24 && this.day < 31) {
                    dayOfTheWeekByDate += 35;
                } else if (this.day >= 31 && this.day < 38) {
                    dayOfTheWeekByDate += 42;
                }
                return dayOfTheWeekByDate;
            case 6:
                if (this.day < 2) {
                    dayOfTheWeekByDate += 7;
                } else if (this.day >= 2 && this.day < 9) {
                    dayOfTheWeekByDate += 14;
                } else if (this.day >= 9 && this.day < 16) {
                    dayOfTheWeekByDate += 21;
                } else if (this.day >= 16 && this.day < 23) {
                    dayOfTheWeekByDate += 28;
                } else if (this.day >= 23 && this.day < 30) {
                    dayOfTheWeekByDate += 35;
                } else if (this.day >= 30 && this.day < 37) {
                    dayOfTheWeekByDate += 42;
                }
                return dayOfTheWeekByDate;
            default:
                break;
        }
        return -1;
    }
}
