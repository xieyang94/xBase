package xiey94.com.xbase;

import android.app.Application;

import xiey94.com.xybase.widget.attention.Attention;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        new Attention.Builder()
                .way(Attention.Way.TOAST)
                .context(this)
                .duration(4000)
                .build();
    }
}
