package defpackage;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPerformanceModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreResultModel;
import com.hwpo_training_app.leaderboards.common.presentation.entity.LeaderboardScoreResultUiEntityMapperKt;
import com.hwpo_training_app.leaderboards.valuedetails.domain.GetLeaderboardValueDetailsUseCase;
import com.hwpo_training_app.leaderboards.valuedetails.domain.entity.LeaderboardValueDetailsModel;
import com.hwpo_training_app.notifications.domain.ObserveSocketReadNotificationsFlowUseCase;
import com.hwpo_training_app.notifications.domain.entity.LeaderboardScoreModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e25 extends dl0<s25, b> implements as2 {
    public static final /* synthetic */ int T = 0;
    public final a46 A;
    public final om1 B;
    public final h35 C;
    public final ol4 D;
    public final zf8 E;
    public final ww1 F;
    public final h13 G;
    public final wd1 H;
    public final y3b I;
    public final uk4 J;
    public final GetLeaderboardValueDetailsUseCase K;
    public final lf7 L;
    public final hk9 M;
    public final jh9 N;
    public final bu8 O;
    public final cm3 P;
    public vn2 Q;
    public xz7 R;
    public final yq6 S;
    public final c87 x;
    public final li7 y;
    public final o52 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            e25 e25Var = (e25) this.receiver;
            int i = e25.T;
            e25Var.getClass();
            oy0.d(rhb.b(e25Var), null, null, new q25(e25Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -934482253;
            }

            public final String toString() {
                return "LoadingFinished";
            }
        }

        /* JADX INFO: renamed from: e25$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0075b extends b {
            public static final C0075b a = new C0075b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0075b);
            }

            public final int hashCode() {
                return 34063904;
            }

            public final String toString() {
                return "LoadingStarted";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e25(q09 q09Var, c87 c87Var, li7 li7Var, o52 o52Var, a46 a46Var, om1 om1Var, h35 h35Var, dm9 dm9Var, ol4 ol4Var, zf8 zf8Var, ww1 ww1Var, h13 h13Var, wd1 wd1Var, y3b y3bVar, uk4 uk4Var, GetLeaderboardValueDetailsUseCase getLeaderboardValueDetailsUseCase, ObserveSocketReadNotificationsFlowUseCase observeSocketReadNotificationsFlowUseCase, lf7 lf7Var, hk9 hk9Var, jh9 jh9Var, bu8 bu8Var, cm3 cm3Var) {
        super(new s25(false));
        q09Var.getClass();
        c87Var.getClass();
        li7Var.getClass();
        o52Var.getClass();
        a46Var.getClass();
        om1Var.getClass();
        h35Var.getClass();
        dm9Var.getClass();
        ol4Var.getClass();
        zf8Var.getClass();
        ww1Var.getClass();
        h13Var.getClass();
        wd1Var.getClass();
        y3bVar.getClass();
        uk4Var.getClass();
        getLeaderboardValueDetailsUseCase.getClass();
        observeSocketReadNotificationsFlowUseCase.getClass();
        lf7Var.getClass();
        hk9Var.getClass();
        jh9Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        s25.Companion.getClass();
        this.x = c87Var;
        this.y = li7Var;
        this.z = o52Var;
        this.A = a46Var;
        this.B = om1Var;
        this.C = h35Var;
        this.D = ol4Var;
        this.E = zf8Var;
        this.F = ww1Var;
        this.G = h13Var;
        this.H = wd1Var;
        this.I = y3bVar;
        this.J = uk4Var;
        this.K = getLeaderboardValueDetailsUseCase;
        this.L = lf7Var;
        this.M = hk9Var;
        this.N = jh9Var;
        this.O = bu8Var;
        this.P = cm3Var;
        this.R = xz7.t;
        jh9Var.a(new a(0, this, e25.class, "onSessionExpired", "onSessionExpired()V", 0));
        yk2.o(new k74(dm9Var.b, new n25(this, null)), rhb.b(this));
        oy0.d(rhb.b(this), null, null, new p25(this, null), 3);
        yk2.o(yk2.r(observeSocketReadNotificationsFlowUseCase.b(g2b.a), new o25(2, null)), rhb.b(this));
        this.S = oh7.a(this.u, new hc3(1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(final e25 e25Var, final LeaderboardScoreModel leaderboardScoreModel, final boolean z, u02 u02Var) throws Throwable {
        k25 k25Var;
        final Integer num;
        Object objB;
        e25Var.getClass();
        if (u02Var instanceof k25) {
            k25Var = (k25) u02Var;
            int i = k25Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                k25Var.y = i - Integer.MIN_VALUE;
            } else {
                k25Var = new k25(e25Var, u02Var);
            }
        } else {
            k25Var = new k25(e25Var, u02Var);
        }
        Object obj = k25Var.w;
        int i2 = k25Var.y;
        if (i2 == 0) {
            dv8.b(obj);
            num = leaderboardScoreModel.b;
            if (num != null) {
                e25Var.e(b.C0075b.a);
                GetLeaderboardValueDetailsUseCase getLeaderboardValueDetailsUseCase = e25Var.K;
                k25Var.t = leaderboardScoreModel;
                k25Var.u = num;
                k25Var.v = z;
                k25Var.y = 1;
                getLeaderboardValueDetailsUseCase.getClass();
                objB = g5b.b(getLeaderboardValueDetailsUseCase, num, k25Var);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                sn2.a aVar = new sn2.a(leaderboardScoreModel.c);
                vn2 vn2Var = e25Var.Q;
                if (vn2Var == null) {
                    xj5.e("deepLinkNavigator");
                    throw null;
                }
                vn2Var.a(aVar, z);
            }
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = k25Var.v;
        Integer num2 = k25Var.u;
        LeaderboardScoreModel leaderboardScoreModel2 = k25Var.t;
        dv8.b(obj);
        num = num2;
        leaderboardScoreModel = leaderboardScoreModel2;
        objB = obj;
        xd3 xd3Var = (xd3) objB;
        oh4 oh4Var = new oh4() { // from class: d25
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                LeaderboardValueDetailsModel leaderboardValueDetailsModel = (LeaderboardValueDetailsModel) obj2;
                int i3 = e25.T;
                leaderboardValueDetailsModel.getClass();
                int i4 = leaderboardScoreModel.c;
                int iIntValue = num.intValue();
                LeaderboardScoreResultModel leaderboardScoreResultModel = leaderboardValueDetailsModel.p;
                e25 e25Var2 = e25Var;
                String strB = LeaderboardScoreResultUiEntityMapperKt.b(leaderboardScoreResultModel, e25Var2.O);
                LeaderboardPerformanceModel leaderboardPerformanceModel = leaderboardValueDetailsModel.r;
                sn2.b bVar = new sn2.b(i4, iIntValue, leaderboardValueDetailsModel.d, strB, leaderboardPerformanceModel != null ? leaderboardPerformanceModel.b : null);
                e25Var2.e(e25.b.a.a);
                vn2 vn2Var2 = e25Var2.Q;
                if (vn2Var2 != null) {
                    vn2Var2.a(bVar, z);
                    return g2b.a;
                }
                xj5.e("deepLinkNavigator");
                throw null;
            }
        };
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            exc.getClass();
            e25Var.e(b.a.a);
            e25Var.f(new b25(e25Var.P.a(exc)));
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            oh4Var.invoke(((xd3.b) xd3Var).a);
        }
        return g2b.a;
    }

    public static void i(e25 e25Var, boolean z, String str, ki7 ki7Var, id7 id7Var, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? false : z;
        String str2 = (i & 2) != 0 ? null : str;
        ki7 ki7Var2 = (i & 4) != 0 ? null : ki7Var;
        id7 id7Var2 = (i & 8) != 0 ? null : id7Var;
        boolean z4 = (i & 16) != 0 ? false : z2;
        e25Var.getClass();
        oy0.d(rhb.b(e25Var), null, null, new m25(e25Var, z3, str2, ki7Var2, id7Var2, z4, null), 3);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var.equals(b.C0075b.a)) {
            b();
            return new s25(true);
        }
        if (!bl0Var.equals(b.a.a)) {
            return b();
        }
        b();
        return new s25(false);
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        super.onCleared();
        this.N.a(null);
    }

    @Override // defpackage.as2
    public final void onStart(m76 m76Var) {
        m76Var.getClass();
        oy0.d(rhb.b(this), null, null, new f25(this, null), 3);
    }

    @Override // defpackage.as2
    public final void onStop(m76 m76Var) {
        oy0.d(rhb.b(this), null, null, new g25(this, null), 3);
    }
}
