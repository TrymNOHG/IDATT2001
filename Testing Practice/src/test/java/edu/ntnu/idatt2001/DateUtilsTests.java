package edu.ntnu.idatt2001;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateUtilsTests {

    @Nested

    class AYearIsALeapYear{

        @Test
        @DisplayName("This year is divisible by four but not by one hundred")
        public void yearIsDivisibleByFourButNotByOneHundred() {
            assertTrue(DateUtils.isLeapYear(2020));
        }

        @Test
        @DisplayName("This year is divisible by four hundred")
        public void yearIsDivisibleByFourHundred(){
            assertTrue(DateUtils.isLeapYear(2000));
        }

    }


    @Nested

    class AYearIsNotALeapYear{
        @Test
        @DisplayName("This year is not divisible by four")
        public void yearIsNotDivisibleByFour(){
            assertFalse(DateUtils.isLeapYear(1999));
        }

        @Test
        @DisplayName("This year is divisible by one hundred but not by four hundred")
        public void yearIsDivisibleByOneHundredButNotByFourHundred(){
            assertFalse(DateUtils.isLeapYear(1900));
        }
    }

    @Nested

    class AYearIsNotSupported{
        @Test
        @DisplayName("This year is negative")
        public void yearIsNegative(){
            try{
               DateUtils.isLeapYear(-1);
               fail("Method did not throw IllegalArgumentException as expected");
            }
            catch(IllegalArgumentException e){
                assertEquals(e.getMessage(), "Year must be larger than or equal to zero");
            }
        }
    }


}
