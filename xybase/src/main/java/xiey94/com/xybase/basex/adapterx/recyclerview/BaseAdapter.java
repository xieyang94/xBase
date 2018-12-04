package xiey94.com.xybase.basex.adapterx.recyclerview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public abstract class BaseAdapter<Bean> extends RecyclerView.Adapter<BaseViewHolder> {

    protected List<Bean> datas;
    private int layoutId;
    private Context context;

    public BaseAdapter(@LayoutRes int layoutId, List<Bean> datas) {
        this.layoutId = layoutId;
        this.datas = datas;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        context = parent.getContext();
        if (oneItemType()) {
            View view = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
            return new BaseViewHolder(view);
        }
        return moreItemType(parent, position);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        if (datas != null && !datas.isEmpty()) {
            bindData(context,holder, position);

            if (!isNull(listener)) {
                holder.itemView.setOnClickListener(v -> {
                    int pos = holder.getLayoutPosition();
                    listener.onClick(holder.itemView, pos);
                });
                holder.itemView.setOnLongClickListener(v -> {
                    int pos = holder.getLayoutPosition();
                    listener.onLongClick(holder.itemView, pos);
                    return false;
                });
            }
        }
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    private OnClickListener listener;

    protected void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    private interface OnClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    protected abstract void bindData(Context context,BaseViewHolder holder, int position);

    protected boolean oneItemType() {
        return true;
    }

    protected BaseViewHolder moreItemType(@NonNull ViewGroup parent, int position) {
        return null;
    }

    protected boolean isNull(Object obj) {
        return obj == null;
    }

    protected boolean isEmpty(String value) {
        return TextUtils.isEmpty(value);
    }

    protected String defaultValue(String value) {
        return defaultValue(value, "");
    }

    protected Integer defaultValue(Integer value) {
        return defaultValue(value, -1);
    }

    protected Float defaultValue(Float value) {
        return defaultValue(value, -1.0f);
    }

    protected Double defaultValue(Double value) {
        return defaultValue(value, -1.0D);
    }

    protected String defaultValue(String value, @NonNull String defaultValue) {
        return value == null ? defaultValue : value;
    }

    protected Integer defaultValue(Integer value, @NonNull Integer defaultValue) {
        return value == null ? defaultValue : value;
    }

    protected Float defaultValue(Float value, @NonNull Float defaultValue) {
        return value == null ? defaultValue : value;
    }

    protected Double defaultValue(Double value, @NonNull Double defaultValue) {
        return value == null ? defaultValue : value;
    }


}
