package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationEndedCardKt {
    public static final ComposableSingletons$ConversationEndedCardKt INSTANCE = new ComposableSingletons$ConversationEndedCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f16lambda1 = new fr1(false, -867938680, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ConversationEndedCardKt.ConversationEndedCard(null, null, new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), null, 2, null), jt1Var, StringProvider.$stable << 6, 3);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f17lambda2 = new fr1(false, -1449960304, ComposableSingletons$ConversationEndedCardKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f18lambda3 = new fr1(false, -156696201, ComposableSingletons$ConversationEndedCardKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f19lambda4 = new fr1(false, -324942016, ComposableSingletons$ConversationEndedCardKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m29getLambda1$intercom_sdk_base_release() {
        return f16lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m30getLambda2$intercom_sdk_base_release() {
        return f17lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m31getLambda3$intercom_sdk_base_release() {
        return f18lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m32getLambda4$intercom_sdk_base_release() {
        return f19lambda4;
    }
}
