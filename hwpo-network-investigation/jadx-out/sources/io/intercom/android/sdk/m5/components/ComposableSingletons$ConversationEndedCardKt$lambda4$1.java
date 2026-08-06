package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationEndedCardKt$lambda4$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda4$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda4$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(-1158189258);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new c();
            jt1Var.C(objF);
        }
        jt1Var.B();
        ConversationEndedCardKt.ConversationEndedCard(null, (mh4) objF, new ComposerState.ConversationEnded(new StringProvider.ActualString("You have another conversation about this issue"), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Continue the conversation"), R.drawable.intercom_send_message_icon, "123")), jt1Var, (StringProvider.$stable << 6) | 48, 1);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
