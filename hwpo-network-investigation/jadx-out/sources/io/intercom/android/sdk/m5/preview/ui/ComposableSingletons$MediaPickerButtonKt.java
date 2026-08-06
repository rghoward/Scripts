package io.intercom.android.sdk.m5.preview.ui;

import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mia;
import defpackage.oy8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MediaPickerButtonKt {
    public static final ComposableSingletons$MediaPickerButtonKt INSTANCE = new ComposableSingletons$MediaPickerButtonKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<oy8, jt1, Integer, g2b> f282lambda1 = new fr1(false, 1113484147, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.ComposableSingletons$MediaPickerButtonKt$lambda-1$1
        public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
            oy8Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                mia.b("Open Picker", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var, 6, 0, 262142);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            invoke(oy8Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f283lambda2 = new fr1(false, 1873711459, ComposableSingletons$MediaPickerButtonKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f284lambda3 = new fr1(false, -1119994382, ComposableSingletons$MediaPickerButtonKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<oy8, jt1, Integer, g2b> m382getLambda1$intercom_sdk_base_release() {
        return f282lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m383getLambda2$intercom_sdk_base_release() {
        return f283lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m384getLambda3$intercom_sdk_base_release() {
        return f284lambda3;
    }
}
