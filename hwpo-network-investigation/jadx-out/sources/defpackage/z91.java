package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z91<S, T> extends u91<T> {
    public final r54<S> w;

    public z91(int i, xx0 xx0Var, h72 h72Var, r54 r54Var) {
        super(h72Var, i, xx0Var);
        this.w = r54Var;
    }

    @Override // defpackage.u91, defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<? super g2b> r02Var) {
        int i = this.u;
        v72 v72Var = v72.t;
        if (i == -3) {
            h72 context = r02Var.getContext();
            Boolean bool = Boolean.FALSE;
            i72 i72Var = new i72();
            h72 h72Var = this.t;
            h72 h72VarC0 = !((Boolean) h72Var.J(i72Var, bool)).booleanValue() ? context.c0(h72Var) : l72.a(context, h72Var, false);
            if (xj5.a(h72VarC0, context)) {
                Object objM = m(s54Var, r02Var);
                return objM == v72Var ? objM : g2b.a;
            }
            v02.a aVar = v02.a.t;
            if (xj5.a(h72VarC0.d0(aVar), context.d0(aVar))) {
                h72 context2 = r02Var.getContext();
                if (!(s54Var instanceof wc9) && !(s54Var instanceof jc7)) {
                    s54Var = new w1b(s54Var, context2);
                }
                Object objA = x91.a(h72VarC0, s54Var, cla.b(h72VarC0), new y91(this, null), r02Var);
                return objA == v72Var ? objA : g2b.a;
            }
        }
        Object objCollect = super.collect(s54Var, r02Var);
        return objCollect == v72Var ? objCollect : g2b.a;
    }

    @Override // defpackage.u91
    public final Object i(ua8<? super T> ua8Var, r02<? super g2b> r02Var) {
        Object objM = m(new wc9(ua8Var), r02Var);
        return objM == v72.t ? objM : g2b.a;
    }

    public abstract Object m(s54<? super T> s54Var, r02<? super g2b> r02Var);

    @Override // defpackage.u91
    public final String toString() {
        return this.w + " -> " + super.toString();
    }
}
