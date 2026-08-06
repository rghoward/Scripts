package io.intercom.android.sdk.m5.helpcenter.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CollectionRowComponentKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$CollectionRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$CollectionRowComponentKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        CollectionRowData collectionRowData = new CollectionRowData(BuildConfig.FLAVOR, "Lorem Ipsum Dolor Sit", 0, "Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit", 3, 2);
        jt1Var.K(1690124933);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new b();
            jt1Var.C(objF);
        }
        jt1Var.B();
        CollectionRowComponentKt.CollectionRowComponent(collectionRowData, (oh4) objF, null, jt1Var, 48, 4);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
