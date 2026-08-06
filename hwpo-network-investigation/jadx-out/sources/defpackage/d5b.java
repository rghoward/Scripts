package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d5b extends v65 {
    public final String b;
    public final String c;

    public d5b(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d5b.class != obj.getClass()) {
            return false;
        }
        d5b d5bVar = (d5b) obj;
        return this.a.equals(d5bVar.a) && Objects.equals(this.b, d5bVar.b) && this.c.equals(d5bVar.c);
    }

    public final int hashCode() {
        int iC = ru3.c(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
