package android.fullsail.com.project_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
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

    //Add to Array List for Employees
    final ArrayList<String> employeeArray = new ArrayList<>();


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        // Alert - USER INFORMATION - Add Employee
        new AlertDialog.Builder(MainActivity.this)
            .setTitle("How To Add Employees")
            .setMessage("To add employees, simply click on 'Add Employee Name' and type in the employees name you would like to add. Then simply click the 'Add' button. ")
            .setCancelable(false)
            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    // Alert - USER INFORMATION - Find Employee
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("How To Find Employees")
                            .setMessage("To find an employee, simply type in 0-4. If more employees are added, feel free to use type higher numbers to find the empployee you are looking for.")
                            .setCancelable(false)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {


                                }
                            }).create().show();

                }
            }).create().show();



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
                float total = getAverage();
                averageLength.setText(Float.toString(total));

                // Verifying User Text has been added.
                for (String test : employeeArray )
                    Log.i(TAG,test.toString());

            }
        });


        theFindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText findText = (EditText) findViewById(R.id.findEmployee);

                // Setup for user input
                String currentText = findText.getText().toString();
                int findInt = Integer.parseInt(currentText);

                // Alert Dialog
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Employee")
                        .setMessage(employeeArray.get(findInt).toUpperCase())
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        }).create().show();
            }
        });







    } // End of onCreate


    // CUSTOM METHOD FOR AVERAGE LENGTH
    public float getAverage(){

        float count = 0;
        float totalAverage = 0;

        for (int i = 0; i < employeeArray.size(); i++) {
            String character = employeeArray.get(i);
            int charLength = character.length();
            count = count + charLength;
            totalAverage = count/employeeArray.size();

        }

        return totalAverage;
    }



}
