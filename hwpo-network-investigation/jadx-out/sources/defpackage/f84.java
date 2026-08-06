package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f84<Params, ResultType> {
    public abstract r54<ResultType> a(Params params);

    /* JADX WARN: Multi-variable type inference failed */
    public final e84 b(Object obj) {
        obj.getClass();
        r54<ResultType> r54VarA = a(obj);
        et2 et2Var = i23.a;
        wr2 wr2Var = wr2.v;
        if (wr2Var.d0(el5.a.t) != null) {
            r.a(wr2Var, "Flow context cannot contain job in it. Had ");
            r54VarA = null;
        } else if (!wr2Var.equals(ff3.t)) {
            r54VarA = r54VarA instanceof ri4 ? ri4.e((ri4) r54VarA, wr2Var, 0, null, 6) : new aa1(r54VarA, wr2Var, 0, null, 12);
        }
        return new e84(r54VarA);
    }
}
