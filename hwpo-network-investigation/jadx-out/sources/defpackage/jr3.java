package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jr3 implements oh4<no5, Boolean> {
    public final /* synthetic */ fr3 t;
    public final /* synthetic */ h37<Boolean> u;

    public jr3(fr3 fr3Var, boolean z, h37 h37Var) {
        this.t = fr3Var;
        this.u = h37Var;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(no5 no5Var) {
        KeyEvent keyEvent = no5Var.a;
        boolean z = true;
        if (db7.b(keyEvent) == 1) {
            long jA = db7.a(keyEvent);
            int i = lo5.O;
            if (!lo5.a(jA, lo5.h) && !lo5.a(jA, lo5.r) && !lo5.a(jA, lo5.E)) {
                z = false;
            }
            if (z || lo5.a(ds6.b(keyEvent.getKeyCode()), lo5.q)) {
                this.t.invoke();
            }
        }
        Boolean bool = Boolean.FALSE;
        this.u.setValue(bool);
        return bool;
    }
}
