package com.hyb.preventkeyboardblock;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hyb.library.PreventKeyboardBlockUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConstraintLayoutActivity extends AppCompatActivity {

    @BindView(R.id.et_account)
    EditText etAccount;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.btn_submit)
    Button btnSubmit;
    @BindView(R.id.tv_forget)
    TextView tvForget;
    @BindView(R.id.cl_content)
    ConstraintLayout clContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        PreventKeyboardBlockUtil.getInstance(this).setBtnView(btnSubmit).setContentLayout(clContent).register();

    }
}
