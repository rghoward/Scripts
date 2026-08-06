package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a78;
import defpackage.ay2;
import defpackage.b9c;
import defpackage.e04;
import defpackage.hv5;
import defpackage.kq1;
import defpackage.m4a;
import defpackage.mec;
import defpackage.nxb;
import defpackage.qp1;
import defpackage.r66;
import defpackage.si;
import defpackage.ti;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static si lambda$getComponents$0(kq1 kq1Var) {
        e04 e04Var = (e04) kq1Var.a(e04.class);
        Context context = (Context) kq1Var.a(Context.class);
        m4a m4aVar = (m4a) kq1Var.a(m4a.class);
        a78.g(e04Var);
        a78.g(context);
        a78.g(m4aVar);
        a78.g(context.getApplicationContext());
        if (ti.c == null) {
            synchronized (ti.class) {
                try {
                    if (ti.c == null) {
                        Bundle bundle = new Bundle(1);
                        e04Var.a();
                        if ("[DEFAULT]".equals(e04Var.b)) {
                            m4aVar.b(b9c.t, nxb.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", e04Var.h());
                        }
                        ti.c = new ti(mec.e(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ti.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        qp1.a aVarB = qp1.b(si.class);
        aVarB.a(ay2.c(e04.class));
        aVarB.a(ay2.c(Context.class));
        aVarB.a(ay2.c(m4a.class));
        aVarB.f = hv5.t;
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), r66.a("fire-analytics", "23.2.0"));
    }
}
