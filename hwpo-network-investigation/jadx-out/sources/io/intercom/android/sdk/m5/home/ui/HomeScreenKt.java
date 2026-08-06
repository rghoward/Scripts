package io.intercom.android.sdk.m5.home.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.al8;
import defpackage.anb;
import defpackage.at7;
import defpackage.ay8;
import defpackage.az3;
import defpackage.b27;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dnb;
import defpackage.dv;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hi0;
import defpackage.inb;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.jv;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.m65;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.q69;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.tx2;
import defpackage.uh8;
import defpackage.uma;
import defpackage.w20;
import defpackage.wd3;
import defpackage.we1;
import defpackage.x10;
import defpackage.x69;
import defpackage.xj8;
import defpackage.xv;
import defpackage.y0a;
import defpackage.yi1;
import defpackage.yn5;
import defpackage.yv9;
import defpackage.yz9;
import defpackage.zf7;
import defpackage.zg3;
import defpackage.zmb;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenKt {
    private static final int ANIMATION_DURATION = 600;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HomeScreen(final HomeViewModel homeViewModel, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, final mh4<g2b> mh4Var3, final oh4<? super String, g2b> oh4Var, final mh4<g2b> mh4Var4, final mh4<g2b> mh4Var5, final oh4<? super String, g2b> oh4Var2, final mh4<g2b> mh4Var6, final oh4<? super Conversation, g2b> oh4Var3, final mh4<g2b> mh4Var7, final oh4<? super TicketType, g2b> oh4Var4, jt1 jt1Var, final int i, final int i2) {
        int i3;
        mh4<g2b> mh4Var8;
        int i4;
        final b27 b27Var;
        boolean z;
        final mh4<g2b> mh4Var9;
        bt1.a.C0034a c0034a;
        jt1.a.C0187a c0187a;
        boolean z2;
        boolean z3;
        homeViewModel.getClass();
        mh4Var.getClass();
        mh4Var2.getClass();
        mh4Var3.getClass();
        oh4Var.getClass();
        mh4Var4.getClass();
        mh4Var5.getClass();
        oh4Var2.getClass();
        mh4Var6.getClass();
        oh4Var3.getClass();
        mh4Var7.getClass();
        oh4Var4.getClass();
        bj4 bj4VarO = jt1Var.o(1138475448);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(homeViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            mh4Var8 = mh4Var4;
            i3 |= bj4VarO.j(mh4Var8) ? 131072 : 65536;
        } else {
            mh4Var8 = mh4Var4;
        }
        if ((i & 1572864) == 0) {
            i3 |= bj4VarO.j(mh4Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bj4VarO.j(mh4Var6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bj4VarO.j(oh4Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bj4VarO.j(mh4Var7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(oh4Var4) ? 32 : 16;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
            mh4Var9 = mh4Var7;
        } else {
            final h37 h37VarC = bl7.c(homeViewModel.getUiState(), bj4VarO, 0);
            x69 x69VarF = q69.f(bj4VarO);
            bj4VarO.K(853956012);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a2 = jt1.a.a;
            if (objF == c0187a2) {
                objF = new at7(0.0f);
                bj4VarO.C(objF);
            }
            b27 b27Var2 = (b27) objF;
            bj4VarO.U(false);
            bj4VarO.K(853958355);
            boolean zJ = ((3670016 & i3) == 1048576) | bj4VarO.j(homeViewModel) | ((i3 & 458752) == 131072) | ((i3 & 29360128) == 8388608);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a2) {
                b27Var = b27Var2;
                HomeScreenKt$HomeScreen$1$1 homeScreenKt$HomeScreen$1$1 = new HomeScreenKt$HomeScreen$1$1(homeViewModel, mh4Var8, mh4Var5, oh4Var2, null);
                bj4VarO.C(homeScreenKt$HomeScreen$1$1);
                objF2 = homeScreenKt$HomeScreen$1$1;
            } else {
                b27Var = b27Var2;
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF2, null);
            y0a y0aVar = AndroidCompositionLocals_androidKt.b;
            Object objF3 = bj4VarO.F(y0aVar);
            Activity activity = objF3 instanceof Activity ? (Activity) objF3 : null;
            final Window window = activity != null ? activity.getWindow() : null;
            bj4VarO.K(853978516);
            if (window == null) {
                z = false;
            } else {
                bj4VarO.K(748713620);
                boolean zJ2 = bj4VarO.j(window) | bj4VarO.J(h37VarC);
                Object objF4 = bj4VarO.f();
                if (zJ2 || objF4 == c0187a2) {
                    objF4 = new mh4() { // from class: z05
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$4$lambda$3$lambda$2(window, h37VarC);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                z = false;
                bj4VarO.U(false);
                bj4VarO.w((mh4) objF4);
                g2b g2bVar = g2b.a;
            }
            bj4VarO.U(z);
            sp0 sp0Var = di.a.a;
            fl6 fl6VarD = dv0.d(sp0Var, z);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
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
            bt1.a.C0034a c0034a2 = bt1.a.h;
            rd7.c(bj4VarO, c0034a2);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            b27 b27Var3 = b27Var;
            dv.d(h37VarC.getValue() instanceof HomeUiState.Content, null, zg3.c(xv.c(ANIMATION_DURATION, 0, null, 6), 2), zg3.d(xv.c(ANIMATION_DURATION, 0, null, 6), 2), null, gr1.b(750386582, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$1
                public final void invoke(jv jvVar, jt1 jt1Var2, int i6) {
                    jvVar.getClass();
                    HomeUiState value = h37VarC.getValue();
                    if (value instanceof HomeUiState.Content) {
                        HomeUiState.Content content = (HomeUiState.Content) value;
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle = content.getHeader().getHeaderBackdropStyle();
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleDark = content.getHeader().getHeaderBackdropStyleDark();
                        float fI0 = ((tx2) jt1Var2.F(qu1.h)).I0(b27Var.h());
                        HomeViewModel homeViewModel2 = homeViewModel;
                        jt1Var2.K(-1050762168);
                        boolean zJ3 = jt1Var2.j(homeViewModel2);
                        Object objF5 = jt1Var2.f();
                        if (zJ3 || objF5 == jt1.a.a) {
                            objF5 = new HomeScreenKt$HomeScreen$3$1$2$1(homeViewModel2);
                            jt1Var2.C(objF5);
                        }
                        jt1Var2.B();
                        HomeHeaderBackdropKt.m359HomeHeaderBackdropAjpBEmI(fI0, headerBackdropStyle, headerBackdropStyleDark, (mh4) ((yn5) objF5), jt1Var2, 0, 0);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 200064, 18);
            final HomeUiState homeUiState = (HomeUiState) h37VarC.getValue();
            az3 az3Var = ir9.c;
            inb inbVar = w20.b;
            ox6 ox6VarH = q69.h(w20.c(az3Var, inbVar), x69VarF, 14);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarH);
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
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a2);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            mh4Var9 = mh4Var7;
            dv.c(homeUiState instanceof HomeUiState.Error, new qs5(true, 1.0f), null, null, null, gr1.b(-1537640308, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$2$1
                public final void invoke(jv jvVar, jt1 jt1Var2, int i6) {
                    jvVar.getClass();
                    HomeUiState homeUiState2 = homeUiState;
                    if (homeUiState2 instanceof HomeUiState.Error) {
                        mh4<g2b> mh4Var10 = mh4Var7;
                        aj1 aj1VarA2 = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                        int iHashCode3 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC3 = it1.c(jt1Var2, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar3 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar3);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA2);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC3);
                        HomeUiState.Error error = (HomeUiState.Error) homeUiState2;
                        HomeHeaderKt.HomeErrorHeader(null, error.getHeader(), mh4Var10, jt1Var2, 0, 1);
                        HomeErrorContentKt.HomeErrorContent(error.getErrorState(), null, jt1Var2, 0, 2);
                        jt1Var2.I();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 1572870, 28);
            dv.c(homeUiState instanceof HomeUiState.Loading, null, null, jo3.a, null, ComposableSingletons$HomeScreenKt.INSTANCE.m337getLambda1$intercom_sdk_base_release(), bj4VarO, 1572870, 22);
            boolean z4 = homeUiState instanceof HomeUiState.Content;
            dv.c(z4, null, zg3.c(xv.c(ANIMATION_DURATION, ANIMATION_DURATION, null, 4), 2), zg3.d(xv.c(ANIMATION_DURATION, 0, null, 6), 2), null, gr1.b(21007876, new HomeScreenKt$HomeScreen$3$2$2(homeUiState, x69VarF, b27Var3, mh4Var, mh4Var2, mh4Var3, oh4Var, mh4Var6, oh4Var3, oh4Var4), bj4VarO), bj4VarO, 1600518, 18);
            b47.b(bj4VarO, ir9.d(aVar, 100.0f));
            bj4VarO.U(true);
            Context context = (Context) bj4VarO.F(y0aVar);
            PoweredBy poweredBy = ((HomeUiState) h37VarC.getValue()).getPoweredBy();
            bj4VarO.K(748852392);
            final kv0 kv0Var = kv0.a;
            if (poweredBy == null) {
                z4 = z4;
                c0034a = c0034a2;
                c0187a = c0187a2;
                z2 = false;
            } else {
                ox6 ox6VarF = kv0Var.f(w20.c(aVar, inbVar), di.a.h);
                String text = poweredBy.getText();
                c0034a = c0034a2;
                PoweredBy.PoweredByIconType icon = poweredBy.getIcon();
                bj4VarO.K(-1050645419);
                boolean zJ3 = bj4VarO.J(poweredBy) | bj4VarO.j(context);
                Object objF5 = bj4VarO.f();
                if (zJ3) {
                    c0187a = c0187a2;
                } else {
                    if (objF5 != c0187a) {
                        c0187a = c0187a2;
                    }
                    z2 = false;
                    bj4VarO.U(false);
                    PoweredByBadgeKt.m88PoweredByBadgewBJOh4Y(text, icon, (mh4) objF5, ox6VarF, 0L, 0L, bj4VarO, 0, 48);
                    g2b g2bVar2 = g2b.a;
                }
                c0187a = c0187a2;
                objF5 = new hi0(1, poweredBy, context);
                bj4VarO.C(objF5);
                z2 = false;
                bj4VarO.U(false);
                PoweredByBadgeKt.m88PoweredByBadgewBJOh4Y(text, icon, (mh4) objF5, ox6VarF, 0L, 0L, bj4VarO, 0, 48);
                g2b g2bVar3 = g2b.a;
            }
            bj4VarO.U(z2);
            bj4VarO.K(748873455);
            if (z4) {
                final HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor = ((HomeUiState.Content) homeUiState).getHeader().getCloseButtonColor();
                bj4VarO.K(748879182);
                String foregroundColor = (!ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6) || closeButtonColor.getForegroundColorDark() == null) ? closeButtonColor.getForegroundColor() : closeButtonColor.getForegroundColorDark();
                bj4VarO.U(false);
                ox6 ox6VarJ = ir9.j(uma.a(kv0Var.f(zf7.b(-16.0f, 14.0f, w20.c(aVar, inbVar)), di.a.c), ay8.a), 30.0f);
                bj4VarO.K(-1050605096);
                boolean z5 = (i5 & 14) == 4;
                Object objF6 = bj4VarO.f();
                if (z5 || objF6 == c0187a) {
                    objF6 = new mh4() { // from class: a15
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$14$lambda$13$lambda$11$lambda$10(mh4Var9);
                        }
                    };
                    bj4VarO.C(objF6);
                }
                bj4VarO.U(false);
                ox6 ox6VarC3 = we1.c(ox6VarJ, false, null, (mh4) objF6, 15);
                fl6 fl6VarD2 = dv0.d(sp0Var, false);
                int iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP3 = bj4VarO.P();
                ox6 ox6VarC4 = it1.c(bj4VarO, ox6VarC3);
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
                rd7.d(bj4VarO, cVar, fl6VarD2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                dv.d(((double) x69VarF.a.k()) > ((double) b27Var3.h()) * 0.6d, null, zg3.c(null, 3), zg3.d(null, 3), null, gr1.b(-1722206090, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$4$2$1
                    public final void invoke(jv jvVar, jt1 jt1Var2, int i6) {
                        jvVar.getClass();
                        dv0.a(gi0.c(kv0Var.f(ir9.c, di.a.e), ColorExtensionsKt.toComposeColor(closeButtonColor.getBackgroundColor(), closeButtonColor.getBackgroundOpacity()), al8.a), jt1Var2, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                        invoke(jvVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 200064, 18);
                z3 = true;
                m65.b(is7.a(R.drawable.intercom_ic_close, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_close), kv0Var.f(aVar, di.a.e), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), bj4VarO, 8, 0);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                g2b g2bVar4 = g2b.a;
            } else {
                z3 = true;
            }
            bj4VarO.U(false);
            bj4VarO.U(z3);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final mh4<g2b> mh4Var10 = mh4Var9;
            xj8VarW.d = new ci4() { // from class: b15
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeScreenKt.HomeScreen$lambda$15(homeViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, mh4Var4, mh4Var5, oh4Var2, mh4Var6, oh4Var3, mh4Var10, oh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeScreen$lambda$14$lambda$13$lambda$11$lambda$10(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeScreen$lambda$14$lambda$8$lambda$7$lambda$6(PoweredBy poweredBy, Context context) {
        Injector.get().getMetricTracker().clickedPoweredBy("home");
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeScreen$lambda$15(HomeViewModel homeViewModel, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, oh4 oh4Var, mh4 mh4Var4, mh4 mh4Var5, oh4 oh4Var2, mh4 mh4Var6, oh4 oh4Var3, mh4 mh4Var7, oh4 oh4Var4, int i, int i2, jt1 jt1Var, int i3) {
        HomeScreen(homeViewModel, mh4Var, mh4Var2, mh4Var3, oh4Var, mh4Var4, mh4Var5, oh4Var2, mh4Var6, oh4Var3, mh4Var7, oh4Var4, jt1Var, gz3.s(i | 1), gz3.s(i2));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeScreen$lambda$4$lambda$3$lambda$2(Window window, yz9 yz9Var) {
        x10 anbVar;
        yv9 yv9Var = new yv9(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            anbVar = new dnb(window, yv9Var);
        } else if (i >= 30) {
            anbVar = new bnb(window, yv9Var);
        } else {
            anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        }
        anbVar.h(isDarkContentEnabled((HomeUiState) yz9Var.getValue()));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHeaderContentOpacity(int i, float f) {
        return uh8.f((f - i) / f, 0.0f, 1.0f);
    }

    private static final boolean isDarkContentEnabled(HomeUiState homeUiState) {
        if (homeUiState instanceof HomeUiState.Content) {
            return ColorExtensionsKt.m839isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Content) homeUiState).getHeader().getIntro().getTextColorLight(), 0.0f, 1, null));
        }
        if (homeUiState instanceof HomeUiState.Error) {
            return ColorExtensionsKt.m839isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Error) homeUiState).getHeader().getForegroundColor(), 0.0f, 1, null));
        }
        return true;
    }
}
