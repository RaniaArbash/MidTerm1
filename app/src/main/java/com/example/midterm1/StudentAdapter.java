package com.example.midterm1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {

    Context context;
    ArrayList<Student> StudentList;
    LayoutInflater inflater;
    View view;

    public StudentAdapter(Context appContext, ArrayList<Student> list){
        this.context = appContext;
        this.StudentList = list;
        inflater = LayoutInflater.from(appContext);
    }

    @Override
    public int getCount() {
        return StudentList.size();
    }

    @Override
    public Object getItem(int position) {
        return StudentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        view = inflater.inflate(R.layout.student_item_layout,null);
        TextView studetName = (TextView)view.findViewById(R.id.StudentName);
        TextView yearandlevelText = (TextView) view.findViewById(R.id.year_level);
        ImageView studentImage = (ImageView)view.findViewById(R.id.image) ;

        studetName.setText((StudentList.get(position)).studentName);
        yearandlevelText.setText("Level: " + StudentList.get(position).level +" Year: " +StudentList.get(position).year);
        studentImage.setImageBitmap(StudentList.get(position).imageData);
        return view;
    }
}
