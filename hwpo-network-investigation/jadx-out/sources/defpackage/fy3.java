package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fy3 implements Closeable {
    public static final tn5 t;

    static {
        tn5 tn5Var;
        try {
            Class.forName("j$.nio.file.Files");
            tn5Var = new ab7();
        } catch (ClassNotFoundException unused) {
            tn5Var = new tn5();
        }
        t = tn5Var;
        String str = du7.u;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        du7.a.a(property);
        ClassLoader classLoader = vt8.class.getClassLoader();
        classLoader.getClass();
        new vt8(classLoader);
    }

    public final hx3 B(du7 du7Var) throws FileNotFoundException {
        du7Var.getClass();
        hx3 hx3VarE = E(du7Var);
        if (hx3VarE != null) {
            return hx3VarE;
        }
        fk.a(du7Var, "no such file: ");
        return null;
    }

    public abstract hx3 E(du7 du7Var);

    public abstract zw3 H(du7 du7Var);

    public abstract yq9 J(du7 du7Var);

    public abstract kw9 K(du7 du7Var);

    public abstract yq9 h(du7 du7Var);

    public abstract void k(du7 du7Var, du7 du7Var2);

    public final void m(du7 du7Var) {
        h30 h30Var = new h30();
        while (du7Var != null && !v(du7Var)) {
            h30Var.addFirst(du7Var);
            du7Var = du7Var.e();
        }
        Iterator<E> it = h30Var.iterator();
        while (it.hasNext()) {
            p((du7) it.next());
        }
    }

    public abstract void p(du7 du7Var);

    public abstract void t(du7 du7Var);

    public final void u(du7 du7Var) {
        du7Var.getClass();
        t(du7Var);
    }

    public final boolean v(du7 du7Var) {
        du7Var.getClass();
        return E(du7Var) != null;
    }

    public abstract List<du7> y(du7 du7Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
