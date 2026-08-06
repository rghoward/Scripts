package io.intercom.android.sdk.helpcenter.search;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.mia;
import defpackage.nr1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterSearchTopBarKt {
    public static final ComposableSingletons$HelpCenterSearchTopBarKt INSTANCE = new ComposableSingletons$HelpCenterSearchTopBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f6lambda1 = new fr1(false, -456122237, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            String strF = nr1.f(jt1Var, R.string.intercom_search_for_help);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            mia.b(strF, null, intercomTheme.getColors(jt1Var, i2).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04(), jt1Var, 0, 0, 131066);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f7lambda2 = new fr1(false, 202432040, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, jt1Var, 0), nr1.f(jt1Var, R.string.intercom_clear), null, IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), jt1Var, 8, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f8lambda3 = new fr1(false, -420729176, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_back, jt1Var, 0), nr1.f(jt1Var, R.string.intercom_navigation_back), null, IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), jt1Var, 8, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m15getLambda1$intercom_sdk_base_release() {
        return f6lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m16getLambda2$intercom_sdk_base_release() {
        return f7lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m17getLambda3$intercom_sdk_base_release() {
        return f8lambda3;
    }
}
