package com.samtheknife.www.whichbuoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import com.samtheknife.www.whichbuoy.CompassDirection;

/**
 * Created by sam on 6/19/17.
 */

public class DrawView extends View {
    Paint paint = new Paint();
    Bitmap compass;
    CompassDirection compassDirection;


    public DrawView(Context context ){

        super(context);

       // Matrix sizeMat = new Matrix();
        //sizeMat.postScale(50, 50);
        compass = BitmapFactory.decodeResource(getResources(), R.drawable.compass);
        compass = Bitmap.createScaledBitmap(compass, 1600,400, false);
        compassDirection = new CompassDirection(context);
    }

    @Override
    public void onDraw(Canvas canvas){

        int w  = canvas.getWidth();
        int h  = canvas.getHeight();

         int wc = w/2;
        int hc = h/2;

        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        canvas.drawRect(wc + 20, hc+50, wc + 130, hc + 230, paint);

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(0);
         canvas.drawCircle(wc, hc, 100, paint);

        canvas.drawBitmap(compass,0, hc, paint);

        String testCompass = compassDirection.getTestCompass();

        paint.setColor(Color.MAGENTA);
        paint.setTextSize(40);
        canvas.drawText(testCompass,10, 100, paint);

    }
}
