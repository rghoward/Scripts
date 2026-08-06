package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface hl6 extends qj5 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements gl6 {
        public final int a;
        public final int b;
        public final Map<ei, Integer> c;
        public final oh4<wy8, g2b> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ hl6 f;
        public final /* synthetic */ oh4<jz7.a, g2b> g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, hl6 hl6Var, oh4<? super jz7.a, g2b> oh4Var2) {
            this.e = i;
            this.f = hl6Var;
            this.g = oh4Var2;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = oh4Var;
        }

        @Override // defpackage.gl6
        public final int h() {
            return this.b;
        }

        @Override // defpackage.gl6
        public final int j() {
            return this.a;
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return this.c;
        }

        @Override // defpackage.gl6
        public final void m() {
            hl6 hl6Var = this.f;
            boolean z = hl6Var instanceof df6;
            oh4<jz7.a, g2b> oh4Var = this.g;
            if (z) {
                oh4Var.invoke(((df6) hl6Var).E);
                return;
            }
            oh4Var.invoke(new mp9(this.e, hl6Var.getLayoutDirection(), hl6Var.getDensity(), hl6Var.N0()));
        }

        @Override // defpackage.gl6
        public final oh4<wy8, g2b> n() {
            return this.d;
        }
    }

    default gl6 i1(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uc5.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, oh4Var, this, oh4Var2);
    }

    default gl6 y0(int i, int i2, Map<ei, Integer> map, oh4<? super jz7.a, g2b> oh4Var) {
        return i1(i, i2, map, null, oh4Var);
    }
}
