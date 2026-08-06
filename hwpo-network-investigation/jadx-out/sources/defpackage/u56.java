package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u56 {
    public final dt7 A;
    public final dt7 B;
    public hda a;
    public final vj8 b;
    public final xv9 c;
    public final nd3 d;
    public gia e;
    public final dt7 f;
    public final dt7 g;
    public qq5 h;
    public final dt7 i;
    public iw j;
    public final dt7 k;
    public final dt7 l;
    public final dt7 m;
    public final dt7 n;
    public final dt7 o;
    public boolean p;
    public final dt7 q;
    public final zo5 r;
    public final dt7 s;
    public final dt7 t;
    public oh4<? super kha, g2b> u;
    public final g75 v;
    public final s56 w;
    public final t56 x;
    public final np y;
    public long z;

    public u56(hda hdaVar, vj8 vj8Var, xv9 xv9Var) {
        this.a = hdaVar;
        this.b = vj8Var;
        this.c = xv9Var;
        nd3 nd3Var = new nd3();
        iw iwVar = lw.a;
        long j = lja.b;
        kha khaVar = new kha(iwVar, j, (lja) null);
        nd3Var.a = khaVar;
        nd3Var.b = new td3(iwVar, khaVar.b);
        this.d = nd3Var;
        Boolean bool = Boolean.FALSE;
        this.f = bl7.i(bool);
        this.g = bl7.i(new y43(0.0f));
        this.i = bl7.i(null);
        this.k = bl7.i(bt4.t);
        this.l = bl7.i(bool);
        this.m = bl7.i(bool);
        this.n = bl7.i(bool);
        this.o = bl7.i(bool);
        this.p = true;
        this.q = bl7.i(Boolean.TRUE);
        this.r = new zo5(xv9Var);
        this.s = bl7.i(bool);
        this.t = bl7.i(bool);
        this.u = new r56(0);
        this.v = new g75(1, this);
        this.w = new s56(this);
        this.x = new t56(this);
        this.y = new np();
        this.z = uh1.k;
        this.A = bl7.i(new lja(j));
        this.B = bl7.i(new lja(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bt4 a() {
        return (bt4) this.k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final qq5 c() {
        qq5 qq5Var = this.h;
        if (qq5Var == null || !qq5Var.e()) {
            return null;
        }
        return qq5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sia d() {
        return (sia) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new lja(j));
    }

    public final void f(long j) {
        this.A.setValue(new lja(j));
    }
}
