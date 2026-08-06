package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mr4 implements w23 {
    public final int a;
    public final String b;
    public final boolean c;

    public mr4(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public static mr4 a(mr4 mr4Var, boolean z) {
        int i = mr4Var.a;
        String str = mr4Var.b;
        str.getClass();
        return new mr4(i, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr4)) {
            return false;
        }
        mr4 mr4Var = (mr4) obj;
        return this.a == mr4Var.a && xj5.a(this.b, mr4Var.b) && this.c == mr4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fz.c(il.a("GymLocationFilterItemUiEntity(id=", ", name=", this.b, ", isChecked=", this.a), this.c, ")");
    }
}
