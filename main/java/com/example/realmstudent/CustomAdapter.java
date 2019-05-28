package com.example.realmstudent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    Showview sv;
    //private int[] img={R.drawable.banana,R.drawable.orange,R.drawable.mixed}; ;
    private ArrayList<String> Name = new ArrayList<String>();
    private ArrayList<String> Class = new ArrayList<String>();
    private ArrayList<String> Age = new ArrayList<String>();
    public CustomAdapter( Context context,ArrayList<String> Name, ArrayList<String> Class, ArrayList<String> Age
    )
    {
        this.mContext = context;
        this.Name = Name;
        this.Class = Class;
        this.Age=Age;
    }


    @Override
    public int getCount() {
        return Name.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final viewHolder holder;
         sv=new Showview();

        LayoutInflater layoutInflater;
        // ColorSpace.Model model= LIST.get(position);
        if (convertView == null) {
            layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.row_item, null);
            holder = new viewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.Name);
            holder.Class = (TextView) convertView.findViewById(R.id.Class);
            holder.age = (TextView) convertView.findViewById(R.id.Age);
            convertView.setTag(holder);
        } else {
            holder = (viewHolder) convertView.getTag();
        }



        holder.name.setText(Name.get(position));
        holder.Class.setText(Class.get(position));
        holder.age.setText(Age.get(position));


        return convertView;
    }
    public class viewHolder {

        TextView name;
        TextView Class;
        TextView age;
    }

}
