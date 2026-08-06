package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eh6;
import defpackage.g2b;
import defpackage.h37;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.t72;
import defpackage.xv9;
import defpackage.yi1;
import defpackage.yz9;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt;
import io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScreenKt$ConversationScreenContent$39$1 implements ci4<jt1, Integer, g2b> {
    final /* synthetic */ Context $context;
    final /* synthetic */ t72 $coroutineScope;
    final /* synthetic */ yz9<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ xv9 $keyboardController;
    final /* synthetic */ mh4<g2b> $navigateToTicketDetail;
    final /* synthetic */ mh4<g2b> $onBackClick;
    final /* synthetic */ oh4<HeaderMenuItem, g2b> $onMenuClicked;
    final /* synthetic */ mh4<g2b> $onTitleClicked;
    final /* synthetic */ h37<Boolean> $openBottomSheet;
    final /* synthetic */ eh6<String, Boolean> $pushNotificationsPermissionLauncher;
    final /* synthetic */ oh4<MetricData, g2b> $trackMetric;
    final /* synthetic */ ConversationUiState $uiState;
    final /* synthetic */ ci4<Boolean, Boolean, g2b> $updatePushNotificationsBanner;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$39$1(ConversationUiState conversationUiState, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, xv9 xv9Var, t72 t72Var, yz9<KeyboardState> yz9Var, h37<Boolean> h37Var, mh4<g2b> mh4Var3, oh4<? super HeaderMenuItem, g2b> oh4Var, oh4<? super MetricData, g2b> oh4Var2, eh6<String, Boolean> eh6Var, Context context, ci4<? super Boolean, ? super Boolean, g2b> ci4Var) {
        this.$uiState = conversationUiState;
        this.$onBackClick = mh4Var;
        this.$onTitleClicked = mh4Var2;
        this.$keyboardController = xv9Var;
        this.$coroutineScope = t72Var;
        this.$keyboardAsState$delegate = yz9Var;
        this.$openBottomSheet = h37Var;
        this.$navigateToTicketDetail = mh4Var3;
        this.$onMenuClicked = oh4Var;
        this.$trackMetric = oh4Var2;
        this.$pushNotificationsPermissionLauncher = eh6Var;
        this.$context = context;
        this.$updatePushNotificationsBanner = ci4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$6$lambda$1$lambda$0(ConversationUiState conversationUiState, mh4 mh4Var, xv9 xv9Var, t72 t72Var, h37 h37Var, yz9 yz9Var) {
        if (conversationUiState instanceof ConversationUiState.Content) {
            mh4Var.invoke();
            ConversationScreenKt.ConversationScreenContent$hideKeyboardAndShowBottomSheet(xv9Var, t72Var, h37Var, yz9Var);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$6$lambda$3$lambda$2(TopAppBarUiState topAppBarUiState, eh6 eh6Var, Context context) {
        if (Build.VERSION.SDK_INT < 33 || !topAppBarUiState.getPushNotificationsBannerState().getAskUsersToAllowNotifications()) {
            context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
        } else {
            eh6Var.a("android.permission.POST_NOTIFICATIONS");
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$6$lambda$5$lambda$4(ci4 ci4Var) {
        ci4Var.invoke(Boolean.TRUE, Boolean.FALSE);
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        final ConversationUiState conversationUiState = this.$uiState;
        mh4<g2b> mh4Var = this.$onBackClick;
        final mh4<g2b> mh4Var2 = this.$onTitleClicked;
        final xv9 xv9Var = this.$keyboardController;
        final t72 t72Var = this.$coroutineScope;
        final yz9<KeyboardState> yz9Var = this.$keyboardAsState$delegate;
        final h37<Boolean> h37Var = this.$openBottomSheet;
        mh4<g2b> mh4Var3 = this.$navigateToTicketDetail;
        oh4<HeaderMenuItem, g2b> oh4Var = this.$onMenuClicked;
        oh4<MetricData, g2b> oh4Var2 = this.$trackMetric;
        final eh6<String, Boolean> eh6Var = this.$pushNotificationsPermissionLauncher;
        final Context context = this.$context;
        final ci4<Boolean, Boolean, g2b> ci4Var = this.$updatePushNotificationsBanner;
        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC = it1.c(jt1Var, ox6.a.t);
        bt1.c.getClass();
        qr5.a aVar = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, aj1VarA);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC);
        jt1Var.K(1461780658);
        final TopAppBarUiState topAppBarUiState = conversationUiState.getTopAppBarUiState();
        jt1Var.K(690852110);
        boolean zJ = jt1Var.j(conversationUiState) | jt1Var.J(mh4Var2) | jt1Var.J(xv9Var) | jt1Var.j(t72Var) | jt1Var.J(yz9Var) | jt1Var.J(h37Var);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            Object obj2 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.h
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ConversationScreenKt$ConversationScreenContent$39$1.invoke$lambda$7$lambda$6$lambda$1$lambda$0(conversationUiState, mh4Var2, xv9Var, t72Var, h37Var, yz9Var);
                }
            };
            jt1Var.C(obj2);
            objF = obj2;
        }
        jt1Var.B();
        ConversationTopAppBarKt.ConversationTopAppBar(topAppBarUiState, mh4Var, (mh4) objF, mh4Var3, oh4Var, oh4Var2, jt1Var, 0, 0);
        jt1Var.K(1461803607);
        if (topAppBarUiState.getPushNotificationsBannerState() != null) {
            jt1Var.K(690873203);
            boolean zJ2 = jt1Var.j(topAppBarUiState) | jt1Var.j(eh6Var) | jt1Var.j(context);
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == obj) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.i
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreenContent$39$1.invoke$lambda$7$lambda$6$lambda$3$lambda$2(topAppBarUiState, eh6Var, context);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var4 = (mh4) objF2;
            jt1Var.B();
            jt1Var.K(690894007);
            boolean zJ3 = jt1Var.J(ci4Var);
            Object objF3 = jt1Var.f();
            if (zJ3 || objF3 == obj) {
                objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.j
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreenContent$39$1.invoke$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var);
                    }
                };
                jt1Var.C(objF3);
            }
            jt1Var.B();
            PushNotificationsBannerKt.PushNotificationsBanner(mh4Var4, (mh4) objF3, jt1Var, 0);
        }
        jt1Var.B();
        jt1Var.B();
        jt1Var.I();
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
