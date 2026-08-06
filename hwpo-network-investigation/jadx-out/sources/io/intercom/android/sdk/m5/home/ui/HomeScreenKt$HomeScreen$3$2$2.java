package io.intercom.android.sdk.m5.home.ui;

import defpackage.aj1;
import defpackage.b27;
import defpackage.bt1;
import defpackage.c30;
import defpackage.di;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jv;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.oh7;
import defpackage.ox6;
import defpackage.qq5;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.x69;
import defpackage.yi1;
import defpackage.yq5;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenKt$HomeScreen$3$2$2 implements ei4<jv, jt1, Integer, g2b> {
    final /* synthetic */ b27 $headerHeightPx;
    final /* synthetic */ HomeUiState $homeState;
    final /* synthetic */ oh4<Conversation, g2b> $onConversationClicked;
    final /* synthetic */ mh4<g2b> $onHelpClicked;
    final /* synthetic */ mh4<g2b> $onMessagesClicked;
    final /* synthetic */ mh4<g2b> $onNewConversationClicked;
    final /* synthetic */ oh4<String, g2b> $onTicketItemClicked;
    final /* synthetic */ oh4<TicketType, g2b> $onTicketLinkClicked;
    final /* synthetic */ mh4<g2b> $onTicketsClicked;
    final /* synthetic */ x69 $scrollState;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeScreenKt$HomeScreen$3$2$2(HomeUiState homeUiState, x69 x69Var, b27 b27Var, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, mh4<g2b> mh4Var3, oh4<? super String, g2b> oh4Var, mh4<g2b> mh4Var4, oh4<? super Conversation, g2b> oh4Var2, oh4<? super TicketType, g2b> oh4Var3) {
        this.$homeState = homeUiState;
        this.$scrollState = x69Var;
        this.$headerHeightPx = b27Var;
        this.$onMessagesClicked = mh4Var;
        this.$onHelpClicked = mh4Var2;
        this.$onTicketsClicked = mh4Var3;
        this.$onTicketItemClicked = oh4Var;
        this.$onNewConversationClicked = mh4Var4;
        this.$onConversationClicked = oh4Var2;
        this.$onTicketLinkClicked = oh4Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(b27 b27Var, qq5 qq5Var) {
        qq5Var.getClass();
        b27Var.g((int) (qq5Var.a() & 4294967295L));
        return g2b.a;
    }

    public final void invoke(jv jvVar, jt1 jt1Var, int i) {
        jvVar.getClass();
        HomeUiState homeUiState = this.$homeState;
        if (homeUiState instanceof HomeUiState.Content) {
            x69 x69Var = this.$scrollState;
            final b27 b27Var = this.$headerHeightPx;
            mh4<g2b> mh4Var = this.$onMessagesClicked;
            mh4<g2b> mh4Var2 = this.$onHelpClicked;
            mh4<g2b> mh4Var3 = this.$onTicketsClicked;
            oh4<String, g2b> oh4Var = this.$onTicketItemClicked;
            mh4<g2b> mh4Var4 = this.$onNewConversationClicked;
            oh4<Conversation, g2b> oh4Var2 = this.$onConversationClicked;
            oh4<TicketType, g2b> oh4Var3 = this.$onTicketLinkClicked;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            ox6 ox6VarB = yq5.b(aVar, HomeScreenKt.getHeaderContentOpacity(x69Var.a.k(), b27Var.h()));
            jt1Var.K(1117667200);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.home.ui.b
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HomeScreenKt$HomeScreen$3$2$2.invoke$lambda$2$lambda$1$lambda$0(b27Var, (qq5) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            HomeUiState.Content content = (HomeUiState.Content) homeUiState;
            HomeHeaderKt.HomeContentHeader(oh7.b(ox6VarB, (oh4) objF), content.getHeader(), jt1Var, 0, 0);
            HomeContentScreenKt.HomeContentScreen(null, content, mh4Var, mh4Var2, mh4Var3, oh4Var, mh4Var4, oh4Var2, oh4Var3, jt1Var, 0, 1);
            jt1Var.I();
        }
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var, Integer num) {
        invoke(jvVar, jt1Var, num.intValue());
        return g2b.a;
    }
}
