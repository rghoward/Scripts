package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ll0 {
    public final ArrayList<vx1> a = new ArrayList<>();
    public final a b = new a();
    public final wx1 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public vx1.a a;
        public vx1.a b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
    }

    public ll0(wx1 wx1Var) {
        this.c = wx1Var;
    }

    public final boolean a(int i, b bVar, vx1 vx1Var) {
        vx1.a[] aVarArr = vx1Var.U;
        int[] iArr = vx1Var.t;
        vx1.a aVar = aVarArr[0];
        a aVar2 = this.b;
        aVar2.a = aVar;
        aVar2.b = aVarArr[1];
        aVar2.c = vx1Var.o();
        aVar2.d = vx1Var.i();
        aVar2.i = false;
        aVar2.j = i;
        vx1.a aVar3 = aVar2.a;
        vx1.a aVar4 = vx1.a.v;
        boolean z = aVar3 == aVar4;
        boolean z2 = aVar2.b == aVar4;
        boolean z3 = z && vx1Var.Y > 0.0f;
        boolean z4 = z2 && vx1Var.Y > 0.0f;
        vx1.a aVar5 = vx1.a.t;
        if (z3 && iArr[0] == 4) {
            aVar2.a = aVar5;
        }
        if (z4 && iArr[1] == 4) {
            aVar2.b = aVar5;
        }
        ((ConstraintLayout.b) bVar).b(vx1Var, aVar2);
        vx1Var.K(aVar2.e);
        vx1Var.H(aVar2.f);
        vx1Var.E = aVar2.h;
        int i2 = aVar2.g;
        vx1Var.c0 = i2;
        vx1Var.E = i2 > 0;
        aVar2.j = 0;
        return aVar2.i;
    }

    public final void b(wx1 wx1Var, int i, int i2, int i3) {
        wx1Var.getClass();
        int i4 = wx1Var.d0;
        int i5 = wx1Var.e0;
        wx1Var.d0 = 0;
        wx1Var.e0 = 0;
        wx1Var.K(i2);
        wx1Var.H(i3);
        if (i4 < 0) {
            wx1Var.d0 = 0;
        } else {
            wx1Var.d0 = i4;
        }
        if (i5 < 0) {
            wx1Var.e0 = 0;
        } else {
            wx1Var.e0 = i5;
        }
        wx1 wx1Var2 = this.c;
        wx1Var2.u0 = i;
        wx1Var2.N();
    }

    public final void c(wx1 wx1Var) {
        ArrayList<vx1> arrayList = this.a;
        arrayList.clear();
        int size = wx1Var.r0.size();
        for (int i = 0; i < size; i++) {
            vx1 vx1Var = wx1Var.r0.get(i);
            vx1.a[] aVarArr = vx1Var.U;
            vx1.a aVar = aVarArr[0];
            vx1.a aVar2 = vx1.a.v;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                arrayList.add(vx1Var);
            }
        }
        wx1Var.t0.b = true;
    }
}
