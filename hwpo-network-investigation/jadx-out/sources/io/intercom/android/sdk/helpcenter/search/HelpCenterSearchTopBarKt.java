package io.intercom.android.sdk.helpcenter.search;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.ah5;
import defpackage.anb;
import defpackage.ap5;
import defpackage.b0a;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.bp5;
import defpackage.c33;
import defpackage.ci4;
import defpackage.d94;
import defpackage.dnb;
import defpackage.dp5;
import defpackage.fi1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.h65;
import defpackage.hi1;
import defpackage.i37;
import defpackage.ifa;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.kra;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p94;
import defpackage.pda;
import defpackage.py;
import defpackage.qu1;
import defpackage.r02;
import defpackage.ty;
import defpackage.uh1;
import defpackage.w20;
import defpackage.wd3;
import defpackage.wja;
import defpackage.x10;
import defpackage.xda;
import defpackage.xj8;
import defpackage.ym2;
import defpackage.yv9;
import defpackage.zmb;
import io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterSearchTopBarKt {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void HelpCenterSearchTopBar(final mh4<g2b> mh4Var, final oh4<? super i37<String>, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2, jt1 jt1Var, final int i) {
        int i2;
        boolean z;
        r02 r02Var;
        bj4 bj4Var;
        mh4Var.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(1649601348);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            bj4VarO.K(149284955);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new p94();
                bj4VarO.C(objF);
            }
            p94 p94Var = (p94) objF;
            bj4VarO.U(false);
            d94 d94Var = (d94) bj4VarO.F(qu1.i);
            bj4VarO.K(149288189);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(BuildConfig.FLAVOR);
                bj4VarO.C(objF2);
            }
            h37 h37Var = (h37) objF2;
            Object objB = aa0.b(bj4VarO, false, 149289823);
            if (objB == c0187a) {
                objB = b0a.b(BuildConfig.FLAVOR);
                bj4VarO.C(objB);
            }
            i37 i37Var = (i37) objB;
            bj4VarO.U(false);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            final boolean z2 = !ColorExtensionsKt.m839isDarkColor8_81llA(intercomTheme.getColors(bj4VarO, i3).m767getHeader0d7_KjU());
            Object objF3 = bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            int i4 = i2;
            Activity activity = objF3 instanceof Activity ? (Activity) objF3 : null;
            final Window window = activity != null ? activity.getWindow() : null;
            bj4VarO.K(149304033);
            if (window == null) {
                z = false;
            } else {
                bj4VarO.K(1000405729);
                boolean zJ = bj4VarO.j(window) | bj4VarO.c(z2);
                Object objF4 = bj4VarO.f();
                if (zJ || objF4 == c0187a) {
                    objF4 = new mh4() { // from class: xv4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$7$lambda$6$lambda$5(window, z2);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                z = false;
                bj4VarO.U(false);
                c33 c33Var = wd3.a;
                bj4VarO.w((mh4) objF4);
                g2b g2bVar = g2b.a;
            }
            bj4VarO.U(z);
            g2b g2bVar2 = g2b.a;
            bj4VarO.K(149311685);
            boolean zJ2 = ((i4 & 112) == 32) | bj4VarO.j(i37Var);
            Object objF5 = bj4VarO.f();
            if (zJ2 || objF5 == c0187a) {
                r02Var = null;
                objF5 = new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1(oh4Var, i37Var, null);
                bj4VarO.C(objF5);
            } else {
                r02Var = null;
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF5, g2bVar2);
            bj4VarO.K(149315723);
            Object objF6 = bj4VarO.f();
            if (objF6 == c0187a) {
                objF6 = new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(p94Var, r02Var);
                bj4VarO.C(objF6);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF6, g2bVar2);
            ox6 ox6VarC = w20.c(ox6.a.t, w20.d);
            long jM767getHeader0d7_KjU = intercomTheme.getColors(bj4VarO, i3).m767getHeader0d7_KjU();
            long jM771getOnHeader0d7_KjU = intercomTheme.getColors(bj4VarO, i3).m771getOnHeader0d7_KjU();
            long jM771getOnHeader0d7_KjU2 = intercomTheme.getColors(bj4VarO, i3).m771getOnHeader0d7_KjU();
            long jM771getOnHeader0d7_KjU3 = intercomTheme.getColors(bj4VarO, i3).m771getOnHeader0d7_KjU();
            long j = uh1.k;
            fi1 fi1Var = (fi1) bj4VarO.F(hi1.a);
            kra kraVar = fi1Var.a0;
            if (kraVar == null) {
                kraVar = new kra(hi1.c(fi1Var, ty.a), hi1.c(fi1Var, ty.c), hi1.c(fi1Var, ty.b), hi1.c(fi1Var, ty.e), hi1.c(fi1Var, ty.f), hi1.c(fi1Var, ty.d));
                fi1Var.a0 = kraVar;
            }
            if (jM767getHeader0d7_KjU == 16) {
                jM767getHeader0d7_KjU = kraVar.a;
            }
            long j2 = jM767getHeader0d7_KjU;
            long j3 = j != 16 ? j : kraVar.b;
            long j4 = jM771getOnHeader0d7_KjU2 != 16 ? jM771getOnHeader0d7_KjU2 : kraVar.c;
            long j5 = jM771getOnHeader0d7_KjU != 16 ? jM771getOnHeader0d7_KjU : kraVar.d;
            bj4Var = bj4VarO;
            py.b(gr1.b(-227105272, new AnonymousClass4(p94Var, oh4Var2, d94Var, i37Var, h37Var), bj4VarO), ox6VarC, gr1.b(-1996576886, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt.HelpCenterSearchTopBar.5
                public final void invoke(jt1 jt1Var2, int i5) {
                    if ((i5 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        h65.b(1572864, 62, jt1Var2, mh4Var, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m17getLambda3$intercom_sdk_base_release(), null, null, null, false);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, 0.0f, null, new kra(j2, j3, j4, j5, jM771getOnHeader0d7_KjU3 != 16 ? jM771getOnHeader0d7_KjU3 : kraVar.e, j != 16 ? j : kraVar.f), bj4Var, 390);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$10(mh4Var, oh4Var, oh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterSearchTopBar$lambda$10(mh4 mh4Var, oh4 oh4Var, oh4 oh4Var2, int i, jt1 jt1Var, int i2) {
        HelpCenterSearchTopBar(mh4Var, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HelpCenterSearchTopBar$lambda$2(h37<String> h37Var) {
        return h37Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HelpCenterSearchTopBar$lambda$3(h37<String> h37Var, String str) {
        h37Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterSearchTopBar$lambda$7$lambda$6$lambda$5(Window window, boolean z) {
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
        anbVar.h(z);
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass4 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ d94 $focusManager;
        final /* synthetic */ p94 $focusRequester;
        final /* synthetic */ oh4<String, g2b> $onSearchAction;
        final /* synthetic */ h37<String> $searchText$delegate;
        final /* synthetic */ i37<String> $textFlow;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(p94 p94Var, oh4<? super String, g2b> oh4Var, d94 d94Var, i37<String> i37Var, h37<String> h37Var) {
            this.$focusRequester = p94Var;
            this.$onSearchAction = oh4Var;
            this.$focusManager = d94Var;
            this.$textFlow = i37Var;
            this.$searchText$delegate = h37Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(oh4 oh4Var, d94 d94Var, h37 h37Var, ap5 ap5Var) {
            ap5Var.getClass();
            if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(h37Var).length() > 0) {
                oh4Var.invoke(HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(h37Var));
                d94Var.w(false);
            }
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$3$lambda$2(i37 i37Var, h37 h37Var, String str) {
            str.getClass();
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(h37Var, str);
            i37Var.setValue(str);
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            String strHelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate);
            ox6 ox6VarB = ym2.b(ir9.d(ir9.c(ox6.a.t, 1.0f), 56.0f), this.$focusRequester);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            wja type04 = intercomTheme.getTypography(jt1Var, i2).getType04();
            dp5 dp5Var = new dp5(1, 3, 115);
            jt1Var.K(1000454130);
            boolean zJ = jt1Var.J(this.$onSearchAction) | jt1Var.j(this.$focusManager);
            final oh4<String, g2b> oh4Var = this.$onSearchAction;
            final d94 d94Var = this.$focusManager;
            final h37<String> h37Var = this.$searchText$delegate;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.helpcenter.search.a
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterSearchTopBarKt.AnonymousClass4.invoke$lambda$1$lambda$0(oh4Var, d94Var, h37Var, (ap5) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            bp5 bp5Var = new bp5(null, (oh4) objF, 47);
            long jA = ah5.a(intercomTheme, jt1Var, i2);
            long jA2 = ah5.a(intercomTheme, jt1Var, i2);
            long jA3 = ah5.a(intercomTheme, jt1Var, i2);
            long j = uh1.j;
            pda pdaVarC = xda.c(jA, jA2, jA3, j, j, j, ah5.a(intercomTheme, jt1Var, i2), j, j, j, jt1Var, 2147468936);
            jt1Var.K(1000423761);
            boolean zJ2 = jt1Var.j(this.$textFlow);
            final i37<String> i37Var = this.$textFlow;
            final h37<String> h37Var2 = this.$searchText$delegate;
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: io.intercom.android.sdk.helpcenter.search.b
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterSearchTopBarKt.AnonymousClass4.invoke$lambda$3$lambda$2(i37Var, h37Var2, (String) obj);
                    }
                };
                jt1Var.C(objF2);
            }
            jt1Var.B();
            ifa.a(strHelpCenterSearchTopBar$lambda$2, (oh4) objF2, ox6VarB, false, type04, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m15getLambda1$intercom_sdk_base_release(), null, gr1.b(1908343233, new AnonymousClass3(this.$textFlow, this.$searchText$delegate), jt1Var), null, dp5Var, bp5Var, true, 0, 0, null, pdaVarC, jt1Var, 817889280, 12779520, 3964248);
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AnonymousClass3 implements ci4<jt1, Integer, g2b> {
            final /* synthetic */ h37<String> $searchText$delegate;
            final /* synthetic */ i37<String> $textFlow;

            public AnonymousClass3(i37<String> i37Var, h37<String> h37Var) {
                this.$textFlow = i37Var;
                this.$searchText$delegate = h37Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final g2b invoke$lambda$1$lambda$0(i37 i37Var, h37 h37Var) {
                HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(h37Var, BuildConfig.FLAVOR);
                i37Var.setValue(BuildConfig.FLAVOR);
                return g2b.a;
            }

            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate).length() > 0) {
                    jt1Var.K(215647391);
                    boolean zJ = jt1Var.j(this.$textFlow);
                    final i37<String> i37Var = this.$textFlow;
                    final h37<String> h37Var = this.$searchText$delegate;
                    Object objF = jt1Var.f();
                    if (zJ || objF == jt1.a.a) {
                        objF = new mh4() { // from class: io.intercom.android.sdk.helpcenter.search.c
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return HelpCenterSearchTopBarKt.AnonymousClass4.AnonymousClass3.invoke$lambda$1$lambda$0(i37Var, h37Var);
                            }
                        };
                        jt1Var.C(objF);
                    }
                    jt1Var.B();
                    h65.b(1572864, 62, jt1Var, (mh4) objF, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m16getLambda2$intercom_sdk_base_release(), null, null, null, false);
                }
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
