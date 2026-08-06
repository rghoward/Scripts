package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 extends q7b {
    public final int a;
    public final String b;

    public nr0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.q7b
    public final int a() {
        return this.a;
    }

    @Override // defpackage.q7b
    public final p7b b(String str, vn0 vn0Var) {
        int i = this.a;
        str.getClass();
        try {
            js7<Integer, Integer> js7VarG = wn0.g(str);
            int iIntValue = js7VarG.t.intValue();
            int iIntValue2 = js7VarG.u.intValue();
            if (iIntValue != 0 && iIntValue2 != 0) {
                return iIntValue < iIntValue2 ? new p7b.a(i, this.b) : new p7b.b(i);
            }
            return new p7b.a(i, null);
        } catch (NumberFormatException unused) {
            return new p7b.a(i, null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr0)) {
            return false;
        }
        nr0 nr0Var = (nr0) obj;
        return this.a == nr0Var.a && xj5.a(this.b, nr0Var.b);
    }

    public final int hashCode() {
        int iA = uo2.a(Integer.hashCode(this.a) * 31, false, 31);
        String str = this.b;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BloodPressureIsCorrect(validatingId=" + this.a + ", emptyInputIsAllowed=false, errorText=" + this.b + ")";
    }
}
