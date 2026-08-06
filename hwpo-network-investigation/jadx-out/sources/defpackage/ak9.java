package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ak9 implements ra3 {
    public final iw a;
    public final int b;

    public ak9(String str, int i) {
        this.a = new iw(str);
        this.b = i;
    }

    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        boolean zE = td3Var.e();
        iw iwVar = this.a;
        if (zE) {
            int i = td3Var.d;
            int i2 = td3Var.e;
            String str = iwVar.u;
            String str2 = iwVar.u;
            td3Var.f(i, i2, str);
            if (str2.length() > 0) {
                td3Var.g(i, str2.length() + i);
            }
        } else {
            int i3 = td3Var.b;
            int i4 = td3Var.c;
            String str3 = iwVar.u;
            String str4 = iwVar.u;
            td3Var.f(i3, i4, str3);
            if (str4.length() > 0) {
                td3Var.g(i3, str4.length() + i3);
            }
        }
        int iD = td3Var.d();
        int i5 = this.b;
        int iG = uh8.g(i5 > 0 ? (iD + i5) - 1 : (iD + i5) - iwVar.u.length(), 0, td3Var.a.a());
        td3Var.h(iG, iG);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak9)) {
            return false;
        }
        ak9 ak9Var = (ak9) obj;
        return xj5.a(this.a.u, ak9Var.a.u) && this.b == ak9Var.b;
    }

    public final int hashCode() {
        return (this.a.u.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.u);
        sb.append("', newCursorPosition=");
        return e44.a(sb, this.b, ')');
    }
}
