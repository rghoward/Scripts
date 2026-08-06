package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zr3 extends xr3<ek4.d> {
    @Override // defpackage.xr3
    public final void a(Map.Entry entry) {
        ((ek4.d) entry.getKey()).getClass();
    }

    @Override // defpackage.xr3
    public final ek4.e b(ur3 ur3Var, au6 au6Var, int i) {
        return ur3Var.a.get(new ur3.a(i, au6Var));
    }

    @Override // defpackage.xr3
    public final su3<ek4.d> c(Object obj) {
        return ((ek4.c) obj).extensions;
    }

    @Override // defpackage.xr3
    public final su3<ek4.d> d(Object obj) {
        ek4.c cVar = (ek4.c) obj;
        su3<ek4.d> su3Var = cVar.extensions;
        if (su3Var.b) {
            cVar.extensions = su3Var.clone();
        }
        return cVar.extensions;
    }

    @Override // defpackage.xr3
    public final boolean e(au6 au6Var) {
        return au6Var instanceof ek4.c;
    }

    @Override // defpackage.xr3
    public final void f(Object obj) {
        ((ek4.c) obj).extensions.h();
    }

    @Override // defpackage.xr3
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.xr3
    public final void h(Object obj) {
        throw null;
    }

    @Override // defpackage.xr3
    public final void i(Object obj) {
        throw null;
    }

    @Override // defpackage.xr3
    public final void j(Map.Entry entry) {
        ((ek4.d) entry.getKey()).getClass();
        throw null;
    }
}
