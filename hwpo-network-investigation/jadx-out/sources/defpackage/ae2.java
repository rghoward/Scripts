package defpackage;

import com.hwpo_training_app.leaderboards.details.common.data.LeaderboardDetailsActionsStorageImpl;
import com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsStorage;
import com.hwpo_training_app.leaderboards.details.header.data.api.LeaderboardDetailsHeaderApi;
import com.hwpo_training_app.leaderboards.details.list.data.api.LeaderboardDetailsListApi;
import com.hwpo_training_app.leaderboards.details.list.data.storage.LeaderboardDetailsListStorageImpl;
import com.hwpo_training_app.leaderboards.details.list.di.ApiModule;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage;
import com.hwpo_training_app.leaderboards.filter.details.data.LeaderboardDetailsFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.details.data.LeaderboardDetailsFiltersStorageImpl;
import com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.list.data.LeaderboardFiltersStorageImpl;
import com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersStorage;
import com.hwpo_training_app.leaderboards.list.common.data.LeaderboardsRepositoryImpl;
import com.hwpo_training_app.leaderboards.list.common.data.network.api.LeaderboardsListApi;
import com.hwpo_training_app.leaderboards.list.common.data.storage.LeaderboardsStorageImpl;
import com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.api.LeaderboardValueDetailsApi;
import com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl;
import com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl;
import com.hwpo_training_app.notifications.data.NotificationsStorageImpl;
import com.hwpo_training_app.notifications.data.network.api.NotificationsApi;
import com.hwpo_training_app.notifications.domain.NotificationsRepository;
import com.hwpo_training_app.notifications.domain.NotificationsSocketService;
import com.hwpo_training_app.notifications.domain.NotificationsStorage;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ae2 extends gf1 {
    public final mf8<wk1> A;
    public final mf8<dm9> B;
    public final mf8<LeaderboardValueDetailsApi> C;
    public final mf8<NotificationsApi> D;
    public final mf8<NotificationsStorage> E;
    public final mf8<NotificationsSocketService> F;
    public final mf8<NotificationsRepository> G;
    public final mf8<LeaderboardDetailsHeaderApi> H;
    public final cy a;
    public final ApiModule b;
    public final com.hwpo_training_app.leaderboards.list.common.di.ApiModule c;
    public final e9 d;
    public final yx e;
    public final com.hwpo_training_app.leaderboards.valuedetails.di.ApiModule f;
    public final com.hwpo_training_app.notifications.di.ApiModule g;
    public final com.hwpo_training_app.leaderboards.details.header.di.ApiModule h;
    public final fe2 i;
    public final ae2 j = this;
    public final mf8<na> k;
    public final mf8<kd8> l;
    public final mf8<xc8> m;
    public final mf8<g49> n;
    public final mf8<yob> o;
    public final mf8<ga0> p;
    public final mf8<pc2> q;
    public final mf8<w5b> r;
    public final mf8<LeaderboardDetailsActionsStorage> s;
    public final mf8<LeaderboardDetailsListApi> t;
    public final mf8<LeaderboardDetailsListStorage> u;
    public final mf8<LeaderboardDetailsFiltersStorage> v;
    public final mf8<LeaderboardsListApi> w;
    public final mf8<LeaderboardsStorage> x;
    public final mf8<LeaderboardFiltersStorage> y;
    public final mf8<t72> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements mf8<T> {
        public final fe2 a;
        public final ae2 b;
        public final int c;

        public a(fe2 fe2Var, ae2 ae2Var, int i) {
            this.a = fe2Var;
            this.b = ae2Var;
            this.c = i;
        }

        @Override // defpackage.nf8
        public final T get() {
            ae2 ae2Var = this.b;
            fe2 fe2Var = this.a;
            int i = this.c;
            switch (i) {
                case 0:
                    return (T) new kv8();
                case 1:
                    return (T) new sd8(fe2Var.K.get(), fe2Var.V.get(), fe2Var.W.get());
                case 2:
                    return (T) new yc8();
                case 3:
                    return (T) new h49(fe2Var.h0.get());
                case 4:
                    return (T) new zob();
                case 5:
                    return (T) new d6b(ae2Var.p.get(), (e6b) pk.c(ae2Var.i.J.get(), e6b.class), fe2Var.p.get(), fe2Var.l.get(), fe2Var.k0.get(), fe2Var.y.get(), ae2Var.q.get());
                case 6:
                    cy cyVar = ae2Var.a;
                    return (T) ((ga0) pk.c(fe2Var.J.get(), ga0.class));
                case 7:
                    return (T) new rc2(ae2Var.p.get(), fe2Var.y.get());
                case 8:
                    return (T) new LeaderboardDetailsActionsStorageImpl();
                case 9:
                    ApiModule apiModule = ae2Var.b;
                    return (T) ((LeaderboardDetailsListApi) pk.c(fe2Var.J.get(), LeaderboardDetailsListApi.class));
                case 10:
                    return (T) new LeaderboardDetailsListStorageImpl();
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    return (T) new LeaderboardDetailsFiltersStorageImpl();
                case 12:
                    com.hwpo_training_app.leaderboards.list.common.di.ApiModule apiModule2 = ae2Var.c;
                    return (T) ((LeaderboardsListApi) pk.c(fe2Var.J.get(), LeaderboardsListApi.class));
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    return (T) new LeaderboardsStorageImpl();
                case 14:
                    return (T) new LeaderboardFiltersStorageImpl();
                case h4c.e /* 15 */:
                    e9 e9Var = ae2Var.d;
                    k5a k5aVarB = od3.b();
                    et2 et2Var = i23.a;
                    return (T) u72.a(h72.a.C0100a.c(k5aVarB, wr2.v));
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    yx yxVar = ae2Var.e;
                    return (T) ((wk1) pk.c(fe2Var.J.get(), wk1.class));
                case 17:
                    return (T) new dm9();
                case 18:
                    com.hwpo_training_app.leaderboards.valuedetails.di.ApiModule apiModule3 = ae2Var.f;
                    return (T) ((LeaderboardValueDetailsApi) pk.c(fe2Var.J.get(), LeaderboardValueDetailsApi.class));
                case 19:
                    return (T) new NotificationsRepositoryImpl(ae2Var.D.get(), ae2Var.E.get(), ae2Var.F.get());
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    com.hwpo_training_app.notifications.di.ApiModule apiModule4 = ae2Var.g;
                    return (T) ((NotificationsApi) pk.c(fe2Var.J.get(), NotificationsApi.class));
                case 21:
                    return (T) new NotificationsStorageImpl();
                case 22:
                    return (T) new NotificationsSocketServiceImpl(fe2Var.m0.get(), fe2Var.H.get());
                case 23:
                    com.hwpo_training_app.leaderboards.details.header.di.ApiModule apiModule5 = ae2Var.h;
                    return (T) ((LeaderboardDetailsHeaderApi) pk.c(fe2Var.J.get(), LeaderboardDetailsHeaderApi.class));
                default:
                    throw new AssertionError(i);
            }
        }
    }

    public ae2(fe2 fe2Var, e9 e9Var, yx yxVar, com.hwpo_training_app.leaderboards.details.header.di.ApiModule apiModule, ApiModule apiModule2, com.hwpo_training_app.leaderboards.list.common.di.ApiModule apiModule3, com.hwpo_training_app.leaderboards.valuedetails.di.ApiModule apiModule4, com.hwpo_training_app.notifications.di.ApiModule apiModule5, cy cyVar, h40 h40Var) {
        this.i = fe2Var;
        this.a = cyVar;
        this.b = apiModule2;
        this.c = apiModule3;
        this.d = e9Var;
        this.e = yxVar;
        this.f = apiModule4;
        this.g = apiModule5;
        this.h = apiModule;
        this.k = j43.a(new a(fe2Var, this, 0));
        this.l = j43.a(new a(fe2Var, this, 1));
        this.m = j43.a(new a(fe2Var, this, 2));
        this.n = j43.a(new a(fe2Var, this, 3));
        this.o = j43.a(new a(fe2Var, this, 4));
        this.p = j43.a(new a(fe2Var, this, 6));
        this.q = j43.a(new a(fe2Var, this, 7));
        this.r = j43.a(new a(fe2Var, this, 5));
        this.s = j43.a(new a(fe2Var, this, 8));
        this.t = j43.a(new a(fe2Var, this, 9));
        this.u = j43.a(new a(fe2Var, this, 10));
        this.v = j43.a(new a(fe2Var, this, 11));
        this.w = j43.a(new a(fe2Var, this, 12));
        this.x = j43.a(new a(fe2Var, this, 13));
        this.y = j43.a(new a(fe2Var, this, 14));
        this.z = j43.a(new a(fe2Var, this, 15));
        this.A = j43.a(new a(fe2Var, this, 16));
        this.B = j43.a(new a(fe2Var, this, 17));
        this.C = j43.a(new a(fe2Var, this, 18));
        this.D = j43.a(new a(fe2Var, this, 20));
        this.E = j43.a(new a(fe2Var, this, 21));
        this.F = j43.a(new a(fe2Var, this, 22));
        this.G = j43.a(new a(fe2Var, this, 19));
        this.H = j43.a(new a(fe2Var, this, 23));
    }

    @Override // ma.c
    public final na a() {
        return this.k.get();
    }

    @Override // d9.a
    public final xd2 b() {
        return new xd2(this.i, this.j);
    }

    public final LeaderboardDetailsFiltersRepositoryImpl c() {
        return new LeaderboardDetailsFiltersRepositoryImpl(this.v.get());
    }

    public final LeaderboardsRepositoryImpl d() {
        return new LeaderboardsRepositoryImpl(this.w.get(), this.x.get(), this.y.get(), this.q.get());
    }
}
