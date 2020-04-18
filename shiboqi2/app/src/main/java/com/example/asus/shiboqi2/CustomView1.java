package com.example.asus.shiboqi2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by asus on 2018/7/11.
 */

public class CustomView1 extends View {
    Paint paint;
    public
    CustomView1(Context context) {
        super(context);
        paint = new Paint(); //设置一个笔刷大小是3的黄色的画笔
        paint.setColor(Color.YELLOW);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(3);
    }
    //在这里我们将测试canvas提供的绘制图形方法
    @Override


    protected
    void onDraw(Canvas canvas) {

    }
}
