package xiey94.com.xybase.widget.attention;

import android.content.Context;

public class Attention {

    public enum Way {
        TOAST,
    }

    public static Way way = Way.TOAST;
    private static Context context;
    private static int duration;

    public Attention(Builder builder) {
        Attention.way = builder.way;
        Attention.context = builder.context;
        Attention.duration = builder.duration;
        switch (way) {
            case TOAST:
                new xToast.Builder().context(context).duration(duration).build();
                break;
        }
    }

    public static void show(String info) {
        switch (way) {
            case TOAST:
                xToast.showToast(info);
                break;
        }
    }

    public static class Builder {

        private Context context;
        private Way way;
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

        public Builder way(Way way) {
            this.way = way;
            return this;
        }

        public Attention build() {
            return new Attention(this);
        }

    }
}
