package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationEndedCardKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda2$1();

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(jt1 jt1Var, int i) {
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(121635156);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new a();
            jt1Var.C(objF);
        }
        jt1Var.B();
        ConversationEndedCardKt.ConversationEndedCard(null, (mh4) objF, new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, i3, 0 == true ? 1 : 0), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Send a message"), R.drawable.intercom_send_message_icon, null, 4, null)), jt1Var, (StringProvider.$stable << 6) | 48, 1);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
