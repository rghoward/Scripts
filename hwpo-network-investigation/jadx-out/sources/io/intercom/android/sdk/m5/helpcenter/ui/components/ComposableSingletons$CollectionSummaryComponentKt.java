package io.intercom.android.sdk.m5.helpcenter.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.helpcenter.sections.Avatar;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CollectionSummaryComponentKt {
    public static final ComposableSingletons$CollectionSummaryComponentKt INSTANCE = new ComposableSingletons$CollectionSummaryComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f231lambda1 = new fr1(false, 309452486, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionSummaryComponentKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                CollectionSummaryComponentKt.CollectionSummaryComponent(new CollectionDetailsUiState.Content("123456", "Recording videos", "How to set up screen and camera recording through our app or Chrome extension.", 5, ws0.i(new Author(BuildConfig.FLAVOR, "Hannah", new Avatar(BuildConfig.FLAVOR, "SK")), new Author(BuildConfig.FLAVOR, "Bob", new Avatar(BuildConfig.FLAVOR, "PS")), new Author(BuildConfig.FLAVOR, "Anna", new Avatar(BuildConfig.FLAVOR, "VR"))), hf3.t), null, jt1Var, 0, 2);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m320getLambda1$intercom_sdk_base_release() {
        return f231lambda1;
    }
}
