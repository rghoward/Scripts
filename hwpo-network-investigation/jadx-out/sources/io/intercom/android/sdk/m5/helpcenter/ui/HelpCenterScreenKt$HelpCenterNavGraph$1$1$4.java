package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import defpackage.fi4;
import defpackage.g2b;
import defpackage.g57;
import defpackage.jt1;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.r47;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterScreenKt$HelpCenterNavGraph$1$1$4 implements fi4<nu, r47, jt1, Integer, g2b> {
    final /* synthetic */ Context $context;
    final /* synthetic */ o67 $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    public HelpCenterScreenKt$HelpCenterNavGraph$1$1$4(HelpCenterViewModel helpCenterViewModel, Context context, o67 o67Var) {
        this.$viewModel = helpCenterViewModel;
        this.$context = context;
        this.$navController = o67Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(HelpCenterViewModel helpCenterViewModel, Context context, String str) {
        str.getClass();
        helpCenterViewModel.onArticleClicked();
        context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(str, MetricTracker.Place.COLLECTION_LIST, false, false, 8, null)));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2(o67 o67Var, String str) {
        str.getClass();
        g57.c(o67Var, "COLLECTION_DETAILS/".concat(str), null, 6);
        return g2b.a;
    }

    public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
        String string;
        nuVar.getClass();
        r47Var.getClass();
        Bundle bundleA = r47Var.A.a();
        if (bundleA == null || (string = bundleA.getString("id")) == null) {
            string = BuildConfig.FLAVOR;
        }
        String str = string;
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        jt1Var.K(-2112929578);
        boolean zJ = jt1Var.j(this.$viewModel) | jt1Var.j(this.$context);
        final HelpCenterViewModel helpCenterViewModel2 = this.$viewModel;
        final Context context = this.$context;
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (zJ || objF == c0187a) {
            objF = new oh4() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.f
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return HelpCenterScreenKt$HelpCenterNavGraph$1$1$4.invoke$lambda$1$lambda$0(helpCenterViewModel2, context, (String) obj);
                }
            };
            jt1Var.C(objF);
        }
        oh4 oh4Var = (oh4) objF;
        jt1Var.B();
        jt1Var.K(-2112910168);
        boolean zJ2 = jt1Var.j(this.$navController);
        final o67 o67Var = this.$navController;
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == c0187a) {
            objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.g
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return HelpCenterScreenKt$HelpCenterNavGraph$1$1$4.invoke$lambda$3$lambda$2(o67Var, (String) obj);
                }
            };
            jt1Var.C(objF2);
        }
        jt1Var.B();
        HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen(helpCenterViewModel, str, oh4Var, (oh4) objF2, jt1Var, 0, 0);
    }

    @Override // defpackage.fi4
    public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
        invoke(nuVar, r47Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
