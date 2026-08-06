package defpackage;

import androidx.media3.exoplayer.k;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nn8 {
    public final k a;
    public final int b;
    public final k c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public nn8(k kVar, k kVar2, int i) {
        this.a = kVar;
        this.b = i;
        this.c = kVar2;
    }

    public static boolean g(k kVar) {
        return kVar.getState() != 0;
    }

    public static void k(k kVar, long j) {
        kVar.p();
        if (kVar instanceof oja) {
            oja ojaVar = (oja) kVar;
            xl7.r(ojaVar.G);
            ojaVar.d0 = j;
        }
    }

    public final void a(k kVar, fs2 fs2Var) {
        xl7.r(this.a == kVar || this.c == kVar);
        if (g(kVar)) {
            if (kVar == fs2Var.v) {
                fs2Var.w = null;
                fs2Var.v = null;
                fs2Var.x = true;
            }
            if (kVar.getState() == 2) {
                kVar.stop();
            }
            kVar.i();
        }
    }

    public final int b() {
        boolean zG = g(this.a);
        k kVar = this.c;
        return (zG ? 1 : 0) + ((kVar == null || !g(kVar)) ? 0 : 1);
    }

    public final k c(vp6 vp6Var) {
        if (vp6Var == null) {
            return null;
        }
        xz8[] xz8VarArr = vp6Var.c;
        int i = this.b;
        if (xz8VarArr[i] == null) {
            return null;
        }
        k kVar = this.a;
        if (kVar.z() == xz8VarArr[i]) {
            return kVar;
        }
        k kVar2 = this.c;
        if (kVar2 == null || kVar2.z() != xz8VarArr[i]) {
            return null;
        }
        return kVar2;
    }

    public final boolean d(vp6 vp6Var, k kVar) {
        if (kVar == null) {
            return true;
        }
        xz8[] xz8VarArr = vp6Var.c;
        int i = this.b;
        xz8 xz8Var = xz8VarArr[i];
        if (kVar.z() == null) {
            return true;
        }
        if (kVar.z() == xz8Var) {
            if (xz8Var == null || kVar.k()) {
                return true;
            }
            vp6 vp6Var2 = vp6Var.m;
            if (vp6Var.g.h && vp6Var2 != null && vp6Var2.e && ((kVar instanceof oja) || (kVar instanceof av6) || kVar.B() >= vp6Var2.e())) {
                return true;
            }
        }
        vp6 vp6Var3 = vp6Var.m;
        return vp6Var3 != null && vp6Var3.c[i] == kVar.z();
    }

    public final boolean e() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean f() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return g(this.a);
        }
        k kVar = this.c;
        kVar.getClass();
        return kVar.getState() != 0;
    }

    public final void h(boolean z) {
        if (z) {
            if (this.e) {
                this.a.reset();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            k kVar = this.c;
            kVar.getClass();
            kVar.reset();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i(k kVar, vp6 vp6Var, nsa nsaVar, fs2 fs2Var) {
        k kVar2;
        int i;
        if (kVar == null || kVar.getState() == 0 || (kVar == (kVar2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (kVar == this.c && this.d == 3) {
            return 1;
        }
        xz8 xz8VarZ = kVar.z();
        xz8[] xz8VarArr = vp6Var.c;
        int i2 = this.b;
        Object[] objArr = xz8VarZ != xz8VarArr[i2];
        boolean zB = nsaVar.b(i2);
        if (!zB || objArr != false) {
            if (!kVar.C()) {
                fq3 fq3Var = nsaVar.c[i2];
                int length = fq3Var != null ? fq3Var.length() : 0;
                id4[] id4VarArr = new id4[length];
                for (int i3 = 0; i3 < length; i3++) {
                    fq3Var.getClass();
                    id4VarArr[i3] = fq3Var.b(i3);
                }
                xz8 xz8Var = vp6Var.c[i2];
                xz8Var.getClass();
                kVar.n(id4VarArr, xz8Var, vp6Var.e(), vp6Var.p, vp6Var.g.a);
                return 3;
            }
            if (!kVar.d()) {
                return 0;
            }
            a(kVar, fs2Var);
            if (!zB || e()) {
                h(kVar == kVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void j() {
        if (!g(this.a)) {
            h(true);
        }
        k kVar = this.c;
        if (kVar == null || kVar.getState() != 0) {
            return;
        }
        h(false);
    }

    public final void l() {
        k kVar = this.a;
        if (kVar.getState() == 1 && this.d != 4) {
            kVar.start();
            return;
        }
        k kVar2 = this.c;
        if (kVar2 == null || kVar2.getState() != 1 || this.d == 3) {
            return;
        }
        kVar2.start();
    }
}
