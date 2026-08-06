package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxEmptyScreenKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InboxEmptyScreenKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$InboxEmptyScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$InboxEmptyScreenKt$lambda1$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        EmptyState emptyState = new EmptyState("No messages", "Messages from the team, queries and support tickets will be visible here", new EmptyState.Action(ActionType.MESSAGE, "Send us a message", IconType.TEAMMATE));
        jt1Var.K(-970032817);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new a();
            jt1Var.C(objF);
        }
        jt1Var.B();
        InboxEmptyScreenKt.InboxEmptyScreen(emptyState, true, (mh4) objF, null, jt1Var, 432, 8);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
