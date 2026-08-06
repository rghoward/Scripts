package defpackage;

import androidx.recyclerview.widget.m;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oh9 extends n50<s23> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<s23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(s23 s23Var, s23 s23Var2) {
            s23 s23Var3 = s23Var;
            s23 s23Var4 = s23Var2;
            if ((s23Var3 instanceof fd8) && (s23Var4 instanceof fd8)) {
                return s23Var3.equals(s23Var4);
            }
            if ((s23Var3 instanceof zpa) && (s23Var4 instanceof zpa)) {
                return s23Var3.equals(s23Var4);
            }
            if ((s23Var3 instanceof un4) && (s23Var4 instanceof un4)) {
                return s23Var3.equals(s23Var4);
            }
            if ((s23Var3 instanceof h08) && (s23Var4 instanceof h08)) {
                return s23Var3.equals(s23Var4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(s23 s23Var, s23 s23Var2) {
            s23 s23Var3 = s23Var;
            s23 s23Var4 = s23Var2;
            if ((s23Var3 instanceof fd8) && (s23Var4 instanceof fd8)) {
                return ((fd8) s23Var3).t == ((fd8) s23Var4).t;
            }
            if ((s23Var3 instanceof zpa) && (s23Var4 instanceof zpa)) {
                return ((zpa) s23Var3).t == ((zpa) s23Var4).t;
            }
            if ((s23Var3 instanceof un4) && (s23Var4 instanceof un4)) {
                return ((un4) s23Var3).t == ((un4) s23Var4).t;
            }
            return (s23Var3 instanceof h08) && (s23Var4 instanceof h08) && ((h08) s23Var3).t == ((h08) s23Var4).t;
        }
    }

    public oh9() {
        throw null;
    }
}
