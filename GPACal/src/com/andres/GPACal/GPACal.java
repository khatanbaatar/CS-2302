package com.andres.GPACal;

import java.text.DecimalFormat;
import java.util.InputMismatchException;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class GPACal extends Activity {
	// Spinners variables that hold Grade Info
	private Spinner grade1Spinner;
	private Spinner grade2Spinner;
	private Spinner grade3Spinner;
	private Spinner grade4Spinner;
	private Spinner grade5Spinner;
	
	// Spinners variables that hold Credit Info
	private Spinner credit1Spinner;
	private Spinner credit2Spinner;
	private Spinner credit3Spinner;
	private Spinner credit4Spinner;
	private Spinner credit5Spinner;
	
	// Creates the adapters variables for credit and grades
	private ArrayAdapter<CharSequence> gradeAdapter;
	private ArrayAdapter<CharSequence> creditAdapter;
	
	private Button calculate;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		LinearLayout myLayout = (LinearLayout) findViewById(R.id.widget29); 
		Drawable d = Drawable.createFromPath("back.jpg");
		//myLayout.setBackgroundColor(Color.MAGENTA); 
		myLayout.setBackgroundDrawable(d);

		CreateSpinners();
	}


	/**
	 * @param grade
	 * @return
	 */
	public double gradeNumber(String grade) {
		double result = 0;
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";
		String f = "F";
		if (grade.compareTo(a) == 0) {
			result = 4;
		} else if (grade.compareTo(b) == 0) {
			result = 3;
		} else if (grade.compareTo(c) == 0) {
			result = 2;
		} else if (grade.compareTo(d) == 0) {
			result = 1;
		} else if (grade.compareTo(f) == 0) {
			result = 0;
		}
		return result;
	}
	
	/**
	 * Creates all the spinner  and creates the Listener for the Calculate button
	 */
	public void CreateSpinners(){
		calculate = (Button) findViewById(R.id.widget35);
		// Creates the info for the first Grade Spinner
		grade1Spinner = (Spinner) findViewById(R.id.grade1);
		gradeAdapter = ArrayAdapter.createFromResource(this,
				R.array.grade_array, android.R.layout.simple_spinner_item);
		gradeAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		grade1Spinner.setAdapter(gradeAdapter);
		// Creates the info for the second Grade Spinner
		grade2Spinner = (Spinner) findViewById(R.id.grade2);
		grade2Spinner.setAdapter(gradeAdapter);
		// Creates the info for the third Grade Spinner
		grade3Spinner = (Spinner) findViewById(R.id.grade3);
		grade3Spinner.setAdapter(gradeAdapter);
		// Creates the info for the fourth Grade Spinner
		grade4Spinner = (Spinner) findViewById(R.id.grade4);
		grade4Spinner.setAdapter(gradeAdapter);
		// Creates the info for the fifth Grade Spinner
		grade5Spinner = (Spinner) findViewById(R.id.grade5);
		grade5Spinner.setAdapter(gradeAdapter);
		// Creates the info for the first Credit Spinner
		credit1Spinner = (Spinner) findViewById(R.id.hours1);
		creditAdapter = ArrayAdapter.createFromResource(this,
				R.array.credit_array, android.R.layout.simple_spinner_item);
		creditAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		credit1Spinner.setAdapter(creditAdapter);
		// Creates the info for the second Credit Spinner
		credit2Spinner = (Spinner) findViewById(R.id.hours2);
		credit2Spinner.setAdapter(creditAdapter);
		// Creates the info for the third Credit Spinner
		credit3Spinner = (Spinner) findViewById(R.id.hours3);
		credit3Spinner.setAdapter(creditAdapter);
		// Creates the info for the fourth credit Spinner
		credit4Spinner = (Spinner) findViewById(R.id.hours4);
		credit4Spinner.setAdapter(creditAdapter);
		// Creates the info for the fifth credit Spinner
		credit5Spinner = (Spinner) findViewById(R.id.hours5);
		credit5Spinner.setAdapter(creditAdapter);
		
		
		
		calculate.setOnClickListener(new View.OnClickListener() {
            /* 
             * 
             */
            public void onClick(View v) {
            	double currentGPA = 0;
            	double attemptedHours = 0;
            	EditText eTGPA = (EditText) findViewById(R.id.widget34);
            	EditText eTHours = (EditText) findViewById(R.id.widget32);
            	try{
            	currentGPA =  Double.parseDouble(eTGPA.getText().toString());
            	attemptedHours = Double.parseDouble(eTHours.getText().toString());
            	}
            	catch(NumberFormatException  nFE){
            		String s = "Please enter numbers only";
            		Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();
            		return;
            	}
            	double currentGradePoints = currentGPA * attemptedHours;
            	double anticipatedCreditHours = 
            	 Double.parseDouble(credit1Spinner.getSelectedItem().toString())
            	+Double.parseDouble(credit2Spinner.getSelectedItem().toString())
            	+Double.parseDouble(credit3Spinner.getSelectedItem().toString())
            	+Double.parseDouble(credit4Spinner.getSelectedItem().toString())
            	+Double.parseDouble(credit5Spinner.getSelectedItem().toString());
            	
            	double anticipatedGradePoints = 
            	 gradeNumber(grade1Spinner.getSelectedItem().toString()) * Double.parseDouble(credit1Spinner.getSelectedItem().toString())
            	+gradeNumber(grade2Spinner.getSelectedItem().toString()) * Double.parseDouble(credit2Spinner.getSelectedItem().toString())
            	+gradeNumber(grade3Spinner.getSelectedItem().toString()) * Double.parseDouble(credit3Spinner.getSelectedItem().toString())
            	+gradeNumber(grade4Spinner.getSelectedItem().toString()) * Double.parseDouble(credit4Spinner.getSelectedItem().toString())
            	+gradeNumber(grade5Spinner.getSelectedItem().toString()) * Double.parseDouble(credit5Spinner.getSelectedItem().toString());
            	
            	
            	
            	double finalGPA = (currentGradePoints + anticipatedGradePoints) / (attemptedHours + anticipatedCreditHours);
            	DecimalFormat gpaFormat = new DecimalFormat("#0.00");
            	String str = gpaFormat.format(finalGPA);
            	Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
            }
        });
	}

}