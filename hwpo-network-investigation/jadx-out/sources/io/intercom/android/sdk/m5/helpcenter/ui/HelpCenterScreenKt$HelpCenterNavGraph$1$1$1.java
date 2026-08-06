package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.a68;
import defpackage.fi4;
import defpackage.g2b;
import defpackage.g57;
import defpackage.jt1;
import defpackage.k77;
import defpackage.l77;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.q57;
import defpackage.r47;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterScreenKt$HelpCenterNavGraph$1$1$1 implements fi4<nu, r47, jt1, Integer, g2b> {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ o67 $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    public HelpCenterScreenKt$HelpCenterNavGraph$1$1$1(HelpCenterViewModel helpCenterViewModel, List<String> list, o67 o67Var) {
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
        this.$navController = o67Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(o67 o67Var, String str) {
        str.getClass();
        g57.c(o67Var, "COLLECTION_DETAILS/".concat(str), null, 6);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$5$lambda$4(o67 o67Var, String str) {
        str.getClass();
        String str2 = "COLLECTION_DETAILS/" + str + "?startDestination=true";
        q57 q57Var = o67Var.b;
        q57Var.getClass();
        l77 l77Var = new l77();
        invoke$lambda$5$lambda$4$lambda$3(l77Var);
        boolean z = l77Var.b;
        k77.a aVar = l77Var.a;
        aVar.a = z;
        aVar.b = l77Var.c;
        String str3 = l77Var.e;
        if (str3 != null) {
            boolean z2 = l77Var.f;
            boolean z3 = l77Var.g;
            aVar.d = str3;
            aVar.c = -1;
            aVar.e = z2;
            aVar.f = z3;
        } else {
            aVar.b(l77Var.d, l77Var.f, l77Var.g);
        }
        q57Var.m(str2, aVar.a());
        return g2b.a;
    }

    private static final g2b invoke$lambda$5$lambda$4$lambda$3(l77 l77Var) {
        l77Var.getClass();
        l77Var.b("COLLECTIONS");
        l77Var.a(-1);
        a68 a68Var = new a68();
        invoke$lambda$5$lambda$4$lambda$3$lambda$2(a68Var);
        l77Var.f = a68Var.a;
        l77Var.g = a68Var.b;
        return g2b.a;
    }

    private static final g2b invoke$lambda$5$lambda$4$lambda$3$lambda$2(a68 a68Var) {
        a68Var.getClass();
        a68Var.a = true;
        return g2b.a;
    }

    public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
        nuVar.getClass();
        r47Var.getClass();
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        List<String> list = this.$collectionIds;
        jt1Var.K(-2112966782);
        boolean zJ = jt1Var.j(this.$navController);
        final o67 o67Var = this.$navController;
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (zJ || objF == c0187a) {
            objF = new oh4() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.d
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return HelpCenterScreenKt$HelpCenterNavGraph$1$1$1.invoke$lambda$1$lambda$0(o67Var, (String) obj);
                }
            };
            jt1Var.C(objF);
        }
        oh4 oh4Var = (oh4) objF;
        jt1Var.B();
        jt1Var.K(-2112960529);
        boolean zJ2 = jt1Var.j(this.$navController);
        final o67 o67Var2 = this.$navController;
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == c0187a) {
            objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.e
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return HelpCenterScreenKt$HelpCenterNavGraph$1$1$1.invoke$lambda$5$lambda$4(o67Var2, (String) obj);
                }
            };
            jt1Var.C(objF2);
        }
        jt1Var.B();
        HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(helpCenterViewModel, list, oh4Var, (oh4) objF2, jt1Var, 0);
    }

    @Override // defpackage.fi4
    public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
        invoke(nuVar, r47Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
