package com.example.movie;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;

//import java.util.ArrayList;
//import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class sydneyfragment extends Fragment {
//    private RecyclerAdap recyclerAdapter;
//    RecyclerView abcrecycler;
//    List<MovieList> movieListModels;
    Toolbar toolbar;
    Activity activity;
//    Context context;
    public sydneyfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sydney, container, false);

//        context = getContext();
        activity = getActivity();
        toolbar = view.findViewById(R.id.toolbar);
//
        toolbar.setNavigationIcon(R.drawable.backblack);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onBackPressed();
            }
        });
//        movieListModels = new ArrayList<MovieList>();
//        abcrecycler = view.findViewById(R.id.sydneyrecycler);
//        movieListModels.add(new MovieList("1","National"));
//        movieListModels.add(new MovieList("2","World"));
//        movieListModels.add(new MovieList("3","Sports"));
//        movieListModels.add(new MovieList("4","Health"));

        //later changoe all these value and create new recycler adapter
        //now its just copy paste for other three fragments
//        recyclerAdapter = new RecyclerAdap(movieListModels, this);
//        abcrecycler.setLayoutManager(new LinearLayoutManager(getContext() ,RecyclerView.VERTICAL, false));
//        abcrecycler.setAdapter(recyclerAdapter);
//        abcrecycler.setHasFixedSize(true);

        return view;
    }
    @Override
    public void onDestroyView() {
//        recyclerAdapter = null;
        super.onDestroyView();
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.gc();

    }
}
