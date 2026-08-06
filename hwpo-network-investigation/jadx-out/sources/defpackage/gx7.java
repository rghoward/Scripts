package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gx7<E> extends r2<E> implements ix7<E> {
    public static final gx7 w;
    public final Object t;
    public final Object u;
    public final qw7<E, z86> v;

    static {
        gg3 gg3Var = gg3.a;
        w = new gx7(gg3Var, gg3Var, qw7.v);
    }

    public gx7(Object obj, Object obj2, qw7<E, z86> qw7Var) {
        this.t = obj;
        this.u = obj2;
        this.v = qw7Var;
    }

    @Override // defpackage.ix7
    public final gx7 Y(gk8.c cVar) {
        qw7<E, z86> qw7VarB = this.v;
        z86 z86Var = qw7VarB.get(cVar);
        if (z86Var == null) {
            return this;
        }
        Object obj = z86Var.a;
        Object obj2 = z86Var.b;
        yxa<E, z86> yxaVar = qw7VarB.t;
        yxa<E, z86> yxaVarV = yxaVar.v(cVar != null ? cVar.hashCode() : 0, 0, cVar);
        if (yxaVar != yxaVarV) {
            qw7VarB = yxaVarV == null ? qw7.v : new qw7<>(yxaVarV, qw7VarB.u - 1);
        }
        gg3 gg3Var = gg3.a;
        if (obj != gg3Var) {
            z86 z86Var2 = qw7VarB.get(obj);
            z86Var2.getClass();
            qw7VarB = qw7VarB.b(obj, new z86(z86Var2.a, obj2));
        }
        if (obj2 != gg3Var) {
            z86 z86Var3 = qw7VarB.get(obj2);
            z86Var3.getClass();
            qw7VarB = qw7VarB.b(obj2, new z86(obj, z86Var3.b));
        }
        Object obj3 = obj != gg3Var ? this.t : obj2;
        if (obj2 != gg3Var) {
            obj = this.u;
        }
        return new gx7(obj3, obj, qw7VarB);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.ix7
    public final gx7 add(Object obj) {
        qw7<E, z86> qw7Var = this.v;
        if (qw7Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new gx7(obj, obj, qw7Var.b(obj, new z86()));
        }
        Object obj2 = this.u;
        z86 z86Var = qw7Var.get(obj2);
        z86Var.getClass();
        return new gx7(this.t, obj, qw7Var.b(obj2, new z86(z86Var.a, obj)).b(obj, new z86(obj2, gg3.a)));
    }

    @Override // defpackage.s0, java.util.Collection
    public final boolean contains(Object obj) {
        return this.v.containsKey(obj);
    }

    @Override // defpackage.s0
    public final int d() {
        return this.v.u;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new hx7(this.t, this.v);
    }
}
