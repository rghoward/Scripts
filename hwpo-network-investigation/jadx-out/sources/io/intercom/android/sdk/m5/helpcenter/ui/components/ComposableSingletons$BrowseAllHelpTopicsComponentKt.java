package io.intercom.android.sdk.m5.helpcenter.ui.components;

import defpackage.ah5;
import defpackage.b47;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.mia;
import defpackage.nr1;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.wja;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BrowseAllHelpTopicsComponentKt {
    public static final ComposableSingletons$BrowseAllHelpTopicsComponentKt INSTANCE = new ComposableSingletons$BrowseAllHelpTopicsComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<oy8, jt1, Integer, g2b> f224lambda1 = new fr1(false, 1224833391, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-1$1
        public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
            oy8Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            m65.b(is7.a(R.drawable.intercom_article_book_icon, jt1Var, 0), null, null, 0L, jt1Var, 56, 12);
            b47.b(jt1Var, ir9.n(ox6.a.t, 6.0f));
            String strF = nr1.f(jt1Var, R.string.intercom_browse_all_help_topics);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            mia.b(strF, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(jt1Var, i2).getType04Point5(), ah5.a(intercomTheme, jt1Var, i2), 0L, null, null, 0L, 0L, null, null, 16777214), jt1Var, 0, 0, 131070);
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            invoke(oy8Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f225lambda2 = new fr1(false, -1938885306, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(null, jt1Var, 0, 1);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f226lambda3 = new fr1(false, 612498774, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, jt1Var, 0, 1);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<oy8, jt1, Integer, g2b> m313getLambda1$intercom_sdk_base_release() {
        return f224lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m314getLambda2$intercom_sdk_base_release() {
        return f225lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m315getLambda3$intercom_sdk_base_release() {
        return f226lambda3;
    }
}
