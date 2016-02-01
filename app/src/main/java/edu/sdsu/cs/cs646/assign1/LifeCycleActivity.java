package edu.sdsu.cs.cs646.assign1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LifeCycleActivity extends ActionBarActivity {

    private static final String APP_NAME = "Assignment1";
    private StringBuffer message_text = new StringBuffer();
    private static final String NAME = "Humaira";

    /**
     * This message will display the message in the TextView.
     * @param message
     */

    public void display(StringBuffer message){
        TextView text_view = (TextView)findViewById(R.id.text_view);
        text_view.setText(message);
    }

    /**
     * This method will be called when the user clicks on the clear
     * button. The onclick property of the clear button is set to
     * this method in the layout xml file.
     *
     * @param view
     */
    public void clear(View view) {
        message_text = new StringBuffer();
        display(message_text);
    }

    /**
     * Overriding the onCreate method of the activity.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        String strCreate = getResources().getString(R.string.onCreate);
        Log.i(APP_NAME, strCreate);
        message_text.append(strCreate);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onStart method of the activity.
     */
    @Override
    public void onStart() {
        super.onStart();
        String strStart = getResources().getString(R.string.onStart);
        Log.i(APP_NAME, strStart);
        message_text.append(strStart);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onPause method of the activity.
     */
    @Override
    public void onPause() {
        super.onPause();
        String strPause = getResources().getString(R.string.onPause);
        Log.i(APP_NAME,strPause);
        message_text.append(strPause);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onResume method of the activity.
     */
    @Override
    public void onResume() {
        super.onResume();
        String strResume = getResources().getString(R.string.onResume);
        Log.i(APP_NAME,strResume);
        message_text.append(strResume);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onStop method of the activity.
     */
    @Override
    public void onStop() {
        super.onStop();
        String strStop= getResources().getString(R.string.onStop);
        Log.i(APP_NAME,strStop);
        message_text.append(strStop);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onDestroy method of the activity.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        String strDestroy = getResources().getString(R.string.onDestroy);
        Log.i(APP_NAME,strDestroy);
        message_text.append(strDestroy);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onRestart method of the activity.
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        String strRestart = getResources().getString(R.string.onRestart);
        Log.i(APP_NAME,strRestart);
        message_text.append(strRestart);
        message_text.append("\n");
        display(message_text);
    }

    /**
     * Overriding the onSaveInstanceState method of the activity.
     * @param savedInstanceState
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        String strSaveInst = getResources().getString(R.string.onSaveInstanceState);
        Log.i(APP_NAME, strSaveInst);
        message_text.append(strSaveInst);
        message_text.append("\n");
        display(message_text);
    }
    /**
     * Overriding the onRestoreInstanceState method of the activity.
     * @param savedInstanceState
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String strRestoreInst = getResources().getString(R.string.onRestoreInstanceState);
        Log.i(APP_NAME, strRestoreInst);
        message_text.append(strRestoreInst);
        message_text.append("\n");
        display(message_text);
    }

}
