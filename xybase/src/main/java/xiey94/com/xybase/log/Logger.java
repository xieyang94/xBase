package xiey94.com.xybase.log;

import android.util.Log;

import xiey94.com.xybase.BuildConfig;

/**
 * @author : xiey
 * @project name : xbase.
 * @package name  : xiey94.com.xybase.log.
 * @date : 2018/7/15.
 * @signature : do my best.
 * @explain :
 */
public class Logger implements xiey94.com.xybase.log.Log {
    public static final String TAG = "xbase";

    private static String tag = TAG;

    private static boolean cancel = false;

    public Logger(Builder builder) {
        Logger.tag = builder.tag;
        Logger.cancel = builder.cancel;
    }

    public static void i(String obj) {
        if (check(obj)) {
            Log.i(tag, obj);
        }
    }

    public static void e(String obj) {
        if (check(obj)) {
            Log.e(tag, obj);
        }
    }

    public static void d(String obj) {
        if (check(obj)) {
            Log.d(tag, obj);
        }
    }

    public static void v(String obj) {
        if (check(obj)) {
            Log.v(tag, obj);
        }
    }

    public static void w(String obj) {
        if (check(obj)) {
            Log.w(tag, obj);
        }
    }

    public static void tag(String tag, String obj) {
        if (check(obj)) {
            Log.i(tag, obj);
        }
    }

    public static boolean check(String obj) {
        return (obj != null && !cancel && BuildConfig.DEBUG);
    }

    public static class Builder {
        private String tag;
        private boolean cancel;

        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public Builder cancel(boolean cancel) {
            this.cancel = cancel;
            return this;
        }

        public Logger build() {
            return new Logger(this);
        }

    }

}
