package com.rishwan.cv.fragments;
import android.os.Bundle;

import com.rishwan.cv.adapters.CustomAdapter;
import com.rishwan.cv.model.DemoItem;
import com.rishwan.cv.adapters.ProfessionAdapter;
import com.rishwan.cv.base.R;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class skills extends Fragment {

    public skills()
    {
        // Required empty public constructor
    }
    public static skills newInstance() {
        skills fragment = new skills();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_recycler_view, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.educationList);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewDemo.setAdapter(new CustomAdapter(feedItems(), getContext()));
        return view;
    }

    private List<DemoItem> feedItems() {
        String Titles = "Interests Section";
        List<DemoItem> demoItems = new ArrayList<>();
        DemoItem demoItem = new DemoItem(Titles);
        demoItems.add(demoItem);
        return demoItems;

    }
}
