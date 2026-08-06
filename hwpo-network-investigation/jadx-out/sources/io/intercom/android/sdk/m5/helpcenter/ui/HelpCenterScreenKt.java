package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.al8;
import defpackage.az3;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.dc4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h47;
import defpackage.hnb;
import defpackage.i67;
import defpackage.i77;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j67;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.m77;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nu1;
import defpackage.o67;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p47;
import defpackage.p87;
import defpackage.q39;
import defpackage.q47;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sh;
import defpackage.u;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.yn5;
import defpackage.yz9;
import defpackage.zg5;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterScreenKt {
    private static final String START_DESTINATION = "startDestination";

    private static final void HelpCenterContent(final HelpCenterViewModel helpCenterViewModel, final List<String> list, final mh4<g2b> mh4Var, final int i, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(1043765272);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(helpCenterViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.h(i) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            y0a y0aVar = AndroidCompositionLocals_androidKt.b;
            nu1.a(y0aVar.a(helpCenterViewModel.localizedContext((Context) bj4VarO.F(y0aVar))), gr1.b(222051544, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterContent.1
                public final void invoke(jt1 jt1Var2, int i4) {
                    if ((i4 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    final o67 o67VarD = dc4.d(new p87[0], jt1Var2);
                    Context context = (Context) jt1Var2.F(AndroidCompositionLocals_androidKt.b);
                    ox6 ox6VarC = gi0.c(ox6.a.t, zg5.a(IntercomTheme.INSTANCE, jt1Var2, IntercomTheme.$stable), al8.a);
                    WeakHashMap<View, fnb> weakHashMap = fnb.w;
                    ox6 ox6VarC2 = hnb.c(ox6VarC, fnb.a.c(jt1Var2).b);
                    fr1 fr1VarB = gr1.b(375288220, new C01561(o67VarD, mh4Var, context, i, helpCenterViewModel), jt1Var2);
                    final List<String> list2 = list;
                    final HelpCenterViewModel helpCenterViewModel2 = helpCenterViewModel;
                    q39.a(ox6VarC2, fr1VarB, null, null, null, 0, 0L, 0L, null, gr1.b(2077063271, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterContent.1.2
                        public final void invoke(go7 go7Var, jt1 jt1Var3, int i5) {
                            go7Var.getClass();
                            if ((i5 & 6) == 0) {
                                i5 |= jt1Var3.J(go7Var) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && jt1Var3.r()) {
                                jt1Var3.u();
                            } else {
                                HelpCenterScreenKt.HelpCenterNavGraph(helpCenterViewModel2, o67VarD, list2.size() == 1 ? "COLLECTION_DETAILS" : "COLLECTIONS", list2, eo7.h(ox6.a.t, go7Var), jt1Var3, 0, 0);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var3, Integer num) {
                            invoke(go7Var, jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 805306416, 508);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterContent$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class C01561 implements ci4<jt1, Integer, g2b> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ o67 $navController;
                    final /* synthetic */ int $navIcon;
                    final /* synthetic */ mh4<g2b> $onCloseClick;
                    final /* synthetic */ HelpCenterViewModel $viewModel;

                    public C01561(o67 o67Var, mh4<g2b> mh4Var, Context context, int i, HelpCenterViewModel helpCenterViewModel) {
                        this.$navController = o67Var;
                        this.$onCloseClick = mh4Var;
                        this.$context = context;
                        this.$navIcon = i;
                        this.$viewModel = helpCenterViewModel;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final g2b invoke$lambda$1$lambda$0(o67 o67Var, mh4 mh4Var) {
                        if (o67Var.b() == null) {
                            mh4Var.invoke();
                        } else {
                            o67Var.d();
                        }
                        return g2b.a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final g2b invoke$lambda$3$lambda$2(Context context) {
                        context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, false));
                        return g2b.a;
                    }

                    public final void invoke(jt1 jt1Var, int i) {
                        if ((i & 3) == 2 && jt1Var.r()) {
                            jt1Var.u();
                            return;
                        }
                        jt1Var.K(-969970035);
                        boolean zJ = jt1Var.j(this.$navController) | jt1Var.J(this.$onCloseClick);
                        final o67 o67Var = this.$navController;
                        final mh4<g2b> mh4Var = this.$onCloseClick;
                        Object objF = jt1Var.f();
                        jt1.a.C0187a c0187a = jt1.a.a;
                        if (zJ || objF == c0187a) {
                            objF = new mh4() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.b
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return HelpCenterScreenKt.AnonymousClass1.C01561.invoke$lambda$1$lambda$0(o67Var, mh4Var);
                                }
                            };
                            jt1Var.C(objF);
                        }
                        mh4 mh4Var2 = (mh4) objF;
                        jt1Var.B();
                        jt1Var.K(-969960597);
                        boolean zJ2 = jt1Var.j(this.$context);
                        final Context context = this.$context;
                        Object objF2 = jt1Var.f();
                        if (zJ2 || objF2 == c0187a) {
                            objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.c
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return HelpCenterScreenKt.AnonymousClass1.C01561.invoke$lambda$3$lambda$2(context);
                                }
                            };
                            jt1Var.C(objF2);
                        }
                        mh4 mh4Var3 = (mh4) objF2;
                        jt1Var.B();
                        HelpCenterTopBarKt.HelpCenterTopBar(mh4Var2, mh4Var3, this.$navController.b() == null ? this.$navIcon : R.drawable.intercom_ic_back, this.$viewModel.getScreenTitle(), jt1Var, StringProvider.$stable << 9, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                        invoke(jt1Var, num.intValue());
                        return g2b.a;
                    }
                }
            }, bj4VarO), bj4VarO, 56);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterScreenKt.HelpCenterContent$lambda$3(helpCenterViewModel, list, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterContent$lambda$3(HelpCenterViewModel helpCenterViewModel, List list, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterContent(helpCenterViewModel, list, mh4Var, i, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void HelpCenterNavGraph(final HelpCenterViewModel helpCenterViewModel, final o67 o67Var, final String str, final List<String> list, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6 ox6Var3;
        final Context context;
        boolean zJ;
        Object objF;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        helpCenterViewModel.getClass();
        o67Var.getClass();
        str.getClass();
        list.getClass();
        bj4 bj4VarO = jt1Var.o(686627856);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(helpCenterViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(o67Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(list) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-1939226718);
                zJ = bj4VarO.j(helpCenterViewModel) | bj4VarO.j(list) | bj4VarO.j(o67Var) | bj4VarO.j(context);
                objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new oh4() { // from class: sv4
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return HelpCenterScreenKt.HelpCenterNavGraph$lambda$7$lambda$6(helpCenterViewModel, list, o67Var, context, (i67) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                i77.b(o67Var, str, ox6Var3, null, null, null, null, null, (oh4) objF, bj4VarO, ((i3 >> 3) & 126) | ((i3 >> 6) & 896), 1016);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: tv4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HelpCenterScreenKt.HelpCenterNavGraph$lambda$8(helpCenterViewModel, o67Var, str, list, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ox6Var2 = ox6Var;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            bj4VarO.K(-1939226718);
            zJ = bj4VarO.j(helpCenterViewModel) | bj4VarO.j(list) | bj4VarO.j(o67Var) | bj4VarO.j(context);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new oh4() { // from class: sv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterScreenKt.HelpCenterNavGraph$lambda$7$lambda$6(helpCenterViewModel, list, o67Var, context, (i67) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: sv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterScreenKt.HelpCenterNavGraph$lambda$7$lambda$6(helpCenterViewModel, list, o67Var, context, (i67) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            i77.b(o67Var, str, ox6Var3, null, null, null, null, null, (oh4) objF, bj4VarO, ((i3 >> 3) & 126) | ((i3 >> 6) & 896), 1016);
            ox6Var4 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            bj4VarO.K(-1939226718);
            zJ = bj4VarO.j(helpCenterViewModel) | bj4VarO.j(list) | bj4VarO.j(o67Var) | bj4VarO.j(context);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new oh4() { // from class: sv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterScreenKt.HelpCenterNavGraph$lambda$7$lambda$6(helpCenterViewModel, list, o67Var, context, (i67) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: sv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterScreenKt.HelpCenterNavGraph$lambda$7$lambda$6(helpCenterViewModel, list, o67Var, context, (i67) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            i77.b(o67Var, str, ox6Var3, null, null, null, null, null, (oh4) objF, bj4VarO, ((i3 >> 3) & 126) | ((i3 >> 6) & 896), 1016);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterScreenKt.HelpCenterNavGraph$lambda$8(helpCenterViewModel, o67Var, str, list, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterNavGraph$lambda$7$lambda$6(HelpCenterViewModel helpCenterViewModel, List list, o67 o67Var, Context context, i67 i67Var) {
        i67Var.getClass();
        j67.a(i67Var, "COLLECTIONS", null, null, null, null, null, new fr1(true, -1869047411, new HelpCenterScreenKt$HelpCenterNavGraph$1$1$1(helpCenterViewModel, list, o67Var)), 254);
        q47 q47Var = new q47();
        HelpCenterNavGraph$lambda$7$lambda$6$lambda$4(q47Var);
        p47.a aVar = q47Var.a;
        m77<Object> m77VarB = aVar.a;
        if (m77VarB == null) {
            m77.b bVar = m77.Companion;
            Object obj = aVar.c;
            bVar.getClass();
            m77VarB = m77.b.b(obj);
        }
        h47 h47Var = new h47("id", new p47(m77VarB, aVar.b, aVar.c, aVar.d));
        q47 q47Var2 = new q47();
        HelpCenterNavGraph$lambda$7$lambda$6$lambda$5(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        j67.a(i67Var, "COLLECTION_DETAILS/{id}?startDestination={startDestination}", ws0.i(h47Var, new h47(START_DESTINATION, new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d))), null, null, null, null, new fr1(true, 2018839094, new HelpCenterScreenKt$HelpCenterNavGraph$1$1$4(helpCenterViewModel, context, o67Var)), 252);
        j67.a(i67Var, "COLLECTION_DETAILS", null, null, null, null, null, new fr1(true, -157077227, new HelpCenterScreenKt$HelpCenterNavGraph$1$1$5(helpCenterViewModel, list, context, o67Var)), 254);
        return g2b.a;
    }

    private static final g2b HelpCenterNavGraph$lambda$7$lambda$6$lambda$4(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        return g2b.a;
    }

    private static final g2b HelpCenterNavGraph$lambda$7$lambda$6$lambda$5(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterNavGraph$lambda$8(HelpCenterViewModel helpCenterViewModel, o67 o67Var, String str, List list, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterNavGraph(helpCenterViewModel, o67Var, str, list, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void HelpCenterOpenGateScaffold(final int i, final mh4<g2b> mh4Var, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-683098219);
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
            q39.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), gr1.b(1941106521, new C03711(mh4Var, i), bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(941231204, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterOpenGateScaffold.2
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
            xj8VarW.d = new ci4() { // from class: uv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterScreenKt.HelpCenterOpenGateScaffold$lambda$2(i, mh4Var, ci4Var, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterOpenGateScaffold$lambda$2(int i, mh4 mh4Var, ci4 ci4Var, int i2, jt1 jt1Var, int i3) {
        HelpCenterOpenGateScaffold(i, mh4Var, ci4Var, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void HelpCenterScreen(HelpCenterViewModel helpCenterViewModel, List<String> list, mh4<g2b> mh4Var, int i, jt1 jt1Var, final int i2) {
        int i3;
        int i4;
        final mh4<g2b> mh4Var2;
        final List<String> list2;
        final HelpCenterViewModel helpCenterViewModel2;
        xj8 xj8VarW;
        helpCenterViewModel.getClass();
        list.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1421214035);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(helpCenterViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.h(i) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) != 1170 || !bj4VarO.r()) {
            final NetworkResponse<OpenMessengerResponse> networkResponseHelpCenterScreen$lambda$0 = HelpCenterScreen$lambda$0(bl7.c(helpCenterViewModel.getOpenState(), bj4VarO, 0));
            if (networkResponseHelpCenterScreen$lambda$0 == null) {
                bj4VarO.K(-556371760);
                HelpCenterOpenGateScaffold(i, mh4Var, ComposableSingletons$HelpCenterScreenKt.INSTANCE.m307getLambda1$intercom_sdk_base_release(), bj4VarO, ((i3 >> 3) & 112) | ((i3 >> 9) & 14) | 384);
                bj4VarO.U(false);
            } else if ((networkResponseHelpCenterScreen$lambda$0 instanceof NetworkResponse.NetworkError) || (networkResponseHelpCenterScreen$lambda$0 instanceof NetworkResponse.ClientError) || (networkResponseHelpCenterScreen$lambda$0 instanceof NetworkResponse.ServerError)) {
                i4 = i;
                mh4Var2 = mh4Var;
                list2 = list;
                helpCenterViewModel2 = helpCenterViewModel;
                bj4VarO.K(-556074284);
                HelpCenterOpenGateScaffold(i4, mh4Var2, gr1.b(-1856200158, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterScreen.1
                    public final void invoke(jt1 jt1Var2, int i5) {
                        ErrorState withoutCTA;
                        if ((i5 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        az3 az3Var = ir9.c;
                        jt1Var2.K(919854477);
                        if (NetworkResponseKt.isRetryable(networkResponseHelpCenterScreen$lambda$0)) {
                            HelpCenterViewModel helpCenterViewModel3 = helpCenterViewModel2;
                            jt1Var2.K(919857291);
                            boolean zJ = jt1Var2.j(helpCenterViewModel3);
                            Object objF = jt1Var2.f();
                            if (zJ || objF == jt1.a.a) {
                                objF = new HelpCenterScreenKt$HelpCenterScreen$1$1$1(helpCenterViewModel3);
                                jt1Var2.C(objF);
                            }
                            jt1Var2.B();
                            withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, (mh4) ((yn5) objF), 15, null);
                        } else {
                            withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                        }
                        jt1Var2.B();
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(withoutCTA, az3Var, jt1Var2, 48, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 3) & 112) | ((i3 >> 9) & 14) | 384);
                bj4VarO.U(false);
            } else if (!(networkResponseHelpCenterScreen$lambda$0 instanceof NetworkResponse.Success)) {
                bj4VarO.K(-1957611050);
                bj4VarO.U(false);
                u.b();
                return;
            } else {
                bj4VarO.K(-555574130);
                i4 = i;
                HelpCenterContent(helpCenterViewModel, list, mh4Var, i4, bj4VarO, i3 & 8190);
                helpCenterViewModel2 = helpCenterViewModel;
                list2 = list;
                mh4Var2 = mh4Var;
                bj4VarO.U(false);
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final int i5 = i4;
                xj8VarW.d = new ci4() { // from class: wv4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HelpCenterScreenKt.HelpCenterScreen$lambda$1(helpCenterViewModel2, list2, mh4Var2, i5, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        bj4VarO.u();
        i4 = i;
        mh4Var2 = mh4Var;
        list2 = list;
        helpCenterViewModel2 = helpCenterViewModel;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final int i6 = i4;
            xj8VarW.d = new ci4() { // from class: wv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterScreenKt.HelpCenterScreen$lambda$1(helpCenterViewModel2, list2, mh4Var2, i6, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final NetworkResponse<OpenMessengerResponse> HelpCenterScreen$lambda$0(yz9<? extends NetworkResponse<OpenMessengerResponse>> yz9Var) {
        return yz9Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterScreen$lambda$1(HelpCenterViewModel helpCenterViewModel, List list, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterScreen(helpCenterViewModel, list, mh4Var, i, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterOpenGateScaffold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C03711 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ int $navIcon;
        final /* synthetic */ mh4<g2b> $onCloseClick;

        public C03711(mh4<g2b> mh4Var, int i) {
            this.$onCloseClick = mh4Var;
            this.$navIcon = i;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            mh4<g2b> mh4Var = this.$onCloseClick;
            jt1Var.K(-1991364586);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new j();
                jt1Var.C(objF);
            }
            jt1Var.B();
            HelpCenterTopBarKt.HelpCenterTopBar(mh4Var, (mh4) objF, this.$navIcon, null, jt1Var, 48, 8);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
