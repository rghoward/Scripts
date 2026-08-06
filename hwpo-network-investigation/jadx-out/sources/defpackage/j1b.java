package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j1b implements p20<qr5> {
    public final qr5 a;
    public final ArrayList<qr5> b = new ArrayList<>();
    public qr5 c;

    public j1b(qr5 qr5Var) {
        this.a = qr5Var;
        this.c = qr5Var;
    }

    @Override // defpackage.p20
    public final qr5 a() {
        return this.c;
    }

    @Override // defpackage.p20
    public final void c(int i, qr5 qr5Var) {
        this.c.N(i, qr5Var);
    }

    @Override // defpackage.p20
    public final void d(qr5 qr5Var) {
        this.b.add(this.c);
        this.c = qr5Var;
    }

    @Override // defpackage.p20
    public final void e() {
        this.c.p();
    }

    @Override // defpackage.p20
    public final void f(int i, int i2, int i3) {
        this.c.W(i, i2, i3);
    }

    @Override // defpackage.p20
    public final void g(int i, int i2) {
        this.c.b0(i, i2);
    }

    @Override // defpackage.p20
    public final void h() {
        ArrayList<qr5> arrayList = this.b;
        this.c = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.p20
    public final /* bridge */ /* synthetic */ void i(int i, qr5 qr5Var) {
    }

    @Override // defpackage.p20
    public final void j() {
        mn7 mn7Var = this.a.G;
        if (mn7Var != null) {
            mn7Var.y();
        }
    }

    public final void k() {
        this.b.clear();
        this.c = this.a;
        this.a.a0();
    }
}
