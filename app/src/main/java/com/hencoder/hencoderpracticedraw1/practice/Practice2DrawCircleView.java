package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {


    public Practice2DrawCircleView(Context context) {
        super(context);




    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint1=new Paint();
        Paint paint2=new Paint();
        Paint paint3=new Paint();
        Paint paint4=new Paint();

        paint1.setColor(Color.BLACK);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setAntiAlias(true);

        paint2.setColor(Color.BLACK);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);

        paint3.setColor(Color.parseColor("#885ec986"));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);

        paint4.setColor(Color.parseColor("#885ec986"));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(20f);
        paint4.setAntiAlias(true);
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        canvas.drawCircle(150,150,100,paint1);
        canvas.drawCircle(450,150,100,paint2);
        canvas.drawCircle(150,400,100,paint3);
        canvas.drawCircle(450,400,100,paint4);

    }
}
