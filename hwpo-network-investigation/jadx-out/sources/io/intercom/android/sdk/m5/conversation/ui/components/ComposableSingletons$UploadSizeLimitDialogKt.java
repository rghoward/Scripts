package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mia;
import defpackage.nr1;
import defpackage.oy8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$UploadSizeLimitDialogKt {
    public static final ComposableSingletons$UploadSizeLimitDialogKt INSTANCE = new ComposableSingletons$UploadSizeLimitDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<oy8, jt1, Integer, g2b> f114lambda1 = new fr1(false, 133212014, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-1$1
        public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
            oy8Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            String strF = nr1.f(jt1Var, R.string.intercom_ok);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            mia.b(strF, null, intercomTheme.getColors(jt1Var, i2).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04SemiBold(), jt1Var, 0, 0, 131066);
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            invoke(oy8Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f115lambda2 = new fr1(false, 1891807555, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                UploadSizeLimitDialogKt.UploadSizeLimitDialog("Couldn't send", "Can't send files over 100MB", null, jt1Var, 54, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<oy8, jt1, Integer, g2b> m145getLambda1$intercom_sdk_base_release() {
        return f114lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m146getLambda2$intercom_sdk_base_release() {
        return f115lambda2;
    }
}
