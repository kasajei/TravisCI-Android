package com.kasajei.TravisCI_Android;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import com.jayway.android.robotium.solo.Solo;


/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.kasajei.TravisCI_Android.MyActivityTest \
 * com.kasajei.TravisCI_Android.tests/android.test.InstrumentationTestRunner
 */

@TargetApi(Build.VERSION_CODES.CUPCAKE)
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {

    private Solo solo;
    public MyActivityTest() {
        super("com.kasajei.TravisCI_Android", MyActivity.class);
    }

    public void testSimpleMathTest() throws Exception {
        assertTrue(true);
    }


}
