package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.a78;
import defpackage.caa;
import defpackage.e04;
import defpackage.krc;
import defpackage.lcc;
import defpackage.mec;
import defpackage.s04;
import defpackage.scc;
import defpackage.t04;
import defpackage.wbc;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final mec a;

    public FirebaseAnalytics(mec mecVar) {
        a78.g(mecVar);
        this.a = mecVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(mec.e(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static krc getScionFrontendApiImplementation(Context context, Bundle bundle) {
        mec mecVarE = mec.e(context, bundle);
        if (mecVarE == null) {
            return null;
        }
        return new wbc(mecVarE);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = s04.m;
            return (String) caa.b(((s04) e04.c().b(t04.class)).getId(), AudioConstants.TRANSCRIPTION_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        lcc lccVarJ = lcc.j(activity);
        mec mecVar = this.a;
        mecVar.getClass();
        mecVar.c(new scc(mecVar, lccVarJ, str, str2));
    }
}
