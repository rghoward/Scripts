package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.v5a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileUploadProgressComponentKt {
    public static final ComposableSingletons$FileUploadProgressComponentKt INSTANCE = new ComposableSingletons$FileUploadProgressComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f328lambda1 = new fr1(false, 394689098, ComposableSingletons$FileUploadProgressComponentKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f329lambda2 = new fr1(false, -1444983099, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadProgressComponentKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FileUploadProgressComponentKt.INSTANCE.m487getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m487getLambda1$intercom_sdk_base_release() {
        return f328lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m488getLambda2$intercom_sdk_base_release() {
        return f329lambda2;
    }
}
