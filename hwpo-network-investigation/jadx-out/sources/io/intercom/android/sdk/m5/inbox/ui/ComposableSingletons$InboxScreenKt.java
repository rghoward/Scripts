package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InboxScreenKt {
    public static final ComposableSingletons$InboxScreenKt INSTANCE = new ComposableSingletons$InboxScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f270lambda1 = new fr1(false, 1159748024, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                InboxLoadingScreenKt.InboxLoadingScreen(jt1Var, 0);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f271lambda2 = new fr1(false, -1973363979, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                m65.b(is7.a(R.drawable.intercom_ic_edit, jt1Var, 0), null, null, 0L, jt1Var, 56, 12);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f272lambda3 = new fr1(false, 712457106, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-3$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                InboxScreenKt.InboxLoadingRow(jt1Var, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f273lambda4 = new fr1(false, 1264126558, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-4$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                InboxLoadingScreenKt.InboxLoadingScreen(jt1Var, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m370getLambda1$intercom_sdk_base_release() {
        return f270lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m371getLambda2$intercom_sdk_base_release() {
        return f271lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m372getLambda3$intercom_sdk_base_release() {
        return f272lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m373getLambda4$intercom_sdk_base_release() {
        return f273lambda4;
    }
}
