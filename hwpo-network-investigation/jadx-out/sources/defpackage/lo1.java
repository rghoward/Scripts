package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 implements ra3 {
    public final iw a;
    public final int b;

    public lo1(String str, int i) {
        this(new iw(str), i);
    }

    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        boolean zE = td3Var.e();
        iw iwVar = this.a;
        if (zE) {
            td3Var.f(td3Var.d, td3Var.e, iwVar.u);
        } else {
            td3Var.f(td3Var.b, td3Var.c, iwVar.u);
        }
        int iD = td3Var.d();
        int i = this.b;
        int iG = uh8.g(i > 0 ? (iD + i) - 1 : (iD + i) - iwVar.u.length(), 0, td3Var.a.a());
        td3Var.h(iG, iG);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo1)) {
            return false;
        }
        lo1 lo1Var = (lo1) obj;
        return xj5.a(this.a.u, lo1Var.a.u) && this.b == lo1Var.b;
    }

    public final int hashCode() {
        return (this.a.u.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.u);
        sb.append("', newCursorPosition=");
        return e44.a(sb, this.b, ')');
    }

    public lo1(iw iwVar, int i) {
        this.a = iwVar;
        this.b = i;
    }
}
