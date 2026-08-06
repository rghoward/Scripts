package io.intercom.android.sdk.m5.inbox.ui;

import android.view.View;
import com.intercom.twig.BuildConfig;
import defpackage.a06;
import defpackage.ae8;
import defpackage.aj1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.az3;
import defpackage.b33;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.c33;
import defpackage.ci4;
import defpackage.d06;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.g76;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hnb;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.kc6;
import defpackage.kk;
import defpackage.kw7;
import defpackage.l02;
import defpackage.m76;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.o54;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.q39;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.s66;
import defpackage.sh;
import defpackage.te1;
import defpackage.u;
import defpackage.ub6;
import defpackage.uh1;
import defpackage.wd3;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yn5;
import defpackage.ys5;
import defpackage.yz9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxScreenKt {
    private static final void InboxContent(final InboxViewModel inboxViewModel, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, final mh4<g2b> mh4Var3, final oh4<? super InboxUiEffects.NavigateToConversation, g2b> oh4Var, final int i, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-144739367);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(inboxViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bj4VarO.h(i) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            a06 a06VarA = d06.a(inboxViewModel.getInboxPagingData(), bj4VarO);
            final InboxUiState inboxUiStateReduceToInboxUiState = InboxPagingItemsReducerKt.reduceToInboxUiState(a06VarA, inboxViewModel.getEmptyState(), null, i, InboxContent$lambda$3(bl7.c(inboxViewModel.getTypingConversations(), bj4VarO, 0)), bj4VarO, ((i3 >> 6) & 7168) | 8, 2);
            m76 m76Var = (m76) bj4VarO.F(kc6.a);
            bj4VarO.K(-1093804836);
            boolean zJ = bj4VarO.j(a06VarA) | bj4VarO.j(m76Var);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            int i4 = 1;
            if (zJ || objF == c0187a) {
                objF = new te1(i4, m76Var, a06VarA);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            wd3.a(m76Var, (oh4) objF, bj4VarO);
            bj4VarO.K(-1093786549);
            int i5 = (bj4VarO.j(inboxViewModel) ? 1 : 0) | ((i3 & 57344) != 16384 ? 0 : 1) | (bj4VarO.j(a06VarA) ? 1 : 0);
            Object objF2 = bj4VarO.f();
            if (i5 != 0 || objF2 == c0187a) {
                objF2 = new InboxScreenKt$InboxContent$2$1(inboxViewModel, oh4Var, a06VarA, null);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF2, null);
            ox6 ox6VarC = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            q39.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), gr1.b(-398771051, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxContent.3
                public final void invoke(jt1 jt1Var2, int i6) {
                    if ((i6 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String title = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().getTitle();
                    if (title == null) {
                        title = BuildConfig.FLAVOR;
                    }
                    mh4<g2b> mh4Var4 = mh4Var3;
                    Integer navIcon = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().getNavIcon();
                    uh1 uh1VarM553getBackgroundColorQN2ZGVo = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().m553getBackgroundColorQN2ZGVo();
                    jt1Var2.K(1124473084);
                    long jM767getHeader0d7_KjU = uh1VarM553getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m767getHeader0d7_KjU() : uh1VarM553getBackgroundColorQN2ZGVo.a;
                    jt1Var2.B();
                    uh1 uh1VarM554getContentColorQN2ZGVo = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().m554getContentColorQN2ZGVo();
                    jt1Var2.K(1124476507);
                    long jM771getOnHeader0d7_KjU = uh1VarM554getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m771getOnHeader0d7_KjU() : uh1VarM554getContentColorQN2ZGVo.a;
                    jt1Var2.B();
                    TopActionBarKt.m90TopActionBarNpQZenA(null, title, null, null, null, mh4Var4, navIcon, false, jM767getHeader0d7_KjU, jM771getOnHeader0d7_KjU, 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, gr1.b(-1074822478, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxContent.4
                public final void invoke(jt1 jt1Var2, int i6) {
                    if ((i6 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    InboxUiState inboxUiState = inboxUiStateReduceToInboxUiState;
                    if ((inboxUiState instanceof InboxUiState.Content) && ((InboxUiState.Content) inboxUiState).getShowSendMessageFab()) {
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i7 = IntercomTheme.$stable;
                        long jM751getAction0d7_KjU = intercomTheme.getColors(jt1Var2, i7).m751getAction0d7_KjU();
                        long jM769getOnAction0d7_KjU = intercomTheme.getColors(jt1Var2, i7).m769getOnAction0d7_KjU();
                        o54.a(mh4Var, eo7.m(ox6.a.t, 0.0f, 0.0f, 0.0f, 16.0f, 7), ay8.a, jM751getAction0d7_KjU, jM769getOnAction0d7_KjU, null, ComposableSingletons$InboxScreenKt.INSTANCE.m371getLambda2$intercom_sdk_base_release(), jt1Var2, 12582960, 96);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), 0, 0L, 0L, null, gr1.b(-1330134806, new AnonymousClass5(inboxUiStateReduceToInboxUiState, inboxViewModel, mh4Var, mh4Var2), bj4VarO), bj4VarO, 805330992, 492);
            bj4VarO = bj4VarO;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ea5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxScreenKt.InboxContent$lambda$9(inboxViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final Map<String, CurrentlyTypingState> InboxContent$lambda$3(yz9<? extends Map<String, CurrentlyTypingState>> yz9Var) {
        return yz9Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b33 InboxContent$lambda$7$lambda$6(final m76 m76Var, final a06 a06Var, c33 c33Var) {
        c33Var.getClass();
        final g76 g76Var = new g76() { // from class: fa5
            @Override // defpackage.g76
            public final void t(m76 m76Var2, s66.a aVar) {
                InboxScreenKt.InboxContent$lambda$7$lambda$6$lambda$4(a06Var, m76Var2, aVar);
            }
        };
        m76Var.getLifecycle().a(g76Var);
        return new b33() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxContent$lambda$7$lambda$6$$inlined$onDispose$1
            @Override // defpackage.b33
            public void dispose() {
                m76Var.getLifecycle().c(g76Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxContent$lambda$7$lambda$6$lambda$4(a06 a06Var, m76 m76Var, s66.a aVar) {
        m76Var.getClass();
        aVar.getClass();
        if (aVar == s66.a.ON_RESUME && (a06Var.b().a instanceof ub6.c)) {
            a06Var.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxContent$lambda$9(InboxViewModel inboxViewModel, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        InboxContent(inboxViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, i, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxErrorRow(final ErrorState errorState, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-126725909);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(errorState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(eo7.k(aVar, 0.0f, 16.0f, 1), 1.0f);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, fl6VarD);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC2);
            aj1 aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            mia.b(nr1.f(bj4VarO, errorState.getMessageResId()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, 0, 0, 262142);
            bj4VarO = bj4VarO;
            bj4VarO.K(-868786475);
            if (errorState instanceof ErrorState.WithCTA) {
                jz0.c(((ErrorState.WithCTA) errorState).getOnCtaClick(), null, false, null, null, null, gr1.b(-282010049, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxErrorRow$1$1$1
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i3) {
                        oy8Var.getClass();
                        if ((i3 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(nr1.f(jt1Var2, ((ErrorState.WithCTA) errorState).getCtaResId()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 805306368, 510);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: da5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxScreenKt.InboxErrorRow$lambda$14(errorState, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxErrorRow$lambda$14(ErrorState errorState, int i, jt1 jt1Var, int i2) {
        InboxErrorRow(errorState, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxLoadingRow(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1843849504);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6VarC = ir9.c(eo7.k(ox6.a.t, 0.0f, 16.0f, 1), 1.0f);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            ae8.a(null, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, bj4VarO, 0, 61);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ia5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxScreenKt.InboxLoadingRow$lambda$11(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxLoadingRow$lambda$11(int i, jt1 jt1Var, int i2) {
        InboxLoadingRow(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void InboxOpenGateScaffold(final int i, final mh4<g2b> mh4Var, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-246524547);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.h(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            ox6 ox6VarC = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            bj4Var = bj4VarO;
            q39.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), gr1.b(-152365511, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxOpenGateScaffold.1
                public final void invoke(jt1 jt1Var2, int i4) {
                    if ((i4 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String strF = nr1.f(jt1Var2, R.string.intercom_messages_space_title);
                    mh4<g2b> mh4Var2 = mh4Var;
                    Integer numValueOf = Integer.valueOf(i);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i5 = IntercomTheme.$stable;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, strF, null, null, null, mh4Var2, numValueOf, false, intercomTheme.getColors(jt1Var2, i5).m767getHeader0d7_KjU(), intercomTheme.getColors(jt1Var2, i5).m771getOnHeader0d7_KjU(), 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1214047374, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxOpenGateScaffold.2
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i4) {
                    go7Var.getClass();
                    if ((i4 & 6) == 0) {
                        i4 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6 ox6VarH = eo7.h(ir9.c, go7Var);
                    ci4<jt1, Integer, g2b> ci4Var2 = ci4Var;
                    fl6 fl6VarD = dv0.d(di.a.a, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarH);
                    bt1.c.getClass();
                    qr5.a aVar = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    sh.a(ci4Var2, jt1Var2, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 805306416, 508);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ha5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxScreenKt.InboxOpenGateScaffold$lambda$2(i, mh4Var, ci4Var, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxOpenGateScaffold$lambda$2(int i, mh4 mh4Var, ci4 ci4Var, int i2, jt1 jt1Var, int i3) {
        InboxOpenGateScaffold(i, mh4Var, ci4Var, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    public static final void InboxScreen(final InboxViewModel inboxViewModel, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, final mh4<g2b> mh4Var3, final oh4<? super InboxUiEffects.NavigateToConversation, g2b> oh4Var, final int i, jt1 jt1Var, final int i2) {
        int i3;
        inboxViewModel.getClass();
        mh4Var.getClass();
        mh4Var2.getClass();
        mh4Var3.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(988563388);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(inboxViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bj4VarO.h(i) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final NetworkResponse<OpenMessengerResponse> networkResponseInboxScreen$lambda$0 = InboxScreen$lambda$0(bl7.c(inboxViewModel.getOpenState(), bj4VarO, 0));
            if (networkResponseInboxScreen$lambda$0 == null) {
                bj4VarO.K(-559116588);
                InboxOpenGateScaffold(i, mh4Var3, ComposableSingletons$InboxScreenKt.INSTANCE.m370getLambda1$intercom_sdk_base_release(), bj4VarO, ((i3 >> 6) & 112) | ((i3 >> 15) & 14) | 384);
                bj4VarO.U(false);
            } else if ((networkResponseInboxScreen$lambda$0 instanceof NetworkResponse.NetworkError) || (networkResponseInboxScreen$lambda$0 instanceof NetworkResponse.ClientError) || (networkResponseInboxScreen$lambda$0 instanceof NetworkResponse.ServerError)) {
                bj4VarO.K(-558819112);
                InboxOpenGateScaffold(i, mh4Var3, gr1.b(-157026591, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.1
                    public final void invoke(jt1 jt1Var2, int i4) {
                        ErrorState withoutCTA;
                        if ((i4 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        az3 az3Var = ir9.c;
                        jt1Var2.K(1816921353);
                        if (NetworkResponseKt.isRetryable(networkResponseInboxScreen$lambda$0)) {
                            InboxViewModel inboxViewModel2 = inboxViewModel;
                            jt1Var2.K(1816924167);
                            boolean zJ = jt1Var2.j(inboxViewModel2);
                            Object objF = jt1Var2.f();
                            if (zJ || objF == jt1.a.a) {
                                objF = new InboxScreenKt$InboxScreen$1$1$1(inboxViewModel2);
                                jt1Var2.C(objF);
                            }
                            jt1Var2.B();
                            withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, (mh4) ((yn5) objF), 15, null);
                        } else {
                            withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                        }
                        jt1Var2.B();
                        InboxErrorScreenKt.InboxErrorScreen(withoutCTA, az3Var, jt1Var2, 48, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 112) | ((i3 >> 15) & 14) | 384);
                bj4VarO.U(false);
            } else if (!(networkResponseInboxScreen$lambda$0 instanceof NetworkResponse.Success)) {
                bj4VarO.K(1090341883);
                bj4VarO.U(false);
                u.b();
                return;
            } else {
                bj4VarO.K(-558313719);
                InboxContent(inboxViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, i, bj4VarO, i3 & 524286);
                bj4VarO.U(false);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ga5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxScreenKt.InboxScreen$lambda$1(inboxViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final NetworkResponse<OpenMessengerResponse> InboxScreen$lambda$0(yz9<? extends NetworkResponse<OpenMessengerResponse>> yz9Var) {
        return yz9Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxScreen$lambda$1(InboxViewModel inboxViewModel, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        InboxScreen(inboxViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, i, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxContent$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass5 implements ei4<go7, jt1, Integer, g2b> {
        final /* synthetic */ mh4<g2b> $onBrowseHelpCenterButtonClick;
        final /* synthetic */ mh4<g2b> $onSendMessageButtonClick;
        final /* synthetic */ InboxUiState $uiState;
        final /* synthetic */ InboxViewModel $viewModel;

        public AnonymousClass5(InboxUiState inboxUiState, InboxViewModel inboxViewModel, mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
            this.$uiState = inboxUiState;
            this.$viewModel = inboxViewModel;
            this.$onSendMessageButtonClick = mh4Var;
            this.$onBrowseHelpCenterButtonClick = mh4Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$3$lambda$2(final InboxUiState inboxUiState, final InboxViewModel inboxViewModel, final mh4 mh4Var, final mh4 mh4Var2, bz5 bz5Var) {
            bz5Var.getClass();
            if (inboxUiState instanceof InboxUiState.Content) {
                InboxUiState.Content content = (InboxUiState.Content) inboxUiState;
                InboxContentScreenItemsKt.inboxContentScreenItems(bz5Var, content.getInboxConversations(), content.getTypingConversations(), new oh4() { // from class: io.intercom.android.sdk.m5.inbox.ui.k
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return InboxScreenKt.AnonymousClass5.invoke$lambda$3$lambda$2$lambda$0(inboxViewModel, (Conversation) obj);
                    }
                });
                final ErrorState errorState = content.getErrorState();
                if (errorState != null) {
                    bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, 1670986031, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxContent$5$1$1$2$1
                        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                            fv5Var.getClass();
                            if ((i & 17) == 16 && jt1Var.r()) {
                                jt1Var.u();
                            } else {
                                InboxScreenKt.InboxErrorRow(errorState, jt1Var, 0);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                            invoke(fv5Var, jt1Var, num.intValue());
                            return g2b.a;
                        }
                    }));
                }
                if (content.isLoadingMore()) {
                    bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$InboxScreenKt.INSTANCE.m372getLambda3$intercom_sdk_base_release());
                }
            } else if (inboxUiState instanceof InboxUiState.Empty) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, -1427381856, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxContent$5$1$1$3

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ActionType.values().length];
                            try {
                                iArr[ActionType.MESSAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[ActionType.HELP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                        mh4<g2b> mh4Var3;
                        fv5Var.getClass();
                        if ((i & 6) == 0) {
                            i |= jt1Var.J(fv5Var) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && jt1Var.r()) {
                            jt1Var.u();
                            return;
                        }
                        EmptyState emptyState = ((InboxUiState.Empty) inboxUiState).getEmptyState();
                        boolean showActionButton = ((InboxUiState.Empty) inboxUiState).getShowActionButton();
                        int i2 = WhenMappings.$EnumSwitchMapping$0[((InboxUiState.Empty) inboxUiState).getEmptyState().getAction().getType().ordinal()];
                        if (i2 == 1) {
                            mh4Var3 = mh4Var;
                        } else {
                            if (i2 != 2) {
                                u.b();
                                return;
                            }
                            mh4Var3 = mh4Var2;
                        }
                        InboxEmptyScreenKt.InboxEmptyScreen(emptyState, showActionButton, mh4Var3, fv5Var.a(), jt1Var, 0, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                        invoke(fv5Var, jt1Var, num.intValue());
                        return g2b.a;
                    }
                }));
            } else if (inboxUiState instanceof InboxUiState.Error) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, -81627649, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxContent$5$1$1$4
                    public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                        fv5Var.getClass();
                        if ((i & 6) == 0) {
                            i |= jt1Var.J(fv5Var) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && jt1Var.r()) {
                            jt1Var.u();
                        } else {
                            InboxErrorScreenKt.InboxErrorScreen(((InboxUiState.Error) inboxUiState).getErrorState(), fv5Var.a(), jt1Var, 0, 0);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                        invoke(fv5Var, jt1Var, num.intValue());
                        return g2b.a;
                    }
                }));
            } else if ((inboxUiState instanceof InboxUiState.Initial) || (inboxUiState instanceof InboxUiState.Loading)) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$InboxScreenKt.INSTANCE.m373getLambda4$intercom_sdk_base_release());
            }
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$3$lambda$2$lambda$0(InboxViewModel inboxViewModel, Conversation conversation) {
            conversation.getClass();
            inboxViewModel.onConversationClick(conversation);
            return g2b.a;
        }

        public final void invoke(go7 go7Var, jt1 jt1Var, int i) {
            int i2;
            go7Var.getClass();
            if ((i & 6) == 0) {
                i2 = (jt1Var.J(go7Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarB = hnb.b(ir9.c, go7Var);
            jt1Var.K(1124491879);
            boolean zJ = jt1Var.j(this.$uiState) | jt1Var.j(this.$viewModel) | jt1Var.J(this.$onSendMessageButtonClick) | jt1Var.J(this.$onBrowseHelpCenterButtonClick);
            final InboxUiState inboxUiState = this.$uiState;
            final InboxViewModel inboxViewModel = this.$viewModel;
            final mh4<g2b> mh4Var = this.$onSendMessageButtonClick;
            final mh4<g2b> mh4Var2 = this.$onBrowseHelpCenterButtonClick;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.inbox.ui.j
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return InboxScreenKt.AnonymousClass5.invoke$lambda$3$lambda$2(inboxUiState, inboxViewModel, mh4Var, mh4Var2, (bz5) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            ys5.a(ox6VarB, null, go7Var, null, di.a.n, null, false, null, (oh4) objF, jt1Var, ((i2 << 6) & 896) | 196608, 474);
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var, Integer num) {
            invoke(go7Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
