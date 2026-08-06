package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.bz9;
import defpackage.ci4;
import defpackage.oh4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$3 implements oh4<Integer, bz9> {
    final /* synthetic */ List $items;
    final /* synthetic */ ci4 $span;

    public GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$3(ci4 ci4Var, List list) {
        this.$span = ci4Var;
        this.$items = list;
    }

    public final bz9 invoke(int i) {
        return (bz9) this.$span.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // defpackage.oh4
    public /* bridge */ /* synthetic */ bz9 invoke(Integer num) {
        return invoke(num.intValue());
    }
}
