package com.hwpo_training_app.host.fcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.hwpo_training_app.host.presentation.HostActivity;
import com.intercom.twig.BuildConfig;
import defpackage.bn8;
import defpackage.dd7;
import defpackage.du3;
import defpackage.h92;
import defpackage.id7;
import defpackage.j04;
import defpackage.kx4;
import defpackage.l92;
import defpackage.qs2;
import defpackage.u;
import defpackage.xg5;
import defpackage.xj5;
import defpackage.z90;
import defpackage.zm8;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseMessagingService extends kx4 {
    public static final a Companion = new a();
    public final j04 w = j04.a();
    public qs2 x;
    public du3 y;
    public xg5 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(zm8 zm8Var) {
        zm8Var.getClass();
        super.onMessageReceived(zm8Var);
        xg5 xg5Var = this.z;
        if (xg5Var == null) {
            xj5.e("intercom");
            throw null;
        }
        boolean zF = xg5Var.f(zm8Var.j());
        if (zF) {
            xg5 xg5Var2 = this.z;
            if (xg5Var2 != null) {
                xg5Var2.c(zm8Var.j());
                return;
            } else {
                xj5.e("intercom");
                throw null;
            }
        }
        if (zF) {
            u.b();
            return;
        }
        qs2 qs2Var = this.x;
        if (qs2Var == null) {
            xj5.e("notificationManager");
            throw null;
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        int iHashCode = zm8Var.hashCode();
        String str = (String) zm8Var.j().get("title");
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str3 = (String) zm8Var.j().get("body");
        if (str3 != null) {
            str2 = str3;
        }
        HashMap mapJ = zm8Var.j();
        Intent intent = new Intent(applicationContext, (Class<?>) HostActivity.class);
        id7.a aVar = id7.Companion;
        Object obj = mapJ.get("type");
        if (obj == null) {
            z90.a("Required value was null.");
            return;
        }
        aVar.getClass();
        id7 id7VarA = id7.a.a((String) obj);
        intent.putExtra("NOTIFICATION_TYPE", "notification_created");
        if (bn8.a[id7VarA.ordinal()] != 1) {
            u.b();
            return;
        }
        intent.putExtra("NOTIFICATION_JSON", (String) mapJ.get("values"));
        intent.setAction("HWPO Client Action");
        PendingIntent activity = PendingIntent.getActivity(applicationContext, intent.hashCode(), intent, 201326592);
        activity.getClass();
        qs2Var.c(new dd7(iHashCode, str, str2, activity));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        super.onNewToken(str);
        l92 l92Var = this.w.a;
        l92Var.o.a.b(new h92(l92Var, System.currentTimeMillis() - l92Var.d, "FirebaseMessagingService: onNewToken called"));
        du3 du3Var = this.y;
        if (du3Var != null) {
            du3Var.b(str);
        } else {
            xj5.e("fcmStorage");
            throw null;
        }
    }
}
