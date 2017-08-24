package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint1 = new Paint();
    Paint paintyellow = new Paint();
    Paint paintpurple = new Paint();
    Paint paintgray = new Paint();
    Paint paintgreen = new Paint();
    Paint paintblue = new Paint();
    int startX = 110;
    int endX = startX + 400;
    int startY = 30;
    int endY = startY + 400;

    Path path = new Path();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint1.setAntiAlias(true);
        paint1.setColor(Color.parseColor("#f34334"));
        paint1.setStyle(Paint.Style.FILL);
        paintyellow.setColor(Color.parseColor("#fec106"));
        paintpurple.setColor(Color.parseColor("#9c26af"));
        paintpurple.setStyle(Paint.Style.FILL);
        paintgray.setColor(Color.parseColor("#9da09e"));
        paintgreen.setColor(Color.parseColor("#009687"));
        paintblue.setColor(Color.parseColor("#1f96f2"));

//        canvas.drawOval(200,100,600,400,paint1);
        canvas.drawArc(startX - 10, startY - 10, endX - 10, endY - 10, -190, 130, true, paint1);

        canvas.drawArc(startX, startY, endX, endY, 80, 90, true, paintblue);
        canvas.drawArc(startX, startY, endX, endY, -60, 58, true, paintyellow);
        canvas.drawArc(startX, startY, endX, endY, 0, 6, true, paintpurple);
        canvas.drawArc(startX, startY, endX, endY, 8, 6, true, paintgray);
        canvas.drawArc(startX, startY, endX, endY, 16, 60, true, paintgreen);

        paintyellow.setAntiAlias(true);
        paintyellow.setStrokeWidth(3f);
        paintyellow.setStyle(Paint.Style.STROKE);
        paintgray.setAntiAlias(true);
        paintgray.setTextSize(20);
        paintgray.setColor(Color.WHITE);
        path.moveTo(90,50);
        path.lineTo(140, 50);
        path.lineTo(170,70);
        canvas.drawText("Lolipop",10,50,paintgray);

        canvas.drawPath(path, paintyellow);

        path.moveTo(460,100);

        path.lineTo(500,60);

        path.lineTo(550,60);

        canvas.drawText("Marshmallow",570,60,paintgray);
        canvas.drawPath(path,paintyellow);


        path.moveTo(453,370);
        path.lineTo(500,400);
        path.lineTo(550,400);
        canvas.drawText("Jelly Bean",560,400,paintgray);
        canvas.drawPath(path,paintyellow);

        path.moveTo(510,240);

        path.lineTo(550,240);

        path.lineTo(580,250);
        path.lineTo(610,250);
        canvas.drawText("Gingebread",620,250,paintgray);
        canvas.drawPath(path,paintyellow);


        path.moveTo(510,270);
        path.lineTo(550,270);
        path.lineTo(580,280);
        path.lineTo(610,280);
        canvas.drawText("Ice Cream Sandwich",620,280,paintgray);
        canvas.drawPath(path,paintyellow);


        path.moveTo(510,225);
        path.lineTo(610,225);
        canvas.drawText("Froyo",620,225,paintgray);
        canvas.drawPath(path,paintyellow);

        path.moveTo(190,390);
        path.lineTo(150,400);
        path.lineTo(90,400);

        canvas.drawText("Kitkat",30,400,paintgray);
        canvas.drawPath(path,paintyellow);


//        canvas.drawArc(200,100,600,400,-190,130,true,paint2);


    }
}
