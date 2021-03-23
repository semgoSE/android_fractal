package ru.semgose.fractal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class Draw extends View {

    Canvas c;
    Paint p;

    public Draw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        c = canvas;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GREEN);
        p = paint;
        drawBox(1000, 0, 0, 1);
        super.onDraw(canvas);
    }

    protected void drawBox(int size, int x, int y, int count) {
        for(int i = 1; i <= count; i++) {
            Rect r = new Rect(x+size*(i-1), y+size*(i-1), x+size*i, y+size*i);
            c.drawRect(r, p);
        }
        if(size != 125) {
            drawBox(size / 2, x, y, count*2);
        }

    }
}
