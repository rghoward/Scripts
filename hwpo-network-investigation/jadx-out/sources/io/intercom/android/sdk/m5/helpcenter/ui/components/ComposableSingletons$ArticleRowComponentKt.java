package io.intercom.android.sdk.m5.helpcenter.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.al8;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.zg5;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ArticleRowComponentKt {
    public static final ComposableSingletons$ArticleRowComponentKt INSTANCE = new ComposableSingletons$ArticleRowComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f222lambda1 = new fr1(false, 888336806, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleRowComponentKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ArticleRowComponentKt.ArticleRowComponent(gi0.c(ox6.a.t, zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a), new CollectionDetailsRow.ArticleRow(BuildConfig.FLAVOR, "Lorem Ipsum"), null, jt1Var, 0, 4);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f223lambda2 = new fr1(false, -772569635, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleRowComponentKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ArticleRowComponentKt.ArticleRowComponent(gi0.c(ox6.a.t, zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a), new CollectionDetailsRow.ArticleRow(BuildConfig.FLAVOR, "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"), null, jt1Var, 0, 4);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m311getLambda1$intercom_sdk_base_release() {
        return f222lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m312getLambda2$intercom_sdk_base_release() {
        return f223lambda2;
    }
}
