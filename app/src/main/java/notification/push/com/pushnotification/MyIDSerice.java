package notification.push.com.pushnotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Mujahid on 5/17/2018.
 */

public class MyIDSerice extends FirebaseInstanceIdService {
    private static final String REG_TOKEN = "REG_TOK";

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,token);
    }
}
