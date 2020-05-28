package company.co.mediclock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mediname extends AppCompatActivity {
        String name;
        EditText editText;
        TextView textView2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setContentView(R.layout.activity_main);

            showToast("onCreate 호출됨"); //방향 이벤트에 관한 것 -> 가로로 돌려지면?

            editText = findViewById(R.id.editText);
           // textView2 = findViewById(R.id.textView2);

            Button button = findViewById(R.id.button);
            if ( button !=null) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText != null) {
                            name = editText.getText().toString();
                            showToast("약 이름을 알람에 설정하였습니다.");
                        }
                    }
                });
            }
            if(savedInstanceState != null) {
                if(textView2 != null) {
                    name = savedInstanceState.getString("name");
                    textView2.setText(name);

                    showToast("값을 복원했습니다 : " + name);
                }
            }
        }


        @Override
        protected void onSaveInstanceState(@NonNull Bundle outState) {
            super.onSaveInstanceState(outState);

            outState.putString ("name", name);
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();

            showToast("onDestroy 호출됨");


        };


        public void showToast(String data) {
            Toast.makeText( this, data, Toast.LENGTH_SHORT).show();
        }
    }
