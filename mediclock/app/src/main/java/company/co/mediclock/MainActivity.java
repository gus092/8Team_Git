package company.co.mediclock;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/*<<<<<<< Updated upstream

import android.app.Activity;
import android.content.Intent;
import android.content.Intent;
=======
>>>>>>> Stashed changes*/


public class MainActivity extends AppCompatActivity {

    Mainmenu mainmenu;
    Medialarm medialarm;
    Medimorning medimorning;
    Mediname mediname;
    Medirepeat medirepeat;
    Meditime meditime;
    Mediweek mediweek;
    Mediweekdays mediweekdays;
    Mymeditime_hour mymeditime_hour;
    SearchActivity searchactivity;
    ShareActivity shareActivity;
    Description description;
    SeecodeActivity seecodeActivity;
    WritecodeActivity writecodeActivity;
    SearchActivity searchActivity;
    Search_Text search_text;
    ShareAlarm sharealarm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
<<<<<<< Updated upstream
        Button button_search = findViewById(R.id.button);
        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_search = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent_search);
            }
        });

        Button b = (Button)findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        ShareActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
=======*/
        mainmenu = (Mainmenu) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        medialarm = new Medialarm();
        medimorning = new Medimorning();
        mediname = new Mediname();
        medirepeat = new Medirepeat();
        meditime = new Meditime();
        mediweek = new Mediweek(); //activity로 올라가야 정상작동
        mediweekdays = new Mediweekdays();
        mymeditime_hour = new Mymeditime_hour();
        searchactivity = new SearchActivity();
        shareActivity= new ShareActivity();
        description=new Description();
        seecodeActivity=new SeecodeActivity();
        writecodeActivity=new WritecodeActivity();
        searchActivity=new SearchActivity();
        search_text=new Search_Text();
        sharealarm = new ShareAlarm();
    }

    public void onFragmentChanged(int index) {
        if ( index == 0 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainmenu).commit();
        }else if ( index ==1 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, searchactivity).commit();
        }
        else if ( index ==2 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, medimorning).commit();
        }
        else if ( index ==3 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mediname).commit();
        }
        else if ( index ==4 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, shareActivity).commit();
        }
        else if ( index ==5 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, description).commit();
        }
        else if ( index ==6 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, medirepeat).commit();
        }
        else if ( index ==7 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mediweek).commit();
        }
        else if ( index ==8 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mediweekdays).commit();
        }
        else if ( index ==9 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mymeditime_hour).commit();
        }
        else if ( index ==10 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, meditime).commit();
        }
        else if ( index ==11 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, medialarm).commit();
        }
        else if ( index ==12 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, writecodeActivity).commit();
        }
        else if ( index ==13 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, seecodeActivity).commit();
        }
        else if ( index ==14 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, sharealarm).commit();
        }
        else if ( index ==15 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, search_text).commit();
        }
//>>>>>>> Stashed changes
    }
}
