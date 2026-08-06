package io.intercom.android.sdk.m5.home.ui;

import defpackage.aj1;
import defpackage.b47;
import defpackage.bt1;
import defpackage.c30;
import defpackage.di;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jv;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeScreenKt {
    public static final ComposableSingletons$HomeScreenKt INSTANCE = new ComposableSingletons$HomeScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<jv, jt1, Integer, g2b> f239lambda1 = new fr1(false, -613291133, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeScreenKt$lambda-1$1
        public final void invoke(jv jvVar, jt1 jt1Var, int i) {
            jvVar.getClass();
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            b47.b(jt1Var, ir9.d(aVar, 32.0f));
            LoadingScreenKt.LoadingScreen(null, R.drawable.intercom_content_loading, jt1Var, 0, 1);
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var, Integer num) {
            invoke(jvVar, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<jv, jt1, Integer, g2b> m337getLambda1$intercom_sdk_base_release() {
        return f239lambda1;
    }
}
