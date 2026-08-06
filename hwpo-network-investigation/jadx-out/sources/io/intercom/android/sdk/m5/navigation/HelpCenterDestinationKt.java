package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import defpackage.bt7;
import defpackage.bx0;
import defpackage.c42;
import defpackage.ci4;
import defpackage.d42;
import defpackage.dq1;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.g27;
import defpackage.g2b;
import defpackage.h47;
import defpackage.hf3;
import defpackage.i67;
import defpackage.j67;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.kv4;
import defpackage.m77;
import defpackage.mh4;
import defpackage.nu;
import defpackage.o67;
import defpackage.p47;
import defpackage.q47;
import defpackage.r47;
import defpackage.ru;
import defpackage.th3;
import defpackage.wd3;
import defpackage.ws0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterDestinationKt {
    public static final void helpCenterDestination(i67 i67Var, dq1 dq1Var, o67 o67Var, IntercomRootActivityArgs intercomRootActivityArgs) {
        i67Var.getClass();
        dq1Var.getClass();
        o67Var.getClass();
        intercomRootActivityArgs.getClass();
        q47 q47Var = new q47();
        helpCenterDestination$lambda$0(q47Var);
        p47.a aVar = q47Var.a;
        m77<Object> m77VarB = aVar.a;
        if (m77VarB == null) {
            m77.b bVar = m77.Companion;
            Object obj = aVar.c;
            bVar.getClass();
            m77VarB = m77.b.b(obj);
        }
        h47 h47Var = new h47("transitionArgs", new p47(m77VarB, aVar.b, aVar.c, aVar.d));
        q47 q47Var2 = new q47();
        helpCenterDestination$lambda$1(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        int i = 1;
        j67.a(i67Var, "HELP_CENTER?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", ws0.i(h47Var, new h47("isLaunchedProgrammatically", new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d))), new kv4(0), new c42(i), new d42(i), new bx0(2), new fr1(true, -2139595832, new AnonymousClass7(dq1Var, intercomRootActivityArgs, o67Var)), 132);
    }

    private static final g2b helpCenterDestination$lambda$0(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(TransitionStyleKt.getTransitionArgNavType());
        q47Var.a(new TransitionArgs(null, null, null, null, 15, null));
        return g2b.a;
    }

    private static final g2b helpCenterDestination$lambda$1(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a.b = false;
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 helpCenterDestination$lambda$2(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 helpCenterDestination$lambda$3(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 helpCenterDestination$lambda$4(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 helpCenterDestination$lambda$5(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass7 implements fi4<nu, r47, jt1, Integer, g2b> {
        final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;

        public AnonymousClass7(dq1 dq1Var, IntercomRootActivityArgs intercomRootActivityArgs, o67 o67Var) {
            this.$rootActivity = dq1Var;
            this.$intercomRootActivityArgs = intercomRootActivityArgs;
            this.$navController = o67Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1(o67 o67Var, dq1 dq1Var) {
            if (o67Var.b() == null) {
                dq1Var.finish();
            } else {
                o67Var.d();
            }
            return g2b.a;
        }

        public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
            List<String> listH;
            int i2;
            nuVar.getClass();
            r47Var.getClass();
            Bundle bundleA = r47Var.A.a();
            boolean z = bundleA != null ? bundleA.getBoolean("isLaunchedProgrammatically") : false;
            HelpCenterViewModel.Companion companion = HelpCenterViewModel.Companion;
            dq1 dq1Var = this.$rootActivity;
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            helpCenterApi.getClass();
            HelpCenterViewModel helpCenterViewModelCreate = companion.create(dq1Var, helpCenterApi, MetricTracker.Place.COLLECTION_LIST);
            jt1Var.K(-102150257);
            o67 o67Var = this.$navController;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                if (o67Var.b() == null) {
                    i2 = R.drawable.intercom_ic_close;
                } else {
                    i2 = z ? R.drawable.intercom_ic_chevron_down : R.drawable.intercom_ic_back;
                }
                objF = new bt7(i2);
                jt1Var.C(objF);
            }
            g27 g27Var = (g27) objF;
            jt1Var.B();
            IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionsArgs) {
                listH = ((IntercomRootActivityArgs.HelpCenterCollectionsArgs) intercomRootActivityArgs).getCollectionIds();
            } else {
                listH = intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionArgs ? ws0.h(((IntercomRootActivityArgs.HelpCenterCollectionArgs) intercomRootActivityArgs).getCollectionId()) : hf3.t;
            }
            List<String> list = listH;
            jt1Var.K(-102124106);
            boolean zJ = jt1Var.j(this.$navController) | jt1Var.j(this.$rootActivity);
            final o67 o67Var2 = this.$navController;
            final dq1 dq1Var2 = this.$rootActivity;
            Object objF2 = jt1Var.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.p
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HelpCenterDestinationKt.AnonymousClass7.invoke$lambda$2$lambda$1(o67Var2, dq1Var2);
                    }
                };
                jt1Var.C(objF2);
            }
            jt1Var.B();
            HelpCenterScreenKt.HelpCenterScreen(helpCenterViewModelCreate, list, (mh4) objF2, g27Var.k(), jt1Var, 0);
            jt1Var.K(-102116008);
            Object objF3 = jt1Var.f();
            if (objF3 == c0187a) {
                objF3 = new HelpCenterDestinationKt$helpCenterDestination$7$2$1(null);
                jt1Var.C(objF3);
            }
            jt1Var.B();
            wd3.d(jt1Var, (ci4) objF3, BuildConfig.FLAVOR);
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
            invoke(nuVar, r47Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
