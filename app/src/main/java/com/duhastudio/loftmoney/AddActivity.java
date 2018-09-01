package com.duhastudio.loftmoney;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {


    private EditText nameInput;
    private EditText priceInput;
    private Button addBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        nameInput = findViewById(R.id.name);
        priceInput = findViewById(R.id.price);
        addBtn = findViewById(R.id.add_btn);

        nameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) { }

            @Override
            public void afterTextChanged(Editable editable) {
             addBtn.setEnabled(TextUtils.isEmpty(editable));
            }
        });
        priceInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) { }

            @Override
            public void afterTextChanged(Editable editable) {
                addBtn.setEnabled(!TextUtils.isEmpty(editable));
            }
        });
    }
}
