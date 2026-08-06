package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jm extends wp5 implements oh4<t72, cq> {
    public final /* synthetic */ cm u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(cm cmVar) {
        super(1);
        this.u = cmVar;
    }

    @Override // defpackage.oh4
    public final cq invoke(t72 t72Var) {
        cm cmVar = this.u;
        return new cq(cmVar, cmVar.getTextInputService(), t72Var);
    }
}
