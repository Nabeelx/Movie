//package com.example.movie;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.squareup.picasso.Picasso;
//
//import java.util.List;

//public class RecyclerAdap extends RecyclerView.Adapter<RecyclerAdap.ViewHolder> {
//
//    public List<MovieList> movieListModels;
//
//
////    MainActivity mc;
////    abcnewsFragment mc;
////    ninenewsfragment mca;
//    sydneyfragment mcb;
////    theagefragment mcc;
//    public Context context;
////    public RecyclerAdap(List<NewsListModel> movieListModels, abcnewsFragment mc){
////        this.newsListModels = newsListModels;
////        this.mc = mc;
////    }
////
////    public RecyclerAdap(List<NewsListModel> movieListModels, ninenewsfragment mca){
////        this.newsListModels = newsListModels;
////        this.mca = mca;
////    }
////
////    public RecyclerAdap(List<NewsListModel> newsListModels, theagefragment mcc){
////        this.newsListModels = newsListModels;
////        this.mcc = mcc;
////    }
//
//    public RecyclerAdap(List<MovieList> newsListModels, sydneyfragment mcb){
//        this.movieListModels = newsListModels;
//        this.mcb = mcb;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
//        context = parent.getContext();
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.setIsRecyclable(false);
//
//        String itemname = movieListModels.get(position).getName();
//        String itemiamge = movieListModels.get(position).getImagename();
//
//        holder.setdata(itemname,itemiamge);
////        holder.mView.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////
////                mc.switchContent(new abcnewsFragment());
////            }
////        });
//
//    }
  /*  private void fragmentJump() {
      Fragment  mFragment = new abcnewsFragment();
      Bundle mBundle = new Bundle();
      mFragment.setArguments(mBundle);
        switchContent(R.id.frame, mFragment);
    }
    public void switchContent(int id, Fragment fragment) {
        if (context == null)
            return;
        if (context instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) context;
            Fragment frag = fragment;
            mainActivity.switchContent(id, frag);
        }
//
//    }*/
//    @Override
//    public int getItemCount() {
//        return movieListModels.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        private View mView;
//
//        private TextView name;
//        private ImageView image;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            mView = itemView;
//
//            image = mView.findViewById(R.id.imageView);
//            name = mView.findViewById(R.id.textView);
//
//        }
//        public void setdata( String naame,String img) {
//
//            name.setText(naame);
//
//            if(img =="1") {
//                Picasso.get().load(R.drawable.map).into(image);
//            }
////           else if(img =="2") {
////                Picasso.get().load(R.drawable.earth).into(image);
////            }
////          else if(img =="3") {
////                Picasso.get().load(R.drawable.sports).into(image);
////            }
////           else if(img =="4") {
////                Picasso.get().load(R.drawable.health).into(image);
////            }
//
//        }
//    }
//}
