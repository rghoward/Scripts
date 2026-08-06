package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iy extends v65 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public iy(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // su6.a
    public final void b(np6.a aVar) {
        aVar.a(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iy.class != obj.getClass()) {
            return false;
        }
        iy iyVar = (iy) obj;
        return this.d == iyVar.d && this.b.equals(iyVar.b) && Objects.equals(this.c, iyVar.c) && Arrays.equals(this.e, iyVar.e);
    }

    public final int hashCode() {
        int iC = ru3.c((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
