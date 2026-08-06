package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$IntercomErrorScreenKt {
    public static final ComposableSingletons$IntercomErrorScreenKt INSTANCE = new ComposableSingletons$IntercomErrorScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f48lambda1 = new fr1(false, 1523325281, ComposableSingletons$IntercomErrorScreenKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f49lambda2 = new fr1(false, 918596779, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomErrorScreenKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                IntercomErrorScreenKt.IntercomErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, jt1Var, 0, 2);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m61getLambda1$intercom_sdk_base_release() {
        return f48lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m62getLambda2$intercom_sdk_base_release() {
        return f49lambda2;
    }
}
