package defpackage;

import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zo extends n56 {
    public el5 b;
    public x56 c;
    public am9 d;

    @Override // defpackage.y18
    public final void a() {
        n56.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = aVar.B(new yo(null, this, aVar, null));
    }

    @Override // defpackage.y18
    public final void c(kha khaVar, ag7 ag7Var, ria riaVar, zda zdaVar, sk8 sk8Var, sk8 sk8Var2) {
        x56 x56Var = this.c;
        if (x56Var != null) {
            l56 l56Var = x56Var.m;
            synchronized (l56Var.c) {
                try {
                    l56Var.j = khaVar;
                    l56Var.l = ag7Var;
                    l56Var.k = riaVar;
                    l56Var.m = sk8Var;
                    l56Var.n = sk8Var2;
                    if (l56Var.e || l56Var.d) {
                        l56Var.a();
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.y18
    public final void d() throws Throwable {
        el5 el5Var = this.b;
        if (el5Var != null) {
            el5Var.k(null);
        }
        this.b = null;
        f37<g2b> f37VarK = k();
        if (f37VarK != null) {
            ((am9) f37VarK).d();
        }
    }

    @Override // defpackage.y18
    public final void e(final kha khaVar, final s85 s85Var, final yda ydaVar, final s56 s56Var) {
        oh4 oh4Var = new oh4() { // from class: wo
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                x56 x56Var = (x56) obj;
                n56.a aVar = this.a;
                x56Var.h = khaVar;
                x56Var.i = s85Var;
                x56Var.c = ydaVar;
                x56Var.d = s56Var;
                x56Var.e = aVar != null ? aVar.D1() : null;
                x56Var.f = aVar != null ? aVar.r0() : null;
                x56Var.g = aVar != null ? aVar.getViewConfiguration() : null;
                return g2b.a;
            }
        };
        n56.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = aVar.B(new yo(oh4Var, this, aVar, null));
    }

    @Override // defpackage.y18
    public final void f(kha khaVar, kha khaVar2) {
        x56 x56Var = this.c;
        if (x56Var != null) {
            boolean z = (lja.b(x56Var.h.b, khaVar2.b) && xj5.a(x56Var.h.c, khaVar2.c)) ? false : true;
            x56Var.h = khaVar2;
            int size = x56Var.j.size();
            for (int i = 0; i < size; i++) {
                pk8 pk8Var = (pk8) ((WeakReference) x56Var.j.get(i)).get();
                if (pk8Var != null) {
                    pk8Var.g = khaVar2;
                }
            }
            l56 l56Var = x56Var.m;
            synchronized (l56Var.c) {
                l56Var.j = null;
                l56Var.l = null;
                l56Var.k = null;
                l56Var.m = null;
                l56Var.n = null;
                g2b g2bVar = g2b.a;
            }
            if (xj5.a(khaVar, khaVar2)) {
                if (z) {
                    nd5 nd5Var = x56Var.b;
                    int iF = lja.f(khaVar2.b);
                    int iE = lja.e(khaVar2.b);
                    lja ljaVar = x56Var.h.c;
                    int iF2 = ljaVar != null ? lja.f(ljaVar.a) : -1;
                    lja ljaVar2 = x56Var.h.c;
                    nd5Var.b(iF, iE, iF2, ljaVar2 != null ? lja.e(ljaVar2.a) : -1);
                    return;
                }
                return;
            }
            if (khaVar != null && (!xj5.a(khaVar.a.u, khaVar2.a.u) || (lja.b(khaVar.b, khaVar2.b) && !xj5.a(khaVar.c, khaVar2.c)))) {
                nd5 nd5Var2 = x56Var.b;
                nd5Var2.a().restartInput(nd5Var2.a);
                return;
            }
            int size2 = x56Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                pk8 pk8Var2 = (pk8) ((WeakReference) x56Var.j.get(i2)).get();
                if (pk8Var2 != null) {
                    kha khaVar3 = x56Var.h;
                    nd5 nd5Var3 = x56Var.b;
                    if (pk8Var2.k) {
                        pk8Var2.g = khaVar3;
                        if (pk8Var2.i) {
                            nd5Var3.a().updateExtractedText(nd5Var3.a, pk8Var2.h, xa6.a(khaVar3));
                        }
                        lja ljaVar3 = khaVar3.c;
                        long j = khaVar3.b;
                        int iF3 = ljaVar3 != null ? lja.f(ljaVar3.a) : -1;
                        lja ljaVar4 = khaVar3.c;
                        nd5Var3.b(lja.f(j), lja.e(j), iF3, ljaVar4 != null ? lja.e(ljaVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.y18
    public final void h(sk8 sk8Var) {
        Rect rect;
        x56 x56Var = this.c;
        if (x56Var != null) {
            x56Var.l = new Rect(wk6.b(sk8Var.a), wk6.b(sk8Var.b), wk6.b(sk8Var.c), wk6.b(sk8Var.d));
            if (!x56Var.j.isEmpty() || (rect = x56Var.l) == null) {
                return;
            }
            x56Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.n56
    public final void i() {
        f37<g2b> f37VarK = k();
        if (f37VarK != null) {
            ((am9) f37VarK).f(g2b.a);
        }
    }

    public final f37<g2b> k() {
        am9 am9Var = this.d;
        if (am9Var != null) {
            return am9Var;
        }
        if (!p3a.a) {
            return null;
        }
        am9 am9VarB = ty1.b(2, xx0.v);
        this.d = am9VarB;
        return am9VarB;
    }
}
