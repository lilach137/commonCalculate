package com.example.BMI;

import android.content.Intent;

import com.example.common.Activity_StatsParent;
import com.example.common.utils.MSP;

public class Activity_Stats extends Activity_StatsParent {

    private Integer weight;
    private float height;
    private Integer age;
    private Integer gender;

    @Override
    protected String getData() {
        weight = MSP.getInstance().getInt("KEY_WEIGHT", 100);
        height = MSP.getInstance().getFloat("KEY_HEIGHT", 170);

        return "your BMI is: " + CalculateBMI() ;
    }

        private Float CalculateBMI() {

            float BMI = weight / (height * height);
            return BMI;
        }
}
