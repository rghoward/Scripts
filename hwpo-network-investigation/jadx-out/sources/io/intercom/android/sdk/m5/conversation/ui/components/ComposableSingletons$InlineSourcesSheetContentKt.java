package io.intercom.android.sdk.m5.conversation.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.v5a;
import defpackage.ws0;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InlineSourcesSheetContentKt {
    public static final ComposableSingletons$InlineSourcesSheetContentKt INSTANCE = new ComposableSingletons$InlineSourcesSheetContentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f91lambda1 = new fr1(false, -402572306, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$InlineSourcesSheetContentKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                InlineSourcesSheetContentKt.InlineSourcesSheetContent(ws0.h(new InlineSource(BuildConfig.FLAVOR, "article", "1", "http://www.developer.intercom.com", "Your pay as you go bill explained")), ws0.i(new Source("1", "article", "Your pay as you go bill explained", "http://www.developer.intercom.com"), new Source("2", "external", "External article", "http://www.google.com/lol")), null, jt1Var, 0, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f92lambda2 = new fr1(false, -1732890285, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$InlineSourcesSheetContentKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m122getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m122getLambda1$intercom_sdk_base_release() {
        return f91lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m123getLambda2$intercom_sdk_base_release() {
        return f92lambda2;
    }
}
