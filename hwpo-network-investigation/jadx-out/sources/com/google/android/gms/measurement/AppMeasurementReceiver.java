package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.fjc;
import defpackage.fkb;
import defpackage.thc;
import defpackage.tkc;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends fkb {
    public fjc c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new fjc(this);
        }
        fjc fjcVar = this.c;
        fjcVar.getClass();
        thc thcVar = tkc.s(context, null, null, null).f;
        tkc.m(thcVar);
        if (intent == null) {
            thcVar.i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        thcVar.n.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                thcVar.i.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        thcVar.n.a("Starting wakeful intent.");
        fjcVar.a.getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = fkb.a;
        synchronized (sparseArray) {
            try {
                int i = fkb.b;
                int i2 = i + 1;
                fkb.b = i2;
                if (i2 <= 0) {
                    fkb.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
