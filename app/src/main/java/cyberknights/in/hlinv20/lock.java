package cyberknights.in.hlinv20;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by loga on 05-03-2016.
 */
public class lock extends Activity{
    RadioGroup lock_radio;
    RadioButton pass_radio , geo_radio , network_radio , none_radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lock);
    }
}
