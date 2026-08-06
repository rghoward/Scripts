package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.ci4;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mia;
import defpackage.nr1;
import defpackage.ox6;
import defpackage.v5a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$GifGridKt {
    public static final ComposableSingletons$GifGridKt INSTANCE = new ComposableSingletons$GifGridKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f126lambda1 = new fr1(false, 885449481, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarK = eo7.k(ox6.a.t, 8.0f, 0.0f, 2);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            mia.b(nr1.f(jt1Var, R.string.intercom_search_gif), ox6VarK, intercomTheme.getColors(jt1Var, i2).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04(), jt1Var, 48, 0, 131064);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f127lambda2 = new fr1(false, -2034998788, ComposableSingletons$GifGridKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f128lambda3 = new fr1(false, 570929079, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$GifGridKt.INSTANCE.m161getLambda2$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m160getLambda1$intercom_sdk_base_release() {
        return f126lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m161getLambda2$intercom_sdk_base_release() {
        return f127lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m162getLambda3$intercom_sdk_base_release() {
        return f128lambda3;
    }
}
