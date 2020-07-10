package com.example.midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ReportActivity extends AppCompatActivity {
ImageView sImage;
ListView simpleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
       ArrayList<Student> list =  getIntent().getParcelableArrayListExtra("students");
        simpleList = (ListView) findViewById(R.id.simpleList);
        StudentAdapter adapter= new StudentAdapter(getApplicationContext(),list);
        simpleList.setAdapter(adapter);
     //  s.allCourses = getIntent().getParcelableArrayListExtra("courseList");

     //   Log.d("course",((Course)s.allCourses.get(0)).courseName);
     //   CourseList newList = CourseList.newInstance(s.allCourses);
       // getSupportFragmentManager().beginTransaction()
         //       .replace(R.id.frameLayout, newList).commit();




    }


}
