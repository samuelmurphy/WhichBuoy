package com.samtheknife.www.whichbuoy;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/**
 * Created by sam on 6/20/17.
 */

public class CompassDirection implements SensorEventListener {

    private Sensor compass;
    private SensorManager sensorManager;
    private float currentDegree = 0f;

public CompassDirection(Context context){


    sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
    compass =sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    if(compass != null){
        sensorManager.registerListener(this, compass, SensorManager.SENSOR_DELAY_NORMAL);
    }
}

public String getTestCompass() {
    String zzz = Float.toHexString(currentDegree);
    return zzz;
}

    @Override
    public void onSensorChanged(SensorEvent event) {

        float degree = Math.round(event.values[0]);
       currentDegree = degree;

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
