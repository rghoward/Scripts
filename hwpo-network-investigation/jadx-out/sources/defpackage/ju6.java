package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ju6<T> implements v49<T> {
    public final zt6 a;
    public final p2b<?, ?> b;
    public final boolean c;
    public final wr3<?> d;

    public ju6(p2b<?, ?> p2bVar, wr3<?> wr3Var, zt6 zt6Var) {
        this.b = p2bVar;
        this.c = wr3Var.d(zt6Var);
        this.d = wr3Var;
        this.a = zt6Var;
    }

    @Override // defpackage.v49
    public final void a(T t, T t2) {
        Class<?> cls = g59.a;
        p2b<?, ?> p2bVar = this.b;
        p2bVar.f(t, p2bVar.e(p2bVar.a(t), p2bVar.a(t2)));
        if (this.c) {
            g59.j(this.d, t, t2);
        }
    }

    @Override // defpackage.v49
    public final void b(T t) {
        this.b.d(t);
        this.d.e(t);
    }

    @Override // defpackage.v49
    public final boolean c(T t) {
        this.d.b(t).e();
        return true;
    }

    @Override // defpackage.v49
    public final T d() {
        zt6 zt6Var = this.a;
        return zt6Var instanceof fk4 ? (T) ((fk4) zt6Var).v() : (T) zt6Var.c().m();
    }

    @Override // defpackage.v49
    public final void e(T t, crb crbVar) {
        Iterator itG = this.d.b(t).g();
        if (itG.hasNext()) {
            ((tu3.a) ((Map.Entry) itG.next()).getKey()).q();
            throw null;
        }
        p2b<?, ?> p2bVar = this.b;
        p2bVar.g(p2bVar.a(t), crbVar);
    }

    @Override // defpackage.v49
    public final int f(fk4 fk4Var) {
        int iHashCode = this.b.a(fk4Var).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.b(fk4Var).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.v49
    public final int g(a2 a2Var) {
        p2b<?, ?> p2bVar = this.b;
        int iC = p2bVar.c(p2bVar.a(a2Var));
        if (this.c) {
            fs9 fs9Var = this.d.b(a2Var).a;
            if (fs9Var.u.size() > 0) {
                tu3.d(fs9Var.c(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = fs9Var.d().iterator();
            if (it.hasNext()) {
                tu3.d(it.next());
                throw null;
            }
        }
        return iC;
    }

    @Override // defpackage.v49
    public final boolean h(fk4 fk4Var, fk4 fk4Var2) {
        p2b<?, ?> p2bVar = this.b;
        if (!p2bVar.a(fk4Var).equals(p2bVar.a(fk4Var2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        wr3<?> wr3Var = this.d;
        return wr3Var.b(fk4Var).equals(wr3Var.b(fk4Var2));
    }
}
