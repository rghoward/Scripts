package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rvb extends rwb {
    public final Context a;
    public final /* synthetic */ wn4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvb(wn4 wn4Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = wn4Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = xn4.a;
        wn4 wn4Var = this.b;
        Context context = this.a;
        int iB = wn4Var.b(context, i2);
        AtomicBoolean atomicBoolean = co4.a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = wn4Var.a(context, "n", iB);
            wn4Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
