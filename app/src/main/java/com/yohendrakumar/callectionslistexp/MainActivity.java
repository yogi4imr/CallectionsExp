package com.yohendrakumar.callectionslistexp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yohendrakumar.callectionslistexp.CollectionPackage.TestArrayList;
import com.yohendrakumar.callectionslistexp.Models.Person;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TestArrayList testArrayList =  new TestArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> personList =testArrayList.getPersonList();
        Iterator<Person> personIterator = personList.iterator();
        for(Person person : personList) {
            Log.d("Appname", person.getName());
            Log.d("Appmobile", person.getMobile());
            Log.d("Appemail", person.getEmail());
            Log.d("Appcity", person.getCity());
            Log.d("Appsalary", String.valueOf(person.getSalary()));
            Log.d("Appsalary", "\n\n"+"***************"+"\n\n");
        }

    }
}
