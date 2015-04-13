package com.example.lo.calendrier;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class MainActivity extends ActionBarActivity {

    public Calendar cal;
    public SimpleDateFormat format;
    public TextView ym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //cal = new GregorianCalendar();
        cal = Calendar.getInstance();
        format = new SimpleDateFormat("MMMM yyyy");
        Locale.setDefault(Locale.US);
        ImageView al = (ImageView) findViewById(R.id.arrowL);

        ym = (TextView) findViewById(R.id.YearMonth);
        ym.setText(format.format(cal.getTime()));
        ImageView ar = (ImageView) findViewById(R.id.arrowR);

        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPreviousMonth();
                refreshCalendar();
            }
        });

        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNextMonth();
                refreshCalendar();
            }
        });

        CalendarItem ad = new CalendarItem(this);
        GridView gridCal = (GridView) findViewById(R.id.GridCal);
        gridCal.setAdapter(ad);
    }

    public void setPreviousMonth()
    {
        Context context = getApplicationContext();
        cal.add(Calendar.MONTH, -1);
        //System.out.println(format.format(cal.getTime()));
        CharSequence text = format.format(cal.getTime());
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void setNextMonth()
    {
        cal.add(Calendar.MONTH, +1);
        Context context = getApplicationContext();
        CharSequence text = format.format(cal.getTime());
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void refreshCalendar()
    {
        ym.setText(format.format(cal.getTime()));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
