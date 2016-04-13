package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.jdelcerr.testproject.MainActivity;
import com.example.jdelcerr.testproject.R;

/**
 * Created by jdelcerr on 4/13/2016.
 */
 public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;

    public JUnit_test() {

        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
    }

    public void testFirst(){
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Bye World", tester);
    }
}

