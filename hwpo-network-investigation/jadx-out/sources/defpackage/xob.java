package defpackage;

import androidx.recyclerview.widget.m;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xob extends n50<x23> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<x23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(x23 x23Var, x23 x23Var2) {
            x23 x23Var3 = x23Var;
            x23 x23Var4 = x23Var2;
            if ((x23Var3 instanceof hq5) && (x23Var4 instanceof hq5)) {
                return x23Var3.equals(x23Var4);
            }
            if (!(x23Var3 instanceof bc8) || !(x23Var4 instanceof bc8)) {
                return false;
            }
            bc8 bc8Var = (bc8) x23Var3;
            bc8 bc8Var2 = (bc8) x23Var4;
            return bc8Var.t == bc8Var2.t && bc8Var.C == bc8Var2.C;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(x23 x23Var, x23 x23Var2) {
            x23 x23Var3 = x23Var;
            x23 x23Var4 = x23Var2;
            return !((x23Var3 instanceof hq5) && (x23Var4 instanceof hq5)) && (x23Var3 instanceof bc8) && (x23Var4 instanceof bc8) && ((bc8) x23Var3).t == ((bc8) x23Var4).t;
        }
    }

    public xob() {
        throw null;
    }
}
