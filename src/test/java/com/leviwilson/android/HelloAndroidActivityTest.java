package com.leviwilson.android;

import static com.leviwilson.android.R.id;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import android.widget.TextView;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

    private HelloAndroidActivity activity;

    @Before
        public void setUp() {
            activity = new HelloAndroidActivity();
            activity.onCreate(null);
        }

    @Test
        public void itProperlyGreetsYou() {
            assertThat(textOf(id.greet_them), equalTo("Hello android-travis-ci-example!"));
        }

    private String textOf(int id) {
        final TextView textView = (TextView)activity.findViewById(id);
        return textView.getText().toString();
    }
}
