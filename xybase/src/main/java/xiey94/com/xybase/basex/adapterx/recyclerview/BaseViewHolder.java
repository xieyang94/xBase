package xiey94.com.xybase.basex.adapterx.recyclerview;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class BaseViewHolder extends RecyclerView.ViewHolder implements IBaseViewHolder {
    private Map<Integer, View> mViewMap;
    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        mViewMap = new HashMap<>();
    }

    public <T extends View> T getView(@IdRes int id) {
        T view = (T) mViewMap.get(id);
        if (view == null) {
            view = itemView.findViewById(id);
            mViewMap.put(id, view);
        }
        return view;
    }

    public void setText(int id, String text) {
        if (getView(id) instanceof TextView) {
            ((TextView) getView(id)).setText(text);
        }
    }

//    public void loadImage(int id, int res) {
//        if (getView(id) instanceof ImageView) {
//            ImageLoader.loadImage(res, getView(id));
//        }
//    }
//
//    public void loadImage(int id, String res) {
//        if (getView(id) instanceof ImageView) {
//            ImageLoader.loadImage(res, getView(id));
//        }
//    }
}
