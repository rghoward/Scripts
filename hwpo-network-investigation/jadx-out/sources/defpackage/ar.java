package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ar extends bx8 implements uw8 {
    public sw8 R;
    public xw8 S;

    @Override // ox6.c
    public final void V1() {
        sw8 sw8Var = this.R;
        if (sw8Var != null) {
            z0();
            vw8 vw8Var = sw8Var.w;
            xw8 xw8Var = (xw8) vw8Var.a.get(this);
            if (xw8Var != null) {
                xw8Var.c();
                LinkedHashMap linkedHashMap = vw8Var.a;
                xw8 xw8Var2 = (xw8) linkedHashMap.get(this);
                if (xw8Var2 != null) {
                }
                linkedHashMap.remove(this);
                sw8Var.v.add(xw8Var);
            }
        }
    }

    @Override // defpackage.uw8
    public final void z0() {
        this.S = null;
        b73.a(this);
    }
}
