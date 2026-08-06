package io.intercom.android.sdk.m5.preview.ui;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.ui.ComposableSingletons$MediaPickerButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(List list) {
        list.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(502111753);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new b();
            jt1Var.C(objF);
        }
        jt1Var.B();
        MediaPickerButtonKt.MediaPickerButton(1, null, null, null, (oh4) objF, new MediaPickerButtonCTAStyle.TextButton("Open Picker"), false, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m383getLambda2$intercom_sdk_base_release(), jt1Var, 100687878, 206);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
