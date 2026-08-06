package io.intercom.android.sdk.m5.preview.ui;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;
import io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class PreviewRootScreenKt$PreviewRootScreen$2$1 extends pi4 implements oh4<Integer, g2b> {
    public PreviewRootScreenKt$PreviewRootScreen$2$1(Object obj) {
        super(1, obj, PreviewViewModel.class, "onPageNavigated", "onPageNavigated$intercom_sdk_base_release(I)V", 0);
    }

    @Override // defpackage.oh4
    public /* bridge */ /* synthetic */ g2b invoke(Integer num) {
        invoke(num.intValue());
        return g2b.a;
    }

    public final void invoke(int i) {
        ((PreviewViewModel) this.receiver).onPageNavigated$intercom_sdk_base_release(i);
    }
}
