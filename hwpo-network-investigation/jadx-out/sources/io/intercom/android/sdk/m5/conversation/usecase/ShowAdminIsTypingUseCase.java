package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.bw2;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ShowAdminIsTypingUseCase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase", f = "ShowAdminIsTypingUseCase.kt", l = {49}, m = "sendAdminIndicator")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShowAdminIsTypingUseCase.this.sendAdminIndicator(null, null, false, false, this);
        }
    }

    public static /* synthetic */ Object invoke$default(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, i37 i37Var, Avatar avatar, boolean z, boolean z2, r02 r02Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return showAdminIsTypingUseCase.invoke(i37Var, avatar, z3, z2, r02Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object sendAdminIndicator(i37<ConversationClientState> i37Var, Avatar avatar, boolean z, boolean z2, r02<? super g2b> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState value2;
        i37<ConversationClientState> i37Var2 = i37Var;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(obj);
            if (i37Var2.getValue().getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
                return g2b.a;
            }
            do {
                value = i37Var2.getValue();
            } while (!i37Var2.c(value, ConversationClientState.copy$default(value, null, null, null, new CurrentlyTypingState(new AvatarWrapper(avatar, z), z2, null, TypingIndicatorType.ADMIN, 4, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388599, null)));
            anonymousClass1.L$0 = i37Var2;
            anonymousClass1.label = 1;
            Object objB = bw2.b(5000L, anonymousClass1);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i37Var2 = (i37) anonymousClass1.L$0;
            dv8.b(obj);
        }
        i37<ConversationClientState> i37Var3 = i37Var2;
        do {
            value2 = i37Var3.getValue();
        } while (!i37Var3.c(value2, ConversationClientState.copy$default(value2, null, null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388599, null)));
        return g2b.a;
    }

    public final Object invoke(i37<ConversationClientState> i37Var, Avatar avatar, boolean z, boolean z2, r02<? super g2b> r02Var) {
        Object objSendAdminIndicator = sendAdminIndicator(i37Var, avatar, z, z2 && !z, r02Var);
        return objSendAdminIndicator == v72.t ? objSendAdminIndicator : g2b.a;
    }
}
