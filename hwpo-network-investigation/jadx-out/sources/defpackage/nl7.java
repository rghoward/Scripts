package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl7 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ nl7(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        int i2 = 0;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                pl7 pl7Var = (pl7) obj2;
                gm3 gm3Var = (gm3) obj;
                pl7.a aVar = pl7.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof am7) {
                    pl7Var.m(((am7) gm3Var).b);
                }
                return g2b.a;
            case 1:
                er8 er8Var = (er8) obj2;
                gm3 gm3Var2 = (gm3) obj;
                er8.a aVar2 = er8.Companion;
                gm3Var2.getClass();
                if (gm3Var2 instanceof ir8.c) {
                    er8Var.t(((ir8.c) gm3Var2).b);
                } else if (gm3Var2 instanceof ir8.a) {
                    er8Var.i();
                } else if (gm3Var2 instanceof ir8.b) {
                    er8Var.getParentFragmentManager().e0(new Bundle(0), "RESULT_REQUIRED_BENCHMARK_DIALOG");
                    er8Var.i();
                }
                return g2b.a;
            case 2:
                w89 w89Var = (w89) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = jLongValue - w89Var.m;
                w89Var.m = jLongValue;
                long jC = wk6.c(j / ((double) w89Var.q));
                t27<w89.a> t27Var = w89Var.n;
                if (t27Var.e()) {
                    Object[] objArr = t27Var.a;
                    int i3 = t27Var.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        w89.a aVar3 = (w89.a) objArr[i4];
                        w89.A(aVar3, jC);
                        aVar3.c = true;
                    }
                    tva<S> tvaVar = w89Var.e;
                    if (tvaVar != 0) {
                        tvaVar.o();
                    }
                    int i5 = t27Var.b;
                    Object[] objArr2 = t27Var.a;
                    fg5 fg5VarJ = uh8.j(0, i5);
                    int i6 = fg5VarJ.t;
                    int i7 = fg5VarJ.u;
                    if (i6 <= i7) {
                        while (true) {
                            objArr2[i6 - i2] = objArr2[i6];
                            if (((w89.a) objArr2[i6]).c) {
                                i2++;
                            }
                            if (i6 != i7) {
                                i6++;
                            }
                        }
                    }
                    gz3.m(i5 - i2, i5, null, objArr2);
                    t27Var.b -= i2;
                }
                w89.a aVar4 = w89Var.o;
                if (aVar4 != null) {
                    aVar4.g = w89Var.f;
                    w89.A(aVar4, jC);
                    w89Var.D(aVar4.d);
                    if (aVar4.d == 1.0f) {
                        w89Var.o = null;
                    }
                    w89Var.C();
                }
                return g2b.a;
            case 3:
                jv9 jv9Var = (jv9) obj2;
                synchronized (jv9Var.g) {
                    jv9.a aVar5 = jv9Var.i;
                    aVar5.getClass();
                    Object obj3 = aVar5.b;
                    obj3.getClass();
                    int i8 = aVar5.d;
                    s27<Object> s27Var = aVar5.c;
                    if (s27Var == null) {
                        s27Var = new s27<>((Object) null);
                        aVar5.c = s27Var;
                        aVar5.f.m(obj3, s27Var);
                        g2b g2bVar = g2b.a;
                    }
                    aVar5.b(obj, i8, obj3, s27Var);
                }
                return g2b.a;
            default:
                int i9 = o9b.m0;
                return ((o9b) obj2).b().j;
        }
    }
}
