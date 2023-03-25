package com.example.fatPercentage;

import com.example.common.Activity_StatsParent;
import com.example.common.utils.MSP;

public class Activity_Stats extends Activity_StatsParent {

    private Integer weight;
    private float height;
    private Integer waist;
    private Integer gender;

    protected String getData() {
        weight = MSP.getInstance().getInt("KEY_WEIGHT", 100);
        waist = MSP.getInstance().getInt("KEY_WAIST", 60);
        gender = MSP.getInstance().getInt("KEY_GENDER", 0);

        return "your fat percentage is: " + CalculateFatPercentage() ;
    }

    private Float CalculateFatPercentage() {
        float fatPercentage = 0;
        double tempCalc = ((4.15*waist) - (0.082*weight));
        if (gender == 0){
            fatPercentage = (float) ((-98.42+ tempCalc)/weight);
        } else {
            fatPercentage = (float) ((-76.76+ tempCalc)/weight);
        }

        return fatPercentage;
    }
}
