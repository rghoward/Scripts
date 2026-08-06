package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o62 implements oh4<no5, Boolean> {
    public final /* synthetic */ u56 t;
    public final /* synthetic */ qga u;

    public o62(u56 u56Var, qga qgaVar) {
        this.t = u56Var;
        this.u = qgaVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // defpackage.oh4
    public final Boolean invoke(no5 no5Var) {
        boolean z;
        KeyEvent keyEvent = no5Var.a;
        if (this.t.a() == bt4.u && keyEvent.getKeyCode() == 4) {
            z = true;
            if (db7.b(keyEvent) == 1) {
                this.u.g(null);
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
