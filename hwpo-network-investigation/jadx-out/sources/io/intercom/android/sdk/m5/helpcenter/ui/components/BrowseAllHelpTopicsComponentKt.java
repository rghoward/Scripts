package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.kk;
import defpackage.ko7;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uh1;
import defpackage.vs0;
import defpackage.vw0;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.xw0;
import defpackage.yi1;
import defpackage.yy0;
import defpackage.zy0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BrowseAllHelpTopicsComponentKt {
    @IntercomPreviews
    private static final void BrowseAllHelpTopicsASItemPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1268619456);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m315getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: uw0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsASItemPreview$lambda$10(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BrowseAllHelpTopicsASItemPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        BrowseAllHelpTopicsASItemPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

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
    public static final void BrowseAllHelpTopicsAsItem(ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-384199751);
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
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            final Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ox6 ox6VarC = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(1227874750);
            boolean zJ = bj4VarO.j(context);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: yw0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem$lambda$4$lambda$3(context);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarM = eo7.m(we1.c(ox6VarC, false, null, (mh4) objF, 15), 16.0f, 16.0f, 0.0f, 0.0f, 12);
            c30.k kVar = c30.c;
            sp0.a aVar2 = di.a.m;
            aj1 aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarM);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
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
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6Var4 = ox6Var3;
            ox6 ox6VarC3 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            qs5 qs5Var = new qs5(true, 1.0f);
            aj1 aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
            int iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP3 = bj4VarO.P();
            ox6 ox6VarC4 = it1.c(bj4VarO, qs5Var);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC4);
            mia.b(nr1.f(bj4VarO, R.string.intercom_browse_all_help_topics), null, 0L, 0L, ob4.A, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), bj4VarO, 1572864, 0, 131006);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            bj4Var.U(true);
            ox6Var2 = ox6Var4;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zw0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem$lambda$8(ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BrowseAllHelpTopicsAsItem$lambda$4$lambda$3(Context context) {
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, hf3.t, MetricTracker.Place.COLLECTION_LIST);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BrowseAllHelpTopicsAsItem$lambda$8(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        BrowseAllHelpTopicsAsItem(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void BrowseAllHelpTopicsComponent(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-1332059523);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ko7 ko7Var = zy0.a;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            yy0 yy0VarE = zy0.e(kk.a(intercomTheme, bj4VarO, i5), gh5.a(intercomTheme, bj4VarO, i5), bj4VarO);
            vs0 vs0VarB = ws0.b(1.0f, uh1.b(0.12f, intercomTheme.getColors(bj4VarO, i5).getText().m824getDefault0d7_KjU()));
            ko7 ko7Var2 = new ko7(16.0f, 8.0f, 16.0f, 8.0f);
            bj4VarO.K(-405240498);
            boolean zJ = bj4VarO.j(context);
            Object objF = bj4VarO.f();
            int i6 = 0;
            if (zJ || objF == jt1.a.a) {
                objF = new vw0(i6, context);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            jz0.b((mh4) objF, ox6Var2, false, null, yy0VarE, vs0VarB, ko7Var2, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m313getLambda1$intercom_sdk_base_release(), bj4VarO, ((i3 << 3) & 112) | 817889280, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ww0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent$lambda$2(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BrowseAllHelpTopicsComponent$lambda$1$lambda$0(Context context) {
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, hf3.t, MetricTracker.Place.COLLECTION_LIST);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BrowseAllHelpTopicsComponent$lambda$2(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        BrowseAllHelpTopicsComponent(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void BrowseAllHelpTopicsComponentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1843811940);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m314getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new xw0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BrowseAllHelpTopicsComponentPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        BrowseAllHelpTopicsComponentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
