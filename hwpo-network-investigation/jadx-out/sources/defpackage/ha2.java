package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 extends rma.b {
    @Override // rma.b
    public final void d(int i, String str, String str2, Throwable th) {
        str2.getClass();
        if (i != 6) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str.concat(" "));
        }
        sb.append(str2);
        String string = sb.toString();
        j04 j04VarA = j04.a();
        l92 l92Var = j04VarA.a;
        l92Var.o.a.b(new h92(l92Var, System.currentTimeMillis() - l92Var.d, string));
        if (th != null) {
            j04VarA.b(th);
        }
    }
}
