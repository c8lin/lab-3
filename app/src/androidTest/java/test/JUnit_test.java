package test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.wlw003.myapplication.MainActivity;
import com.example.wlw003.myapplication.R;

/**
 * Created by wlw003 on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test()
    {
        super(MainActivity.class);
    }
    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }

}
