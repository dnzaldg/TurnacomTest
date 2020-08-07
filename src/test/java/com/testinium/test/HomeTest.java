package com.testinium.test;

import com.sun.org.glassfish.gmbal.Description;
import com.testinium.base.BaseTest;
import com.testinium.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public  void ticketTest(){
        new HomePage(driver,wait).
                ticketSearch()
                .selectTicket()
                .fillForm();
    }


}
