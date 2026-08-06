package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.ac4;
import defpackage.ef0;
import defpackage.kh;
import defpackage.l4b;
import defpackage.o98;
import defpackage.pxa;
import defpackage.r98;
import defpackage.v4b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        pxa.b(context);
        if (queryParameter == null) {
            ac4.c("Null backendName");
            return;
        }
        o98 o98VarB = r98.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        v4b v4bVar = pxa.a().d;
        v4bVar.e.execute(new l4b(v4bVar, new ef0(queryParameter, bArrDecode, o98VarB), i, new kh()));
    }
}
