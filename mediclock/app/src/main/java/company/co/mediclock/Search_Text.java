package company.co.mediclock;
<<<<<<< HEAD
/*<<<<<<< Updated upstream:mediclock/app/src/main/java/company/co/mediclock/Search_ResultList.java

import androidx.appcompat.app.AppCompatActivity;

=======
>>>>>>> Stashed changes:mediclock/app/src/main/java/company/co/mediclock/ShareActiviry.java*/

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

/*<<<<<<< Updated upstream:mediclock/app/src/main/java/company/co/mediclock/Search_ResultList.java
public class Search_ResultList extends AppCompatActivity {
=======

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Search_Text extends AppCompatActivity {
>>>>>>> master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_search_list);
    }
=======
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ShareActiviry extends Fragment {
 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_share);
    }
 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
     ViewGroup rootView  = (ViewGroup) inflater.inflate(R.layout.fragment_share, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

     Button bbutton = rootView.findViewById(R.id.button6);
     bbutton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v){
             MainActivity activity = (MainActivity) getActivity();
             activity.onFragmentChanged(0);
         }
     });
     return rootView;
 }
>>>>>>> Stashed changes:mediclock/app/src/main/java/company/co/mediclock/ShareActiviry.java*/

public class Search_Text extends Fragment {
    /*
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_search__text);
        }
    }*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_search_list, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

        Button bbutton = rootView.findViewById(R.id.result_btn1);
        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        return rootView;
    }
}

=======
        setContentView(R.layout.activity_search__text);
    }
}
>>>>>>> master
