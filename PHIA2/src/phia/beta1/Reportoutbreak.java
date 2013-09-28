package phia.beta1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Reportoutbreak extends Activity {
	public final static String EXTRA_MESSAGE = "phia.beta1.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reportoutbreak);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reportoutbreak, menu);
		return true;
	}
	public void home(View view) {
        Intent intent = new Intent(this, FullscreenActivity.class);
        startActivity(intent);
	}
	public void outbreak(View view) {
        Intent intent = new Intent(this, Outbreaks.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        EditText editText1 = (EditText) findViewById(R.id.editText3);
        String message = editText.getText().toString()+editText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
	}
	

}
