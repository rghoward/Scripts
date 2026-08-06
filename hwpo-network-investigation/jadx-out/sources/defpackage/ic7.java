package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ic7 implements xva {
    public final uwa a;
    public final l85 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements xva.a {
        @Override // xva.a
        public final xva a(uwa uwaVar, l85 l85Var) {
            return new ic7(uwaVar, l85Var);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public ic7(uwa uwaVar, l85 l85Var) {
        this.a = uwaVar;
        this.b = l85Var;
    }

    @Override // defpackage.xva
    public final void a() {
        l85 l85Var = this.b;
        boolean z = l85Var instanceof f5a;
        uwa uwaVar = this.a;
        if (z) {
            uwaVar.onSuccess(((f5a) l85Var).a);
        } else if (l85Var instanceof dm3) {
            uwaVar.onError(((dm3) l85Var).a);
        } else {
            u.b();
        }
    }
}
