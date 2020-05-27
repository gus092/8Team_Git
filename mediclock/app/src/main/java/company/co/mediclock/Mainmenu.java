package company.co.mediclock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Mainmenu extends Fragment {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_mainmenu, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

        Button bbutton1 = rootView.findViewById(R.id.button1);
        bbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(1);
            }
        });

        Button bbutton2 = rootView.findViewById(R.id.button2);
        bbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(2);
            }
        });

        Button bbutton3 = rootView.findViewById(R.id.button3);
        bbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(3);
            }
        });

        Button bbutton4 = rootView.findViewById(R.id.button4);
        bbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(14);
            }
        });

        Button bbutton5 = rootView.findViewById(R.id.button5);
        bbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(5);
            }
        });
        return rootView;
    }
}
