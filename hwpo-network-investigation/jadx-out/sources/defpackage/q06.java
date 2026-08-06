package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q06 implements pv5 {
    public final c26 a;

    public q06(c26 c26Var) {
        this.a = c26Var;
    }

    @Override // defpackage.pv5
    public final int b() {
        return this.a.g().e();
    }

    @Override // defpackage.pv5
    public final int c() {
        return ((w06) th1.G(this.a.g().g())).getIndex();
    }

    @Override // defpackage.pv5
    public final int d() {
        int i;
        c26 c26Var = this.a;
        int iF = 0;
        if (c26Var.g().g().isEmpty()) {
            return 0;
        }
        i16 i16VarG = c26Var.g();
        q16 q16Var = r16.a;
        fl7 fl7VarC = i16VarG.c();
        fl7 fl7Var = fl7.t;
        int iA = (int) (fl7VarC == fl7Var ? i16VarG.a() & 4294967295L : i16VarG.a() >> 32);
        i16 i16VarG2 = c26Var.g();
        List<w06> listG = i16VarG2.g();
        if (!listG.isEmpty()) {
            int size = listG.size();
            int iA2 = 0;
            while (iF < size) {
                w06 w06Var = listG.get(iF);
                iA2 += (int) (i16VarG2.c() == fl7Var ? w06Var.a() & 4294967295L : w06Var.a() >> 32);
                iF++;
            }
            iF = i16VarG2.f() + (iA2 / listG.size());
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
        return this.a.c.c.k();
    }
}
