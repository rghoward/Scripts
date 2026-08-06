package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.g2b;
import defpackage.mh4;
import defpackage.pi4;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class HelpCenterScreenKt$HelpCenterScreen$1$1$1 extends pi4 implements mh4<g2b> {
    public HelpCenterScreenKt$HelpCenterScreen$1$1$1(Object obj) {
        super(0, obj, HelpCenterViewModel.class, "onRetryOpen", "onRetryOpen()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HelpCenterViewModel) this.receiver).onRetryOpen();
    }

    @Override // defpackage.mh4
    public /* bridge */ /* synthetic */ g2b invoke() {
        invoke2();
        return g2b.a;
    }
}
