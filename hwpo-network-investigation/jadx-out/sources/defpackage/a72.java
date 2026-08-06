package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a72 extends gw2 implements qb9 {
    public mva J;
    public kha K;
    public u56 L;
    public boolean M;
    public boolean N;
    public ag7 O;
    public qga P;
    public s85 Q;
    public p94 R;

    public static void f2(u56 u56Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        gia giaVar = u56Var.e;
        g75 g75Var = u56Var.v;
        if (giaVar == null) {
            int length = str.length();
            g75Var.invoke(new kha(4, ay.c(length, length), str));
        } else {
            kha khaVarA = u56Var.d.a(ws0.i(new cx2(), new lo1(str, 1)));
            giaVar.a(null, khaVarA);
            g75Var.invoke(khaVarA);
        }
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        iw iwVar = this.K.a;
        ho5<Object>[] ho5VarArr = ec9.a;
        gc9<iw> gc9Var = ac9.F;
        ho5<Object>[] ho5VarArr2 = ec9.a;
        ho5<Object> ho5Var = ho5VarArr2[18];
        hc9Var.d(gc9Var, iwVar);
        iw iwVar2 = this.J.a;
        gc9<iw> gc9Var2 = ac9.G;
        ho5<Object> ho5Var2 = ho5VarArr2[19];
        hc9Var.d(gc9Var2, iwVar2);
        long j = this.K.b;
        gc9<lja> gc9Var3 = ac9.H;
        ho5<Object> ho5Var3 = ho5VarArr2[20];
        hc9Var.d(gc9Var3, new lja(j));
        gc9<bz1> gc9Var4 = ac9.s;
        ho5<Object> ho5Var4 = ho5VarArr2[9];
        hc9Var.d(gc9Var4, bz1.a.a);
        fo foVarA = ez3.a(this.K.a);
        if (foVarA != null) {
            gc9<dz3> gc9Var5 = ac9.t;
            ho5<Object> ho5Var5 = ho5VarArr2[10];
            hc9Var.d(gc9Var5, foVarA);
        }
        int i = 0;
        hc9Var.d(kb9.h, new k3(null, new t62(0, this)));
        int i2 = this.Q.d;
        if (i2 == 6) {
            pz1.a.getClass();
            fn fnVar = pz1.a.c;
            gc9<pz1> gc9Var6 = ac9.r;
            ho5<Object> ho5Var6 = ho5VarArr2[8];
            hc9Var.d(gc9Var6, fnVar);
        } else if (i2 == 7 || i2 == 8) {
            pz1.a.getClass();
            fn fnVar2 = pz1.a.b;
            gc9<pz1> gc9Var7 = ac9.r;
            ho5<Object> ho5Var7 = ho5VarArr2[8];
            hc9Var.d(gc9Var7, fnVar2);
        } else if (i2 == 4) {
            pz1.a.getClass();
            fn fnVar3 = pz1.a.d;
            gc9<pz1> gc9Var8 = ac9.r;
            ho5<Object> ho5Var8 = ho5VarArr2[8];
            hc9Var.d(gc9Var8, fnVar3);
        }
        if (!this.N) {
            hc9Var.d(ac9.j, g2b.a);
        }
        boolean z = this.N && !this.M;
        gc9<Boolean> gc9Var9 = ac9.O;
        ho5<Object> ho5Var9 = ho5VarArr2[28];
        hc9Var.d(gc9Var9, Boolean.valueOf(z));
        ec9.a(hc9Var, new v62(i, this));
        if (z) {
            hc9Var.d(kb9.k, new k3(null, new nw(1, this)));
            hc9Var.d(kb9.o, new k3(null, new w62(0, this, hc9Var)));
        }
        hc9Var.d(kb9.j, new k3(null, new ei4() { // from class: x62
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                a72 a72Var = this.t;
                if (!zBooleanValue) {
                    iIntValue = a72Var.O.a(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = a72Var.O.a(iIntValue2);
                }
                boolean z2 = false;
                if (a72Var.N) {
                    long j2 = a72Var.K.b;
                    int i3 = lja.c;
                    if (iIntValue != ((int) (j2 >> 32)) || iIntValue2 != ((int) (j2 & 4294967295L))) {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        bt4 bt4Var = bt4.t;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > a72Var.K.a.u.length()) {
                            qga qgaVar = a72Var.P;
                            qgaVar.t(false);
                            qgaVar.q(bt4Var);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                qga qgaVar2 = a72Var.P;
                                qgaVar2.t(false);
                                qgaVar2.q(bt4Var);
                            } else {
                                a72Var.P.h(true);
                            }
                            a72Var.L.v.invoke(new kha(a72Var.K.a, ay.c(iIntValue, iIntValue2), (lja) null));
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }));
        int i3 = this.Q.e;
        mh4 mh4Var = new mh4() { // from class: y62
            @Override // defpackage.mh4
            public final Object invoke() {
                a72 a72Var = this.t;
                s56 s56Var = a72Var.L.w;
                s56Var.t.r.b(a72Var.Q.e);
                g2b g2bVar = g2b.a;
                return Boolean.TRUE;
            }
        };
        hc9Var.d(ac9.I, new r85(i3));
        hc9Var.d(kb9.p, new k3(null, mh4Var));
        hc9Var.d(kb9.b, new k3(null, new mh4() { // from class: z62
            @Override // defpackage.mh4
            public final Object invoke() {
                xv9 xv9Var;
                a72 a72Var = this.t;
                u56 u56Var = a72Var.L;
                p94 p94Var = a72Var.R;
                boolean z2 = a72Var.M;
                if (!u56Var.b()) {
                    p94.a(p94Var);
                } else if (!z2 && (xv9Var = u56Var.c) != null) {
                    xv9Var.b();
                }
                return Boolean.TRUE;
            }
        }));
        hc9Var.d(kb9.c, new k3(null, new mq1(1, this)));
        if (!lja.c(this.K.b)) {
            hc9Var.d(kb9.q, new k3(null, new q62(0, this)));
            if (this.N && !this.M) {
                hc9Var.d(kb9.r, new k3(null, new mh4() { // from class: r62
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        this.t.P.f();
                        return Boolean.TRUE;
                    }
                }));
            }
        }
        if (!this.N || this.M) {
            return;
        }
        hc9Var.d(kb9.s, new k3(null, new u62(0, this)));
    }

    @Override // defpackage.qb9
    public final boolean G1() {
        return true;
    }
}
