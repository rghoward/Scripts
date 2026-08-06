package io.intercom.android.sdk.helpcenter.articles;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.xr1;

/* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ReactionsComponentKt$lambda5$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ReactionsComponentKt$lambda5$1 INSTANCE = new ComposableSingletons$ReactionsComponentKt$lambda5$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ArticleViewState.ReactionState reactionStateCopy$default = ArticleViewState.ReactionState.copy$default(ArticleViewState.ReactionState.Companion.getDefaultReactionState(), 0, ArticleViewState.Reaction.Neutral, 0, false, 13, null);
        jt1Var.K(1121629440);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new g();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, 1121630848);
        if (objA == c0187a) {
            objA = new h();
            jt1Var.C(objA);
        }
        mh4 mh4Var2 = (mh4) objA;
        Object objA2 = xr1.a(jt1Var, 1121632192);
        if (objA2 == c0187a) {
            objA2 = new i();
            jt1Var.C(objA2);
        }
        jt1Var.B();
        ReactionsComponentKt.ReactionsComponent(null, reactionStateCopy$default, mh4Var, mh4Var2, (mh4) objA2, jt1Var, 28032, 1);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
