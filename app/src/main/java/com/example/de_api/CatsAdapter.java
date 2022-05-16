//package com.example.de_api;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class CatsAdapter extends RecyclerView.Adapter<CatsAdapter.ViewHolder> {
//
//    private List<CatsResponce> catsResponces;
//    private LayoutInflater inflater;
//    private Context context;
//    private int position;
//    public CatsAdapter(List<CatsResponce> catsResponces, Context context) {
//        this.catsResponces = catsResponces;
//        this.inflater = LayoutInflater.from(context);
//        this.context = context;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        context = parent.getContext();
//        View view = inflater.inflate(R.layout.cats_item, parent,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        CatsResponce catsResponce = catsResponces.get(position);
//        this.position = position;
//        Contact contact = catsResponce.contact;
//        holder.swtTextName(catsResponce.getName());
//        holder.swtTextCity(catsResponce.getCity());
//        holder.swtTextMobile(contact.getModile());
//        holder.swtTextSkype(contact.getSkype());
//        holder.swtTextEmail(contact.getEmail());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return catsResponces.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        final private TextView Item_Cat_Name;
//        final private TextView Item_Cat_City;
//        final private TextView Item_Cat_Mobile;
//        final private TextView Item_Cat_Email;
//        final private TextView Item_Cat_Skype;
//
//        private ViewHolder(View view) {
//            super(view);
//            this.Item_Cat_Name = view.findViewById(R.id.Item_Cat_Name);
//            this.Item_Cat_City = view.findViewById(R.id.Item_Cat_City);
//            this.Item_Cat_Mobile = view.findViewById(R.id.Item_Cat_Mobile);
//            this.Item_Cat_Email = view.findViewById(R.id.Item_Cat_Email);
//            this.Item_Cat_Skype = view.findViewById(R.id.Item_Cat_Skype);
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    //TODO Иди нахуй
//                }
//            });
//            view.findViewById(R.id.Item_Button).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    //TODO Иди нахуй
//                }
//            });
//        }
//        public void swtTextName(String text){this.Item_Cat_Name.setText(text);}
//        public void swtTextCity(String text){this.Item_Cat_City.setText(text);}
//        public void swtTextMobile(String text){
//            this.Item_Cat_Mobile.setText(text);
//        }
//        public void swtTextEmail(String text){
//            this.Item_Cat_Email.setText(text);
//        }
//        public void swtTextSkype(String text){
//            this.Item_Cat_Skype.setText(text);
//        }
//    }
//}
