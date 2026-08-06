package io.intercom.android.sdk.m5.home.ui.components;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ExternalLinkCardKt {
    public static final ComposableSingletons$ExternalLinkCardKt INSTANCE = new ComposableSingletons$ExternalLinkCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f240lambda1 = new fr1(false, 19664413, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$ExternalLinkCardKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ExternalLinkCardKt.ExternalLinkCard(new HomeCards.HomeExternalLinkData("External Links", HomeCardType.EXTERNAL_LINKS, ws0.i(new Link("Ask the community", "https://stackoverflow.com/"), new Link("Knowledge base", "https://stackoverflow.com/"))), jt1Var, 0);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m338getLambda1$intercom_sdk_base_release() {
        return f240lambda1;
    }
}
