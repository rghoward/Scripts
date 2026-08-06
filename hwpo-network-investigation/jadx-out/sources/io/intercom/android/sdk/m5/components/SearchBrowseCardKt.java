package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.raa;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uh1;
import defpackage.uma;
import defpackage.wd3;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.SearchBrowseCardKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchBrowseCardKt {
    @IntercomPreviews
    private static final void PreviewSearchBrowse(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1546858090);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m70getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d89
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SearchBrowseCardKt.PreviewSearchBrowse$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewSearchBrowse$lambda$1(int i, jt1 jt1Var, int i2) {
        PreviewSearchBrowse(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSearchFirst(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-678171621);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m72getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: h89
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SearchBrowseCardKt.PreviewSearchBrowseNoSearchFirst$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewSearchBrowseNoSearchFirst$lambda$3(int i, jt1 jt1Var, int i2) {
        PreviewSearchBrowseNoSearchFirst(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestions(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1745562356);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m71getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: e89
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SearchBrowseCardKt.PreviewSearchBrowseNoSuggestions$lambda$2(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewSearchBrowseNoSuggestions$lambda$2(int i, jt1 jt1Var, int i2) {
        PreviewSearchBrowseNoSuggestions(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestionsNoSearchFirst(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(354688977);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m73getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: g89
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SearchBrowseCardKt.PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(int i, jt1 jt1Var, int i2) {
        PreviewSearchBrowseNoSuggestionsNoSearchFirst(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SearchBrowseCard(final HomeCards.HomeHelpCenterData homeHelpCenterData, final boolean z, final List<AvatarWrapper> list, final boolean z2, final MetricTracker metricTracker, jt1 jt1Var, final int i) {
        int i2;
        homeHelpCenterData.getClass();
        list.getClass();
        metricTracker.getClass();
        bj4 bj4VarO = jt1Var.o(382156573);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(homeHelpCenterData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.c(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.c(z2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(metricTracker) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomCardKt.IntercomCard(ir9.c(ox6.a.t, 1.0f), null, gr1.b(-1020132823, new AnonymousClass1(z, homeHelpCenterData, metricTracker, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), z2, list), bj4VarO), bj4VarO, 390, 2);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f89
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SearchBrowseCardKt.SearchBrowseCard$lambda$0(homeHelpCenterData, z, list, z2, metricTracker, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SearchBrowseCard$lambda$0(HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z, List list, boolean z2, MetricTracker metricTracker, int i, jt1 jt1Var, int i2) {
        SearchBrowseCard(homeHelpCenterData, z, list, z2, metricTracker, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ boolean $accessToTeammateEnabled;
        final /* synthetic */ List<AvatarWrapper> $avatars;
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeCards.HomeHelpCenterData $helpCenterData;
        final /* synthetic */ boolean $isSearchFirstEnabled;
        final /* synthetic */ MetricTracker $metricTracker;

        public AnonymousClass1(boolean z, HomeCards.HomeHelpCenterData homeHelpCenterData, MetricTracker metricTracker, Context context, boolean z2, List<AvatarWrapper> list) {
            this.$isSearchFirstEnabled = z;
            this.$helpCenterData = homeHelpCenterData;
            this.$metricTracker = metricTracker;
            this.$context = context;
            this.$accessToTeammateEnabled = z2;
            this.$avatars = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$10$lambda$1$lambda$0(MetricTracker metricTracker, Context context) {
            metricTracker.clickedSearchBrowseCard();
            context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, true));
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$10$lambda$9$lambda$8$lambda$6$lambda$5(MetricTracker metricTracker, SuggestedArticle suggestedArticle, Context context) {
            metricTracker.clickedArticleSuggestion(suggestedArticle.getId());
            context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(suggestedArticle.getId(), "search_browse_card", true, false, 8, null)));
            return g2b.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v3, types: [int] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.String, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v6, types: [ox6] */
        /* JADX WARN: Type inference failed for: r61v0 */
        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            jt1 jt1Var2;
            List<SuggestedArticle> list;
            float f;
            int i2;
            int i3;
            float f2;
            ?? r15;
            final MetricTracker metricTracker;
            jt1.a.C0187a c0187a;
            boolean z;
            boolean z2;
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            boolean z3 = this.$isSearchFirstEnabled || !this.$helpCenterData.getSuggestedArticles().isEmpty();
            final MetricTracker metricTracker2 = this.$metricTracker;
            final Context context = this.$context;
            HomeCards.HomeHelpCenterData homeHelpCenterData = this.$helpCenterData;
            boolean z4 = this.$isSearchFirstEnabled;
            boolean z5 = this.$accessToTeammateEnabled;
            List<AvatarWrapper> list2 = this.$avatars;
            c30.k kVar = c30.c;
            sp0.a aVar = di.a.m;
            aj1 aj1VarA = yi1.a(kVar, aVar, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var, aVar2);
            bt1.c.getClass();
            boolean z6 = z3;
            qr5.a aVar3 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar3);
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
            ox6 ox6VarL = eo7.l(aVar2, z6 ? 8.0f : 0.0f, z6 ? 8.0f : 0.0f, z6 ? 8.0f : 0.0f, 0.0f);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i4 = IntercomTheme.$stable;
            ox6 ox6VarA = uma.a(ox6VarL, intercomTheme.getShapes(jt1Var, i4).b);
            jt1Var.K(343614556);
            long jB = z6 ? uh1.b(0.05f, intercomTheme.getColors(jt1Var, i4).getText().m824getDefault0d7_KjU()) : uh1.j;
            jt1Var.B();
            ox6 ox6VarC2 = gi0.c(ox6VarA, jB, al8.a);
            jt1Var.K(343623299);
            boolean zJ = jt1Var.j(metricTracker2) | jt1Var.j(context);
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a2 = jt1.a.a;
            Object obj = objF;
            if (zJ || objF == c0187a2) {
                mh4 mh4Var = new mh4() { // from class: io.intercom.android.sdk.m5.components.b0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return SearchBrowseCardKt.AnonymousClass1.invoke$lambda$10$lambda$1$lambda$0(metricTracker2, context);
                    }
                };
                jt1Var.C(mh4Var);
                obj = mh4Var;
            }
            jt1Var.B();
            ox6 ox6VarC3 = we1.c(ox6VarC2, false, null, (mh4) obj, 15);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode2 = Long.hashCode(jt1Var.v());
            kw7 kw7VarY2 = jt1Var.y();
            ox6 ox6VarC4 = it1.c(jt1Var, ox6VarC3);
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar3);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, cVar, fl6VarD);
            rd7.d(jt1Var, eVar, kw7VarY2);
            g3.c(iHashCode2, jt1Var, bVar, jt1Var, c0034a);
            rd7.d(jt1Var, dVar, ox6VarC4);
            ox6 ox6VarJ = eo7.j(z6 ? 8.0f : 16.0f, z6 ? 12.0f : 20.0f, ir9.c(aVar2, 1.0f));
            c30.f fVar = c30.f;
            sp0.b bVar2 = di.a.k;
            ny8 ny8VarA = ly8.a(fVar, bVar2, jt1Var, 54);
            int iHashCode3 = Long.hashCode(jt1Var.v());
            kw7 kw7VarY3 = jt1Var.y();
            ox6 ox6VarC5 = it1.c(jt1Var, ox6VarJ);
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar3);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, cVar, ny8VarA);
            rd7.d(jt1Var, eVar, kw7VarY3);
            g3.c(iHashCode3, jt1Var, bVar, jt1Var, c0034a);
            rd7.d(jt1Var, dVar, ox6VarC5);
            sp0.b bVar3 = bVar2;
            Context context2 = context;
            mia.b(nr1.f(jt1Var, R.string.intercom_search_for_help), null, 0L, 0L, ob4.A, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var, 1572864, 0, 262078);
            int i5 = R.drawable.intercom_gif_search_icon;
            float f3 = 16.0f;
            ox6.a aVar4 = aVar2;
            ?? r10 = 0;
            boolean z7 = false;
            m65.b(is7.a(i5, jt1Var, 0), null, raa.a(ir9.j(aVar4, 16.0f), String.valueOf(i5)), intercomTheme.getColors(jt1Var, i4).m752getActionContrastWhite0d7_KjU(), jt1Var, 56, 0);
            jt1 jt1Var3 = jt1Var;
            jt1Var3.I();
            jt1Var3.I();
            List<SuggestedArticle> suggestedArticles = homeHelpCenterData.getSuggestedArticles();
            jt1Var3.K(343677646);
            int i6 = 2;
            int i7 = 6;
            if (suggestedArticles.isEmpty()) {
                jt1Var2 = jt1Var3;
                list = suggestedArticles;
                f = 16.0f;
                i2 = 2;
                i3 = 6;
                f2 = 0.0f;
                r15 = 0;
            } else {
                aj1 aj1VarA2 = yi1.a(kVar, aVar, jt1Var3, 0);
                int iHashCode4 = Long.hashCode(jt1Var3.v());
                kw7 kw7VarY4 = jt1Var3.y();
                ox6 ox6VarC6 = it1.c(jt1Var3, aVar4);
                if (jt1Var3.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var3.q();
                if (jt1Var3.l()) {
                    jt1Var3.k(aVar3);
                } else {
                    jt1Var3.z();
                }
                rd7.d(jt1Var3, cVar, aj1VarA2);
                rd7.d(jt1Var3, eVar, kw7VarY4);
                g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                rd7.d(jt1Var3, dVar, ox6VarC6);
                jt1Var3.K(-562735656);
                if (suggestedArticles.isEmpty()) {
                    metricTracker = metricTracker2;
                    c0187a = c0187a2;
                    z = false;
                } else {
                    jt1Var3.K(-562730931);
                    metricTracker = metricTracker2;
                    boolean zJ2 = jt1Var3.j(metricTracker) | jt1Var3.j(suggestedArticles);
                    Object objF2 = jt1Var3.f();
                    c0187a = c0187a2;
                    if (zJ2 || objF2 == c0187a) {
                        z2 = false;
                        objF2 = new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1(metricTracker, suggestedArticles, null);
                        jt1Var3.C(objF2);
                    } else {
                        z2 = false;
                    }
                    jt1Var3.B();
                    wd3.d(jt1Var3, (ci4) objF2, BuildConfig.FLAVOR);
                    z = z2;
                }
                jt1Var3.B();
                jt1Var3.K(-562721858);
                int i8 = 0;
                ?? r16 = z;
                for (Object obj2 : suggestedArticles) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw r16;
                    }
                    final SuggestedArticle suggestedArticle = (SuggestedArticle) obj2;
                    jt1Var3.K(-562722027);
                    if (i8 == 0) {
                        b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                    }
                    jt1Var3.B();
                    ox6 ox6VarC7 = ir9.c(aVar4, 1.0f);
                    jt1Var3.K(-1193385195);
                    final Context context3 = context2;
                    boolean zJ3 = jt1Var3.j(metricTracker) | jt1Var3.J(suggestedArticle) | jt1Var3.j(context3);
                    Object objF3 = jt1Var3.f();
                    if (zJ3 || objF3 == c0187a) {
                        objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.components.c0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SearchBrowseCardKt.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8$lambda$6$lambda$5(metricTracker, suggestedArticle, context3);
                            }
                        };
                        jt1Var3.C(objF3);
                    }
                    jt1Var3.B();
                    context2 = context3;
                    ox6 ox6VarA2 = raa.a(eo7.m(we1.c(ox6VarC7, z7, r16, (mh4) objF3, 15), f3, 4.0f, 0.0f, 4.0f, 4), "suggested article");
                    sp0.b bVar4 = bVar3;
                    ny8 ny8VarA2 = ly8.a(c30.a, bVar4, jt1Var3, 48);
                    int iHashCode5 = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY5 = jt1Var3.y();
                    ox6 ox6VarC8 = it1.c(jt1Var3, ox6VarA2);
                    bt1.c.getClass();
                    qr5.a aVar5 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar5);
                    } else {
                        jt1Var3.z();
                    }
                    rd7.d(jt1Var3, bt1.a.f, ny8VarA2);
                    rd7.d(jt1Var3, bt1.a.e, kw7VarY5);
                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode5));
                    rd7.c(jt1Var3, bt1.a.h);
                    rd7.d(jt1Var3, bt1.a.d, ox6VarC8);
                    qs5 qs5Var = new qs5(true, 1.0f);
                    String title = suggestedArticle.getTitle();
                    ob4 ob4Var = ob4.y;
                    boolean z8 = z7 ? 1 : 0;
                    mia.b(title, qs5Var, 0L, 0L, ob4Var, 0L, null, 0L, 2, false, 2, 0, null, null, jt1Var, 1572864, 24960, 241596);
                    aVar4 = aVar4;
                    z7 = false;
                    IntercomChevronKt.IntercomChevron(eo7.k(aVar4, 20.0f, 0.0f, 2), jt1Var, 6, 0);
                    jt1Var.I();
                    b47.b(jt1Var, ir9.d(aVar4, 16.0f));
                    i6 = 2;
                    f3 = 16.0f;
                    i7 = 6;
                    jt1Var3 = jt1Var;
                    i8 = i9;
                    suggestedArticles = suggestedArticles;
                    bVar3 = bVar4;
                    metricTracker = metricTracker;
                    c0187a = c0187a;
                    r16 = 0;
                }
                jt1Var2 = jt1Var3;
                list = suggestedArticles;
                f = f3;
                i2 = i6;
                i3 = i7;
                f2 = 0.0f;
                jt1Var2.B();
                jt1Var2.I();
                r10 = z7;
                r15 = r16;
            }
            jt1Var2.B();
            jt1Var2.K(343756010);
            if (z4 && z5) {
                jt1Var2.K(343758146);
                if (!list.isEmpty()) {
                    IntercomDividerKt.IntercomDivider(eo7.k(aVar4, f, f2, i2), jt1Var2, i3, r10);
                }
                jt1Var2.B();
                TeamPresenceRowKt.TeamPresenceRow(r15, list2, jt1Var2, r10, 1);
            }
            jt1Var2.B();
            jt1Var2.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
