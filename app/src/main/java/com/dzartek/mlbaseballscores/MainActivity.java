package com.dzartek.mlbaseballscores;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity implements BaseballScores.OnTouchBaseballDate,
    DateDialog.OnFragmentDialogDateSet{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaseballScores baseballScores = new BaseballScores();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentHolder, baseballScores)
                .commit();

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


    @Override
    public void onTouchDate(int year, int month, int day) {
        DateDialog newFragment = new DateDialog();

        Bundle b = new Bundle();
        b.putInt("Year", year);
        b.putInt("Month", month);
        b.putInt("Day", day);
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }

    @Override
    public void onDialogDateSet(int year, int month, int day) {
        //Toast.makeText(this, "MainActivity - Selected date: " + year + "/" + month + "/" + day, Toast.LENGTH_LONG).show();

        /*  Send this to BaseballScores fragment.

         */
        BaseballScores baseballScores = new BaseballScores();

        Bundle b = new Bundle();
        b.putInt("Year", year);
        b.putInt("Month", month);
        b.putInt("Day", day);
        baseballScores.setArguments(b);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentHolder, baseballScores)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();

    }
}
