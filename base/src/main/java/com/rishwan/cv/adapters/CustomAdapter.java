package com.rishwan.cv.adapters;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rishwan.cv.model.DemoItem;
import com.rishwan.cv.base.R;
import java.util.List;
public class CustomAdapter extends RecyclerView.Adapter {
    private List<DemoItem> demoItems;
    private Context        context;
    public CustomAdapter(List<DemoItem> demoItems, Context context) {
        this.demoItems = demoItems;
        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.list, parent, false);
        return new DemoItemHolder4(row);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }
    @Override
    public int getItemCount() {
        return demoItems.size();
    }


    public class DemoItemHolder4 extends RecyclerView.ViewHolder {

        DemoItemHolder4(View itemView) {
            super(itemView);
        }
    }

}
