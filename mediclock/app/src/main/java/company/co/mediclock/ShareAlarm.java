package company.co.mediclock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class ShareAlarm extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_sharealarm, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

        Button bbutton = rootView.findViewById(R.id.seecode);
        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(13);
            }
        });
        Button bbutton2 = rootView.findViewById(R.id.writecode);
        bbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(12);
            }
        });
        return rootView;
    }
}
