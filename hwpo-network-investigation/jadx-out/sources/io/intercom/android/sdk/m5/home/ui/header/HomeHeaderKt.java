package io.intercom.android.sdk.m5.home.ui.header;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aa0;
import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.f50;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.k50;
import defpackage.k85;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.l05;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.n05;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.nz1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sc5;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import defpackage.z75;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeHeaderKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void HomeContentHeader(ox6 ox6Var, final HomeUiState.Content.ContentHeader contentHeader, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        final ox6 ox6Var3;
        ?? r0;
        bj4 bj4Var;
        boolean z;
        Object obj;
        bj4 bj4Var2;
        contentHeader.getClass();
        bj4 bj4VarO = jt1Var.o(-1992208830);
        j1b j1bVar = bj4VarO.a;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = i | (bj4VarO.J(ox6Var2) ? 4 : 2);
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(contentHeader) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            bj4Var2 = bj4VarO;
        } else {
            ox6.a aVar = ox6.a.t;
            ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            wja type02 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType02();
            bj4VarO.K(-1302174101);
            Object objF = bj4VarO.f();
            Object obj2 = jt1.a.a;
            if (objF == obj2) {
                objF = bl7.i(type02);
                bj4VarO.C(objF);
            }
            h37 h37Var = (h37) objF;
            Object objB = aa0.b(bj4VarO, false, -1302171803);
            if (objB == obj2) {
                objB = bl7.i(Boolean.FALSE);
                bj4VarO.C(objB);
            }
            final h37 h37Var2 = (h37) objB;
            bj4VarO.U(false);
            ox6 ox6VarM = eo7.m(eo7.m(ox6Var3, 0.0f, 10.0f, 0.0f, 32.0f, 5), 32.0f, 0.0f, 24.0f, 0.0f, 10);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarM);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarC2);
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
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            bj4VarO.K(-827693262);
            if (contentHeader.getShowLogo()) {
                Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                String strSelectUrlForThemeCompose$intercom_sdk_base_release = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(contentHeader.getLogoUrl(), contentHeader.getLogoDarkUrl(), bj4VarO, 384);
                k85.a aVar3 = new k85.a(context);
                aVar3.c = strSelectUrlForThemeCompose$intercom_sdk_base_release;
                aVar3.b();
                f50 f50VarA = k50.a(aVar3.a(), IntercomImageLoaderKt.getImageLoader(context), null, null, bj4VarO, 124);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                r0 = 0;
                z75.a(f50VarA, null, ir9.d(eo7.m(new qs5(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11), 32.0f), di.a.d, nz1.a.c, 0.0f, null, bj4VarO, 27696, 96);
                bj4Var = bj4VarO;
            } else {
                r0 = 0;
                bj4Var = bj4VarO;
            }
            bj4Var.U(r0);
            bj4Var.K(-827663462);
            bj4 bj4Var3 = bj4Var;
            if (contentHeader.getShowAvatars()) {
                bj4 bj4Var4 = bj4Var;
                AvatarGroupKt.m19AvatarGroupJ8mCjc(contentHeader.getAdminsAvatars(), null, 0.0f, 0L, bj4Var4, 0, 14);
                bj4Var3 = bj4Var4;
            }
            bj4Var3.U(r0);
            bj4Var3.K(-827660195);
            if (contentHeader.getShowLogo()) {
                z = true;
            } else {
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                z = true;
                b47.b(bj4Var3, new qs5(true, 1.0f > r1 ? Float.MAX_VALUE : 1.0f));
            }
            bj4Var3.U(r0);
            b47.b(bj4Var3, ir9.j(aVar, 24.0f));
            bj4Var3.U(z);
            b47.b(bj4Var3, ir9.d(aVar, 48.0f));
            bj4Var3.K(-2011771929);
            HomeUiState.Content.ContentHeader.ColoredText greeting = contentHeader.getGreeting();
            bj4Var3.K(-2011770823);
            if (z2a.w(greeting.getText())) {
                obj = r20;
            } else {
                bj4Var3.K(-827645376);
                String textColorLight = (!ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4Var3, 6) || greeting.getTextColorDark() == null) ? greeting.getTextColorLight() : greeting.getTextColorDark();
                float opacity = greeting.getOpacity();
                bj4Var3.U(r0);
                String text = greeting.getText();
                wja wjaVar = (wja) h37Var.getValue();
                long composeColor = ColorExtensionsKt.toComposeColor(textColorLight, opacity);
                bj4Var3.K(-827627186);
                Object objF2 = bj4Var3.f();
                if (objF2 == obj2) {
                    objF2 = new oh4() { // from class: k05
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return HomeHeaderKt.HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(h37Var2, ((Boolean) obj3).booleanValue());
                        }
                    };
                    bj4Var3.C(objF2);
                }
                bj4Var3.U(r0);
                obj = obj2;
                WrapReportingTextKt.m347WrapReportingTextT042LqI(null, text, composeColor, wjaVar, (oh4) objF2, bj4Var3, 24576, 1);
            }
            bj4Var3.U(r0);
            g2b g2bVar = g2b.a;
            bj4Var3.U(r0);
            bj4Var3.K(-2011741756);
            HomeUiState.Content.ContentHeader.ColoredText intro = contentHeader.getIntro();
            bj4Var3.K(-2011740743);
            if (!z2a.w(intro.getText())) {
                bj4Var3.K(-827615296);
                String textColorLight2 = (!ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4Var3, 6) || intro.getTextColorDark() == null) ? intro.getTextColorLight() : intro.getTextColorDark();
                float opacity2 = intro.getOpacity();
                bj4Var3.U(r0);
                String text2 = intro.getText();
                wja wjaVar2 = (wja) h37Var.getValue();
                long composeColor2 = ColorExtensionsKt.toComposeColor(textColorLight2, opacity2);
                bj4Var3.K(-827597106);
                Object objF3 = bj4Var3.f();
                if (objF3 == obj) {
                    objF3 = new l05(r0, r22);
                    bj4Var3.C(objF3);
                }
                bj4Var3.U(r0);
                WrapReportingTextKt.m347WrapReportingTextT042LqI(null, text2, composeColor2, wjaVar2, (oh4) objF3, bj4Var3, 24576, 1);
            }
            bj4Var3.U(r0);
            bj4Var3.U(r0);
            bj4Var3.U(z);
            bj4Var2 = bj4Var3;
        }
        xj8 xj8VarW = bj4Var2.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: m05
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return HomeHeaderKt.HomeContentHeader$lambda$12(ox6Var3, contentHeader, i, i2, (jt1) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8(h37 h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z | ((Boolean) h37Var.getValue()).booleanValue()));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(h37 h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z | ((Boolean) h37Var.getValue()).booleanValue()));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeContentHeader$lambda$12(ox6 ox6Var, HomeUiState.Content.ContentHeader contentHeader, int i, int i2, jt1 jt1Var, int i3) {
        HomeContentHeader(ox6Var, contentHeader, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void HomeContentHeaderPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1555491493);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m356getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: q05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderKt.HomeContentHeaderPreview$lambda$19(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeContentHeaderPreview$lambda$19(int i, jt1 jt1Var, int i2) {
        HomeContentHeaderPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HomeErrorHeader(ox6 ox6Var, HomeUiState.Error.ErrorHeader errorHeader, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        HomeUiState.Error.ErrorHeader errorHeader2;
        boolean z;
        final ox6 ox6Var3;
        errorHeader.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(964565742);
        j1b j1bVar = bj4VarO.a;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            errorHeader2 = errorHeader;
        } else {
            errorHeader2 = errorHeader;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(errorHeader2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var4 = i4 != 0 ? aVar : ox6Var2;
            ox6 ox6VarD = ir9.d(eo7.k(gi0.c(ir9.c(ox6Var4, 1.0f), ColorExtensionsKt.toComposeColor$default(errorHeader2.getBackgroundColor(), 0.0f, 1, null), al8.a), 16.0f, 0.0f, 2), 56.0f);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarD);
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
            rd7.d(bj4VarO, cVar, ny8VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            bj4VarO.K(941715051);
            String foregroundColor = errorHeader2.getForegroundColor();
            bj4VarO.K(1204041954);
            boolean z2 = (i3 & 896) == 256;
            Object objF = bj4VarO.f();
            if (z2 || objF == jt1.a.a) {
                z = false;
                objF = new n05(0 == true ? 1 : 0, mh4Var);
                bj4VarO.C(objF);
            } else {
                z = false;
            }
            bj4VarO.U(z);
            ox6 ox6Var5 = ox6Var4;
            ox6 ox6VarC2 = we1.c(aVar, z, null, (mh4) objF, 15);
            fl6 fl6VarD = dv0.d(di.a.a, z);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarC2);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            m65.b(is7.a(R.drawable.intercom_ic_close, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_close), kv0.a.f(aVar, di.a.e), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), bj4VarO, 8, 0);
            bj4VarO.U(true);
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var3 = ox6Var5;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final HomeUiState.Error.ErrorHeader errorHeader3 = errorHeader2;
            xj8VarW.d = new ci4() { // from class: o05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderKt.HomeErrorHeader$lambda$18(ox6Var3, errorHeader3, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeErrorHeader$lambda$18(ox6 ox6Var, HomeUiState.Error.ErrorHeader errorHeader, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        HomeErrorHeader(ox6Var, errorHeader, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void HomeErrorHeaderPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-484536790);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m358getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: p05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderKt.HomeErrorHeaderPreview$lambda$20(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeErrorHeaderPreview$lambda$20(int i, jt1 jt1Var, int i2) {
        HomeErrorHeaderPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
