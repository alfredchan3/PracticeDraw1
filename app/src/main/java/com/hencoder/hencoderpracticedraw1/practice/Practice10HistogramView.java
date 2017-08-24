package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Paint textpaint = new Paint();
    float width = 80;
    float widthMargin = 50;
    float startX = 80;
    float height = 450;
    float textheight = height + 20;
    float textmargin = 20;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.parseColor("#71ba15"));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        textpaint.setColor(Color.WHITE);
        textpaint.setAntiAlias(true);
        textpaint.setStyle(Paint.Style.FILL);
        //先画矩阵

        canvas.drawRect(startX+ width, 100, startX + width + widthMargin, height, paint);
        canvas.drawText("Froyo", startX + width+ 10, textheight, textpaint);
        canvas.drawRect(startX + width * 2, 300, startX + width * 2 + widthMargin, height, paint);
        canvas.drawText("GB", startX + width * 2 + textmargin, textheight, textpaint);
        canvas.drawRect(startX + width * 3, 400, startX + width * 3 + widthMargin, height, paint);
        canvas.drawText("ICS", startX + width * 3 + textmargin, textheight, textpaint);
        canvas.drawRect(startX + width * 4, 100, startX + width * 4 + widthMargin, height, paint);
        canvas.drawText("JB", startX + width * 4 + textmargin, textheight, textpaint);
        canvas.drawRect(startX + width * 5, 200, startX + width * 5 + widthMargin, height, paint);
        canvas.drawText("Kitkat", startX + width * 5 + 10, textheight, textpaint);
        canvas.drawRect(startX + width * 6, 250, startX + width * 6 + widthMargin, height, paint);
        canvas.drawText("L", startX + width * 6 + textmargin, textheight, textpaint);
        canvas.drawRect(startX + width * 7, 400, startX + width * 7 + widthMargin, height, paint);
        canvas.drawText("M", startX + width * 7 + textmargin, textheight, textpaint);
        canvas.drawLine(startX+width/2 - 10, 0, startX+width/2 - 10, height, textpaint);
        canvas.drawLine(startX+width/2 - 10, height, startX + width * 14, height, textpaint);
    }
}
