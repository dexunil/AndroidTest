package com.example.aaa.app_led_003;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button button = null;
    private boolean ledon = false;
    private CheckBox checkboxLed1 =null;
    private CheckBox checkboxLed2 =null;
    private CheckBox checkboxLed3 =null;
    private CheckBox checkboxLed4 =null;
    class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            ledon = !ledon;
            if(ledon) {
                button.setText("ALL OFF");
                checkboxLed1.setChecked(true);
                checkboxLed2.setChecked(true);
                checkboxLed3.setChecked(true);
                checkboxLed4.setChecked(true);
            }
            else {
                button.setText("ALL ON");
                checkboxLed1.setChecked(false);
                checkboxLed2.setChecked(false);
                checkboxLed3.setChecked(false);
                checkboxLed4.setChecked(false);
            }
        }
    };
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox1:
                if (checked)
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "Led1 ON", Toast.LENGTH_SHORT).show();
                else
                    // Remove the meat
                    Toast.makeText(getApplicationContext(),"Led1 OFF",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkbox2:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(),"Led2 ON",Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(),"Led2 OFF",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkbox3:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Led3 ON",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Led3 OFF",Toast.LENGTH_SHORT).show();

                break;

            default:
                if(checked)
                    Toast.makeText(getApplicationContext(),"Led4 ON",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Led4 OFF",Toast.LENGTH_SHORT).show();
                break;

            // TODO: Veggie sandwich
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button_id);
        button.setOnClickListener(new ButtonListener());

        checkboxLed1 = (CheckBox)findViewById(R.id.checkbox1);
        checkboxLed2 = (CheckBox)findViewById(R.id.checkbox2);
        checkboxLed3 = (CheckBox)findViewById(R.id.checkbox3);
        checkboxLed4 = (CheckBox)findViewById(R.id.checkbox4);


        /* {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ledon = !ledon;
                if(ledon)
                    button.setText("ALL OFF");
                else
                    button.setText("ALL ON");
            }
        });*/
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
