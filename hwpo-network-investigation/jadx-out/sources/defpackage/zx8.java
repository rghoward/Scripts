package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zx8 extends b72 {
    @Override // defpackage.b72
    public final zx8 a(e72 e72Var, e72 e72Var2, e72 e72Var3, e72 e72Var4) {
        return new zx8(e72Var, e72Var2, e72Var3, e72Var4);
    }

    @Override // defpackage.b72
    public final dm7 c(long j, float f, float f2, float f3, float f4, tq5 tq5Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new dm7.b(tk8.a(0L, j));
        }
        sk8 sk8VarA = tk8.a(0L, j);
        tq5 tq5Var2 = tq5.t;
        float f5 = tq5Var == tq5Var2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        float f6 = tq5Var == tq5Var2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        float f7 = tq5Var == tq5Var2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = tq5Var == tq5Var2 ? f4 : f3;
        return new dm7.c(new vx8(sk8VarA.a, sk8VarA.b, sk8VarA.c, sk8VarA.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx8)) {
            return false;
        }
        zx8 zx8Var = (zx8) obj;
        return xj5.a(this.a, zx8Var.a) && xj5.a(this.b, zx8Var.b) && xj5.a(this.c, zx8Var.c) && xj5.a(this.d, zx8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
