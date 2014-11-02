package com.telecom.tuto01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView m_text = null;
    private EditText m_editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        this.setContentView(R.layout.main_activity);
        this.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);

        // get view item
        m_text = (TextView) findViewById(R.id.textId);
        m_editText = (EditText) findViewById(R.id.editTextId);
    }

    @Override
    public void onBackPressed()
    {
        moveTaskToBack(true);
    }

}
