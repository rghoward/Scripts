package io.intercom.android.sdk.ui.component;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$PermissionDeniedDialogKt {
    public static final ComposableSingletons$PermissionDeniedDialogKt INSTANCE = new ComposableSingletons$PermissionDeniedDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f386lambda1 = new fr1(false, -593234401, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PermissionDeniedDialogKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, "Audio permission is required to use voice input. Please enable it in the app settings.", "Settings", "Not now", Integer.valueOf(R.drawable.intercom_ic_microphone), null, null, jt1Var, 3504, 97);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m566getLambda1$intercom_sdk_ui_release() {
        return f386lambda1;
    }
}
