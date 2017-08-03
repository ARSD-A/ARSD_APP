package com.samridhi.arsdf;

/**
 * Created by Samridhi on 29-06-2017.
 */
import android.util.Log;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

//Class extending FirebaseInstanceIdService
public class fcm_id extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token on logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        Intent intent = new Intent(this, EventActivity.class);
        startService(intent);



    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}
