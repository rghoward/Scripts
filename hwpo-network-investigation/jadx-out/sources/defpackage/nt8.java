package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nt8 implements ko5 {
    public static final mf6<Class<?>, byte[]> j = new mf6<>(50);
    public final o30 b;
    public final ko5 c;
    public final ko5 d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final xk7 h;
    public final dva<?> i;

    public nt8(o30 o30Var, ko5 ko5Var, ko5 ko5Var2, int i, int i2, dva<?> dvaVar, Class<?> cls, xk7 xk7Var) {
        this.b = o30Var;
        this.c = ko5Var;
        this.d = ko5Var2;
        this.e = i;
        this.f = i2;
        this.i = dvaVar;
        this.g = cls;
        this.h = xk7Var;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        o30 o30Var = this.b;
        byte[] bArr = (byte[]) o30Var.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        dva<?> dvaVar = this.i;
        if (dvaVar != null) {
            dvaVar.b(messageDigest);
        }
        this.h.b(messageDigest);
        mf6<Class<?>, byte[]> mf6Var = j;
        Class<?> cls = this.g;
        byte[] bArrA = mf6Var.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(ko5.a);
            mf6Var.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        o30Var.put(bArr);
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof nt8) {
            nt8 nt8Var = (nt8) obj;
            if (this.f == nt8Var.f && this.e == nt8Var.e && l6b.b(this.i, nt8Var.i) && this.g.equals(nt8Var.g) && this.c.equals(nt8Var.c) && this.d.equals(nt8Var.d) && this.h.equals(nt8Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        dva<?> dvaVar = this.i;
        if (dvaVar != null) {
            iHashCode = (iHashCode * 31) + dvaVar.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
