package defpackage;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uub implements ik0.c {
    public final zw.e a;
    public final ux b;
    public p55 c;
    public Set d;
    public boolean e;
    public final /* synthetic */ zn4 f;

    public uub(zn4 zn4Var, zw.e eVar, ux uxVar) {
        Objects.requireNonNull(zn4Var);
        this.f = zn4Var;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = eVar;
        this.b = uxVar;
    }

    @Override // ik0.c
    public final void a(ax1 ax1Var) {
        this.f.F.post(new tub(this, ax1Var));
    }

    public final void b(ax1 ax1Var) {
        rub rubVar = (rub) this.f.C.get(this.b);
        if (rubVar != null) {
            rubVar.o(ax1Var);
        }
    }
}
