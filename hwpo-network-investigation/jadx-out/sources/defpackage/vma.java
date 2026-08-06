package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vma extends q7b {
    public final int a;
    public final boolean b;

    public vma(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.q7b
    public final int a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    @Override // defpackage.q7b
    public final p7b b(String str, vn0 vn0Var) {
        boolean z;
        str.getClass();
        boolean zEquals = str.equals("00:00");
        int i = this.a;
        if (zEquals) {
            return new p7b.a(i, null);
        }
        if (str.length() != 5) {
            z = false;
        } else {
            Character chValueOf = 2 < str.length() ? Character.valueOf(str.charAt(2)) : null;
            if (chValueOf != null && chValueOf.charValue() == ':') {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z2 = this.b;
        if (!z2 || str.length() <= 0 || z) {
            return (z2 || z) ? new p7b.b(i) : new p7b.a(i, null);
        }
        return new p7b.a(i, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vma)) {
            return false;
        }
        vma vmaVar = (vma) obj;
        return this.a == vmaVar.a && this.b == vmaVar.b;
    }

    public final int hashCode() {
        return uo2.a(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "TimeIsCorrect(validatingId=" + this.a + ", emptyInputIsAllowed=" + this.b + ", errorText=null)";
    }
}
