package com.example.koli.cameraapp;

import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;

/**
 * Created by Koli on 1/28/2016.
 */
public class ShowCamera extends SurfaceView implements SurfaceHolder.Callback {

    private Camera cam;

    public ShowCamera(){
        super(null);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            cam.setPreviewDisplay(surfaceHolder);
            cam.startPreview();
        }catch (Exception e){
            Toast.makeText(this.getContext(),"Error On Camera",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
