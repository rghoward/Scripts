package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ci4;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.v5a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LazyMessageListKt {
    public static final ComposableSingletons$LazyMessageListKt INSTANCE = new ComposableSingletons$LazyMessageListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f93lambda1 = new fr1(false, 1002694257, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-1$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                dv0.a(ir9.c(ox6.a.t, 1.0f), jt1Var, 6);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f94lambda2 = new fr1(false, 829029502, ComposableSingletons$LazyMessageListKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f95lambda3 = new fr1(false, 1588713059, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m125getLambda2$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m124getLambda1$intercom_sdk_base_release() {
        return f93lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m125getLambda2$intercom_sdk_base_release() {
        return f94lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m126getLambda3$intercom_sdk_base_release() {
        return f95lambda3;
    }
}
