package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment;
import com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ce2 extends hf1 {
    public final fe2 a;
    public final ae2 b;
    public final yd2 c;
    public final mf8<vo0> d;
    public final mf8<kp0> e;
    public final mf8<kx3.b> f;
    public final mf8<ld3> g;
    public final mf8<hu0> h;
    public final mf8<nf9> i;
    public final mf8<mg9> j;
    public final mf8<si9> k;
    public final mf8<d08> l;
    public final mf8<wj9> m;
    public final mf8<tpb> n;
    public final mf8<om2> o;
    public final mf8<eqb> p;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements mf8<T> {
        public final fe2 a;
        public final yd2 b;
        public final ce2 c;
        public final int d;

        /* JADX INFO: renamed from: ce2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0039a implements kx3.b {
            public C0039a() {
            }

            @Override // kx3.b
            public final kx3 a(ba baVar, s66 s66Var) {
                a aVar = a.this;
                Activity activity = aVar.b.a;
                ce2 ce2Var = aVar.c;
                z41 z41Var = new z41(ce2Var.a.l.get());
                fe2 fe2Var = aVar.a;
                ContentResolver contentResolverF = fe2Var.f();
                dq0 dq0Var = new dq0(ce2Var.a.f());
                fe2 fe2Var2 = ce2Var.a;
                return new kx3(s66Var, baVar, activity, z41Var, contentResolverF, dq0Var, new yw3(fe2Var2.c.a, fe2Var2.M.get()), fe2Var.l.get(), fe2Var.U.get());
            }
        }

        public a(fe2 fe2Var, yd2 yd2Var, ce2 ce2Var, int i) {
            this.a = fe2Var;
            this.b = yd2Var;
            this.c = ce2Var;
            this.d = i;
        }

        @Override // defpackage.nf8
        public final T get() {
            fe2 fe2Var = this.a;
            ce2 ce2Var = this.c;
            int i = this.d;
            switch (i) {
                case 0:
                    return (T) new kp0(fe2Var.u.get(), fe2Var.t.get(), new cb(ce2Var.d.get()), new hl4(ce2Var.a.K.get()), ce2Var.q(), fe2Var.P.get(), fe2Var.T.get(), fe2Var.U.get());
                case 1:
                    return (T) new yo0(fe2Var.K.get());
                case 2:
                    return (T) new C0039a();
                case 3:
                    hy8 hy8Var = fe2Var.t.get();
                    fe2 fe2Var2 = ce2Var.a;
                    ae2 ae2Var = ce2Var.b;
                    fe2 fe2Var3 = ce2Var.a;
                    return (T) new ld3(hy8Var, new hl4(fe2Var2.K.get()), new zz8(ae2Var.l.get(), fe2Var3.X.get(), fe2Var3.Y.get(), fe2Var3.Z.get(), new wc8(ae2Var.m.get())), new ee1(ae2Var.l.get(), fe2Var3.X.get(), fe2Var3.Y.get(), fe2Var3.Z.get(), new wc8(ae2Var.m.get())), ce2Var.p(), ce2Var.r(), ce2Var.q(), fe2Var.P.get(), new oz9(fe2Var3.c0.get()), new s31(fe2Var3.c0.get()), new ov8(fe2Var3.c0.get()), new bf7(fe2Var3.c0.get()), fe2Var.L.get(), fe2Var.U.get(), fe2Var.f(), fe2Var.T.get());
                case 4:
                    return (T) new ju0();
                case 5:
                    mf8<nf9> mf8Var = ce2Var.i;
                    fe2 fe2Var4 = ce2Var.a;
                    return (T) new mg9(mf8Var.get(), fe2Var.Y.get(), fe2Var.u.get(), fe2Var.X.get(), fe2Var.Z.get(), new hl4(fe2Var4.K.get()), ce2Var.p(), new af7(fe2Var4.f0.get()), new mz9(fe2Var4.M.get(), fe2Var4.f0.get(), fe2Var4.U.get()), new r31(fe2Var4.f0.get()), ce2Var.r(), new mf7(fe2Var4.g0.get()), new r60(fe2Var4.M.get()), fe2Var.l.get(), ce2Var.q(), fe2Var.P.get(), fe2Var.Q.get(), fe2Var.R.get(), fe2Var.T.get(), fe2Var.U.get());
                case 6:
                    return (T) new of9(new qn6(ce2Var.a.t.get()), fe2Var.t.get());
                case 7:
                    mf8<si9> mf8Var2 = ce2Var.k;
                    ae2 ae2Var2 = ce2Var.b;
                    return (T) new wj9(mf8Var2.get(), fe2Var.u.get(), fe2Var.Z.get(), ce2Var.p(), ce2Var.r(), new al4(ae2Var2.l.get()), new zk4(ae2Var2.l.get()), new yk4(ce2Var.l.get()), new ef7(ce2Var.l.get()), new b09(ce2Var.l.get()), ce2Var.q(), fe2Var.P.get(), fe2Var.V.get(), fe2Var.U.get(), fe2Var.T.get());
                case 8:
                    return (T) new ti9(new qn6(ce2Var.a.t.get()), fe2Var.t.get());
                case 9:
                    return (T) new e08(fe2Var.c.a);
                case 10:
                    mf8<tpb> mf8Var3 = ce2Var.n;
                    ae2 ae2Var3 = ce2Var.b;
                    return (T) new om2(mf8Var3.get(), new wk4(ae2Var3.l.get()), new uc9(ae2Var3.n.get()), fe2Var.V.get(), fe2Var.u.get(), fe2Var.Z.get(), ce2Var.q(), fe2Var.P.get(), fe2Var.U.get());
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    return (T) new upb();
                case 12:
                    mf8<tpb> mf8Var4 = ce2Var.n;
                    ae2 ae2Var4 = ce2Var.b;
                    return (T) new eqb(mf8Var4.get(), new xk4(ae2Var4.l.get()), new f49(ae2Var4.n.get()), new ue7(ce2Var.a.i0.get()), ce2Var.p(), new rl4(ae2Var4.o.get()), fe2Var.j0.get(), fe2Var.T.get(), fe2Var.U.get());
                default:
                    throw new AssertionError(i);
            }
        }
    }

    public ce2(fe2 fe2Var, ae2 ae2Var, yd2 yd2Var) {
        this.a = fe2Var;
        this.b = ae2Var;
        this.c = yd2Var;
        this.d = j43.a(new a(fe2Var, yd2Var, this, 1));
        this.e = j43.a(new a(fe2Var, yd2Var, this, 0));
        a aVar = new a(fe2Var, yd2Var, this, 2);
        tp9 tp9Var = new tp9();
        tp9Var.b = tp9.c;
        tp9Var.a = aVar;
        this.f = tp9Var;
        this.g = j43.a(new a(fe2Var, yd2Var, this, 3));
        this.h = j43.a(new a(fe2Var, yd2Var, this, 4));
        this.i = j43.a(new a(fe2Var, yd2Var, this, 6));
        this.j = j43.a(new a(fe2Var, yd2Var, this, 5));
        this.k = j43.a(new a(fe2Var, yd2Var, this, 8));
        this.l = j43.a(new a(fe2Var, yd2Var, this, 9));
        this.m = j43.a(new a(fe2Var, yd2Var, this, 7));
        this.n = j43.a(new a(fe2Var, yd2Var, this, 11));
        this.o = j43.a(new a(fe2Var, yd2Var, this, 10));
        this.p = j43.a(new a(fe2Var, yd2Var, this, 12));
    }

    @Override // rv2.b
    public final rv2.c a() {
        return this.c.a();
    }

    @Override // defpackage.lb8
    public final void b(db8 db8Var) {
        db8Var.A = this.a.l.get();
    }

    @Override // defpackage.h8a
    public final void c(g8a g8aVar) {
        g8aVar.A = this.a.e0.get();
        g8aVar.B = this.h.get();
    }

    @Override // defpackage.lf9
    public final void d(bf9 bf9Var) {
        bf9Var.A = this.j.get();
    }

    @Override // defpackage.wl2
    public final void e(ql2 ql2Var) {
        ql2Var.A = this.o.get();
    }

    @Override // defpackage.to0
    public final void f(oo0 oo0Var) {
        oo0Var.A = this.e.get();
    }

    @Override // defpackage.rpb
    public final void g(jpb jpbVar) {
        jpbVar.A = this.p.get();
    }

    @Override // defpackage.mm1
    public final void h(am1 am1Var) {
        am1Var.A = this.f.get();
    }

    @Override // com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment_GeneratedInjector
    public final void i(LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment) {
        leaderboardDetailsFiltersFlowFragment.P = this.a.d0.get();
    }

    @Override // defpackage.oi9
    public final void j(hi9 hi9Var) {
        hi9Var.A = this.m.get();
    }

    @Override // defpackage.wi3
    public final void k(fi3 fi3Var) {
        fi3Var.A = this.f.get();
    }

    @Override // defpackage.gc3
    public final void l(rb3 rb3Var) {
        rb3Var.A = this.g.get();
        rb3Var.B = this.f.get();
    }

    @Override // defpackage.pg6
    public final void m(og6 og6Var) {
        og6Var.E = this.h.get();
    }

    @Override // defpackage.xj7
    public final void n(wj7 wj7Var) {
        wj7Var.A = this.a.l.get();
    }

    @Override // com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowFragment_GeneratedInjector
    public final void o(LeaderboardFiltersFlowFragment leaderboardFiltersFlowFragment) {
        leaderboardFiltersFlowFragment.P = this.a.d0.get();
    }

    public final fp1 p() {
        return new fp1(this.b.l.get(), this.a.Z.get());
    }

    public final n89 q() {
        fe2 fe2Var = this.a;
        return new n89(fe2Var.L.get(), fe2Var.Q.get(), fe2Var.R.get());
    }

    public final t1b r() {
        return new t1b(this.b.l.get(), this.a.Z.get());
    }
}
