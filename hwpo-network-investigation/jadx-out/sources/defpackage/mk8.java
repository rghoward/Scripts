package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mk8<N> implements p20<N> {
    public final d27 a = new d27();
    public final t27<Object> b = new t27<>((Object) null);
    public final N c;

    public mk8(N n) {
        this.c = n;
    }

    @Override // defpackage.p20
    public final N a() {
        return this.c;
    }

    @Override // defpackage.p20
    public final void b(ci4<? super N, Object, g2b> ci4Var, Object obj) {
        this.a.c(7);
        t27<Object> t27Var = this.b;
        t27Var.g(ci4Var);
        t27Var.g(obj);
    }

    @Override // defpackage.p20
    public final void c(int i, N n) {
        d27 d27Var = this.a;
        d27Var.c(5);
        d27Var.c(i);
        this.b.g(n);
    }

    @Override // defpackage.p20
    public final void d(N n) {
        this.a.c(1);
        this.b.g(n);
    }

    @Override // defpackage.p20
    public final void e() {
        this.a.c(8);
    }

    @Override // defpackage.p20
    public final void f(int i, int i2, int i3) {
        d27 d27Var = this.a;
        d27Var.c(3);
        d27Var.c(i);
        d27Var.c(i2);
        d27Var.c(i3);
    }

    @Override // defpackage.p20
    public final void g(int i, int i2) {
        d27 d27Var = this.a;
        d27Var.c(2);
        d27Var.c(i);
        d27Var.c(i2);
    }

    @Override // defpackage.p20
    public final void h() {
        this.a.c(0);
    }

    @Override // defpackage.p20
    public final void i(int i, N n) {
        d27 d27Var = this.a;
        d27Var.c(6);
        d27Var.c(i);
        this.b.g(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(j1b j1bVar, hm8 hm8Var) {
        Exception exc;
        d27 d27Var = this.a;
        int i = d27Var.b;
        t27 t27Var = new t27((Object) null);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            t27<Object> t27Var2 = this.b;
            if (i2 >= i) {
                if (i3 != t27Var2.b) {
                    pt1.a("Applier operation size mismatch");
                }
                t27Var2.j();
                d27Var.b = 0;
                j1bVar.j();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (d27Var.a(i2)) {
                        case 0:
                            j1bVar.h();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            j1bVar.d(t27Var2.b(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            j1bVar.g(d27Var.a(i4), d27Var.a(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    j1bVar.f(d27Var.a(i4), d27Var.a(i7), d27Var.a(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            j1bVar.k();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            j1bVar.c(d27Var.a(i4), t27Var2.b(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                d27Var.a(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objB = t27Var2.b(i3);
                            objB.getClass();
                            fza.b(2, objB);
                            i3 += 2;
                            j1bVar.b((ci4) objB, t27Var2.b(i11));
                            i2 = i4;
                            break;
                        case 8:
                            qr5 qr5Var = j1bVar.c;
                            if (qr5Var instanceof ls1) {
                                qr5 qr5Var2 = qr5Var;
                                if (hm8Var.f.n(qr5Var2)) {
                                    qr5Var2.g();
                                }
                            }
                            t27Var.g(qr5Var);
                            j1bVar.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    j1bVar.j();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new ns1(t27Var2, t27Var, d27Var, i2 - 1, exc);
        }
    }
}
