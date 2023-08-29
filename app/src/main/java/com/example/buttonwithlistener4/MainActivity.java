/*  Button with Listener4 in App Development.

    Date:29 August,2023
    Author:Hasibur Rahman

 */
package com.example.buttonwithlistener4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButtonId);
        logoutButton = (Button) findViewById(R.id.logoutButtonId);
        textView = (TextView) findViewById(R.id.textViewId);
    }

    public void show(View view)
    {
        if(view.getId()==R.id.loginButtonId)
        {
            textView.setText("Login Button is Clicked.");
        }
        if(view.getId()==R.id.logoutButtonId)
        {
            textView.setText("Logout Button is Clicked.");
        }
    }
}