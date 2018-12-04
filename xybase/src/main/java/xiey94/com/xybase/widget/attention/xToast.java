package xiey94.com.xybase.widget.attention;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class xToast {

    private static Context context;
    private static int duration;

    public xToast(Builder builder) {
        xToast.context = builder.context;
        xToast.duration = builder.duration;
    }

    public static final void showToast(String info) {
        showToast(context, info, duration, false);
    }

    public static final void showToast(String info, int duration) {
        showToast(context, info, duration, false);
    }

    public static final void showToast(Context context, String info, int duration) {
        showToast(context, info, duration, false);
    }

    public static final void showToast(Context context, String info, int duration, boolean LENGTH_LONG) {
        if (context != null && !TextUtils.isEmpty(info)) {
            Toast.makeText(context, info, LENGTH_LONG ? Toast.LENGTH_LONG : duration > 0 ? duration : Toast.LENGTH_SHORT).show();
        }
    }

    public static class Builder {
        private Context context;
        private int duration;

        public Builder() {
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public xToast build() {
            return new xToast(this);
        }
    }
}
