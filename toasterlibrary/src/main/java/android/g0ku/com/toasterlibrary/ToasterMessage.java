package android.g0ku.com.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {


    public static void show(Context ctx, String msg){

        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }
}
