package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a30;
import defpackage.ad5;
import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d73;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.f60;
import defpackage.fi4;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.ys5;
import defpackage.z63;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InlineSourcesSheetContentKt {
    public static final void InlineSourcesSheetContent(final List<InlineSource> list, final List<Source> list2, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        String strF;
        list.getClass();
        list2.getClass();
        bj4 bj4VarO = jt1Var.o(-2127469664);
        int i4 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bj4VarO.j(list) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(list2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            int i5 = i2 & 4;
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var2 = i5 != 0 ? aVar : ox6Var;
            ox6 ox6VarE = ir9.e(ir9.c(aVar, 1.0f), 0.0f, ((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.5f, 1);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarE);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarM = eo7.m(eo7.k(ir9.c(aVar, 1.0f), 40.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            if (list2.size() == 1) {
                bj4VarO.K(504735737);
                strF = nr1.f(bj4VarO, R.string.intercom_source);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(504813144);
                strF = nr1.f(bj4VarO, R.string.intercom_sources);
                bj4VarO.U(false);
            }
            ox6Var = ox6Var2;
            mia.b(strF, ox6VarM, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, 48, 0, 131068);
            bj4VarO = bj4VarO;
            bj4VarO.K(-953536926);
            boolean zJ = bj4VarO.j(list2) | bj4VarO.j(list);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new f60(i4, list2, list);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ys5.a(null, null, null, null, null, null, false, null, (oh4) objF, bj4VarO, 0, 511);
            bj4VarO.U(true);
        }
        final ox6 ox6Var3 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: cd5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$15(list, list2, ox6Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InlineSourcesSheetContent$lambda$14$lambda$13$lambda$12(final List list, final List list2, bz5 bz5Var) {
        bz5Var.getClass();
        final ad5 ad5Var = new ad5();
        bz5Var.a(list.size(), new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return ad5Var.invoke(Integer.valueOf(i), list.get(i));
            }

            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$2
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, new fr1(true, 2039820996, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$3
            public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
                int i3;
                boolean z;
                long jM712getBase0d7_KjU;
                qr5.a aVar;
                IntercomTheme intercomTheme;
                int i4;
                final long jM754getAdminBackground0d7_KjU;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (jt1Var.J(fv5Var) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= jt1Var.h(i) ? 32 : 16;
                }
                if (!jt1Var.A(i3 & 1, (i3 & 147) != 146)) {
                    jt1Var.u();
                    return;
                }
                final Source source = (Source) list.get(i);
                jt1Var.K(328361500);
                List list3 = list2;
                if (list3 != null && list3.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (xj5.a(((InlineSource) it.next()).getHref(), source.getUrl())) {
                        z = true;
                        break;
                    }
                }
                final boolean zA = xj5.a(source.getType(), "article");
                final Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
                c30.k kVar = c30.c;
                sp0.a aVar2 = di.a.m;
                aj1 aj1VarA = yi1.a(kVar, aVar2, jt1Var, 0);
                int iHashCode = Long.hashCode(jt1Var.v());
                kw7 kw7VarY = jt1Var.y();
                ox6.a aVar3 = ox6.a.t;
                ox6 ox6VarC = it1.c(jt1Var, aVar3);
                bt1.c.getClass();
                qr5.a aVar4 = bt1.a.b;
                if (jt1Var.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var.q();
                if (jt1Var.l()) {
                    jt1Var.k(aVar4);
                } else {
                    jt1Var.z();
                }
                bt1.a.c cVar = bt1.a.f;
                rd7.d(jt1Var, cVar, aj1VarA);
                bt1.a.e eVar = bt1.a.e;
                rd7.d(jt1Var, eVar, kw7VarY);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bt1.a.b bVar = bt1.a.g;
                rd7.d(jt1Var, bVar, numValueOf);
                bt1.a.C0034a c0034a = bt1.a.h;
                rd7.c(jt1Var, c0034a);
                bt1.a.d dVar = bt1.a.d;
                rd7.d(jt1Var, dVar, ox6VarC);
                if (z) {
                    jt1Var.K(292397625);
                    jM712getBase0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).m754getAdminBackground0d7_KjU();
                    jt1Var.B();
                } else {
                    jt1Var.K(292510527);
                    jM712getBase0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    jt1Var.B();
                }
                ox6 ox6VarC2 = gi0.c(aVar3, jM712getBase0d7_KjU, al8.a);
                jt1Var.K(-406200326);
                boolean zC = jt1Var.c(zA) | jt1Var.J(source) | jt1Var.j(context);
                Object objF = jt1Var.f();
                Object obj = jt1.a.a;
                if (zC || objF == obj) {
                    objF = new mh4<g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$1$2$1$1$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            LinkOpener.handleUrl(source.getUrl(), context, Injector.get().getApi(), zA);
                        }

                        @Override // defpackage.mh4
                        public /* bridge */ /* synthetic */ g2b invoke() {
                            invoke2();
                            return g2b.a;
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                ox6 ox6VarM = eo7.m(eo7.k(we1.c(ox6VarC2, false, null, (mh4) objF, 15), 0.0f, 24.0f, 1), 0.0f, 0.0f, 24.0f, 0.0f, 11);
                c30.j jVar = c30.a;
                sp0.b bVar2 = di.a.k;
                ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var, 48);
                int iHashCode2 = Long.hashCode(jt1Var.v());
                kw7 kw7VarY2 = jt1Var.y();
                ox6 ox6VarC3 = it1.c(jt1Var, ox6VarM);
                if (jt1Var.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var.q();
                if (jt1Var.l()) {
                    jt1Var.k(aVar4);
                } else {
                    jt1Var.z();
                }
                rd7.d(jt1Var, cVar, ny8VarA);
                rd7.d(jt1Var, eVar, kw7VarY2);
                g3.c(iHashCode2, jt1Var, bVar, jt1Var, c0034a);
                rd7.d(jt1Var, dVar, ox6VarC3);
                ox6 ox6VarN = ir9.n(aVar3, 40.0f);
                sp0 sp0Var = di.a.a;
                fl6 fl6VarD = dv0.d(sp0Var, false);
                int iHashCode3 = Long.hashCode(jt1Var.v());
                kw7 kw7VarY3 = jt1Var.y();
                ox6 ox6VarC4 = it1.c(jt1Var, ox6VarN);
                if (jt1Var.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var.q();
                if (jt1Var.l()) {
                    jt1Var.k(aVar4);
                } else {
                    jt1Var.z();
                }
                rd7.d(jt1Var, cVar, fl6VarD);
                rd7.d(jt1Var, eVar, kw7VarY3);
                g3.c(iHashCode3, jt1Var, bVar, jt1Var, c0034a);
                rd7.d(jt1Var, dVar, ox6VarC4);
                String strValueOf = String.valueOf(i + 1);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i5 = IntercomTheme.$stable;
                wja type05 = intercomTheme2.getTypography(jt1Var, i5).getType05();
                ob4 ob4Var = ob4.z;
                kv0 kv0Var = kv0.a;
                sp0 sp0Var2 = di.a.e;
                mia.b(strValueOf, kv0Var.f(aVar3, sp0Var2), 0L, 0L, ob4Var, 0L, null, 0L, 0, false, 0, 0, null, type05, jt1Var, 1572864, 0, 131004);
                jt1Var.I();
                ox6 ox6VarC5 = ir9.c(aVar3, 1.0f);
                aj1 aj1VarA2 = yi1.a(new c30.h(8.0f, true, new a30()), aVar2, jt1Var, 6);
                int iHashCode4 = Long.hashCode(jt1Var.v());
                kw7 kw7VarY4 = jt1Var.y();
                ox6 ox6VarC6 = it1.c(jt1Var, ox6VarC5);
                if (jt1Var.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var.q();
                if (jt1Var.l()) {
                    aVar = aVar4;
                    jt1Var.k(aVar);
                } else {
                    aVar = aVar4;
                    jt1Var.z();
                }
                rd7.d(jt1Var, cVar, aj1VarA2);
                rd7.d(jt1Var, eVar, kw7VarY4);
                g3.c(iHashCode4, jt1Var, bVar, jt1Var, c0034a);
                rd7.d(jt1Var, dVar, ox6VarC6);
                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var, 48);
                int iHashCode5 = Long.hashCode(jt1Var.v());
                kw7 kw7VarY5 = jt1Var.y();
                ox6 ox6VarC7 = it1.c(jt1Var, aVar3);
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
                rd7.d(jt1Var, cVar, ny8VarA2);
                rd7.d(jt1Var, eVar, kw7VarY5);
                g3.c(iHashCode5, jt1Var, bVar, jt1Var, c0034a);
                rd7.d(jt1Var, dVar, ox6VarC7);
                if (z) {
                    jt1Var.K(-1086354981);
                    intercomTheme = intercomTheme2;
                    i4 = i5;
                    jM754getAdminBackground0d7_KjU = intercomTheme.getColors(jt1Var, i4).m774getSourceBackground0d7_KjU();
                    jt1Var.B();
                } else {
                    intercomTheme = intercomTheme2;
                    i4 = i5;
                    jt1Var.K(-1086240932);
                    jM754getAdminBackground0d7_KjU = intercomTheme.getColors(jt1Var, i4).m754getAdminBackground0d7_KjU();
                    jt1Var.B();
                }
                ox6 ox6VarJ = ir9.j(aVar3, 24.0f);
                jt1Var.K(103517240);
                boolean zI = jt1Var.i(jM754getAdminBackground0d7_KjU);
                Object objF2 = jt1Var.f();
                if (zI || objF2 == obj) {
                    objF2 = new oh4<d73, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$1$2$1$2$2$1$1$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(d73 d73Var) {
                            d73Var.getClass();
                            d73.N(d73Var, jM754getAdminBackground0d7_KjU, 0.0f, 0L, 0, 126);
                        }

                        @Override // defpackage.oh4
                        public /* bridge */ /* synthetic */ g2b invoke(d73 d73Var) {
                            invoke2(d73Var);
                            return g2b.a;
                        }
                    };
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                ox6 ox6VarC8 = z63.c(ox6VarJ, (oh4) objF2);
                fl6 fl6VarD2 = dv0.d(sp0Var, false);
                int iHashCode6 = Long.hashCode(jt1Var.v());
                kw7 kw7VarY6 = jt1Var.y();
                ox6 ox6VarC9 = it1.c(jt1Var, ox6VarC8);
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
                rd7.d(jt1Var, cVar, fl6VarD2);
                rd7.d(jt1Var, eVar, kw7VarY6);
                g3.c(iHashCode6, jt1Var, bVar, jt1Var, c0034a);
                rd7.d(jt1Var, dVar, ox6VarC9);
                m65.b(is7.a(zA ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_public_article : io.intercom.android.sdk.ui.R.drawable.intercom_ic_link, jt1Var, 0), null, kv0Var.f(ir9.j(aVar3, 12.0f), sp0Var2), intercomTheme.getColors(jt1Var, i4).getIcon().m809getMuted0d7_KjU(), jt1Var, 56, 0);
                jt1Var.I();
                b47.b(jt1Var, ir9.n(aVar3, 8.0f));
                jt1Var.K(103559224);
                String strF = zA ? nr1.f(jt1Var, R.string.intercom_help_center_article) : InlineSourcesSheetContentKt.getHost(source.getUrl());
                jt1Var.B();
                strF.getClass();
                mia.b(strF, null, intercomTheme.getColors(jt1Var, i4).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i4).getType04Point5(), jt1Var, 0, 0, 131066);
                jt1Var.I();
                mia.b(source.getTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(jt1Var, i4).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var, 0, 0, 131070);
                jt1Var.I();
                jt1Var.I();
                IntercomDividerKt.IntercomDivider(null, jt1Var, 0, 1);
                jt1Var.I();
                jt1Var.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object InlineSourcesSheetContent$lambda$14$lambda$13$lambda$12$lambda$1(int i, Source source) {
        source.getClass();
        String id = source.getId();
        if (id.length() != 0) {
            return id;
        }
        return "source_" + i + '_' + source.getUrl().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InlineSourcesSheetContent$lambda$15(List list, List list2, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        InlineSourcesSheetContent(list, list2, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void InlineSourcesSheetContentPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1197768873);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m123getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bd5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InlineSourcesSheetContentKt.InlineSourcesSheetContentPreview$lambda$16(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InlineSourcesSheetContentPreview$lambda$16(int i, jt1 jt1Var, int i2) {
        InlineSourcesSheetContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHost(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return str;
        }
    }
}
