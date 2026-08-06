package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cla {
    public static final k7a a = new k7a("NO_THREAD_ELEMENTS");
    public static final x19 b = new x19(1);
    public static final ala c = new ala();
    public static final bla d = new bla();

    public static final void a(h72 h72Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof hla)) {
            Object objJ = h72Var.J(c, null);
            objJ.getClass();
            ((zka) objJ).e0(obj);
            return;
        }
        hla hlaVar = (hla) obj;
        zka<Object>[] zkaVarArr = hlaVar.c;
        int length = zkaVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            zka<Object> zkaVar = zkaVarArr[length];
            zkaVar.getClass();
            zkaVar.e0(hlaVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(h72 h72Var) {
        Object objJ = h72Var.J(b, 0);
        objJ.getClass();
        return objJ;
    }

    public static final Object c(h72 h72Var, Object obj) {
        if (obj == null) {
            obj = b(h72Var);
        }
        if (obj == 0) {
            return a;
        }
        if (!(obj instanceof Integer)) {
            return ((zka) obj).T();
        }
        return h72Var.J(d, new hla(((Number) obj).intValue(), h72Var));
    }
}
