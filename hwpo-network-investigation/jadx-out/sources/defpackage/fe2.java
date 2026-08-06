package defpackage;

import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import com.hwpo_training_app.client.ClientApplication;
import com.hwpo_training_app.leaderboards.filter.di.FlitersFlowNavigationModule;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe2 extends if1 {
    public final a O;
    public final mf8<p43> P;
    public final mf8<uc8> Q;
    public final mf8<ad8> R;
    public final mf8<yl3> S;
    public final mf8<cm3> T;
    public final mf8<bu8> U;
    public final mf8<td8> V;
    public final mf8<u11> W;
    public final mf8<dh9> X;
    public final mf8<ih9> Y;
    public final mf8<de9> Z;
    public final ly0 a;
    public final mf8<a70> a0;
    public final u00 b;
    public final mf8<py3> b0;
    public final j20 c;
    public final mf8<oy3> c0;
    public final an4 d;
    public final mf8<q87> d0;
    public final zx e;
    public final mf8<ic6> e0;
    public final x97 f;
    public final mf8<qw3> f0;
    public final mg7 g;
    public final mf8<tsa> g0;
    public final vw3 h;
    public final mf8<i49> h0;
    public final FlitersFlowNavigationModule i;
    public final mf8<f21> i0;
    public final vv9 j;
    public final mf8<i7a> j0;
    public final mf8<lw7> k0;
    public final mf8<lg7> l0;
    public final mf8<tv9> m0;
    public final mf8<du3> n0;
    public final mf8<zt3> o0;
    public final mf8<hy8> p0;
    public final mf8<rr3> q0;
    public final mf8<kd7> r0;
    public final mf8<jh9> s0;
    public final mf8<wr8> t0;
    public final fe2 k = this;
    public final mf8<k55> l = tk.a(this, 0);
    public final mf8<xg5> m = tk.a(this, 1);
    public final mf8<u10> n = j43.a(new a(this, 3));
    public final mf8<AccountManager> o = tk.a(this, 6);
    public final mf8<e6> p = j43.a(new a(this, 5));
    public final mf8<q5b> q = j43.a(new a(this, 4));
    public final mf8<zz1> r = tk.a(this, 2);
    public final mf8<q87> s = tk.a(this, 7);
    public final mf8<hy8> t = tk.a(this, 8);
    public final mf8<pf9> u = tk.a(this, 9);
    public final mf8<v45> v = tk.a(this, 14);
    public final mf8<vg5> w = tk.a(this, 15);
    public final mf8<ah9> x = tk.a(this, 18);
    public final mf8<wg9> y = tk.a(this, 17);
    public final mf8<vg5> z = tk.a(this, 16);
    public final mf8<vg5> A = tk.a(this, 19);
    public final mf8<vg5> B = tk.a(this, 20);
    public final mf8<vg5> C = tk.a(this, 21);
    public final mf8<pg9> D = tk.a(this, 22);
    public final mf8<vg5> E = tk.a(this, 23);
    public final mf8<lg7.a> F = tk.a(this, 13);
    public final mf8<lg7> G = tk.a(this, 12);
    public final mf8<sl5> H = tk.a(this, 25);
    public final mf8<g52.a> I = tk.a(this, 24);
    public final mf8<mv8> J = tk.a(this, 11);
    public final mf8<s49> K = tk.a(this, 10);
    public final mf8<e70> L = tk.a(this, 26);
    public final mf8<xy3> M = tk.a(this, 29);
    public final mf8<lg7> N = tk.a(this, 30);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements mf8<T> {
        public final fe2 a;
        public final int b;

        public a(fe2 fe2Var, int i) {
            this.a = fe2Var;
            this.b = i;
        }

        /* JADX WARN: Type inference failed for: r12v58, types: [T, v45] */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, lg7$a] */
        @Override // defpackage.nf8
        public final T get() {
            int i = this.b;
            switch (i) {
                case 0:
                    ly0 ly0Var = this.a.a;
                    return (T) new k55();
                case 1:
                    fe2 fe2Var = this.a;
                    u00 u00Var = fe2Var.b;
                    Context context = fe2Var.c.a;
                    k55 k55Var = fe2Var.l.get();
                    k55Var.getClass();
                    return (T) new vi5(context, k55Var);
                case 2:
                    return (T) new zz1(this.a.n.get(), this.a.q.get());
                case 3:
                    return (T) new v10();
                case 4:
                    return (T) new r5b(this.a.p.get());
                case 5:
                    return (T) new f6(this.a.o.get(), this.a.c.a);
                case 6:
                    fe2 fe2Var2 = this.a;
                    u00 u00Var2 = fe2Var2.b;
                    T t = (T) AccountManager.get(fe2Var2.c.a);
                    t.getClass();
                    return t;
                case 7:
                    T t2 = (T) this.a.d.a.a.a;
                    gm7.a(t2);
                    return t2;
                case 8:
                    T t3 = (T) this.a.d.a.a;
                    gm7.a(t3);
                    return t3;
                case 9:
                    return (T) new pf9();
                case 10:
                    fe2 fe2Var3 = this.a;
                    zx zxVar = fe2Var3.e;
                    return (T) ((s49) pk.c(fe2Var3.J.get(), s49.class));
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    fe2 fe2Var4 = this.a;
                    x97 x97Var = fe2Var4.f;
                    lg7 lg7Var = fe2Var4.G.get();
                    g52.a aVar = this.a.I.get();
                    k55 k55Var2 = this.a.l.get();
                    lg7Var.getClass();
                    aVar.getClass();
                    k55Var2.getClass();
                    mv8.b bVar = new mv8.b();
                    bVar.a = lg7Var;
                    bVar.c.add(aVar);
                    bVar.a("https://app.hwpo-training.com/mobile/api/v4/");
                    return (T) bVar.b();
                case 12:
                    fe2 fe2Var5 = this.a;
                    mg7 mg7Var = fe2Var5.g;
                    lg7.a aVar2 = fe2Var5.F.get();
                    aVar2.getClass();
                    return (T) new lg7(aVar2);
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    x97 x97Var2 = this.a.f;
                    g23 g23Var = new g23();
                    v45 v45Var = this.a.v.get();
                    vg5 vg5Var = this.a.w.get();
                    vg5 vg5Var2 = this.a.z.get();
                    vg5 vg5Var3 = this.a.A.get();
                    vg5 vg5Var4 = this.a.B.get();
                    vg5 vg5Var5 = this.a.C.get();
                    pg9 pg9Var = this.a.D.get();
                    vg5 vg5Var6 = this.a.E.get();
                    v45Var.getClass();
                    vg5Var.getClass();
                    vg5Var2.getClass();
                    vg5Var3.getClass();
                    vg5Var4.getClass();
                    vg5Var5.getClass();
                    pg9Var.getClass();
                    vg5Var6.getClass();
                    ?? r8 = (T) new lg7.a();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    r8.a(10L, timeUnit);
                    r8.z = ytb.b(30L, timeUnit);
                    r8.A = ytb.b(60L, timeUnit);
                    r8.a = g23Var;
                    ArrayList arrayList = r8.c;
                    arrayList.add(vg5Var);
                    arrayList.add(vg5Var4);
                    arrayList.add(vg5Var3);
                    arrayList.add(vg5Var2);
                    arrayList.add(v45Var);
                    arrayList.add(pg9Var);
                    arrayList.add(vg5Var6);
                    arrayList.add(vg5Var5);
                    return r8;
                case 14:
                    fe2 fe2Var6 = this.a;
                    x97 x97Var3 = fe2Var6.f;
                    fe2Var6.l.get().getClass();
                    ?? r12 = (T) new v45(0);
                    r12.d = v45.a.t;
                    return r12;
                case h4c.e /* 15 */:
                    x97 x97Var4 = this.a.f;
                    return (T) new w97();
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    fe2 fe2Var7 = this.a;
                    x97 x97Var5 = fe2Var7.f;
                    final wg9 wg9Var = fe2Var7.y.get();
                    wg9Var.getClass();
                    return (T) new vg5() { // from class: v97
                        @Override // defpackage.vg5
                        public final qu8 intercept(vg5.a aVar3) {
                            aj8 aj8Var = (aj8) aVar3;
                            jp8.a aVarB = aj8Var.e.b();
                            String strD = wg9Var.d();
                            if (strD != null) {
                                aVarB.b(HttpConstants.Headers.AUTHORIZATION, "Bearer ".concat(strD));
                            }
                            return aj8Var.a(new jp8(aVarB));
                        }
                    };
                case 17:
                    fe2 fe2Var8 = this.a;
                    u00 u00Var3 = fe2Var8.b;
                    ah9 ah9Var = fe2Var8.x.get();
                    e6 e6Var = this.a.p.get();
                    ah9Var.getClass();
                    e6Var.getClass();
                    return (T) new xg9(ah9Var, e6Var);
                case 18:
                    u00 u00Var4 = this.a.b;
                    return (T) new ah9();
                case 19:
                    x97 x97Var6 = this.a.f;
                    return (T) new cf3();
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    fe2 fe2Var9 = this.a;
                    x97 x97Var7 = fe2Var9.f;
                    return (T) new j5b(fe2Var9.c.a);
                case 21:
                    fe2 fe2Var10 = this.a;
                    x97 x97Var8 = fe2Var10.f;
                    u10 u10Var = fe2Var10.n.get();
                    u10Var.getClass();
                    return (T) new p5b(u10Var);
                case 22:
                    x97 x97Var9 = this.a.f;
                    return (T) new pg9(new g23());
                case 23:
                    x97 x97Var10 = this.a.f;
                    return (T) new uc1();
                case 24:
                    fe2 fe2Var11 = this.a;
                    x97 x97Var11 = fe2Var11.f;
                    sl5 sl5Var = fe2Var11.H.get();
                    sl5Var.getClass();
                    ol8 ol8Var = wq6.e;
                    return (T) new ys3(wq6.a.a(HttpConstants.ContentTypes.JSON), new vd9.a(sl5Var));
                case 25:
                    u00 u00Var5 = this.a.b;
                    return (T) tm5.a(new t00(0));
                case 26:
                    return (T) new e70();
                case 27:
                    return (T) new uc8(this.a.L.get(), this.a.P.get());
                case 28:
                    return (T) new rw3(this.a.M.get(), this.a.N.get());
                case 29:
                    fe2 fe2Var12 = this.a;
                    u00 u00Var6 = fe2Var12.b;
                    Context context2 = fe2Var12.c.a;
                    k55 k55Var3 = fe2Var12.l.get();
                    k55Var3.getClass();
                    return (T) new xy3(context2, k55Var3);
                case 30:
                    vw3 vw3Var = this.a.h;
                    g23 g23Var2 = new g23();
                    vg5 vg5Var7 = this.a.z.get();
                    vg5Var7.getClass();
                    lg7.a aVar3 = new lg7.a();
                    TimeUnit timeUnit2 = TimeUnit.MINUTES;
                    aVar3.a(1L, timeUnit2);
                    aVar3.z = ytb.b(1L, timeUnit2);
                    aVar3.a = g23Var2;
                    aVar3.c.add(vg5Var7);
                    return (T) new lg7(aVar3);
                case 31:
                    return (T) new ad8();
                case 32:
                    fe2 fe2Var13 = this.a;
                    u00 u00Var7 = fe2Var13.b;
                    Context context3 = fe2Var13.c.a;
                    yl3 yl3Var = fe2Var13.S.get();
                    sl5 sl5Var2 = this.a.H.get();
                    yl3Var.getClass();
                    sl5Var2.getClass();
                    return (T) new wq2(context3, yl3Var, sl5Var2);
                case 33:
                    u00 u00Var8 = this.a.b;
                    return (T) new yl3();
                case 34:
                    fe2 fe2Var14 = this.a;
                    u00 u00Var9 = fe2Var14.b;
                    return (T) new xq(fe2Var14.c.a);
                case 35:
                    return (T) new td8();
                case 36:
                    return (T) new v11();
                case 37:
                    return (T) new dh9();
                case 38:
                    return (T) new ih9();
                case 39:
                    return (T) new de9();
                case 40:
                    return (T) new oy3(this.a.a0.get(), this.a.b0.get(), this.a.f());
                case 41:
                    fe2 fe2Var15 = this.a;
                    zx zxVar2 = fe2Var15.e;
                    return (T) ((a70) pk.c(fe2Var15.J.get(), a70.class));
                case 42:
                    return (T) new py3();
                case 43:
                    T t4 = (T) this.a.i.a.a.a;
                    gm7.a(t4);
                    return t4;
                case Carousel.ENTITY_TYPE /* 44 */:
                    return (T) new ic6();
                case 45:
                    return (T) new usa(this.a.Z.get());
                case 46:
                    return (T) new j49();
                case 47:
                    return (T) new f21(this.a.W.get());
                case 48:
                    return (T) new i7a();
                case 49:
                    fe2 fe2Var16 = this.a;
                    u00 u00Var10 = fe2Var16.b;
                    bu8 bu8Var = fe2Var16.U.get();
                    Context context4 = this.a.c.a;
                    bu8Var.getClass();
                    return (T) new pw7(bu8Var, yz1.b.a(context4, yz1.a[0]));
                case 50:
                    fe2 fe2Var17 = this.a;
                    vv9 vv9Var = fe2Var17.j;
                    lg7 lg7Var2 = fe2Var17.l0.get();
                    lg7Var2.getClass();
                    return (T) new tv9(lg7Var2);
                case 51:
                    vv9 vv9Var2 = this.a.j;
                    g23 g23Var3 = new g23();
                    v45 v45Var2 = this.a.v.get();
                    vg5 vg5Var8 = this.a.B.get();
                    vg5 vg5Var9 = this.a.C.get();
                    v45Var2.getClass();
                    vg5Var8.getClass();
                    vg5Var9.getClass();
                    lg7.a aVar4 = new lg7.a();
                    aVar4.a = g23Var3;
                    ArrayList arrayList2 = aVar4.c;
                    arrayList2.add(v45Var2);
                    arrayList2.add(vg5Var8);
                    arrayList2.add(vg5Var9);
                    return (T) new lg7(aVar4);
                case 52:
                    return (T) new cu3(this.a.n0.get());
                case 53:
                    return (T) new eu3();
                case 54:
                    T t5 = (T) this.a.i.a.a;
                    gm7.a(t5);
                    return t5;
                case 55:
                    T t6 = (T) ((rr3) this.a.d.a.a);
                    gm7.a(t6);
                    return t6;
                case 56:
                    return (T) new kd7(this.a.m0.get());
                case 57:
                    fe2 fe2Var18 = this.a;
                    x97 x97Var12 = fe2Var18.f;
                    T t7 = (T) ((pg9) fe2Var18.D.get());
                    t7.getClass();
                    return t7;
                case 58:
                    return (T) new xr8();
                default:
                    throw new AssertionError(i);
            }
        }
    }

    public fe2(zx zxVar, u00 u00Var, j20 j20Var, ly0 ly0Var, vw3 vw3Var, FlitersFlowNavigationModule flitersFlowNavigationModule, an4 an4Var, x97 x97Var, mq5 mq5Var, mg7 mg7Var, vv9 vv9Var) {
        this.a = ly0Var;
        this.b = u00Var;
        this.c = j20Var;
        this.d = an4Var;
        this.e = zxVar;
        this.f = x97Var;
        this.g = mg7Var;
        this.h = vw3Var;
        this.i = flitersFlowNavigationModule;
        this.j = vv9Var;
        a aVar = new a(this, 28);
        this.O = aVar;
        this.P = j43.a(aVar);
        this.Q = tk.a(this, 27);
        this.R = tk.a(this, 31);
        this.S = tk.a(this, 33);
        this.T = tk.a(this, 32);
        this.U = tk.a(this, 34);
        this.V = tk.a(this, 35);
        this.W = j43.a(new a(this, 36));
        this.X = tk.a(this, 37);
        this.Y = tk.a(this, 38);
        this.Z = tk.a(this, 39);
        this.a0 = tk.a(this, 41);
        this.b0 = tk.a(this, 42);
        this.c0 = tk.a(this, 40);
        this.d0 = tk.a(this, 43);
        this.e0 = tk.a(this, 44);
        this.f0 = j43.a(this.O);
        this.g0 = j43.a(new a(this, 45));
        this.h0 = j43.a(new a(this, 46));
        this.i0 = tk.a(this, 47);
        this.j0 = tk.a(this, 48);
        this.k0 = tk.a(this, 49);
        this.l0 = tk.a(this, 51);
        this.m0 = tk.a(this, 50);
        this.n0 = j43.a(new a(this, 53));
        this.o0 = j43.a(new a(this, 52));
        this.p0 = tk.a(this, 54);
        this.q0 = tk.a(this, 55);
        this.r0 = tk.a(this, 56);
        this.s0 = tk.a(this, 57);
        this.t0 = j43.a(new a(this, 58));
    }

    @Override // zd9.a
    public final de2 a() {
        return new de2(this.k);
    }

    @Override // defpackage.a02
    public final zz1 b() {
        return this.r.get();
    }

    @Override // defpackage.ef1
    public final void c(ClientApplication clientApplication) {
        clientApplication.v = this.l.get();
        clientApplication.w = this.m.get();
    }

    @Override // te4.a
    public final wl8 d() {
        int i = q95.v;
        return wl8.C;
    }

    @Override // ma.a
    public final zd2 e() {
        return new zd2(this.k);
    }

    public final ContentResolver f() {
        ContentResolver contentResolver = this.c.a.getContentResolver();
        contentResolver.getClass();
        return contentResolver;
    }

    public final qs2 g() {
        return new qs2(this.c.a);
    }
}
