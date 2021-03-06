package nz.co.nonameden.spotifystreamer.ui;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import nz.co.nonameden.spotifystreamer.R;
import nz.co.nonameden.spotifystreamer.ui.base.BaseActivity;


/**
 * Created by nonameden on 6/06/15.
 */
public class SettingsActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);
    }

    public static class SettingsFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.spotify_settings);
        }
    }
}
