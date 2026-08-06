package io.intercom.android.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class ActivityLifecycleHandler extends Handler {
    private static final int ESTIMATED_ACTIVITY_TRANSITION_DURATION_MS = 500;
    static final int PAUSED_CODE = 2;
    static final int READY_FOR_VIEW_CODE = 1;
    static final int RESUMED_CODE = 0;
    static final int STOPPED_CODE = 3;
    private final IntercomDataLayer dataLayer;
    private final long readyForViewDelayMs;
    private final Twig twig;

    public ActivityLifecycleHandler(Looper looper, float f, IntercomDataLayer intercomDataLayer) {
        super(looper);
        this.twig = LumberMill.getLogger();
        this.readyForViewDelayMs = (long) (f * 500.0f);
        this.dataLayer = intercomDataLayer;
    }

    public static Message getMessage(int i, Activity activity) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = activity;
        return messageObtain;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Activity activity = (Activity) message.obj;
        int i = message.what;
        if (i == 0) {
            sendMessageAfterDelay(getMessage(1, activity), this.readyForViewDelayMs);
            return;
        }
        if (i == 1) {
            this.twig.i("Ready to show in-app messages in " + activity, new Object[0]);
            this.dataLayer.emitEvent(new IntercomEvent.ActivityReadyForViewAttachment(activity));
            this.dataLayer.activityReadyForViewAttachment(activity);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.dataLayer.emitEvent(new IntercomEvent.ActivityStopped(activity));
            this.dataLayer.activityStopped(activity);
            return;
        }
        this.twig.i(activity + " was paused", new Object[0]);
        this.dataLayer.emitEvent(new IntercomEvent.ActivityPaused(activity));
        this.dataLayer.activityPaused(activity);
    }

    public void sendMessageAfterDelay(Message message, long j) {
        sendMessageDelayed(message, j);
    }
}
