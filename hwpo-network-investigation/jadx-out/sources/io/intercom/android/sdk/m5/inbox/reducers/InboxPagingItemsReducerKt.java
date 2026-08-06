package io.intercom.android.sdk.m5.inbox.reducers;

import defpackage.a06;
import defpackage.ca5;
import defpackage.g2b;
import defpackage.if3;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.nr1;
import defpackage.qf2;
import defpackage.qk5;
import defpackage.ub6;
import defpackage.uh1;
import defpackage.z;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxPagingItemsReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InboxUiState reduceToInboxUiState(a06<Conversation> a06Var, EmptyState emptyState, AppConfig appConfig, int i, Map<String, CurrentlyTypingState> map, jt1 jt1Var, int i2, int i3) {
        InboxUiState initial;
        a06Var.getClass();
        emptyState.getClass();
        jt1Var.K(-628473750);
        AppConfig appConfig2 = (i3 & 2) != 0 ? (AppConfig) z.a() : appConfig;
        Map<String, CurrentlyTypingState> map2 = (i3 & 8) != 0 ? if3.t : map;
        String spaceLabelIfExists = appConfig2.getSpaceLabelIfExists(Space.Type.MESSAGES);
        jt1Var.K(-261432417);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = nr1.f(jt1Var, R.string.intercom_messages_space_title);
        }
        String str = spaceLabelIfExists;
        jt1Var.B();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i4 = IntercomTheme.$stable;
        IntercomTopBarState intercomTopBarState = new IntercomTopBarState(Integer.valueOf(i), str, null, new uh1(intercomTheme.getColors(jt1Var, i4).m767getHeader0d7_KjU()), new uh1(intercomTheme.getColors(jt1Var, i4).m771getOnHeader0d7_KjU()), null, 36, null);
        int iD = ((qk5) a06Var.d.getValue()).d();
        jt1.a.C0187a c0187a = jt1.a.a;
        boolean z = true;
        int i5 = 0;
        if (iD != 0) {
            jt1Var.K(-261419678);
            boolean zShouldShowSendMessageButton = shouldShowSendMessageButton(appConfig2);
            boolean z2 = a06Var.b().c instanceof ub6.b;
            ub6 ub6Var = a06Var.b().c;
            ErrorState withoutCTA = null;
            ub6.a aVar = ub6Var instanceof ub6.a ? (ub6.a) ub6Var : null;
            if (aVar != null) {
                boolean z3 = aVar.b instanceof IOException;
                jt1Var.K(-261407761);
                if (z3) {
                    jt1Var.K(-598334865);
                    if ((((i2 & 14) ^ 6) <= 4 || !jt1Var.j(a06Var)) && (i2 & 6) != 4) {
                        z = false;
                    }
                    Object objF = jt1Var.f();
                    if (z || objF == c0187a) {
                        objF = new ca5(i5, a06Var);
                        jt1Var.C(objF);
                    }
                    jt1Var.B();
                    withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, (mh4) objF, 15, null);
                } else {
                    withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                }
                jt1Var.B();
            }
            initial = new InboxUiState.Content(intercomTopBarState, a06Var, zShouldShowSendMessageButton, z2, withoutCTA, map2);
            jt1Var.B();
        } else if (a06Var.b().a instanceof ub6.a) {
            jt1Var.K(486543987);
            ub6 ub6Var2 = a06Var.b().a;
            ub6Var2.getClass();
            if (((ub6.a) ub6Var2).b instanceof IOException) {
                jt1Var.K(-261391566);
                if ((((i2 & 14) ^ 6) <= 4 || !jt1Var.j(a06Var)) && (i2 & 6) != 4) {
                    z = false;
                }
                Object objF2 = jt1Var.f();
                if (z || objF2 == c0187a) {
                    objF2 = new qf2(2, a06Var);
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                initial = new InboxUiState.Error(intercomTopBarState, new ErrorState.WithCTA(0, 0, null, 0, (mh4) objF2, 15, null));
            } else {
                initial = new InboxUiState.Error(intercomTopBarState, new ErrorState.WithoutCTA(0, 0, null, 7, null));
            }
            jt1Var.B();
        } else if (!emptyState.equals(EmptyState.Companion.getNULL())) {
            jt1Var.K(-261380615);
            jt1Var.B();
            initial = new InboxUiState.Empty(intercomTopBarState, emptyState, shouldShowSendMessageButton(appConfig2));
        } else if (a06Var.b().a instanceof ub6.b) {
            jt1Var.K(-261372105);
            jt1Var.B();
            initial = new InboxUiState.Loading(intercomTopBarState);
        } else {
            jt1Var.K(-261369513);
            jt1Var.B();
            initial = new InboxUiState.Initial(intercomTopBarState);
        }
        jt1Var.B();
        return initial;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b reduceToInboxUiState$lambda$2$lambda$1$lambda$0(a06 a06Var) {
        a06Var.d();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b reduceToInboxUiState$lambda$4$lambda$3(a06 a06Var) {
        a06Var.c();
        return g2b.a;
    }

    private static final boolean shouldShowSendMessageButton(AppConfig appConfig) {
        return AppConfigExtensionsKt.canStartNewConversation(appConfig) && !appConfig.isHelpCenterRequireSearchEnabled();
    }
}
