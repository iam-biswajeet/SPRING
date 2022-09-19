package com.nt.sbeans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//make the class as spring bean
@Component("season")
public class SeasonGeneratorUsingMonthApp {
	//field injection
	@Autowired
	private Calendar cal;
	//write the b.logic
	public String getMessage(String user) {
		int month=cal.get(Calendar.MONTH);
		System.out.print("Hey "+user+" This is ");
		if(month<2)
			return "Winter Season\nThe cold weather may have something to do with burning more calories. The cold weather prompts our bodies to burn more calories in order to keep our bodies warm.";
		else if(month<4)
			return "Spring Season\n In spring, our days start getting longer, flowers begin to bloom, and warmer weather allows us to spend more time enjoying the outdoors.";
		else if(month<6)
			return "Summer Season\nOk, so getting some sun isn't always likely but we do sometimes get a few days of bliss and when we do, it's the best.";
		else if(month<8)
			return "Monsoon Season\nIt boosts the agriculture in India. Infact, the whole agriculture of the country depends on the monsoons";
		if(month<10)
			return "Autumn Season\nFall makes for the perfect time to get outdoors and increase the physical activity our bodies need.";
		else
			return "Dew Season\nDew reduces water loss from plants and soil because it contributes to slowing the process of evaporation and transpiration for a period of time.";

	}
}
