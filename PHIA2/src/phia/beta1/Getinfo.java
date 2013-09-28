package phia.beta1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Getinfo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_getinfo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.getinfo, menu);
		return true;
	}
	public void home(View view) {
        Intent intent = new Intent(this, FullscreenActivity.class);
        startActivity(intent);
	}
	public void outbreak(View view) {
        Intent intent = new Intent(this, Outbreaks.class);
        startActivity(intent);
        
	}
	public void contact(View view) {
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
	}

}
