package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m61 {
    public final int a;
    public final int b;
    public final String c;
    public final vc8 d;
    public final bd8 e;

    public m61(int i, int i2, String str, vc8 vc8Var, bd8 bd8Var) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = vc8Var;
        this.e = bd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m61)) {
            return false;
        }
        m61 m61Var = (m61) obj;
        return this.a == m61Var.a && this.b == m61Var.b && xj5.a(this.c, m61Var.c) && xj5.a(this.d, m61Var.d) && this.e.equals(m61Var.e);
    }

    public final int hashCode() {
        int iC = ru3.c(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        vc8 vc8Var = this.d;
        return this.e.hashCode() + ((iC + (vc8Var == null ? 0 : vc8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("ChallengeEntryDetails(scheduleId=", ", sectionId=", ", title=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", programPerformance=");
        sbB.append(this.d);
        sbB.append(", programScore=");
        sbB.append(this.e);
        sbB.append(")");
        return sbB.toString();
    }
}
