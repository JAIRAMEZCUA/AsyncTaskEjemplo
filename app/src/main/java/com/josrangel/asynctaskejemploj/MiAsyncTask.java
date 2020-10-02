package com.josrangel.asynctaskejemploj;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class MiAsyncTask extends AsyncTask<Double,Void,String> {
    PublicaUI publicaUI;

    public MiAsyncTask(PublicaUI publicaUI) {
        this.publicaUI= publicaUI;
    }

    interface PublicaUI{
        void regresa(String resultado);
    }

    @Override
    protected String doInBackground(Double... integers) {
        double serieNumero = integers[0];
        fibonacci(serieNumero);
        Log.e("fibo","lala");
        return String.valueOf(fibonacci(serieNumero));
    }

    public double fibonacci(double x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        return fibonacci(x-1) + fibonacci(x-2);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        this.publicaUI.regresa(s);
    }
}
