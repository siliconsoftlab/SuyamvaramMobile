package thanjai.it.com.suyamvaram.unwanted;

import android.support.v4.app.Fragment;

import thanjai.it.com.suyamvaram.view.AbstractFragmentActivity;

public class BeatBoxActivity extends AbstractFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new BeatBoxFragment();
    }
}
