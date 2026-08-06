package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y94 extends gw2 implements rf7, ju1 {
    public final ba4 J;
    public ez7.a K;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements ci4<v94, v94, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(v94 v94Var, v94 v94Var2) {
            boolean zE;
            v94 v94Var3 = v94Var;
            v94 v94Var4 = v94Var2;
            y94 y94Var = (y94) this.receiver;
            if (y94Var.G && (zE = v94Var4.e()) != v94Var3.e()) {
                if (zE) {
                    gl8 gl8Var = new gl8();
                    sf7.a(y94Var, new z94(gl8Var, y94Var));
                    ez7 ez7Var = (ez7) gl8Var.t;
                    y94Var.K = ez7Var != null ? ez7Var.b() : null;
                } else {
                    ez7.a aVar = y94Var.K;
                    if (aVar != null) {
                        aVar.a();
                    }
                    y94Var.K = null;
                }
            }
            return g2b.a;
        }
    }

    public y94() {
        ba4 ba4Var = new ba4(0, new a(2, this, y94.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 9);
        c2(ba4Var);
        this.J = ba4Var;
    }

    @Override // defpackage.rf7
    public final void e1() {
        gl8 gl8Var = new gl8();
        sf7.a(this, new z94(gl8Var, this));
        ez7 ez7Var = (ez7) gl8Var.t;
        if (this.J.a0().e()) {
            ez7.a aVar = this.K;
            if (aVar != null) {
                aVar.a();
            }
            this.K = ez7Var != null ? ez7Var.b() : null;
        }
    }
}
