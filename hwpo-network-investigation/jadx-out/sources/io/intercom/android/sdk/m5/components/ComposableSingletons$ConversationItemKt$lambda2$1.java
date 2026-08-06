package io.intercom.android.sdk.m5.components;

import defpackage.al8;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ko7;
import defpackage.mh4;
import defpackage.ox6;
import defpackage.zg5;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationItemKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ConversationItemKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationItemKt$lambda2$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarC = gi0.c(ir9.c(ox6.a.t, 1.0f), zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a);
        Conversation conversationSampleConversationWithBot = ConversationItemKt.sampleConversationWithBot();
        ko7 ko7Var = new ko7(16.0f, 16.0f, 16.0f, 16.0f);
        jt1Var.K(1370757811);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new f();
            jt1Var.C(objF);
        }
        jt1Var.B();
        ConversationItemKt.ConversationItem(conversationSampleConversationWithBot, ox6VarC, null, ko7Var, false, (mh4) objF, jt1Var, 196608, 20);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
