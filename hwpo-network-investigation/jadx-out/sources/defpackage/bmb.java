package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class bmb extends vx1 {
    public ArrayList<vx1> r0 = new ArrayList<>();

    @Override // defpackage.vx1
    public void A() {
        this.r0.clear();
        super.A();
    }

    @Override // defpackage.vx1
    public final void C(m01 m01Var) {
        super.C(m01Var);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            this.r0.get(i).C(m01Var);
        }
    }

    public void N() {
        ArrayList<vx1> arrayList = this.r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vx1 vx1Var = this.r0.get(i);
            if (vx1Var instanceof bmb) {
                ((bmb) vx1Var).N();
            }
        }
    }
}
