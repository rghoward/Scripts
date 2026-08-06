package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
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
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationItemKt$lambda5$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ConversationItemKt$lambda5$1 INSTANCE = new ComposableSingletons$ConversationItemKt$lambda5$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarC = gi0.c(ir9.c(ox6.a.t, 1.0f), zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a);
        Conversation conversationSampleConversation$default = ConversationItemKt.sampleConversation$default(false, 1, null);
        Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
        avatarCreate.getClass();
        CurrentlyTypingState currentlyTypingState = new CurrentlyTypingState(new AvatarWrapper(avatarCreate, false), false, null, TypingIndicatorType.ADMIN, 6, null);
        ko7 ko7Var = new ko7(16.0f, 16.0f, 16.0f, 16.0f);
        jt1Var.K(1598506294);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new i();
            jt1Var.C(objF);
        }
        jt1Var.B();
        ConversationItemKt.ConversationItem(conversationSampleConversation$default, ox6VarC, currentlyTypingState, ko7Var, false, (mh4) objF, jt1Var, 196608, 16);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
