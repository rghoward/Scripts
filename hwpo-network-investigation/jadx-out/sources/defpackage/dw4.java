package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class dw4 extends vx1 {
    public vx1[] r0 = new vx1[4];
    public int s0 = 0;

    public final void N(int i, cmb cmbVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.s0; i2++) {
            vx1 vx1Var = this.r0[i2];
            ArrayList<vx1> arrayList2 = cmbVar.a;
            if (!arrayList2.contains(vx1Var)) {
                arrayList2.add(vx1Var);
            }
        }
        for (int i3 = 0; i3 < this.s0; i3++) {
            rp4.a(this.r0[i3], i, arrayList, cmbVar);
        }
    }
}
