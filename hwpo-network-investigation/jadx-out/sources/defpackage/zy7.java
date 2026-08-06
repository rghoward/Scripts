package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zy7 implements su6.a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public zy7(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static zy7 d(pt7 pt7Var) {
        int iM = pt7Var.m();
        String strN = fv6.n(pt7Var.x(pt7Var.m(), StandardCharsets.US_ASCII));
        String strX = pt7Var.x(pt7Var.m(), StandardCharsets.UTF_8);
        int iM2 = pt7Var.m();
        int iM3 = pt7Var.m();
        int iM4 = pt7Var.m();
        int iM5 = pt7Var.m();
        int iM6 = pt7Var.m();
        byte[] bArr = new byte[iM6];
        pt7Var.k(bArr, 0, iM6);
        return new zy7(iM, strN, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // su6.a
    public final void b(np6.a aVar) {
        aVar.a(this.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy7.class != obj.getClass()) {
            return false;
        }
        zy7 zy7Var = (zy7) obj;
        return this.a == zy7Var.a && this.b.equals(zy7Var.b) && this.c.equals(zy7Var.c) && this.d == zy7Var.d && this.e == zy7Var.e && this.f == zy7Var.f && this.g == zy7Var.g && Arrays.equals(this.h, zy7Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((ru3.c(ru3.c((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
