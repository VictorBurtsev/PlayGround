package ru;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victor.burtsev@gmail.com on 10/21/17.
 */


public class CustomDatePickerTest {
    @Test
    public void testDayOfTheWeekByDate() throws Exception {
        for (int dayNum = 1; dayNum <= 7; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 10, 2017).getDayOfTheWeekByDate(), dayNum - 1);
        }
    }

    @Test
    public void testDayOfTheWeekPrinter() throws Exception {
        String[] dayName = {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        int j = 0;

        for (int dayNum = 1; dayNum < 7; dayNum++) {
            Assert.assertEquals(
                    new CustomDatePicker(dayNum, 10, 2017).dayOfTheWeekPrinter(), dayName[j++]);
        }
    }

    @Test
    public void test1DayNumPositionForDatePicker() throws Exception {
        int shift = 8;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 10, 2017).dayNumPositionForDatePicker(), shift++);
        }
    }

    @Test
    public void test2DayNumPositionForDatePicker() throws Exception {
        int startPosition = 9;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 5, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test3DayNumPositionForDatePicker() throws Exception {
        int startPosition = 10;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 8, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test4DayNumPositionForDatePicker() throws Exception {
        int startPosition = 15;

        for (int dayNum = 5; dayNum <= 5; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 11, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test5DayNumPositionForDatePicker() throws Exception {
        int startPosition = 12;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 6, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test6DayNumPositionForDatePicker() throws Exception {
        int startPosition = 13;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 12, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test7DayNumPositionForDatePicker() throws Exception {
        int startPosition = 14;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 7, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test8DayNumPositionForDatePicker() throws Exception {
        int startPosition = 8;

        for (int dayNum = 1; dayNum <= 31; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 1, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

    @Test
    public void test9DayNumPositionForDatePicker() throws Exception {
        int startPosition = 11;

        for (int dayNum = 1; dayNum <= 28; dayNum++) {
            Assert.assertEquals(new CustomDatePicker(dayNum, 2, 2017).dayNumPositionForDatePicker(), startPosition++);
        }
    }

}
