package xiey94.com.xbase;

import android.app.Application;

import xiey94.com.xybase.widget.xToast;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new xToast.Builder().context(this).duration(4000).build();
    }
}
