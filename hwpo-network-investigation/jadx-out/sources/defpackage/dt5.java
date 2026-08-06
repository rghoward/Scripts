package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dt5 implements pv5 {
    public final zu5 a;

    public dt5(zu5 zu5Var) {
        this.a = zu5Var;
    }

    @Override // defpackage.pv5
    public final int b() {
        return this.a.g().e();
    }

    @Override // defpackage.pv5
    public final int c() {
        return ((kt5) th1.G(this.a.g().g())).getIndex();
    }

    @Override // defpackage.pv5
    public final int d() {
        int i;
        zu5 zu5Var = this.a;
        int iF = 0;
        if (zu5Var.g().g().isEmpty()) {
            return 0;
        }
        cu5 cu5VarG = zu5Var.g();
        fl7 fl7VarC = cu5VarG.c();
        fl7 fl7Var = fl7.t;
        int iA = (int) (fl7VarC == fl7Var ? cu5VarG.a() & 4294967295L : cu5VarG.a() >> 32);
        cu5 cu5VarG2 = zu5Var.g();
        boolean z = cu5VarG2.c() == fl7Var;
        List<kt5> listG = cu5VarG2.g();
        if (!listG.isEmpty()) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < listG.size()) {
                kt5 kt5Var = cu5VarG2.g().get(i2);
                int iK = z ? kt5Var.k() : kt5Var.o();
                if (iK == -1) {
                    i2++;
                } else {
                    int iMax = 0;
                    while (i2 < listG.size()) {
                        kt5 kt5Var2 = cu5VarG2.g().get(i2);
                        if ((z ? kt5Var2.k() : kt5Var2.o()) != iK) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? listG.get(i2).a() & 4294967295L : listG.get(i2).a() >> 32));
                        i2++;
                    }
                    i3 += iMax;
                    i4++;
                }
            }
            iF = cu5VarG2.f() + (i3 / i4);
        }
        if (iF != 0 && (i = iA / iF) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.pv5
    public final boolean e() {
        return !this.a.g().g().isEmpty();
    }

    @Override // defpackage.pv5
    public final int f() {
        return this.a.d.a.k();
    }
}
