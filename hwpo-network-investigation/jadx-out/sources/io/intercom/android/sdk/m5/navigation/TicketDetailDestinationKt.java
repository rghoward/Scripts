package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.intercom.twig.BuildConfig;
import defpackage.a68;
import defpackage.ah5;
import defpackage.al8;
import defpackage.b56;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.cg8;
import defpackage.ci4;
import defpackage.dq1;
import defpackage.dq5;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h47;
import defpackage.h91;
import defpackage.hnb;
import defpackage.i67;
import defpackage.j67;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.k29;
import defpackage.k77;
import defpackage.kk;
import defpackage.ky7;
import defpackage.l77;
import defpackage.ly7;
import defpackage.m77;
import defpackage.mh4;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p47;
import defpackage.q39;
import defpackage.q47;
import defpackage.r47;
import defpackage.r56;
import defpackage.raa;
import defpackage.ru;
import defpackage.th3;
import defpackage.u47;
import defpackage.v56;
import defpackage.whb;
import defpackage.ws0;
import defpackage.xc6;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xla;
import defpackage.yn5;
import defpackage.zg5;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketDetailViewModel;
import io.intercom.android.sdk.tickets.TicketDetailsLoadingScreenKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailDestinationKt {
    public static final String LAUNCHED_FROM = "from";
    public static final String SHOW_SUBMISSION_CARD = "show_submission_card";
    public static final String TICKET_ID = "ticket_id";

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00a8, please report this as an issue */
    public static final void TicketDetailScreen(final TicketDetailState ticketDetailState, mh4<g2b> mh4Var, ci4<? super String, ? super Boolean, g2b> ci4Var, boolean z, final boolean z2, jt1 jt1Var, final int i, final int i2) {
        int i3;
        mh4<g2b> mh4Var2;
        int i4;
        ci4<? super String, ? super Boolean, g2b> ci4Var2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        jt1.a.C0187a c0187a;
        final mh4<g2b> mh4Var3;
        ci4<? super String, ? super Boolean, g2b> ci4Var3;
        bj4 bj4Var;
        final boolean z4;
        final mh4<g2b> mh4Var4;
        final ci4<? super String, ? super Boolean, g2b> ci4Var4;
        Object objF;
        Object objF2;
        xj8 xj8VarW;
        ticketDetailState.getClass();
        bj4 bj4VarO = jt1Var.o(226165078);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ticketDetailState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                mh4Var2 = mh4Var;
                i3 |= bj4VarO.j(mh4Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z3 = z;
                        if (bj4VarO.c(z3)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        if (bj4VarO.c(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                        c0187a = jt1.a.a;
                        if (i9 != 0) {
                            bj4VarO.K(1672816883);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new b56(3);
                                bj4VarO.C(objF2);
                            }
                            mh4Var3 = (mh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        if (i4 != 0) {
                            bj4VarO.K(1672818908);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new dq5(1);
                                bj4VarO.C(objF);
                            }
                            ci4Var3 = (ci4) objF;
                            bj4VarO.U(false);
                        } else {
                            ci4Var3 = ci4Var2;
                        }
                        boolean z5 = i6 == 0 ? z3 : false;
                        ox6 ox6VarC = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                        WeakHashMap<View, fnb> weakHashMap = fnb.w;
                        bj4Var = bj4VarO;
                        q39.a(raa.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                            public final void invoke(jt1 jt1Var2, int i10) {
                                String ticketName;
                                if ((i10 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                TicketDetailState ticketDetailState2 = ticketDetailState;
                                TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                                if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                    ticketName = BuildConfig.FLAVOR;
                                }
                                mh4<g2b> mh4Var5 = mh4Var3;
                                Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i11 = IntercomTheme.$stable;
                                TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                        ci4<? super String, ? super Boolean, g2b> ci4Var5 = ci4Var3;
                        z4 = z5;
                        mh4Var4 = mh4Var3;
                        ci4Var4 = ci4Var5;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        mh4Var4 = mh4Var2;
                        ci4Var4 = ci4Var2;
                        z4 = z3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: wla
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                z3 = z;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (bj4VarO.c(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) == 9362) {
                    c0187a = jt1.a.a;
                    if (i9 != 0) {
                        bj4VarO.K(1672816883);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b56(3);
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1672818908);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new dq5(1);
                            bj4VarO.C(objF);
                        }
                        ci4Var3 = (ci4) objF;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    if (i6 == 0) {
                    }
                    ox6 ox6VarC2 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap2 = fnb.w;
                    bj4Var = bj4VarO;
                    q39.a(raa.a(hnb.c(ox6VarC2, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            String ticketName;
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = BuildConfig.FLAVOR;
                            }
                            mh4<g2b> mh4Var5 = mh4Var3;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                    ci4<? super String, ? super Boolean, g2b> ci4Var6 = ci4Var3;
                    z4 = z5;
                    mh4Var4 = mh4Var3;
                    ci4Var4 = ci4Var6;
                } else {
                    c0187a = jt1.a.a;
                    if (i9 != 0) {
                        bj4VarO.K(1672816883);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b56(3);
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1672818908);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new dq5(1);
                            bj4VarO.C(objF);
                        }
                        ci4Var3 = (ci4) objF;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    if (i6 == 0) {
                    }
                    ox6 ox6VarC3 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap3 = fnb.w;
                    bj4Var = bj4VarO;
                    q39.a(raa.a(hnb.c(ox6VarC3, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            String ticketName;
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = BuildConfig.FLAVOR;
                            }
                            mh4<g2b> mh4Var5 = mh4Var3;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                    ci4<? super String, ? super Boolean, g2b> ci4Var7 = ci4Var3;
                    z4 = z5;
                    mh4Var4 = mh4Var3;
                    ci4Var4 = ci4Var7;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: wla
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            ci4Var2 = ci4Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (bj4VarO.c(z3)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (bj4VarO.c(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) == 9362) {
                    c0187a = jt1.a.a;
                    if (i9 != 0) {
                        bj4VarO.K(1672816883);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b56(3);
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1672818908);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new dq5(1);
                            bj4VarO.C(objF);
                        }
                        ci4Var3 = (ci4) objF;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    if (i6 == 0) {
                    }
                    ox6 ox6VarC4 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap4 = fnb.w;
                    bj4Var = bj4VarO;
                    q39.a(raa.a(hnb.c(ox6VarC4, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            String ticketName;
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = BuildConfig.FLAVOR;
                            }
                            mh4<g2b> mh4Var5 = mh4Var3;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                    ci4<? super String, ? super Boolean, g2b> ci4Var8 = ci4Var3;
                    z4 = z5;
                    mh4Var4 = mh4Var3;
                    ci4Var4 = ci4Var8;
                } else {
                    c0187a = jt1.a.a;
                    if (i9 != 0) {
                        bj4VarO.K(1672816883);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b56(3);
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1672818908);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new dq5(1);
                            bj4VarO.C(objF);
                        }
                        ci4Var3 = (ci4) objF;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    if (i6 == 0) {
                    }
                    ox6 ox6VarC5 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap5 = fnb.w;
                    bj4Var = bj4VarO;
                    q39.a(raa.a(hnb.c(ox6VarC5, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            String ticketName;
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = BuildConfig.FLAVOR;
                            }
                            mh4<g2b> mh4Var5 = mh4Var3;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                    ci4<? super String, ? super Boolean, g2b> ci4Var9 = ci4Var3;
                    z4 = z5;
                    mh4Var4 = mh4Var3;
                    ci4Var4 = ci4Var9;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: wla
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bj4VarO.c(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) == 9362) {
                c0187a = jt1.a.a;
                if (i9 != 0) {
                    bj4VarO.K(1672816883);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b56(3);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1672818908);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new dq5(1);
                        bj4VarO.C(objF);
                    }
                    ci4Var3 = (ci4) objF;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                if (i6 == 0) {
                }
                ox6 ox6VarC6 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap6 = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC6, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        String ticketName;
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = BuildConfig.FLAVOR;
                        }
                        mh4<g2b> mh4Var5 = mh4Var3;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                ci4<? super String, ? super Boolean, g2b> ci4Var10 = ci4Var3;
                z4 = z5;
                mh4Var4 = mh4Var3;
                ci4Var4 = ci4Var10;
            } else {
                c0187a = jt1.a.a;
                if (i9 != 0) {
                    bj4VarO.K(1672816883);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b56(3);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1672818908);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new dq5(1);
                        bj4VarO.C(objF);
                    }
                    ci4Var3 = (ci4) objF;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                if (i6 == 0) {
                }
                ox6 ox6VarC7 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap7 = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC7, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        String ticketName;
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = BuildConfig.FLAVOR;
                        }
                        mh4<g2b> mh4Var5 = mh4Var3;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                ci4<? super String, ? super Boolean, g2b> ci4Var11 = ci4Var3;
                z4 = z5;
                mh4Var4 = mh4Var3;
                ci4Var4 = ci4Var11;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: wla
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        mh4Var2 = mh4Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (bj4VarO.c(z3)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (bj4VarO.c(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) == 9362) {
                    c0187a = jt1.a.a;
                    if (i9 != 0) {
                        bj4VarO.K(1672816883);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b56(3);
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1672818908);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new dq5(1);
                            bj4VarO.C(objF);
                        }
                        ci4Var3 = (ci4) objF;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    if (i6 == 0) {
                    }
                    ox6 ox6VarC8 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap8 = fnb.w;
                    bj4Var = bj4VarO;
                    q39.a(raa.a(hnb.c(ox6VarC8, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            String ticketName;
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = BuildConfig.FLAVOR;
                            }
                            mh4<g2b> mh4Var5 = mh4Var3;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                    ci4<? super String, ? super Boolean, g2b> ci4Var12 = ci4Var3;
                    z4 = z5;
                    mh4Var4 = mh4Var3;
                    ci4Var4 = ci4Var12;
                } else {
                    c0187a = jt1.a.a;
                    if (i9 != 0) {
                        bj4VarO.K(1672816883);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b56(3);
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1672818908);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new dq5(1);
                            bj4VarO.C(objF);
                        }
                        ci4Var3 = (ci4) objF;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    if (i6 == 0) {
                    }
                    ox6 ox6VarC9 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap9 = fnb.w;
                    bj4Var = bj4VarO;
                    q39.a(raa.a(hnb.c(ox6VarC9, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            String ticketName;
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = BuildConfig.FLAVOR;
                            }
                            mh4<g2b> mh4Var5 = mh4Var3;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                    ci4<? super String, ? super Boolean, g2b> ci4Var13 = ci4Var3;
                    z4 = z5;
                    mh4Var4 = mh4Var3;
                    ci4Var4 = ci4Var13;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: wla
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bj4VarO.c(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) == 9362) {
                c0187a = jt1.a.a;
                if (i9 != 0) {
                    bj4VarO.K(1672816883);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b56(3);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1672818908);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new dq5(1);
                        bj4VarO.C(objF);
                    }
                    ci4Var3 = (ci4) objF;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                if (i6 == 0) {
                }
                ox6 ox6VarC10 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap10 = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC10, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        String ticketName;
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = BuildConfig.FLAVOR;
                        }
                        mh4<g2b> mh4Var5 = mh4Var3;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                ci4<? super String, ? super Boolean, g2b> ci4Var14 = ci4Var3;
                z4 = z5;
                mh4Var4 = mh4Var3;
                ci4Var4 = ci4Var14;
            } else {
                c0187a = jt1.a.a;
                if (i9 != 0) {
                    bj4VarO.K(1672816883);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b56(3);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1672818908);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new dq5(1);
                        bj4VarO.C(objF);
                    }
                    ci4Var3 = (ci4) objF;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                if (i6 == 0) {
                }
                ox6 ox6VarC11 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap11 = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC11, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        String ticketName;
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = BuildConfig.FLAVOR;
                        }
                        mh4<g2b> mh4Var5 = mh4Var3;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                ci4<? super String, ? super Boolean, g2b> ci4Var15 = ci4Var3;
                z4 = z5;
                mh4Var4 = mh4Var3;
                ci4Var4 = ci4Var15;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: wla
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ci4Var2 = ci4Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (bj4VarO.c(z3)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bj4VarO.c(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) == 9362) {
                c0187a = jt1.a.a;
                if (i9 != 0) {
                    bj4VarO.K(1672816883);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b56(3);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1672818908);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new dq5(1);
                        bj4VarO.C(objF);
                    }
                    ci4Var3 = (ci4) objF;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                if (i6 == 0) {
                }
                ox6 ox6VarC12 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap12 = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC12, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        String ticketName;
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = BuildConfig.FLAVOR;
                        }
                        mh4<g2b> mh4Var5 = mh4Var3;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                ci4<? super String, ? super Boolean, g2b> ci4Var16 = ci4Var3;
                z4 = z5;
                mh4Var4 = mh4Var3;
                ci4Var4 = ci4Var16;
            } else {
                c0187a = jt1.a.a;
                if (i9 != 0) {
                    bj4VarO.K(1672816883);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b56(3);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1672818908);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new dq5(1);
                        bj4VarO.C(objF);
                    }
                    ci4Var3 = (ci4) objF;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                if (i6 == 0) {
                }
                ox6 ox6VarC13 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
                WeakHashMap<View, fnb> weakHashMap13 = fnb.w;
                bj4Var = bj4VarO;
                q39.a(raa.a(hnb.c(ox6VarC13, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        String ticketName;
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = BuildConfig.FLAVOR;
                        }
                        mh4<g2b> mh4Var5 = mh4Var3;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
                ci4<? super String, ? super Boolean, g2b> ci4Var17 = ci4Var3;
                z4 = z5;
                mh4Var4 = mh4Var3;
                ci4Var4 = ci4Var17;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: wla
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (bj4VarO.c(z2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362) {
            c0187a = jt1.a.a;
            if (i9 != 0) {
                bj4VarO.K(1672816883);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new b56(3);
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            if (i4 != 0) {
                bj4VarO.K(1672818908);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new dq5(1);
                    bj4VarO.C(objF);
                }
                ci4Var3 = (ci4) objF;
                bj4VarO.U(false);
            } else {
                ci4Var3 = ci4Var2;
            }
            if (i6 == 0) {
            }
            ox6 ox6VarC14 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap14 = fnb.w;
            bj4Var = bj4VarO;
            q39.a(raa.a(hnb.c(ox6VarC14, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                public final void invoke(jt1 jt1Var2, int i10) {
                    String ticketName;
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    TicketDetailState ticketDetailState2 = ticketDetailState;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                        ticketName = BuildConfig.FLAVOR;
                    }
                    mh4<g2b> mh4Var5 = mh4Var3;
                    Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i11 = IntercomTheme.$stable;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
            ci4<? super String, ? super Boolean, g2b> ci4Var18 = ci4Var3;
            z4 = z5;
            mh4Var4 = mh4Var3;
            ci4Var4 = ci4Var18;
        } else {
            c0187a = jt1.a.a;
            if (i9 != 0) {
                bj4VarO.K(1672816883);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new b56(3);
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            if (i4 != 0) {
                bj4VarO.K(1672818908);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new dq5(1);
                    bj4VarO.C(objF);
                }
                ci4Var3 = (ci4) objF;
                bj4VarO.U(false);
            } else {
                ci4Var3 = ci4Var2;
            }
            if (i6 == 0) {
            }
            ox6 ox6VarC15 = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap15 = fnb.w;
            bj4Var = bj4VarO;
            q39.a(raa.a(hnb.c(ox6VarC15, fnb.a.c(bj4VarO).b), "ticket_detail_screen"), gr1.b(-2018170598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                public final void invoke(jt1 jt1Var2, int i10) {
                    String ticketName;
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    TicketDetailState ticketDetailState2 = ticketDetailState;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                        ticketName = BuildConfig.FLAVOR;
                    }
                    mh4<g2b> mh4Var5 = mh4Var3;
                    Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i11 = IntercomTheme.$stable;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, ticketName, null, null, null, mh4Var5, numValueOf, false, zg5.a(intercomTheme, jt1Var2, i11), ah5.a(intercomTheme, jt1Var2, i11), 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(1401868325, new AnonymousClass4(ticketDetailState, ci4Var3, z2, z5), bj4VarO), bj4Var, 805306416, 508);
            ci4<? super String, ? super Boolean, g2b> ci4Var19 = ci4Var3;
            z4 = z5;
            mh4Var4 = mh4Var3;
            ci4Var4 = ci4Var19;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wla
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketDetailDestinationKt.TicketDetailScreen$lambda$21(ticketDetailState, mh4Var4, ci4Var4, z4, z2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketDetailScreen$lambda$20$lambda$19(String str, boolean z) {
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketDetailScreen$lambda$21(TicketDetailState ticketDetailState, mh4 mh4Var, ci4 ci4Var, boolean z, boolean z2, int i, int i2, jt1 jt1Var, int i3) {
        TicketDetailScreen(ticketDetailState, mh4Var, ci4Var, z, z2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void ticketDetailDestination(i67 i67Var, final o67 o67Var, final dq1 dq1Var) {
        i67Var.getClass();
        o67Var.getClass();
        dq1Var.getClass();
        q47 q47Var = new q47();
        ticketDetailDestination$lambda$2(q47Var);
        p47.a aVar = q47Var.a;
        m77<Object> m77VarB = aVar.a;
        if (m77VarB == null) {
            m77.b bVar = m77.Companion;
            Object obj = aVar.c;
            bVar.getClass();
            m77VarB = m77.b.b(obj);
        }
        h47 h47Var = new h47(SHOW_SUBMISSION_CARD, new p47(m77VarB, aVar.b, aVar.c, aVar.d));
        q47 q47Var2 = new q47();
        ticketDetailDestination$lambda$3(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        h47 h47Var2 = new h47("transitionArgs", new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d));
        q47 q47Var3 = new q47();
        ticketDetailDestination$lambda$4(q47Var3);
        p47.a aVar3 = q47Var3.a;
        m77<Object> m77VarB3 = aVar3.a;
        if (m77VarB3 == null) {
            m77.b bVar3 = m77.Companion;
            Object obj3 = aVar3.c;
            bVar3.getClass();
            m77VarB3 = m77.b.b(obj3);
        }
        List listI = ws0.i(h47Var, h47Var2, new h47("isLaunchedProgrammatically", new p47(m77VarB3, aVar3.b, aVar3.c, aVar3.d)));
        int i = 1;
        int i2 = 2;
        j67.a(i67Var, "TICKET_DETAIL?show_submission_card={show_submission_card}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", listI, new ly7(i), new k29(i), new v56(i2), new h91(i2), new fr1(true, -1948427665, new fi4<nu, r47, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.ticketDetailDestination.8
            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i3) {
                nuVar.getClass();
                r47Var.getClass();
                u47 u47Var = r47Var.A;
                Bundle bundleA = u47Var.a();
                boolean z = bundleA != null ? bundleA.getBoolean(TicketDetailDestinationKt.SHOW_SUBMISSION_CARD) : false;
                Bundle bundleA2 = u47Var.a();
                boolean z2 = bundleA2 != null ? bundleA2.getBoolean("isLaunchedProgrammatically") : false;
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
                whb whbVarA = xc6.a(jt1Var);
                if (whbVarA == null) {
                    whbVarA = dq1Var;
                }
                TicketDetailState ticketDetailState = (TicketDetailState) bl7.c(companion.create(whbVarA, new TicketLaunchedFrom.Conversation(null, 1, 0 == true ? 1 : 0)).getStateFlow(), jt1Var, 0).getValue();
                jt1Var.K(447655767);
                boolean zJ = jt1Var.j(o67Var) | jt1Var.j(dq1Var);
                o67 o67Var2 = o67Var;
                dq1 dq1Var2 = dq1Var;
                Object objF = jt1Var.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (zJ || objF == c0187a) {
                    objF = new TicketDetailDestinationKt$ticketDetailDestination$8$1$1(o67Var2, dq1Var2);
                    jt1Var.C(objF);
                }
                jt1Var.B();
                mh4 mh4Var = (mh4) ((yn5) objF);
                jt1Var.K(447657570);
                boolean zJ2 = jt1Var.j(o67Var);
                o67 o67Var3 = o67Var;
                Object objF2 = jt1Var.f();
                if (zJ2 || objF2 == c0187a) {
                    objF2 = new TicketDetailDestinationKt$ticketDetailDestination$8$2$1(o67Var3);
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                TicketDetailDestinationKt.TicketDetailScreen(ticketDetailState, mh4Var, (ci4) ((yn5) objF2), z, z2, jt1Var, 0, 0);
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
                invoke(nuVar, r47Var, jt1Var, num.intValue());
                return g2b.a;
            }
        }), 132);
        q47 q47Var4 = new q47();
        ticketDetailDestination$lambda$9(q47Var4);
        p47.a aVar4 = q47Var4.a;
        m77<Object> m77VarB4 = aVar4.a;
        if (m77VarB4 == null) {
            m77.b bVar4 = m77.Companion;
            Object obj4 = aVar4.c;
            bVar4.getClass();
            m77VarB4 = m77.b.b(obj4);
        }
        h47 h47Var3 = new h47(TICKET_ID, new p47(m77VarB4, aVar4.b, aVar4.c, aVar4.d));
        q47 q47Var5 = new q47();
        ticketDetailDestination$lambda$10(q47Var5);
        p47.a aVar5 = q47Var5.a;
        m77<Object> m77VarB5 = aVar5.a;
        if (m77VarB5 == null) {
            m77.b bVar5 = m77.Companion;
            Object obj5 = aVar5.c;
            bVar5.getClass();
            m77VarB5 = m77.b.b(obj5);
        }
        h47 h47Var4 = new h47(LAUNCHED_FROM, new p47(m77VarB5, aVar5.b, aVar5.c, aVar5.d));
        q47 q47Var6 = new q47();
        ticketDetailDestination$lambda$11(q47Var6);
        p47.a aVar6 = q47Var6.a;
        m77<Object> m77VarB6 = aVar6.a;
        if (m77VarB6 == null) {
            m77.b bVar6 = m77.Companion;
            Object obj6 = aVar6.c;
            bVar6.getClass();
            m77VarB6 = m77.b.b(obj6);
        }
        h47 h47Var5 = new h47("transitionArgs", new p47(m77VarB6, aVar6.b, aVar6.c, aVar6.d));
        q47 q47Var7 = new q47();
        ticketDetailDestination$lambda$12(q47Var7);
        p47.a aVar7 = q47Var7.a;
        m77<Object> m77VarB7 = aVar7.a;
        if (m77VarB7 == null) {
            m77.b bVar7 = m77.Companion;
            Object obj7 = aVar7.c;
            bVar7.getClass();
            m77VarB7 = m77.b.b(obj7);
        }
        j67.a(i67Var, "TICKET_DETAIL/{ticket_id}?from={from}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", ws0.i(h47Var3, h47Var4, h47Var5, new h47("isLaunchedProgrammatically", new p47(m77VarB7, aVar7.b, aVar7.c, aVar7.d))), new cg8(3), new xla(), new r56(4), new ky7(i2), new fr1(true, 1365826072, new fi4<nu, r47, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.ticketDetailDestination.17
            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i3) {
                String ticketId;
                String from;
                nuVar.getClass();
                r47Var.getClass();
                u47 u47Var = r47Var.A;
                Bundle bundleA = u47Var.a();
                if (bundleA == null || (ticketId = bundleA.getString(TicketDetailDestinationKt.TICKET_ID)) == null) {
                    ticketId = BuildConfig.FLAVOR;
                }
                Bundle bundleA2 = u47Var.a();
                boolean z = bundleA2 != null ? bundleA2.getBoolean("isLaunchedProgrammatically") : false;
                Bundle bundleA3 = u47Var.a();
                if (bundleA3 == null || (from = bundleA3.getString(TicketDetailDestinationKt.LAUNCHED_FROM)) == null) {
                    from = MetricTracker.Context.FROM_TICKETS_SPACE;
                }
                if (o67Var.b() == null) {
                    Intent intent = dq1Var.getIntent();
                    intent.getClass();
                    IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
                    if (argsForIntent instanceof IntercomRootActivityArgs.TicketDetailsScreenArgs) {
                        IntercomRootActivityArgs.TicketDetailsScreenArgs ticketDetailsScreenArgs = (IntercomRootActivityArgs.TicketDetailsScreenArgs) argsForIntent;
                        ticketId = ticketDetailsScreenArgs.getTicketId();
                        from = ticketDetailsScreenArgs.getFrom();
                    }
                }
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
                whb whbVarA = xc6.a(jt1Var);
                if (whbVarA == null) {
                    whbVarA = dq1Var;
                }
                TicketDetailState ticketDetailState = (TicketDetailState) bl7.c(companion.create(whbVarA, xj5.a(from, "conversation") ? new TicketLaunchedFrom.Conversation(null, 1, 0 == true ? 1 : 0) : new TicketLaunchedFrom.Other(ticketId, from)).getStateFlow(), jt1Var, 0).getValue();
                jt1Var.K(447768183);
                boolean zJ = jt1Var.j(o67Var) | jt1Var.j(dq1Var);
                o67 o67Var2 = o67Var;
                dq1 dq1Var2 = dq1Var;
                Object objF = jt1Var.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (zJ || objF == c0187a) {
                    objF = new TicketDetailDestinationKt$ticketDetailDestination$17$1$1(o67Var2, dq1Var2);
                    jt1Var.C(objF);
                }
                jt1Var.B();
                mh4 mh4Var = (mh4) ((yn5) objF);
                jt1Var.K(447769986);
                boolean zJ2 = jt1Var.j(o67Var);
                o67 o67Var3 = o67Var;
                Object objF2 = jt1Var.f();
                if (zJ2 || objF2 == c0187a) {
                    objF2 = new TicketDetailDestinationKt$ticketDetailDestination$17$2$1(o67Var3);
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                TicketDetailDestinationKt.TicketDetailScreen(ticketDetailState, mh4Var, (ci4) ((yn5) objF2), false, z, jt1Var, 3072, 0);
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
                invoke(nuVar, r47Var, jt1Var, num.intValue());
                return g2b.a;
            }
        }), 132);
    }

    private static final g2b ticketDetailDestination$lambda$10(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        q47Var.a.b = true;
        q47Var.a(MetricTracker.Context.FROM_TICKETS_SPACE);
        return g2b.a;
    }

    private static final g2b ticketDetailDestination$lambda$11(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(TransitionStyleKt.getTransitionArgNavType());
        q47Var.a(new TransitionArgs(null, null, null, null, 15, null));
        return g2b.a;
    }

    private static final g2b ticketDetailDestination$lambda$12(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 ticketDetailDestination$lambda$13(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 ticketDetailDestination$lambda$14(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 ticketDetailDestination$lambda$15(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 ticketDetailDestination$lambda$16(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    private static final g2b ticketDetailDestination$lambda$2(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        return g2b.a;
    }

    private static final g2b ticketDetailDestination$lambda$3(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(TransitionStyleKt.getTransitionArgNavType());
        q47Var.a(new TransitionArgs(null, null, null, null, 15, null));
        return g2b.a;
    }

    private static final g2b ticketDetailDestination$lambda$4(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 ticketDetailDestination$lambda$5(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 ticketDetailDestination$lambda$6(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 ticketDetailDestination$lambda$7(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 ticketDetailDestination$lambda$8(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    private static final g2b ticketDetailDestination$lambda$9(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onBackClicked(o67 o67Var, dq1 dq1Var) {
        if (o67Var.b() == null) {
            dq1Var.getOnBackPressedDispatcher().c().a();
        } else {
            o67Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onConversationCTAClicked(o67 o67Var, String str, boolean z) {
        l77 l77Var = new l77();
        ticketDetailDestination$onConversationCTAClicked$lambda$1(l77Var);
        boolean z2 = l77Var.b;
        k77.a aVar = l77Var.a;
        aVar.a = z2;
        aVar.b = l77Var.c;
        String str2 = l77Var.e;
        if (str2 != null) {
            boolean z3 = l77Var.f;
            boolean z4 = l77Var.g;
            aVar.d = str2;
            aVar.c = -1;
            aVar.e = z3;
            aVar.f = z4;
        } else {
            aVar.b(l77Var.d, l77Var.f, l77Var.g);
        }
        IntercomRouterKt.openConversation$default(o67Var, str, null, z, null, aVar.a(), null, 42, null);
    }

    private static final g2b ticketDetailDestination$onConversationCTAClicked$lambda$1(l77 l77Var) {
        l77Var.getClass();
        l77Var.b("CONVERSATION");
        l77Var.a(-1);
        a68 a68Var = new a68();
        ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(a68Var);
        l77Var.f = a68Var.a;
        l77Var.g = a68Var.b;
        return g2b.a;
    }

    private static final g2b ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(a68 a68Var) {
        a68Var.getClass();
        a68Var.a = true;
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass4 implements ei4<go7, jt1, Integer, g2b> {
        final /* synthetic */ boolean $isLaunchedProgrammatically;
        final /* synthetic */ ci4<String, Boolean, g2b> $onConversationCTAClicked;
        final /* synthetic */ boolean $showSubmissionCard;
        final /* synthetic */ TicketDetailState $ticketDetailState;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(TicketDetailState ticketDetailState, ci4<? super String, ? super Boolean, g2b> ci4Var, boolean z, boolean z2) {
            this.$ticketDetailState = ticketDetailState;
            this.$onConversationCTAClicked = ci4Var;
            this.$isLaunchedProgrammatically = z;
            this.$showSubmissionCard = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(ci4 ci4Var, TicketDetailState ticketDetailState, boolean z, String str) {
            ci4Var.invoke(((TicketDetailState.TicketDetailContentState) ticketDetailState).getConversationId(), Boolean.valueOf(z));
            return g2b.a;
        }

        public final void invoke(go7 go7Var, jt1 jt1Var, int i) {
            go7Var.getClass();
            if ((i & 6) == 0) {
                i |= jt1Var.J(go7Var) ? 4 : 2;
            }
            if ((i & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            TicketDetailState ticketDetailState = this.$ticketDetailState;
            boolean zA = xj5.a(ticketDetailState, TicketDetailState.Initial.INSTANCE);
            ox6.a aVar = ox6.a.t;
            if (zA || xj5.a(ticketDetailState, TicketDetailState.Loading.INSTANCE)) {
                jt1Var.K(1534755126);
                TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreen(eo7.h(aVar, go7Var), jt1Var, 0, 0);
                jt1Var.B();
                return;
            }
            if (ticketDetailState instanceof TicketDetailState.Error) {
                jt1Var.K(332915065);
                TicketDetailErrorScreenKt.TicketDetailErrorScreen(((TicketDetailState.Error) this.$ticketDetailState).getErrorState(), eo7.h(aVar, go7Var), jt1Var, 0, 0);
                jt1Var.B();
                return;
            }
            if (!(ticketDetailState instanceof TicketDetailState.TicketDetailContentState)) {
                jt1Var.K(1534752204);
                jt1Var.B();
                defpackage.u.b();
                return;
            }
            jt1Var.K(333140962);
            ox6 ox6VarH = eo7.h(aVar, go7Var);
            TicketDetailState.TicketDetailContentState ticketDetailContentState = (TicketDetailState.TicketDetailContentState) this.$ticketDetailState;
            jt1Var.K(1534773769);
            boolean zJ = jt1Var.J(this.$onConversationCTAClicked) | jt1Var.J(this.$ticketDetailState) | jt1Var.c(this.$isLaunchedProgrammatically);
            final ci4<String, Boolean, g2b> ci4Var = this.$onConversationCTAClicked;
            final TicketDetailState ticketDetailState2 = this.$ticketDetailState;
            final boolean z = this.$isLaunchedProgrammatically;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.g0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TicketDetailDestinationKt.AnonymousClass4.invoke$lambda$1$lambda$0(ci4Var, ticketDetailState2, z, (String) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            TicketDetailContentKt.TicketDetailContent(ox6VarH, ticketDetailContentState, (oh4) objF, this.$showSubmissionCard, jt1Var, 0, 0);
            jt1Var.B();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var, Integer num) {
            invoke(go7Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
