package io.intercom.android.sdk.m5.preview.ui;

import defpackage.oh4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$2 implements oh4<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ oh4 $key;

    public PreviewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$2(oh4 oh4Var, List list) {
        this.$key = oh4Var;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }

    @Override // defpackage.oh4
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
