package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.caa;
import defpackage.jg1;
import defpackage.kg1;
import defpackage.nu6;
import defpackage.wt3;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends kg1 {
    @Override // defpackage.kg1
    public final int a(Context context, jg1 jg1Var) {
        try {
            return ((Integer) caa.a(new wt3(context).b(jg1Var.t))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.kg1
    public final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (nu6.d(intentPutExtras)) {
            nu6.c(intentPutExtras.getExtras(), "_nd");
        }
    }
}
