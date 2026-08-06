package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import defpackage.adc;
import defpackage.aec;
import defpackage.bdc;
import defpackage.cec;
import defpackage.ibc;
import defpackage.mec;
import defpackage.tnc;
import defpackage.ucc;
import defpackage.vcc;
import defpackage.zdc;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {
    public final mec a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a extends tnc {
    }

    public AppMeasurementSdk(mec mecVar) {
        this.a = mecVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return mec.e(context, null).b;
    }

    public final void a(a aVar) {
        mec mecVar = this.a;
        ArrayList arrayList = mecVar.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (aVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            cec cecVar = new cec(aVar);
            arrayList.add(new Pair(aVar, cecVar));
            if (mecVar.f != null) {
                try {
                    mecVar.f.registerOnMeasurementEventListener(cecVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            mecVar.c(new zdc(mecVar, cecVar));
        }
    }

    public void beginAdUnitExposure(String str) {
        mec mecVar = this.a;
        mecVar.c(new ucc(mecVar, str));
    }

    public void endAdUnitExposure(String str) {
        mec mecVar = this.a;
        mecVar.c(new vcc(mecVar, str));
    }

    public long generateEventId() {
        return this.a.g();
    }

    public String getAppInstanceId() {
        ibc ibcVar = new ibc();
        mec mecVar = this.a;
        mecVar.c(new bdc(mecVar, ibcVar));
        return (String) ibc.i(ibcVar.g(50L), String.class);
    }

    public String getGmpAppId() {
        ibc ibcVar = new ibc();
        mec mecVar = this.a;
        mecVar.c(new adc(mecVar, ibcVar));
        return (String) ibc.i(ibcVar.g(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        mec mecVar = this.a;
        mecVar.c(new aec(mecVar, str, str2, bundle));
    }
}
