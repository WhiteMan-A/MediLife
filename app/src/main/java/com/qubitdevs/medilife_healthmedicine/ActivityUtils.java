package com.qubitdevs.medilife_healthmedicine;

import android.content.Context;
import android.content.Intent;

public class ActivityUtils {

    public static void skippable(Context context) {
        try {
            Intent intent = new Intent(context, LogInActivity.class);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
