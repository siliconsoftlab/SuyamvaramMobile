package thanjai.it.com.suyamvaram.view;

import android.support.v4.app.Fragment;

public class ListActivity extends AbstractFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new MatchesListFragment();
    }
}
