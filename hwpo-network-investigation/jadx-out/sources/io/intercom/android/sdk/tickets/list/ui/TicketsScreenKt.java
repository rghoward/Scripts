package io.intercom.android.sdk.tickets.list.ui;

import android.view.View;
import defpackage.aj1;
import defpackage.al8;
import defpackage.az3;
import defpackage.az5;
import defpackage.bj3;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.er0;
import defpackage.fl6;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hnb;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.kk;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.q39;
import defpackage.qk5;
import defpackage.qr5;
import defpackage.raa;
import defpackage.rd7;
import defpackage.s12;
import defpackage.u;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.ys5;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsScreenKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void TicketsScreen(final TicketsScreenUiState ticketsScreenUiState, final mh4<g2b> mh4Var, oh4<? super String, g2b> oh4Var, final int i, jt1 jt1Var, final int i2, final int i3) {
        int i4;
        oh4<? super String, g2b> oh4Var2;
        int i5;
        final oh4<? super String, g2b> oh4Var3;
        bj4 bj4Var;
        Object objF;
        xj8 xj8VarW;
        ticketsScreenUiState.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1552213693);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (bj4VarO.J(ticketsScreenUiState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 384) == 0) {
                oh4Var2 = oh4Var;
                i4 |= bj4VarO.j(oh4Var2) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (bj4VarO.h(i)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 1171) == 1170 || !bj4VarO.r()) {
                if (i6 != 0) {
                    bj4VarO.K(1435034320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new bj3(1);
                        bj4VarO.C(objF);
                    }
                    oh4Var3 = (oh4) objF;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                ox6 ox6VarC = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), "tickets_screen"), gr1.b(-1473942521, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                    public final void invoke(jt1 jt1Var2, int i7) {
                        if ((i7 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String screenLabel = ticketsScreenUiState.getScreenLabel();
                        mh4<g2b> mh4Var2 = mh4Var;
                        Integer numValueOf = Integer.valueOf(i);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i8 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, screenLabel, null, null, null, mh4Var2, numValueOf, false, intercomTheme.getColors(jt1Var2, i8).m767getHeader0d7_KjU(), intercomTheme.getColors(jt1Var2, i8).m771getOnHeader0d7_KjU(), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(-1690440366, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                    public final void invoke(go7 go7Var, jt1 jt1Var2, int i7) {
                        go7Var.getClass();
                        if ((i7 & 6) == 0) {
                            i7 |= jt1Var2.J(go7Var) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketsScreenUiState ticketsScreenUiState2 = ticketsScreenUiState;
                        if (ticketsScreenUiState2 instanceof TicketsScreenUiState.Content) {
                            jt1Var2.K(1161790631);
                            TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) ticketsScreenUiState, go7Var, oh4Var3, jt1Var2, 8 | ((i7 << 3) & 112), 0);
                            jt1Var2.B();
                            return;
                        }
                        boolean z = ticketsScreenUiState2 instanceof TicketsScreenUiState.Empty;
                        ox6.a aVar = ox6.a.t;
                        if (z) {
                            jt1Var2.K(1161992379);
                            TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) ticketsScreenUiState).getEmptyState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (ticketsScreenUiState2 instanceof TicketsScreenUiState.Error) {
                            jt1Var2.K(1162174752);
                            TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) ticketsScreenUiState).getErrorState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if ((ticketsScreenUiState2 instanceof TicketsScreenUiState.Initial) || (ticketsScreenUiState2 instanceof TicketsScreenUiState.Loading)) {
                            jt1Var2.K(2115705620);
                            TicketsLoadingScreenKt.TicketsLoadingScreen(eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(2115686166);
                            jt1Var2.B();
                            u.b();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                        invoke(go7Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 805306416, 508);
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                oh4Var3 = oh4Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: pma
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketsScreenKt.TicketsScreen$lambda$2(ticketsScreenUiState, mh4Var, oh4Var3, i, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 384;
        oh4Var2 = oh4Var;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (bj4VarO.h(i)) {
                i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 1171) == 1170) {
            if (i6 != 0) {
                bj4VarO.K(1435034320);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new bj3(1);
                    bj4VarO.C(objF);
                }
                oh4Var3 = (oh4) objF;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            ox6 ox6VarC2 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap2 = fnb.w;
            bj4Var = bj4VarO;
            q39.a(raa.a(hnb.c(ox6VarC2, fnb.a.c(bj4VarO).b), "tickets_screen"), gr1.b(-1473942521, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String screenLabel = ticketsScreenUiState.getScreenLabel();
                    mh4<g2b> mh4Var2 = mh4Var;
                    Integer numValueOf = Integer.valueOf(i);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, screenLabel, null, null, null, mh4Var2, numValueOf, false, intercomTheme.getColors(jt1Var2, i8).m767getHeader0d7_KjU(), intercomTheme.getColors(jt1Var2, i8).m771getOnHeader0d7_KjU(), 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(-1690440366, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i7) {
                    go7Var.getClass();
                    if ((i7 & 6) == 0) {
                        i7 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i7 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    TicketsScreenUiState ticketsScreenUiState2 = ticketsScreenUiState;
                    if (ticketsScreenUiState2 instanceof TicketsScreenUiState.Content) {
                        jt1Var2.K(1161790631);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) ticketsScreenUiState, go7Var, oh4Var3, jt1Var2, 8 | ((i7 << 3) & 112), 0);
                        jt1Var2.B();
                        return;
                    }
                    boolean z = ticketsScreenUiState2 instanceof TicketsScreenUiState.Empty;
                    ox6.a aVar = ox6.a.t;
                    if (z) {
                        jt1Var2.K(1161992379);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) ticketsScreenUiState).getEmptyState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (ticketsScreenUiState2 instanceof TicketsScreenUiState.Error) {
                        jt1Var2.K(1162174752);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) ticketsScreenUiState).getErrorState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if ((ticketsScreenUiState2 instanceof TicketsScreenUiState.Initial) || (ticketsScreenUiState2 instanceof TicketsScreenUiState.Loading)) {
                        jt1Var2.K(2115705620);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(2115686166);
                        jt1Var2.B();
                        u.b();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 805306416, 508);
        } else {
            if (i6 != 0) {
                bj4VarO.K(1435034320);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new bj3(1);
                    bj4VarO.C(objF);
                }
                oh4Var3 = (oh4) objF;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            ox6 ox6VarC3 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap3 = fnb.w;
            bj4Var = bj4VarO;
            q39.a(raa.a(hnb.c(ox6VarC3, fnb.a.c(bj4VarO).b), "tickets_screen"), gr1.b(-1473942521, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String screenLabel = ticketsScreenUiState.getScreenLabel();
                    mh4<g2b> mh4Var2 = mh4Var;
                    Integer numValueOf = Integer.valueOf(i);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, screenLabel, null, null, null, mh4Var2, numValueOf, false, intercomTheme.getColors(jt1Var2, i8).m767getHeader0d7_KjU(), intercomTheme.getColors(jt1Var2, i8).m771getOnHeader0d7_KjU(), 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(-1690440366, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i7) {
                    go7Var.getClass();
                    if ((i7 & 6) == 0) {
                        i7 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i7 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    TicketsScreenUiState ticketsScreenUiState2 = ticketsScreenUiState;
                    if (ticketsScreenUiState2 instanceof TicketsScreenUiState.Content) {
                        jt1Var2.K(1161790631);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) ticketsScreenUiState, go7Var, oh4Var3, jt1Var2, 8 | ((i7 << 3) & 112), 0);
                        jt1Var2.B();
                        return;
                    }
                    boolean z = ticketsScreenUiState2 instanceof TicketsScreenUiState.Empty;
                    ox6.a aVar = ox6.a.t;
                    if (z) {
                        jt1Var2.K(1161992379);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) ticketsScreenUiState).getEmptyState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (ticketsScreenUiState2 instanceof TicketsScreenUiState.Error) {
                        jt1Var2.K(1162174752);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) ticketsScreenUiState).getErrorState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if ((ticketsScreenUiState2 instanceof TicketsScreenUiState.Initial) || (ticketsScreenUiState2 instanceof TicketsScreenUiState.Loading)) {
                        jt1Var2.K(2115705620);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(2115686166);
                        jt1Var2.B();
                        u.b();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 805306416, 508);
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: pma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketsScreenKt.TicketsScreen$lambda$2(ticketsScreenUiState, mh4Var, oh4Var3, i, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsScreen$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsScreen$lambda$2(TicketsScreenUiState ticketsScreenUiState, mh4 mh4Var, oh4 oh4Var, int i, int i2, int i3, jt1 jt1Var, int i4) {
        TicketsScreen(ticketsScreenUiState, mh4Var, oh4Var, i, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void TicketsScreenContent(final TicketsScreenUiState.Content content, go7 go7Var, oh4<? super String, g2b> oh4Var, jt1 jt1Var, int i, int i2) {
        int i3;
        go7 go7Var2;
        oh4<? super String, g2b> oh4Var2;
        jt1.a.C0187a c0187a;
        int i4;
        final oh4<? super String, g2b> oh4Var3;
        int i5;
        int i6;
        Object objF;
        Object objF2;
        xj8 xj8VarW;
        content.getClass();
        go7Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1912868973);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bj4VarO.J(content) : bj4VarO.j(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            go7Var2 = go7Var;
        } else {
            go7Var2 = go7Var;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(go7Var2) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                oh4Var2 = oh4Var;
                i3 |= bj4VarO.j(oh4Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                c0187a = jt1.a.a;
                i4 = 1;
                if (i7 != 0) {
                    bj4VarO.K(1467405837);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new er0(i4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                az3 az3Var = ir9.c;
                bj4VarO.K(1467411420);
                if ((i3 & 14) != 4 || ((i3 & 8) != 0 && bj4VarO.j(content))) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                i6 = i5 | ((i3 & 896) != 256 ? 0 : 1);
                objF = bj4VarO.f();
                if (i6 == 0 || objF == c0187a) {
                    objF = new oh4() { // from class: oma
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TicketsScreenKt.TicketsScreenContent$lambda$6$lambda$5(content, oh4Var3, (bz5) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ys5.a(az3Var, null, go7Var2, null, null, null, false, null, (oh4) objF, bj4VarO, ((i3 << 3) & 896) | 6, 506);
            } else {
                bj4VarO.u();
                oh4Var3 = oh4Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new s12(content, go7Var, oh4Var3, i, i2, 1);
            }
        }
        i3 |= 384;
        oh4Var2 = oh4Var;
        if ((i3 & 147) == 146) {
            c0187a = jt1.a.a;
            i4 = 1;
            if (i7 != 0) {
                bj4VarO.K(1467405837);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new er0(i4);
                    bj4VarO.C(objF2);
                }
                oh4Var3 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            az3 az3Var2 = ir9.c;
            bj4VarO.K(1467411420);
            if ((i3 & 14) != 4) {
                i5 = 1;
            } else {
                i5 = 1;
            }
            i6 = i5 | ((i3 & 896) != 256 ? 0 : 1);
            objF = bj4VarO.f();
            if (i6 == 0) {
                objF = new oh4() { // from class: oma
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$6$lambda$5(content, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: oma
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$6$lambda$5(content, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ys5.a(az3Var2, null, go7Var2, null, null, null, false, null, (oh4) objF, bj4VarO, ((i3 << 3) & 896) | 6, 506);
        } else {
            c0187a = jt1.a.a;
            i4 = 1;
            if (i7 != 0) {
                bj4VarO.K(1467405837);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new er0(i4);
                    bj4VarO.C(objF2);
                }
                oh4Var3 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            az3 az3Var3 = ir9.c;
            bj4VarO.K(1467411420);
            if ((i3 & 14) != 4) {
                i5 = 1;
            } else {
                i5 = 1;
            }
            i6 = i5 | ((i3 & 896) != 256 ? 0 : 1);
            objF = bj4VarO.f();
            if (i6 == 0) {
                objF = new oh4() { // from class: oma
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$6$lambda$5(content, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: oma
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$6$lambda$5(content, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ys5.a(az3Var3, null, go7Var2, null, null, null, false, null, (oh4) objF, bj4VarO, ((i3 << 3) & 896) | 6, 506);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new s12(content, go7Var, oh4Var3, i, i2, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsScreenContent$lambda$4$lambda$3(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b TicketsScreenContent$lambda$6$lambda$5(TicketsScreenUiState.Content content, oh4 oh4Var, bz5 bz5Var) {
        bz5Var.getClass();
        bz5Var.a(((qk5) content.getLazyPagingTickets().d.getValue()).d(), null, az5.t, new fr1(true, 264752689, new TicketsScreenKt$TicketsScreenContent$2$1$1(content, oh4Var)));
        final ErrorState errorState = content.getErrorState();
        if (errorState != null) {
            bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, -1511938327, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$1$2
                public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                    fv5Var.getClass();
                    if ((i & 17) == 16 && jt1Var.r()) {
                        jt1Var.u();
                        return;
                    }
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarC = ir9.c(eo7.k(aVar, 0.0f, 16.0f, 1), 1.0f);
                    final ErrorState errorState2 = errorState;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var.v());
                    kw7 kw7VarY = jt1Var.y();
                    ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
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
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var, cVar, fl6VarD);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar = bt1.a.g;
                    rd7.d(jt1Var, bVar, numValueOf);
                    bt1.a.C0034a c0034a = bt1.a.h;
                    rd7.c(jt1Var, c0034a);
                    bt1.a.d dVar = bt1.a.d;
                    rd7.d(jt1Var, dVar, ox6VarC2);
                    aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var, 48);
                    int iHashCode2 = Long.hashCode(jt1Var.v());
                    kw7 kw7VarY2 = jt1Var.y();
                    ox6 ox6VarC3 = it1.c(jt1Var, aVar);
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
                    rd7.d(jt1Var, cVar, aj1VarA);
                    rd7.d(jt1Var, eVar, kw7VarY2);
                    g3.c(iHashCode2, jt1Var, bVar, jt1Var, c0034a);
                    rd7.d(jt1Var, dVar, ox6VarC3);
                    mia.b(nr1.f(jt1Var, errorState2.getMessageResId()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var, 0, 0, 262142);
                    jt1Var.K(-1943408455);
                    if (errorState2 instanceof ErrorState.WithCTA) {
                        jz0.c(((ErrorState.WithCTA) errorState2).getOnCtaClick(), null, false, null, null, null, gr1.b(-774229187, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$1$2$1$1$1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i2) {
                                oy8Var.getClass();
                                if ((i2 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(nr1.f(jt1Var2, ((ErrorState.WithCTA) errorState2).getCtaResId()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var), jt1Var, 805306368, 510);
                    }
                    jt1Var.B();
                    jt1Var.I();
                    jt1Var.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                    invoke(fv5Var, jt1Var, num.intValue());
                    return g2b.a;
                }
            }));
        }
        if (content.isLoadingMore()) {
            bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$TicketsScreenKt.INSTANCE.m547getLambda1$intercom_sdk_base_release());
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsScreenContent$lambda$7(TicketsScreenUiState.Content content, go7 go7Var, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        TicketsScreenContent(content, go7Var, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
