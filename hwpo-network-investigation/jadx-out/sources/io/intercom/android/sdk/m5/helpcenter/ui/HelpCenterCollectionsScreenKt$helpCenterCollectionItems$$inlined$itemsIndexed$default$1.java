package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.ci4;
import defpackage.oh4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1 implements oh4<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ ci4 $key;

    public HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1(ci4 ci4Var, List list) {
        this.$key = ci4Var;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // defpackage.oh4
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
