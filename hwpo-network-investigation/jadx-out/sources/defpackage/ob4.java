package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ob4 implements Comparable<ob4> {
    public static final ob4 A;
    public static final ob4 B;
    public static final List<ob4> C;
    public static final ob4 u;
    public static final ob4 v;
    public static final ob4 w;
    public static final ob4 x;
    public static final ob4 y;
    public static final ob4 z;
    public final int t;

    static {
        ob4 ob4Var = new ob4(100);
        ob4 ob4Var2 = new ob4(200);
        ob4 ob4Var3 = new ob4(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
        ob4 ob4Var4 = new ob4(CarouselScreenFragment.CAROUSEL_ANIMATION_MS);
        u = ob4Var4;
        ob4 ob4Var5 = new ob4(500);
        ob4 ob4Var6 = new ob4(600);
        v = ob4Var6;
        ob4 ob4Var7 = new ob4(700);
        ob4 ob4Var8 = new ob4(800);
        w = ob4Var8;
        ob4 ob4Var9 = new ob4(900);
        x = ob4Var3;
        y = ob4Var4;
        z = ob4Var5;
        A = ob4Var6;
        B = ob4Var7;
        C = ws0.i(ob4Var, ob4Var2, ob4Var3, ob4Var4, ob4Var5, ob4Var6, ob4Var7, ob4Var8, ob4Var9);
    }

    public ob4(int i) {
        this.t = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        vc5.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ob4 ob4Var) {
        return xj5.b(this.t, ob4Var.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ob4) {
            return this.t == ((ob4) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t;
    }

    public final String toString() {
        return e44.a(new StringBuilder("FontWeight(weight="), this.t, ')');
    }
}
