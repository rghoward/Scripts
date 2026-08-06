package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class c7d {
    public static final a7d d = new a7d();
    public final c7d a;
    public final ep9 b;
    public boolean c = false;

    public /* synthetic */ c7d(c7d c7dVar, ep9 ep9Var) {
        if (c7dVar != null) {
            xl7.g(c7dVar.c);
        }
        this.a = c7dVar;
        this.b = ep9Var;
    }

    public static c7d a(c7d c7dVar, c7d c7dVar2) {
        c7dVar.getClass();
        c7d c7dVar3 = b7d.e;
        if (c7dVar == c7dVar3) {
            return c7dVar2;
        }
        c7dVar2.getClass();
        if (c7dVar2 == c7dVar3) {
            return c7dVar;
        }
        q95<c7d> q95VarO = q95.o(2, c7dVar, c7dVar2);
        if (q95VarO.isEmpty()) {
            return c7dVar3;
        }
        if (q95VarO.size() == 1) {
            return (c7d) q95VarO.iterator().next();
        }
        int i = 0;
        for (c7d c7dVar4 : q95VarO) {
            do {
                i += c7dVar4.b.v;
                c7dVar4 = c7dVar4.a;
            } while (c7dVar4 != null);
        }
        if (i == 0) {
            return b7d.e;
        }
        ep9 ep9Var = new ep9(i);
        for (c7d c7dVar5 : q95VarO) {
            do {
                int i2 = 0;
                while (true) {
                    ep9 ep9Var2 = c7dVar5.b;
                    if (i2 >= ep9Var2.v) {
                        break;
                    }
                    xl7.i(ep9Var.put((a7d) ep9Var2.f(i2), ep9Var2.j(i2)) == null, "Duplicate bindings: %s", ep9Var2.f(i2));
                    i2++;
                }
                c7dVar5 = c7dVar5.a;
            } while (c7dVar5 != null);
        }
        return new b7d(null, ep9Var).b();
    }

    public final c7d b() {
        if (this.c) {
            aa0.c("Already frozen");
            return null;
        }
        this.c = true;
        c7d c7dVar = this.a;
        return (c7dVar == null || !this.b.isEmpty()) ? this : c7dVar;
    }

    public final boolean c(a7d a7dVar) {
        if (this.b.containsKey(a7dVar)) {
            return true;
        }
        c7d c7dVar = this.a;
        return c7dVar != null && c7dVar.c(a7dVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (c7d c7dVar = this; c7dVar != null; c7dVar = c7dVar.a) {
            for (int i = 0; i < c7dVar.b.v; i++) {
                sb.append("[");
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
