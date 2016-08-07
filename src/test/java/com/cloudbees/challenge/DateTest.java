package com.cloudbees.challenge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by carlos.cornejo 07/08/16.
 */
public class DateTest {

    @Test
    public void itShouldAddExpectedDayWhenWithinTheCurrentMonth() {

        //given
        final Date date = new Date(7, 8, 2016);

        //when
        date.add(3);

        //then
        assertThat(date.getDay(), equalTo(10));
    }

    @Test
    public void itShouldIncreaseDaysAndMonthWhenDaysGoOverCurrentMonth() {

        //given
        final Date date = new Date(7, 8, 2016);

        //when
        date.add(31);

        //then
        assertThat(date.getDay(), equalTo(7));
        assertThat(date.getMonth(), equalTo(9));
    }

    @Test
    public void itShouldIncreaseDaysAndMonthAndYearWhenDaysGoOverCurrentYear() {

        //given
        final Date date = new Date(7, 8, 2016);

        //when
        date.add(365);

        //then
        assertThat(date.getDay(), equalTo(7));
        assertThat(date.getMonth(), equalTo(8));
        assertThat(date.getYear(), equalTo(2017));
    }
}
