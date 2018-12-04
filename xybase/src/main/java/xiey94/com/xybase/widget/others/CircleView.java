package xiey94.com.xybase.widget.others;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import xiey94.com.xybase.R;
import xiey94.com.xybase.utils.BitmapUtils;

public class CircleView extends View {

    private Bitmap bitmap;
    private Paint paint, bgPaint;
    private Path path;
    int width = 150;

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setLayerType(LAYER_TYPE_SOFTWARE, null);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_right);
        bitmap = BitmapUtils.zoomImg(bitmap, width, width);
        paint = new Paint();
        bgPaint = new Paint();
        bgPaint.setStrokeWidth(20);
        bgPaint.setColor(Color.WHITE);
        bgPaint.setStyle(Paint.Style.STROKE);
        path = new Path();
        path.addCircle(width / 2, width / 2, width / 2, Path.Direction.CCW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, 0, 0, paint);
        canvas.drawCircle(width / 2, width / 2, width / 2, bgPaint);
        canvas.restore();
    }

}
