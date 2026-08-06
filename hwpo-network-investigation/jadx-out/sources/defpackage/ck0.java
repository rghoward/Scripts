package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ck0 implements if2 {
    public final boolean a;
    public final ArrayList<yua> b = new ArrayList<>(1);
    public int c;
    public of2 d;

    public ck0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.if2
    public final void d(yua yuaVar) {
        yuaVar.getClass();
        ArrayList<yua> arrayList = this.b;
        if (arrayList.contains(yuaVar)) {
            return;
        }
        arrayList.add(yuaVar);
        this.c++;
    }

    public final void o(int i) {
        of2 of2Var = this.d;
        String str = n6b.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).c(of2Var, this.a, i);
        }
    }

    public final void p() {
        of2 of2Var = this.d;
        String str = n6b.a;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).f(of2Var, this.a);
        }
        this.d = null;
    }

    public final void q(of2 of2Var) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).getClass();
        }
    }

    public final void r(of2 of2Var) {
        this.d = of2Var;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).g(of2Var, this.a);
        }
    }
}
