package android.fullsail.com.project_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String addedText;

    // TAG
    String TAG = "Employee Project";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add to Array List for Employees
        final ArrayList<String> employeeArray = new ArrayList<>();
        employeeArray.add("Jack");
        employeeArray.add("Kenn");
        employeeArray.add("Britney");
        employeeArray.add("Rick");
        employeeArray.add("Elena");

        // Verifying items in Array
        for (String test : employeeArray )
        Log.i(TAG,test.toString());


        // Setup for Number Of Employees
        TextView numberOfEmployees = (TextView) findViewById(R.id.numberEmployee);
        String number = Integer.toString(employeeArray.size());
        numberOfEmployees.setText(number);

        // Setup for Average Length
        TextView averageLength = (TextView) findViewById(R.id.averageNumber);
        averageLength.setText("0");

        // Add & Find BUTTON SETUP
        Button theAddButon = (Button) findViewById(R.id.addButton);
        Button theFindButton = (Button) findViewById(R.id.findButton);

        // Add Button OnClickListener
        theAddButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Setup Variables
                final TextView currentTextLbl = (TextView) findViewById(R.id.currentText);
                TextView numberOfEmployees = (TextView) findViewById(R.id.numberEmployee);
                TextView averageLength = (TextView) findViewById(R.id.averageNumber);

                // Adding "User Text" to Employee Array
                addedText = currentTextLbl.getText().toString();
                employeeArray.add(addedText);

                // Change Number of Employees
                String number = Integer.toString(employeeArray.size());
                numberOfEmployees.setText(number);

                // Average


                // Verifying User Text has been added.
                for (String test : employeeArray )
                    Log.i(TAG,test.toString());

            }
        });


        theFindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText findText = (EditText) findViewById(R.id.findEmployee);

                String currentText;
                int currentInt;
            }
        });




    } // End of onCreate





}
