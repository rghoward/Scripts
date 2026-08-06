package defpackage;

import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel;
import com.hwpo_training_app.leaderboards.details.common.data.LeaderboardDetailsActionsRepositoryImpl;
import com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsFlowUseCase;
import com.hwpo_training_app.leaderboards.details.common.domain.SendLeaderboardDetailsActionUseCase;
import com.hwpo_training_app.leaderboards.details.header.data.LeaderboardDetailsHeaderRepositoryImpl;
import com.hwpo_training_app.leaderboards.details.header.domain.ClearCachedTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.ClearLeaderboardDetailsFiltersUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.GetLeaderboardByIdUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.SearchTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.delegate.DescriptionTextHeightDelegate;
import com.hwpo_training_app.leaderboards.details.list.data.LeaderboardAdditionalValueRepositoryImpl;
import com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl;
import com.hwpo_training_app.leaderboards.details.list.domain.ChangeTopValueVisibilityUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.FetchLeaderboardTopValuesNextPageUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.FetchLeaderboardTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.ObserveTopValuesFlowUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel;
import com.hwpo_training_app.leaderboards.filter.details.domain.ApplyDetailsFiltersUseCase;
import com.hwpo_training_app.leaderboards.filter.details.domain.ObserveLeaderboardDetailsFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowViewModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.list.data.LeaderboardFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.list.domain.ApplyFiltersUseCase;
import com.hwpo_training_app.leaderboards.filter.list.domain.ObserveLeaderboardFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowViewModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel;
import com.hwpo_training_app.leaderboards.list.challenge.presentation.ChallengesLeaderboardsViewModel;
import com.hwpo_training_app.leaderboards.list.common.domain.ClearLeaderboardStorageUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsNextPageUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase;
import com.hwpo_training_app.leaderboards.list.daily.presentation.DailyLeaderboardsViewModel;
import com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase;
import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel;
import com.hwpo_training_app.leaderboards.valuedetails.data.LeaderboardValueDetailsRepositoryImpl;
import com.hwpo_training_app.leaderboards.valuedetails.domain.GetLeaderboardValueDetailsUseCase;
import com.hwpo_training_app.notifications.domain.ClearNotificationsUseCase;
import com.hwpo_training_app.notifications.domain.FetchNotificationsUseCase;
import com.hwpo_training_app.notifications.domain.ObserveSocketNotificationsFlowUseCase;
import com.hwpo_training_app.notifications.domain.ObserveSocketReadNotificationsFlowUseCase;
import com.hwpo_training_app.notifications.domain.ObserverNotificationsFlowUseCase;
import com.hwpo_training_app.notifications.domain.SubscribeToNotificationsUseCase;
import com.hwpo_training_app.notifications.presentation.NotificationsViewModel;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 extends jf1 {
    public final a A;
    public final mf8<ip8> A0;
    public final mf8<is4> B;
    public final mf8<zo8> B0;
    public final a C;
    public final a C0;
    public final mf8<js4> D;
    public final a D0;
    public final mf8<es4> E;
    public final mf8<iu3> E0;
    public final mf8<ls4> F;
    public final a F0;
    public final a G;
    public final a G0;
    public final a H;
    public final mf8<pb8> H0;
    public final a I;
    public final a I0;
    public final a J;
    public final a J0;
    public final mf8<a46> K;
    public final a K0;
    public final a L;
    public final mf8<ts8> L0;
    public final mf8<k81> M;
    public final mf8<zr8> M0;
    public final mf8<x81> N;
    public final mf8<ws8> N0;
    public final a O;
    public final a O0;
    public final mf8<gn1> P;
    public final a P0;
    public final mf8<pm1> Q;
    public final a Q0;
    public final a R;
    public final a R0;
    public final a S;
    public final a S0;
    public final mf8<li7> T;
    public final a T0;
    public final a U;
    public final a U0;
    public final a V;
    public final a V0;
    public final a W;
    public final a W0;
    public final a X;
    public final a Y;
    public final mf8<eq4> Z;
    public final dy a;
    public final a a0;
    public final q09 b;
    public final mf8<g35> b0;
    public final wx c;
    public final mf8<o52> c0;
    public final f31 d;
    public final mf8<om1> d0;
    public final xx e;
    public final mf8<h35> e0;
    public final ve f;
    public final a f0;
    public final ay g;
    public final mf8<s36> g0;
    public final we h;
    public final a h0;
    public final hu1 i;
    public final a i0;
    public final aa7 j;
    public final a j0;
    public final vx k;
    public final a k0;
    public final fe2 l;
    public final a l0;
    public final ae2 m;
    public final a m0;
    public final a n;
    public final a n0;
    public final mf8<g6> o;
    public final mf8<gd7> o0;
    public final mf8<c5> p;
    public final a p0;
    public final mf8<h6> q;
    public final mf8<f70> q0;
    public final a r;
    public final a r0;
    public final mf8<eta> s;
    public final a s0;
    public final mf8<tp6> t;
    public final mf8<b87> t0;
    public final mf8<pta> u;
    public final mf8<rr8> u0;
    public final mf8<rta> v;
    public final mf8<sr8> v0;
    public final mf8<p1<osa>> w;
    public final a w0;
    public final mf8<p1<cbb>> x;
    public final a x0;
    public final mf8<lab> y;
    public final a y0;
    public final mf8<sta> z;
    public final mf8<do8> z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements mf8<T> {
        public final fe2 a;
        public final ae2 b;
        public final je2 c;
        public final int d;

        public a(fe2 fe2Var, ae2 ae2Var, je2 je2Var, int i) {
            this.a = fe2Var;
            this.b = ae2Var;
            this.c = je2Var;
            this.d = i;
        }

        @Override // defpackage.nf8
        public final T get() {
            ae2 ae2Var = this.b;
            fe2 fe2Var = this.a;
            je2 je2Var = this.c;
            int i = this.d;
            switch (i) {
                case 0:
                    return (T) new r7(je2Var.s(), new u3b(je2Var.m.r.get()), je2Var.B(), fe2Var.T.get());
                case 1:
                    return (T) new e8(je2Var.o.get(), new u3b(je2Var.m.r.get()), je2Var.o(), je2Var.n(), je2Var.D(), je2Var.s(), je2Var.k(), je2Var.j(), je2Var.r(), fe2Var.U.get(), fe2Var.T.get());
                case 2:
                    return (T) new h5(fe2Var.t.get());
                case 3:
                    return (T) new i6(je2Var.p.get(), fe2Var.y.get());
                case 4:
                    return (T) ey.a(je2Var.a, fe2Var.J.get());
                case 5:
                    return (T) new gd(je2Var.b, je2Var.u.get(), je2Var.z(), je2Var.x(), fe2Var.U.get(), fe2Var.T.get());
                case 6:
                    return (T) new bta(fe2Var.t.get(), je2Var.s.get(), je2Var.t.get());
                case 7:
                    return (T) new dta(fe2Var.t.get());
                case 8:
                    return (T) new qn6(fe2Var.t.get());
                case 9:
                    return (T) new tta(je2Var.v.get(), je2Var.w.get(), je2Var.x.get(), je2Var.y.get());
                case 10:
                    return (T) hy.a(je2Var.c, fe2Var.J.get());
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    return (T) l1a.a(je2Var.d);
                case 12:
                    return (T) k1a.a(je2Var.d);
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    return (T) j1a.a(je2Var.d);
                case 14:
                    return (T) new ue(je2Var.b, je2Var.B.get());
                case h4c.e /* 15 */:
                    return (T) new gs4(fe2Var.t.get());
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    return (T) new pg(je2Var.b, je2Var.D.get(), je2Var.y(), je2Var.u(), new w3b(je2Var.m.r.get()), fe2Var.T.get(), fe2Var.U.get());
                case 17:
                    return (T) new ks4(fe2Var.t.get(), fe2Var.p0.get());
                case 18:
                    return (T) new ms4(je2Var.E.get());
                case 19:
                    return (T) gy.a(je2Var.e, fe2Var.J.get());
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    SendLeaderboardDetailsActionUseCase sendLeaderboardDetailsActionUseCaseA = je2Var.A();
                    ae2 ae2Var2 = je2Var.m;
                    return (T) new AthletesListViewModel(sendLeaderboardDetailsActionUseCaseA, je2Var.m(), new ObserveLeaderboardDetailsFiltersFlowUseCase(ae2Var2.c()), je2Var.l(), je2Var.v(), je2Var.E(), je2Var.h(), new df7(new wc8(ae2Var2.m.get())), fe2Var.U.get(), fe2Var.T.get(), je2Var.b);
                case 21:
                    return (T) new cx0(new ol4(je2Var.m.r.get()), fe2Var.U.get());
                case 22:
                    q09 q09Var = je2Var.b;
                    fe2 fe2Var2 = je2Var.l;
                    return (T) new w71(q09Var, je2Var.u.get(), new qk4(je2Var.z.get(), fe2Var2.P.get()), fe2Var.L.get(), fe2Var.R.get(), fe2Var.Q.get(), je2Var.t(), je2Var.C(), je2Var.g(), fe2Var.Y.get(), new r60(fe2Var2.M.get()), fe2Var.X.get(), je2Var.w(), fe2Var.l.get(), fe2Var.U.get(), fe2Var.T.get());
                case 23:
                    mf8<a46> mf8Var = je2Var.K;
                    ae2 ae2Var3 = je2Var.m;
                    return (T) new ChallengesLeaderboardsViewModel(mf8Var.get(), new FetchLeaderboardsUseCase(ae2Var3.d()), new ObserveLeaderboardsFlowUseCase(ae2Var3.r.get(), ae2Var3.d()), new ObserveLeaderboardFiltersFlowUseCase(new LeaderboardFiltersRepositoryImpl(ae2Var3.y.get())), new FetchLeaderboardsNextPageUseCase(ae2Var3.d()), fe2Var.U.get(), fe2Var.T.get());
                case 24:
                    return (T) new p26(fe2Var.q0.get(), new qn6(je2Var.l.t.get()));
                case 25:
                    return (T) new m91(new l7b(je2Var.l.U.get()), new a91(je2Var.N.get()), fe2Var.T.get());
                case 26:
                    return (T) new z81(je2Var.M.get(), fe2Var.y.get());
                case 27:
                    ve veVar = je2Var.f;
                    mv8 mv8Var = fe2Var.J.get();
                    veVar.getClass();
                    mv8Var.getClass();
                    Object objB = mv8Var.b(k81.class);
                    objB.getClass();
                    return (T) ((k81) objB);
                case 28:
                    return (T) new qn1(fe2Var.t.get(), ae2Var.z.get(), new hu3(je2Var.Q.get()), new xe7(je2Var.Q.get()), new ci8(je2Var.Q.get()), new fb(je2Var.Q.get()), new jb(je2Var.Q.get()), new et8(je2Var.Q.get()), new hn8(je2Var.Q.get()), new we7(je2Var.Q.get()), je2Var.C(), je2Var.g(), new jx2(je2Var.Q.get()), new hx2(je2Var.Q.get()), new zd1(je2Var.Q.get()), je2Var.p(), ae2Var.B.get(), new vb1(je2Var.m.r.get()), fe2Var.l.get(), fe2Var.M.get(), fe2Var.U.get(), fe2Var.T.get(), je2Var.b);
                case 29:
                    return (T) new dn1(ae2Var.A.get(), fe2Var.a0.get(), je2Var.P.get(), ae2Var.r.get(), fe2Var.f(), fe2Var.f0.get(), fe2Var.P.get());
                case 30:
                    return (T) new jn1();
                case 31:
                    mf8<a46> mf8Var2 = je2Var.K;
                    ae2 ae2Var4 = je2Var.m;
                    return (T) new DailyLeaderboardsViewModel(mf8Var2.get(), new FetchLeaderboardsUseCase(ae2Var4.d()), new ObserveLeaderboardsFlowUseCase(ae2Var4.r.get(), ae2Var4.d()), new ObserveLeaderboardFiltersFlowUseCase(new LeaderboardFiltersRepositoryImpl(ae2Var4.y.get())), new FetchLeaderboardsNextPageUseCase(ae2Var4.d()), fe2Var.U.get(), fe2Var.T.get());
                case 32:
                    return (T) new a43(je2Var.T.get());
                case 33:
                    return (T) new ji7(fe2Var.t.get());
                case 34:
                    q09 q09Var2 = je2Var.b;
                    fe2 fe2Var3 = je2Var.l;
                    return (T) new fj3(q09Var2, je2Var.u.get(), new xc(je2Var.z.get()), new sd3(je2Var.z.get()), new q68(fe2Var3.g0.get()), new oz9(fe2Var3.c0.get()), new s31(fe2Var3.c0.get()), new ov8(fe2Var3.c0.get()), new bf7(fe2Var3.c0.get()), fe2Var.L.get(), fe2Var.f(), fe2Var.U.get(), fe2Var.T.get());
                case 35:
                    q09 q09Var3 = je2Var.b;
                    fe2 fe2Var4 = je2Var.l;
                    return (T) new gl3(q09Var3, je2Var.u.get(), new pl4(je2Var.z.get(), fe2Var4.P.get()), je2Var.w(), fe2Var.L.get(), fe2Var.l.get(), new r60(fe2Var4.M.get()), je2Var.C(), je2Var.g(), je2Var.t(), fe2Var.U.get(), fe2Var.T.get());
                case 36:
                    return (T) new cd4(fe2Var.T.get(), new vu8(je2Var.m.r.get()));
                case 37:
                    return (T) new bd4(je2Var.T.get(), fe2Var.T.get(), new vu8(je2Var.m.r.get()));
                case 38:
                    return (T) new rr4(je2Var.b, new tp8(je2Var.Z.get()), new xp8(je2Var.Z.get()), new ve7(je2Var.Z.get()), new ye7(je2Var.Z.get()), fe2Var.T.get(), fe2Var.U.get());
                case 39:
                    return (T) new fq4(je2Var.E.get());
                case 40:
                    q09 q09Var4 = je2Var.b;
                    fe2 fe2Var5 = je2Var.l;
                    ae2 ae2Var5 = je2Var.m;
                    return (T) new e25(q09Var4, je2Var.b0.get(), je2Var.T.get(), je2Var.c0.get(), je2Var.K.get(), je2Var.d0.get(), je2Var.e0.get(), ae2Var.B.get(), new ol4(ae2Var5.r.get()), new zf8(fe2Var5.H.get()), je2Var.i(), new h13(fe2Var5.m0.get()), new wd1(ae2Var5.l.get(), fe2Var5.g(), fe2Var5.M.get(), fe2Var5.m0.get(), fe2Var5.o0.get(), fe2Var5.p.get(), fe2Var5.m.get()), new y3b(ae2Var5.r.get()), je2Var.p(), new GetLeaderboardValueDetailsUseCase(new LeaderboardValueDetailsRepositoryImpl(ae2Var5.C.get())), new ObserveSocketReadNotificationsFlowUseCase(ae2Var5.G.get()), new lf7(fe2Var5.r0.get(), new SubscribeToNotificationsUseCase(fe2Var5.m0.get(), fe2Var5.H.get())), new hk9(ae2Var5.o.get()), fe2Var.s0.get(), fe2Var.U.get(), fe2Var.T.get());
                case 41:
                    return (T) new g35();
                case 42:
                    return (T) new n52(fe2Var.t.get());
                case 43:
                    return (T) new xk1(fe2Var.t.get());
                case Carousel.ENTITY_TYPE /* 44 */:
                    return (T) new v25(fe2Var.t.get());
                case 45:
                    return (T) new LeaderboardDetailsFiltersFlowViewModel(je2Var.g0.get());
                case 46:
                    return (T) new l36(fe2Var.p0.get());
                case 47:
                    mf8<s36> mf8Var3 = je2Var.g0;
                    ae2 ae2Var6 = je2Var.m;
                    return (T) new LeaderboardDetailsFiltersViewModel(mf8Var3.get(), new ApplyDetailsFiltersUseCase(ae2Var6.c()), new ObserveLeaderboardDetailsFiltersFlowUseCase(ae2Var6.c()), je2Var.p());
                case 48:
                    q09 q09Var5 = je2Var.b;
                    ae2 ae2Var7 = je2Var.m;
                    return (T) new LeaderboardDetailsHeaderViewModel(q09Var5, je2Var.K.get(), ae2Var.z.get(), new LeaderboardDetailsActionsFlowUseCase(new LeaderboardDetailsActionsRepositoryImpl(ae2Var7.s.get())), new ObserveLeaderboardDetailsFiltersFlowUseCase(ae2Var7.c()), new GetLeaderboardByIdUseCase(new LeaderboardDetailsHeaderRepositoryImpl(ae2Var7.H.get())), new ClearCachedTopValuesUseCase(je2Var.q()), new SearchTopValuesUseCase(ae2Var7.c()), new df7(new wc8(ae2Var7.m.get())), new ClearLeaderboardDetailsFiltersUseCase(ae2Var7.c()), new DescriptionTextHeightDelegate(je2Var.l.U.get()), ae2Var.B.get(), fe2Var.U.get(), fe2Var.T.get());
                case 49:
                    return (T) new LeaderboardFiltersFlowViewModel(je2Var.g0.get());
                case 50:
                    mf8<s36> mf8Var4 = je2Var.g0;
                    ae2 ae2Var8 = je2Var.m;
                    return (T) new LeaderboardFiltersViewModel(mf8Var4.get(), new ApplyFiltersUseCase(new LeaderboardFiltersRepositoryImpl(ae2Var8.y.get())), new ObserveLeaderboardFiltersFlowUseCase(new LeaderboardFiltersRepositoryImpl(ae2Var8.y.get())), je2Var.p());
                case 51:
                    ae2 ae2Var9 = je2Var.m;
                    ae2 ae2Var10 = je2Var.m;
                    return (T) new LeaderboardTabContainerViewModel(new ClearLeaderboardStorageUseCase(ae2Var9.d()), new ObserveLeaderboardFiltersFlowUseCase(new LeaderboardFiltersRepositoryImpl(ae2Var10.y.get())), new SearchLeaderboardsUseCase(new LeaderboardFiltersRepositoryImpl(ae2Var10.y.get())), ae2Var.z.get());
                case 52:
                    return (T) new LeaderboardValueAttachmentsViewModel(je2Var.K.get(), je2Var.t(), je2Var.C(), je2Var.g(), new GetLeaderboardValueDetailsUseCase(new LeaderboardValueDetailsRepositoryImpl(je2Var.m.C.get())), fe2Var.l.get(), fe2Var.M.get(), fe2Var.U.get(), fe2Var.T.get(), je2Var.b);
                case 53:
                    hy8 hy8Var = fe2Var.t.get();
                    ae2 ae2Var11 = je2Var.m;
                    ae2 ae2Var12 = je2Var.m;
                    fe2 fe2Var6 = je2Var.l;
                    return (T) new qg6(hy8Var, new ObserveSocketNotificationsFlowUseCase(ae2Var11.G.get()), new rb1(fe2Var6.o0.get(), fe2Var6.m.get(), ae2Var12.r.get()), new tb1(ae2Var12.r.get(), fe2Var6.m.get()), je2Var.p(), new xo1(fe2Var6.q.get()), je2Var.B(), new xb1(je2Var.o0.get(), fe2Var6.g()), new ck9(je2Var.o0.get()), fe2Var.U.get(), fe2Var.T.get(), je2Var.b);
                case 54:
                    return (T) new hd7(fe2Var.c.a);
                case 55:
                    return (T) new ip6(new pb6(je2Var.q0.get()), new ob6(je2Var.q0.get()), fe2Var.U.get(), fe2Var.T.get());
                case 56:
                    ay ayVar = je2Var.g;
                    return (T) new g70((c70) pk.c(je2Var.l.J.get(), c70.class));
                case 57:
                    dm9 dm9Var = ae2Var.B.get();
                    ae2 ae2Var13 = je2Var.m;
                    ae2 ae2Var14 = je2Var.m;
                    return (T) new NotificationsViewModel(dm9Var, new FetchNotificationsUseCase(ae2Var13.G.get()), new ObserverNotificationsFlowUseCase(ae2Var14.G.get()), fe2Var.r0.get(), new ClearNotificationsUseCase(ae2Var14.G.get()), ae2Var.z.get(), fe2Var.U.get(), fe2Var.T.get());
                case 58:
                    return (T) new fj7(je2Var.c0.get(), je2Var.s(), je2Var.t0.get(), new u3b(je2Var.m.r.get()), je2Var.B(), new ju3(je2Var.v0.get()), new xo1(je2Var.l.q.get()), fe2Var.T.get());
                case 59:
                    return (T) new b87(ae2Var.B.get());
                case 60:
                    return (T) new vr8(je2Var.u0.get(), fe2Var.t0.get());
                case 61:
                    we weVar = je2Var.h;
                    return (T) ((rr8) pk.c(fe2Var.J.get(), rr8.class));
                case 62:
                    return (T) new rj7(je2Var.t0.get(), je2Var.T.get(), new gf7(je2Var.v0.get()), new he1(je2Var.v0.get()), ae2Var.z.get(), fe2Var.U.get());
                case 63:
                    return (T) new yj7(je2Var.T.get());
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    return (T) new wl7(je2Var.b, je2Var.z0.get(), new eo8(je2Var.B0.get()), fe2Var.U.get(), fe2Var.T.get());
                case 65:
                    return (T) new bo8(fe2Var.q0.get());
                case 66:
                    return (T) new cp8(fe2Var.U.get(), je2Var.A0.get());
                case 67:
                    hu1 hu1Var = je2Var.i;
                    return (T) ((ip8) pk.c(fe2Var.J.get(), ip8.class));
                case 68:
                    return (T) new vx7(fe2Var.t.get());
                case 69:
                    return (T) new ny7(new sk4(new e82(je2Var.E0.get())), fe2Var.T.get(), je2Var.b);
                case 70:
                    aa7 aa7Var = je2Var.j;
                    return (T) ((iu3) pk.c(fe2Var.J.get(), iu3.class));
                case 71:
                    return (T) new k48(fe2Var.t.get(), new tk4(je2Var.l.q.get()), je2Var.b);
                case 72:
                    return (T) new zb8(je2Var.H0.get(), je2Var.s(), new y3b(je2Var.m.r.get()), je2Var.B(), je2Var.r(), fe2Var.T.get());
                case 73:
                    return (T) new ya8(fe2Var.t.get());
                case 74:
                    return (T) new gp8(je2Var.b, je2Var.z0.get(), new bl4(je2Var.B0.get()), new wn8(je2Var.B0.get()), fe2Var.T.get());
                case 75:
                    return (T) new jr8(new cl4(je2Var.v0.get()), new c09(je2Var.v0.get()), fe2Var.U.get(), fe2Var.T.get(), je2Var.b);
                case 76:
                    return (T) new ct8(je2Var.L0.get(), je2Var.b, new us8(je2Var.N0.get()), new dl4(je2Var.N0.get()), new uc9(je2Var.m.n.get()), fe2Var.T.get(), fe2Var.U.get(), ae2Var.B.get());
                case 77:
                    return (T) new as8(fe2Var.t.get());
                case 78:
                    return (T) new zs8(je2Var.M0.get());
                case 79:
                    vx vxVar = je2Var.k;
                    return (T) ((zr8) pk.c(fe2Var.J.get(), zr8.class));
                case Defaults.PORT /* 80 */:
                    return (T) new ij9(fe2Var.t.get(), fe2Var.j0.get(), je2Var.b);
                case 81:
                    return (T) new qo9(je2Var.t0.get(), je2Var.T.get(), fe2Var.T.get(), new oo9(je2Var.m.r.get()), new xo1(je2Var.l.q.get()), je2Var.B(), je2Var.i(), fe2Var.l.get());
                case 82:
                    return (T) new tka(je2Var.b, je2Var.z0.get());
                case 83:
                    return (T) new wpa(fe2Var.t.get(), je2Var.b);
                case 84:
                    return (T) new nua(je2Var.u.get(), fe2Var.U.get());
                case SurveyViewModel.ENTITY_TYPE /* 85 */:
                    q09 q09Var6 = je2Var.b;
                    fe2 fe2Var7 = je2Var.l;
                    return (T) new o9b(q09Var6, je2Var.u.get(), fe2Var.l.get(), fe2Var.U.get(), new rq8(je2Var.z.get()), new nf7(je2Var.z.get()), new pl4(je2Var.z.get(), fe2Var7.P.get()), new qk4(je2Var.z.get(), fe2Var7.P.get()), je2Var.w(), je2Var.C(), je2Var.g(), je2Var.t(), new ox2(je2Var.z.get()), new fl4(je2Var.z.get(), fe2Var7.P.get()), new q68(fe2Var7.g0.get()), fe2Var.L.get(), fe2Var.Q.get(), new r60(fe2Var7.M.get()), fe2Var.R.get(), fe2Var.T.get());
                case 86:
                    return (T) new ybb(je2Var.b, je2Var.u.get(), new vq8(je2Var.z.get()), new of7(je2Var.z.get()), je2Var.w(), new dx2(je2Var.z.get()), new ll4(je2Var.z.get()), fe2Var.U.get(), fe2Var.T.get());
                case 87:
                    return (T) new tsb(je2Var.b, je2Var.B.get(), new w3b(je2Var.m.r.get()), fe2Var.T.get(), fe2Var.U.get());
                default:
                    throw new AssertionError(i);
            }
        }
    }

    public je2(fe2 fe2Var, ae2 ae2Var, dy dyVar, xx xxVar, ve veVar, we weVar, aa7 aa7Var, ay ayVar, hu1 hu1Var, vx vxVar, wx wxVar, f31 f31Var, q09 q09Var) {
        this.l = fe2Var;
        this.m = ae2Var;
        this.a = dyVar;
        this.b = q09Var;
        this.c = wxVar;
        this.d = f31Var;
        this.e = xxVar;
        this.f = veVar;
        this.g = ayVar;
        this.h = weVar;
        this.i = hu1Var;
        this.j = aa7Var;
        this.k = vxVar;
        this.n = new a(fe2Var, ae2Var, this, 0);
        this.o = j43.a(new a(fe2Var, ae2Var, this, 2));
        this.p = j43.a(new a(fe2Var, ae2Var, this, 4));
        this.q = j43.a(new a(fe2Var, ae2Var, this, 3));
        this.r = new a(fe2Var, ae2Var, this, 1);
        this.s = j43.a(new a(fe2Var, ae2Var, this, 7));
        this.t = j43.a(new a(fe2Var, ae2Var, this, 8));
        this.u = j43.a(new a(fe2Var, ae2Var, this, 6));
        this.v = j43.a(new a(fe2Var, ae2Var, this, 10));
        this.w = j43.a(new a(fe2Var, ae2Var, this, 11));
        this.x = j43.a(new a(fe2Var, ae2Var, this, 12));
        this.y = j43.a(new a(fe2Var, ae2Var, this, 13));
        this.z = j43.a(new a(fe2Var, ae2Var, this, 9));
        this.A = new a(fe2Var, ae2Var, this, 5);
        this.B = j43.a(new a(fe2Var, ae2Var, this, 15));
        this.C = new a(fe2Var, ae2Var, this, 14);
        this.D = j43.a(new a(fe2Var, ae2Var, this, 17));
        this.E = j43.a(new a(fe2Var, ae2Var, this, 19));
        this.F = j43.a(new a(fe2Var, ae2Var, this, 18));
        this.G = new a(fe2Var, ae2Var, this, 16);
        this.H = new a(fe2Var, ae2Var, this, 20);
        this.I = new a(fe2Var, ae2Var, this, 21);
        this.J = new a(fe2Var, ae2Var, this, 22);
        this.K = j43.a(new a(fe2Var, ae2Var, this, 24));
        this.L = new a(fe2Var, ae2Var, this, 23);
        this.M = j43.a(new a(fe2Var, ae2Var, this, 27));
        this.N = j43.a(new a(fe2Var, ae2Var, this, 26));
        this.O = new a(fe2Var, ae2Var, this, 25);
        this.P = j43.a(new a(fe2Var, ae2Var, this, 30));
        this.Q = j43.a(new a(fe2Var, ae2Var, this, 29));
        this.R = new a(fe2Var, ae2Var, this, 28);
        this.S = new a(fe2Var, ae2Var, this, 31);
        this.T = j43.a(new a(fe2Var, ae2Var, this, 33));
        this.U = new a(fe2Var, ae2Var, this, 32);
        this.V = new a(fe2Var, ae2Var, this, 34);
        this.W = new a(fe2Var, ae2Var, this, 35);
        this.X = new a(fe2Var, ae2Var, this, 36);
        this.Y = new a(fe2Var, ae2Var, this, 37);
        this.Z = j43.a(new a(fe2Var, ae2Var, this, 39));
        this.a0 = new a(fe2Var, ae2Var, this, 38);
        this.b0 = j43.a(new a(fe2Var, ae2Var, this, 41));
        this.c0 = j43.a(new a(fe2Var, ae2Var, this, 42));
        this.d0 = j43.a(new a(fe2Var, ae2Var, this, 43));
        this.e0 = j43.a(new a(fe2Var, ae2Var, this, 44));
        this.f0 = new a(fe2Var, ae2Var, this, 40);
        this.g0 = j43.a(new a(fe2Var, ae2Var, this, 46));
        this.h0 = new a(fe2Var, ae2Var, this, 45);
        this.i0 = new a(fe2Var, ae2Var, this, 47);
        this.j0 = new a(fe2Var, ae2Var, this, 48);
        this.k0 = new a(fe2Var, ae2Var, this, 49);
        this.l0 = new a(fe2Var, ae2Var, this, 50);
        this.m0 = new a(fe2Var, ae2Var, this, 51);
        this.n0 = new a(fe2Var, ae2Var, this, 52);
        this.o0 = j43.a(new a(fe2Var, ae2Var, this, 54));
        this.p0 = new a(fe2Var, ae2Var, this, 53);
        this.q0 = j43.a(new a(fe2Var, ae2Var, this, 56));
        this.r0 = new a(fe2Var, ae2Var, this, 55);
        this.s0 = new a(fe2Var, ae2Var, this, 57);
        this.t0 = j43.a(new a(fe2Var, ae2Var, this, 59));
        this.u0 = j43.a(new a(fe2Var, ae2Var, this, 61));
        this.v0 = j43.a(new a(fe2Var, ae2Var, this, 60));
        this.w0 = new a(fe2Var, ae2Var, this, 58);
        this.x0 = new a(fe2Var, ae2Var, this, 62);
        this.y0 = new a(fe2Var, ae2Var, this, 63);
        this.z0 = j43.a(new a(fe2Var, ae2Var, this, 65));
        this.A0 = j43.a(new a(fe2Var, ae2Var, this, 67));
        this.B0 = j43.a(new a(fe2Var, ae2Var, this, 66));
        this.C0 = new a(fe2Var, ae2Var, this, 64);
        this.D0 = new a(fe2Var, ae2Var, this, 68);
        this.E0 = j43.a(new a(fe2Var, ae2Var, this, 70));
        this.F0 = new a(fe2Var, ae2Var, this, 69);
        this.G0 = new a(fe2Var, ae2Var, this, 71);
        this.H0 = j43.a(new a(fe2Var, ae2Var, this, 73));
        this.I0 = new a(fe2Var, ae2Var, this, 72);
        this.J0 = new a(fe2Var, ae2Var, this, 74);
        this.K0 = new a(fe2Var, ae2Var, this, 75);
        this.L0 = j43.a(new a(fe2Var, ae2Var, this, 77));
        this.M0 = j43.a(new a(fe2Var, ae2Var, this, 79));
        this.N0 = j43.a(new a(fe2Var, ae2Var, this, 78));
        this.O0 = new a(fe2Var, ae2Var, this, 76);
        this.P0 = new a(fe2Var, ae2Var, this, 80);
        this.Q0 = new a(fe2Var, ae2Var, this, 81);
        this.R0 = new a(fe2Var, ae2Var, this, 82);
        this.S0 = new a(fe2Var, ae2Var, this, 83);
        this.T0 = new a(fe2Var, ae2Var, this, 84);
        this.U0 = new a(fe2Var, ae2Var, this, 85);
        this.V0 = new a(fe2Var, ae2Var, this, 86);
        this.W0 = new a(fe2Var, ae2Var, this, 87);
    }

    public final SendLeaderboardDetailsActionUseCase A() {
        return new SendLeaderboardDetailsActionUseCase(new LeaderboardDetailsActionsRepositoryImpl(this.m.s.get()));
    }

    public final yj9 B() {
        return new yj9(this.l.q.get());
    }

    public final mz9 C() {
        fe2 fe2Var = this.l;
        return new mz9(fe2Var.M.get(), fe2Var.f0.get(), fe2Var.U.get());
    }

    public final s3b D() {
        return new s3b(this.q.get());
    }

    public final UpdateLikeTopValueUseCase E() {
        return new UpdateLikeTopValueUseCase(q());
    }

    @Override // sw4.b
    public final vs5 a() {
        zg1.b(48, "expectedSize");
        m95.a aVar = new m95.a(48);
        int i = bsc.w;
        aVar.b("r7", this.n);
        int i2 = zb9.v;
        aVar.b("e8", this.r);
        aVar.b("gd", this.A);
        aVar.b("ue", this.C);
        aVar.b("pg", this.G);
        aVar.b("com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel", this.H);
        aVar.b("cx0", this.I);
        aVar.b("w71", this.J);
        aVar.b("com.hwpo_training_app.leaderboards.list.challenge.presentation.ChallengesLeaderboardsViewModel", this.L);
        aVar.b("m91", this.O);
        aVar.b("qn1", this.R);
        aVar.b("com.hwpo_training_app.leaderboards.list.daily.presentation.DailyLeaderboardsViewModel", this.S);
        aVar.b("a43", this.U);
        aVar.b("fj3", this.V);
        aVar.b("gl3", this.W);
        int i3 = f41.v;
        aVar.b("cd4", this.X);
        aVar.b("bd4", this.Y);
        aVar.b("rr4", this.a0);
        aVar.b("e25", this.f0);
        aVar.b("com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowViewModel", this.h0);
        aVar.b("com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel", this.i0);
        aVar.b("com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel", this.j0);
        aVar.b("com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowViewModel", this.k0);
        aVar.b("com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel", this.l0);
        aVar.b("com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel", this.m0);
        aVar.b("com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel", this.n0);
        aVar.b("qg6", this.p0);
        int i4 = d3a.v;
        aVar.b("ip6", this.r0);
        aVar.b("com.hwpo_training_app.notifications.presentation.NotificationsViewModel", this.s0);
        aVar.b("fj7", this.w0);
        aVar.b("rj7", this.x0);
        aVar.b("yj7", this.y0);
        aVar.b("wl7", this.C0);
        aVar.b("vx7", this.D0);
        int i5 = ty1.e;
        aVar.b("ny7", this.F0);
        aVar.b("k48", this.G0);
        int i6 = ml5.A;
        aVar.b("zb8", this.I0);
        int i7 = sm3.v;
        aVar.b("gp8", this.J0);
        aVar.b("jr8", this.K0);
        aVar.b("ct8", this.O0);
        aVar.b("ij9", this.P0);
        aVar.b("qo9", this.Q0);
        aVar.b("tka", this.R0);
        aVar.b("wpa", this.S0);
        aVar.b("nua", this.T0);
        aVar.b("o9b", this.U0);
        int i8 = kz0.v;
        aVar.b("ybb", this.V0);
        aVar.b("tsb", this.W0);
        return new vs5(aVar.a(true));
    }

    @Override // sw4.b
    public final vl8 b() {
        return vl8.z;
    }

    public final r31 g() {
        return new r31(this.l.f0.get());
    }

    public final ChangeTopValueVisibilityUseCase h() {
        return new ChangeTopValueVisibilityUseCase(q());
    }

    public final ww1 i() {
        fe2 fe2Var = this.l;
        return new ww1(fe2Var.m0.get(), fe2Var.l.get(), fe2Var.y.get());
    }

    public final bx2 j() {
        return new bx2(this.q.get());
    }

    public final gx2 k() {
        return new gx2(this.q.get());
    }

    public final FetchLeaderboardTopValuesNextPageUseCase l() {
        return new FetchLeaderboardTopValuesNextPageUseCase(q());
    }

    public final FetchLeaderboardTopValuesUseCase m() {
        return new FetchLeaderboardTopValuesUseCase(q());
    }

    public final xj4 n() {
        fe2 fe2Var = this.l;
        return new xj4(new yw3(fe2Var.c.a, fe2Var.M.get()), fe2Var.M.get());
    }

    public final rk4 o() {
        fe2 fe2Var = this.l;
        return new rk4(fe2Var.f(), new dq0(fe2Var.f()));
    }

    public final uk4 p() {
        return new uk4(this.m.r.get());
    }

    public final LeaderboardDetailsListRepositoryImpl q() {
        ae2 ae2Var = this.m;
        return new LeaderboardDetailsListRepositoryImpl(ae2Var.t.get(), new LeaderboardAdditionalValueRepositoryImpl(ae2Var.u.get(), ae2Var.r.get()), ae2Var.u.get(), ae2Var.v.get(), ae2Var.q.get());
    }

    public final rd6 r() {
        fe2 fe2Var = this.l;
        h13 h13Var = new h13(fe2Var.m0.get());
        ae2 ae2Var = this.m;
        return new rd6(h13Var, ae2Var.r.get(), ae2Var.l.get(), fe2Var.g(), fe2Var.M.get(), fe2Var.o0.get(), fe2Var.m.get(), fe2Var.k0.get());
    }

    public final ze7 s() {
        return new ze7(this.m.r.get());
    }

    public final af7 t() {
        return new af7(this.l.f0.get());
    }

    public final cf7 u() {
        return new cf7(this.F.get());
    }

    public final ObserveTopValuesFlowUseCase v() {
        return new ObserveTopValuesFlowUseCase(q());
    }

    public final mf7 w() {
        return new mf7(this.l.g0.get());
    }

    public final pf7 x() {
        return new pf7(this.z.get());
    }

    public final iq8 y() {
        return new iq8(this.F.get());
    }

    public final tq8 z() {
        return new tq8(this.z.get());
    }
}
