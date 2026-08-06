package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ws0;
import defpackage.xr1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileUploadErrorComponentKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$FileUploadErrorComponentKt$lambda3$1 INSTANCE = new ComposableSingletons$FileUploadErrorComponentKt$lambda3$1();

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(jt1 jt1Var, int i) {
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        Answer.MediaAnswer.FileUploadError.UploadFailed uploadFailed = new Answer.MediaAnswer.FileUploadError.UploadFailed(ws0.h(new StringProvider.StringRes(R.string.intercom_upload_failed, null, i3, 0 == true ? 1 : 0)));
        jt1Var.K(-1166604675);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new e();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, -1166603523);
        if (objA == c0187a) {
            objA = new f();
            jt1Var.C(objA);
        }
        jt1Var.B();
        FileUploadErrorComponentKt.FileUploadErrorComponent("Error", uploadFailed, mh4Var, (mh4) objA, jt1Var, 3462);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
