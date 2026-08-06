package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface e1a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final C0074a a = new C0074a();

        /* JADX INFO: renamed from: e1a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0074a implements e1a {
            @Override // defpackage.e1a
            public final d27 a(int i, int i2, uf5 uf5Var) {
                int i3;
                if (i2 - i < 0 || (i3 = uf5Var.b) == 0) {
                    return vf5.a;
                }
                fg5 fg5VarJ = uh8.j(0, i3);
                int i4 = fg5VarJ.t;
                int i5 = fg5VarJ.u;
                int iA = -1;
                if (i4 <= i5) {
                    while (uf5Var.a(i4) <= i) {
                        iA = uf5Var.a(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (iA == -1) {
                    return vf5.a;
                }
                d27 d27Var = vf5.a;
                d27 d27Var2 = new d27(1);
                d27Var2.c(iA);
                return d27Var2;
            }

            @Override // defpackage.e1a
            public final int b(ArrayList arrayList, int i, int i2, int i3, int i4) {
                Object obj;
                int i5;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i6);
                    if (((uw5) obj).getIndex() != i) {
                        break;
                    }
                    i6++;
                }
                uw5 uw5Var = (uw5) obj;
                if (uw5Var != null) {
                    long jN = uw5Var.n(0);
                    i5 = (int) (uw5Var.l() ? jN & 4294967295L : jN >> 32);
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                int iMax = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
                return i5 != Integer.MIN_VALUE ? Math.min(iMax, i5 - i2) : iMax;
            }
        }
    }

    d27 a(int i, int i2, uf5 uf5Var);

    int b(ArrayList arrayList, int i, int i2, int i3, int i4);
}
