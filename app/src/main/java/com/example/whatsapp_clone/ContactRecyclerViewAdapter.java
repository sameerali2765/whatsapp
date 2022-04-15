package com.example.whatsapp_clone;


    import android.graphics.drawable.Drawable;
    import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
    import android.widget.ImageButton;
    import android.widget.ImageView;
    import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewAdapter.ViewHolder> {


        private ArrayList<contact> contacts = new ArrayList<contact>();

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_layout,parent,false);
            ViewHolder viewHolder = new ViewHolder(view);
            return  viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtName.setText(contacts.get(position).getName());
            holder.txtEmail.setText(contacts.get(position).getEmail());
            holder.txtimg.setImageDrawable(Drawable.createFromPath(contacts.get(position).getImageUrl()));

        }

        @Override
        public int getItemCount() {
            return contacts.size();
        }

        public void setContacts(ArrayList<contact> contacts)
        {
            this.contacts = contacts;
            notifyDataSetChanged();
        }

        public class ViewHolder extends RecyclerView.ViewHolder
        {
            private TextView txtName;
            private TextView txtEmail;
            private ImageView txtimg;

            public ViewHolder(@NonNull View itemView)
            {
                super(itemView);
                txtName = itemView.findViewById(R.id.txtName);
                txtEmail = itemView.findViewById(R.id.txtEamil);
                txtimg = itemView.findViewById(R.id.txtimg);
            }
        }

    }


