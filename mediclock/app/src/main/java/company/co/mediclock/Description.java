package company.co.mediclock;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Description extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView  = (ViewGroup) inflater.inflate(R.layout.fragment_description, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

        Button bbutton = rootView.findViewById(R.id.home);
        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        return rootView;
    }
}

//            <intent-filter>
//                <action android:name="android.intent.action.MAIN" />
//
//                <category android:name="android.intent.category.LAUNCHER" />
//            </intent-filter> android manifest
/*<activity android:name=".Search_Text" />
<activity android:name=".Mymeditime_hour" />
<activity android:name=".SearchActivity" />
<activity android:name=".WritecodeActivity" />
<activity android:name=".SeecodeActivity" />
<activity android:name=".ShareActivity" />
<activity android:name=".SearchActivity" />
<activity android:name=".MainActivity">
<activity android:name=".Medialarm" />
<activity android:name=".Mediweekdays" />
<activity android:name=".Mediweek" />
<activity android:name=".Medirepeat" />
<activity android:name=".Mymeditime_hour" />
<activity android:name=".Meditime" />
<activity android:name=".Medimorning" />
<activity android:name=".Mediname" />
<activity android:name=".SearchActivity" />*/
