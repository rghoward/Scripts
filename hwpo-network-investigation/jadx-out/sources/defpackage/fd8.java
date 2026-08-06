package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fd8 implements s23, ep1, r89 {
    public final boolean A;
    public final int t;
    public final int u;
    public final String v;
    public final o89 w;
    public final int x;
    public final String y;
    public final boolean z;

    public fd8(int i, int i2, String str, o89 o89Var, int i3, String str2, boolean z, boolean z2) {
        o89Var.getClass();
        this.t = i;
        this.u = i2;
        this.v = str;
        this.w = o89Var;
        this.x = i3;
        this.y = str2;
        this.z = z;
        this.A = z2;
    }

    public static fd8 d(fd8 fd8Var, int i, String str, o89 o89Var, int i2, String str2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i = fd8Var.t;
        }
        int i4 = i;
        int i5 = fd8Var.u;
        if ((i3 & 4) != 0) {
            str = fd8Var.v;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            o89Var = fd8Var.w;
        }
        o89 o89Var2 = o89Var;
        if ((i3 & 16) != 0) {
            i2 = fd8Var.x;
        }
        int i6 = i2;
        String str4 = (i3 & 32) != 0 ? fd8Var.y : str2;
        o89Var2.getClass();
        return new fd8(i4, i5, str3, o89Var2, i6, str4, z, z2);
    }

    @Override // defpackage.r89
    public final int a() {
        return this.u;
    }

    @Override // defpackage.ep1
    public final ep1 b(boolean z, boolean z2) {
        return d(this, 0, null, null, 0, null, z, z2, 63);
    }

    @Override // defpackage.ep1
    public final boolean c() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd8)) {
            return false;
        }
        fd8 fd8Var = (fd8) obj;
        return this.t == fd8Var.t && this.u == fd8Var.u && this.v.equals(fd8Var.v) && this.w == fd8Var.w && this.x == fd8Var.x && this.y.equals(fd8Var.y) && this.z == fd8Var.z && this.A == fd8Var.A;
    }

    @Override // defpackage.s23, defpackage.ep1
    public final int getId() {
        return this.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + uo2.a(ru3.c(os2.a(this.x, (this.w.hashCode() + ru3.c(os2.a(this.u, Integer.hashCode(this.t) * 31, 31), 31, this.v)) * 31, 31), 31, this.y), this.z, 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("ProgramSection(id=", ", optionId=", ", title=", this.t, this.u);
        sbB.append(this.v);
        sbB.append(", kind=");
        sbB.append(this.w);
        sbB.append(", position=");
        sbB.append(this.x);
        sbB.append(", description=");
        sbB.append(this.y);
        sbB.append(", isCompleted=");
        sbB.append(this.z);
        sbB.append(", couldCompletedStateBeChanged=");
        sbB.append(this.A);
        sbB.append(")");
        return sbB.toString();
    }
}
