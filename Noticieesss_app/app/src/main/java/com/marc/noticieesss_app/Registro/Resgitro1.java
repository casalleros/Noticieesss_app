package com.marc.noticieesss_app.Registro;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.marc.noticieesss_app.R;

public class Resgitro1 extends Fragment implements View.OnClickListener{
    private EditText userName;
    private EditText passw;
    private EditText repeatPassw;
    private EditText email;
    private Button siguiente;
    private Button cancelar;

    private Usuario user;


    public Resgitro1() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_resgitro1, container, false);

        userName = v.findViewById(R.id.et_registro1_userName);
        passw = v.findViewById(R.id.et_registro1_password);
        repeatPassw = v.findViewById(R.id.et_registro1_repeatPassword);
        email = v.findViewById(R.id.et_registro1_email);
        siguiente = v.findViewById(R.id.btn_registro1_siguiente);
        cancelar = v.findViewById(R.id.btn_registro1_cancelar);

        siguiente.setOnClickListener(this);
        cancelar.setOnClickListener(this);

        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_registro1_siguiente)
        {
            if(comprobarLosCampos())
            {
                //pasar los datos a registro2
            }
        }
    }

    private boolean comprobarLosCampos()
    {
        String txtUser = userName.getText().toString();
        String txtPassw = passw.getText().toString();
        String txtRepeatPassw = repeatPassw.getText().toString();
        String txtEmail = email.getText().toString();
        boolean validado = true;

        if (!txtUser.isEmpty())
        {
            if (!txtEmail.isEmpty())
            {
                if (!txtPassw.isEmpty())
                {
                    if (txtPassw==txtRepeatPassw)
                    {
                        validado = true;
                    }
                }
                else {
                    validado = false;
                }
            }
            else
            {
                validado = false;
            }
        }
        else
        {
            validado = false;
        }
        return validado;
    }
}
