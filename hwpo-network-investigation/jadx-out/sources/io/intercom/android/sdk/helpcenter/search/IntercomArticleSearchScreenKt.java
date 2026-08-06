package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.ah5;
import defpackage.aj1;
import defpackage.al8;
import defpackage.az5;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.eca;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.iw;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u;
import defpackage.v5a;
import defpackage.vaa;
import defpackage.w2a;
import defpackage.ww9;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.ys5;
import defpackage.z2a;
import defpackage.zg5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleSearchScreenKt {
    public static final void IntercomArticleSearchScreen(final ArticleSearchState articleSearchState, final mh4<g2b> mh4Var, final oh4<? super String, g2b> oh4Var, jt1 jt1Var, final int i) {
        int i2;
        articleSearchState.getClass();
        mh4Var.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1211464960);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(articleSearchState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            v5a.a(null, null, kk.a(intercomTheme, bj4VarO, i3), gh5.a(intercomTheme, bj4VarO, i3), 0.0f, 0.0f, null, gr1.b(1420291739, new AnonymousClass1(articleSearchState, oh4Var, mh4Var, context), bj4VarO), bj4VarO, 12582912, 115);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomArticleSearchScreenKt.IntercomArticleSearchScreen$lambda$0(articleSearchState, mh4Var, oh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomArticleSearchScreen$lambda$0(ArticleSearchState articleSearchState, mh4 mh4Var, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        IntercomArticleSearchScreen(articleSearchState, mh4Var, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iw getNoResultsMessage(Context context, String str) {
        String strA = eca.a('\'', "'", str);
        String string = context.getString(R.string.intercom_no_results_for_searchterm);
        string.getClass();
        String strL = w2a.l(string, "{searchTerm}", strA);
        iw.b bVar = new iw.b();
        int iU = z2a.u(strL, strA, 0, false, 6);
        bVar.c(strL.substring(0, iU));
        int iH = bVar.h(new ww9(0L, 0L, ob4.B, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
        try {
            bVar.c(strL.substring(iU, strA.length() + iU));
            g2b g2bVar = g2b.a;
            bVar.e(iH);
            bVar.c(strL.substring(strA.length() + iU));
            return bVar.i();
        } catch (Throwable th) {
            bVar.e(iH);
            throw th;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ oh4<String, g2b> $onArticleClicked;
        final /* synthetic */ mh4<g2b> $onClearSearchClick;
        final /* synthetic */ ArticleSearchState $state;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ArticleSearchState articleSearchState, oh4<? super String, g2b> oh4Var, mh4<g2b> mh4Var, Context context) {
            this.$state = articleSearchState;
            this.$onArticleClicked = oh4Var;
            this.$onClearSearchClick = mh4Var;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(final ArticleSearchState articleSearchState, final oh4 oh4Var, bz5 bz5Var) {
            bz5Var.getClass();
            bz5Var.a(((ArticleSearchState.Content) articleSearchState).getSearchResults().size(), null, az5.t, new fr1(true, 1308683973, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1
                public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
                    int i3;
                    fv5Var.getClass();
                    if ((i2 & 48) == 0) {
                        i3 = (jt1Var.h(i) ? 32 : 16) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 145) == 144 && jt1Var.r()) {
                        jt1Var.u();
                        return;
                    }
                    ArticleSearchResultRow articleSearchResultRow = ((ArticleSearchState.Content) articleSearchState).getSearchResults().get(i);
                    if (articleSearchResultRow instanceof ArticleSearchResultRow.ArticleResultRow) {
                        jt1Var.K(-1577698655);
                        ArticleResultRowComponentKt.ArticleResultRowComponent((ArticleSearchResultRow.ArticleResultRow) articleSearchResultRow, oh4Var, null, jt1Var, 0, 4);
                        jt1Var.B();
                    } else if (articleSearchResultRow instanceof ArticleSearchResultRow.TeammateHelpRow) {
                        jt1Var.K(-1577693120);
                        TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchResultRow.TeammateHelpRow) articleSearchResultRow).getTeamPresenceState(), false, null, jt1Var, 0, 6);
                        jt1Var.B();
                    } else {
                        jt1Var.K(-1577703200);
                        jt1Var.B();
                        u.b();
                    }
                }

                @Override // defpackage.fi4
                public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                    invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                    return g2b.a;
                }
            }));
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            String searchTerm;
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ArticleSearchState articleSearchState = this.$state;
            boolean z = articleSearchState instanceof ArticleSearchState.Content;
            ox6.a aVar = ox6.a.t;
            if (z) {
                jt1Var.K(484447724);
                ox6 ox6VarC = gi0.c(aVar, zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a);
                jt1Var.K(154178756);
                boolean zJ = jt1Var.J(this.$state) | jt1Var.J(this.$onArticleClicked);
                final ArticleSearchState articleSearchState2 = this.$state;
                final oh4<String, g2b> oh4Var = this.$onArticleClicked;
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new oh4() { // from class: io.intercom.android.sdk.helpcenter.search.i
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0(articleSearchState2, oh4Var, (bz5) obj);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                ys5.a(ox6VarC, null, null, null, null, null, false, null, (oh4) objF, jt1Var, 0, 510);
                jt1Var.B();
                return;
            }
            if (xj5.a(articleSearchState, ArticleSearchState.Error.INSTANCE)) {
                jt1Var.K(485141132);
                HelpCenterErrorScreenKt.HelpCenterErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), ir9.c, jt1Var, 48, 0);
                jt1Var.B();
                return;
            }
            if (xj5.a(articleSearchState, ArticleSearchState.Initial.INSTANCE)) {
                jt1Var.K(485340524);
                jt1Var.B();
                this.$onClearSearchClick.invoke();
                return;
            }
            if (xj5.a(articleSearchState, ArticleSearchState.Loading.INSTANCE)) {
                jt1Var.K(485419295);
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(ir9.c, jt1Var, 6, 0);
                jt1Var.B();
                return;
            }
            if (!(articleSearchState instanceof ArticleSearchState.NoResults) && !(articleSearchState instanceof ArticleSearchState.NoResultsNoTeamHelp)) {
                jt1Var.K(154175038);
                jt1Var.B();
                u.b();
                return;
            }
            jt1Var.K(485631955);
            ArticleSearchState articleSearchState3 = this.$state;
            if (articleSearchState3 instanceof ArticleSearchState.NoResults) {
                searchTerm = ((ArticleSearchState.NoResults) articleSearchState3).getSearchTerm();
            } else {
                searchTerm = articleSearchState3 instanceof ArticleSearchState.NoResultsNoTeamHelp ? ((ArticleSearchState.NoResultsNoTeamHelp) articleSearchState3).getSearchTerm() : BuildConfig.FLAVOR;
            }
            Context context = this.$context;
            ArticleSearchState articleSearchState4 = this.$state;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC2 = it1.c(jt1Var, aVar);
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
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC2);
            mia.c(IntercomArticleSearchScreenKt.getNoResultsMessage(context, searchTerm), eo7.m(ir9.c(aVar, 1.0f), 20.0f, 32.0f, 20.0f, 0.0f, 8), ah5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), cka.b(16), null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, null, jt1Var, 24576, 0, 523240);
            jt1Var.K(145075595);
            if (articleSearchState4 instanceof ArticleSearchState.NoResults) {
                TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchState.NoResults) articleSearchState4).getTeamPresenceState(), false, null, jt1Var, 0, 6);
            }
            jt1Var.B();
            jt1Var.I();
            jt1Var.B();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
