package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ms9;
import defpackage.mt9;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationScreenKt {
    public static final ComposableSingletons$ConversationScreenKt INSTANCE = new ComposableSingletons$ConversationScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<ms9, jt1, Integer, g2b> f84lambda1 = new fr1(false, -1271509465, new ei4<ms9, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationScreenKt$lambda-1$1
        public final void invoke(ms9 ms9Var, jt1 jt1Var, int i) {
            ms9 ms9Var2;
            int i2;
            ms9Var.getClass();
            if ((i & 6) == 0) {
                ms9Var2 = ms9Var;
                i2 = i | (jt1Var.J(ms9Var2) ? 4 : 2);
            } else {
                ms9Var2 = ms9Var;
                i2 = i;
            }
            if ((i2 & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            mt9.c(ms9Var2, null, intercomTheme.getShapes(jt1Var, i3).b, 0L, 0L, ColorExtensionsKt.m835getAccessibleColorOnDarkBackground8_81llA(intercomTheme.getColors(jt1Var, i3).m751getAction0d7_KjU()), 0L, 0L, jt1Var, i2 & 14, 438);
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(ms9 ms9Var, jt1 jt1Var, Integer num) {
            invoke(ms9Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<ms9, jt1, Integer, g2b> m115getLambda1$intercom_sdk_base_release() {
        return f84lambda1;
    }
}
