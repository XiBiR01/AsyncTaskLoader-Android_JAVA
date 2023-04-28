package com.example.asynctaskasynctaskloader;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class TaskLoader extends AsyncTaskLoader<String> {
    String s="Loading Finished";
    Context ctx;

    public TaskLoader(@NonNull Context context) {
        super(context);
        this.ctx=context;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
//        Important Method for Task to run
        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        for (int i=0;i<=100;i++){
            try {
                Thread.sleep(50);
                Log.d("___","loadInBackground"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return s;
    }

    @Override
    public void deliverResult(@Nullable String data) {
        super.deliverResult(data);
    }

}
