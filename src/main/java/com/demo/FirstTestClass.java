package com.demo;

import com.demo.dataproviders.YamlDataProvider;
import com.demo.testdata.PersonDetails;
import org.testng.annotations.Test;

public class FirstTestClass {

    @Test(dataProvider = "YamlDataProvider", dataProviderClass = YamlDataProvider.class)
    public void userDisplaysThePersonDetails(PersonDetails personDetails){
        System.out.println("Displaying the PersonDetails");
        System.out.println("Ddetails: ---> " + personDetails);
    }

    @Test
    public void personParticipatesInCompetition(){

    }

}
