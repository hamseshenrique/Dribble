package br.com.hms.dribble;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class DribbleDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dribble_detail);
        if (savedInstanceState == null) {

            final Bundle bundle = getIntent().getExtras();
            final DribbleDetailFragment dribbleDetailFragment = new DribbleDetailFragment();

            dribbleDetailFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, dribbleDetailFragment)
                    .commit();
        }
    }
}
