package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zs1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [erb, ys1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [vi4] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List a(cs9 cs9Var, Integer num, int i, Integer num2) {
        int iG;
        int iS;
        t27<Object> t27VarB;
        if (cs9Var.w || cs9Var.p() == 0) {
            return hf3.t;
        }
        ?? erbVar = new erb(cs9Var);
        if (num2 != null) {
            iG = num2.intValue();
        } else {
            iG = cs9Var.v;
            if (iG < 0) {
                iG = cs9Var.G(cs9Var.b, i);
            }
        }
        if (num == 0) {
            int iP = cs9Var.i - cs9Var.P(cs9Var.b, cs9Var.r(i));
            e27<t27<Object>> e27Var = cs9Var.s;
            num = Integer.valueOf(iP + ((e27Var == null || (t27VarB = e27Var.b(i)) == null) ? 0 : t27VarB.b));
        }
        int iR = cs9Var.r(i) * 5;
        int[] iArr = cs9Var.b;
        if (iR < iArr.length) {
            iS = cs9Var.s(i);
        } else {
            int iG2 = iG >= 0 ? cs9Var.G(iArr, iG) : iG;
            iS = cs9Var.s(iG);
            int i2 = iG;
            iG = iG2;
            i = i2;
        }
        while (i >= 0) {
            erbVar.d(iS, (cs9Var.b[(cs9Var.r(i) * 5) + 1] & 536870912) != 0 ? cs9Var.t(i) : jt1.a.a, cs9Var.Q(i), num);
            num = cs9Var.b(i);
            if (iG >= 0) {
                int iG3 = cs9Var.G(cs9Var.b, iG);
                iS = cs9Var.s(iG);
                int i3 = iG;
                iG = iG3;
                i = i3;
            } else {
                i = iG;
            }
        }
        return erbVar.a;
    }

    public static final Integer b(yr9 yr9Var, yt1 yt1Var, int i, int i2) {
        Integer numB;
        int[] iArr = yr9Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iA = bs9.a(iArr, i) + i;
            if (yr9Var.j(i) && yr9Var.i(i) == 206 && xj5.a(yr9Var.p(iArr, i), pt1.e)) {
                Object objH = yr9Var.h(i, 0);
                jm8 jm8Var = objH instanceof jm8 ? (jm8) objH : null;
                im8 im8VarC = jm8Var != null ? jm8Var.c() : null;
                bj4.a aVar = im8VarC instanceof bj4.a ? (bj4.a) im8VarC : null;
                if (aVar != null && aVar.t == yt1Var) {
                    return Integer.valueOf(i);
                }
            }
            if (yr9Var.d(i) && (numB = b(yr9Var, yt1Var, i + 1, iA)) != null) {
                return Integer.valueOf(numB.intValue());
            }
            i = iA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ii8, ys1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList c(yr9 yr9Var, int i, Integer num) {
        ?? ii8Var = new ii8(yr9Var);
        i = yr9Var.q(i);
        vi4 vi4VarA = yr9Var.a(i);
        while (i >= 0) {
            ii8Var.d(yr9Var.i(i), yr9Var.k(i) ? yr9Var.p(yr9Var.b, i) : jt1.a.a, yr9Var.a.o1(i), num);
            if (i >= 0) {
                vi4 vi4Var = vi4VarA;
                vi4VarA = yr9Var.a(i);
                i = yr9Var.q(i);
                num = vi4Var;
            } else {
                num = vi4VarA;
            }
        }
        return ii8Var.a;
    }
}
