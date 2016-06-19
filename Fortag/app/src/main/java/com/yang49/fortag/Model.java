package com.yang49.fortag;

import android.app.Activity;
import android.widget.TextView;



/**
 * Created by yang on 06/06/16.
 * Model for Fortag
 */
public class Model {
    Activity myact = null;
    String ip = "107.180.3.73";
    TextView tmp;
    Model(Activity act) {
        this.myact = act;
        tmp = (TextView) act.findViewById(R.id.result);
    }
}
