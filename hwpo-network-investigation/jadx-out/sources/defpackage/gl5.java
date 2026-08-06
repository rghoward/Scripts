package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class gl5 extends ll5 {
    public final boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl5(el5 el5Var) {
        super(true);
        boolean z = true;
        X(el5Var);
        ac1 ac1VarR = R();
        bc1 bc1Var = ac1VarR instanceof bc1 ? (bc1) ac1VarR : null;
        if (bc1Var == null) {
            z = false;
            break;
        }
        ll5 ll5VarP = bc1Var.p();
        while (!ll5VarP.M()) {
            ac1 ac1VarR2 = ll5VarP.R();
            bc1 bc1Var2 = ac1VarR2 instanceof bc1 ? (bc1) ac1VarR2 : null;
            if (bc1Var2 == null) {
                z = false;
                break;
            }
            ll5VarP = bc1Var2.p();
        }
        this.x = z;
    }

    @Override // defpackage.ll5
    public final boolean M() {
        return this.x;
    }

    @Override // defpackage.ll5
    public final boolean O() {
        return true;
    }
}
