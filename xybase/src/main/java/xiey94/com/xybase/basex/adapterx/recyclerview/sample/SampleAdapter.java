package xiey94.com.xybase.basex.adapterx.recyclerview.sample;

import android.content.Context;

import java.util.List;

import xiey94.com.xybase.R;
import xiey94.com.xybase.basex.adapterx.recyclerview.BaseAdapter;
import xiey94.com.xybase.basex.adapterx.recyclerview.BaseViewHolder;

public class SampleAdapter extends BaseAdapter<String> {

    public SampleAdapter(List<String> datas) {
        super(R.layout.sample_item_adapter, datas);
    }

    @Override
    protected void bindData(Context context, BaseViewHolder holder, int position) {
        holder.setText(R.id.tv_content, datas.get(position));
    }
}
