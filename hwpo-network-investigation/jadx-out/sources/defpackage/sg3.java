package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sg3 implements ko5 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final ko5 g;
    public final Map<Class<?>, dva<?>> h;
    public final xk7 i;
    public int j;

    public sg3(Object obj, ko5 ko5Var, int i, int i2, Map<Class<?>, dva<?>> map, Class<?> cls, Class<?> cls2, xk7 xk7Var) {
        ov9.d(obj, "Argument must not be null");
        this.b = obj;
        ov9.d(ko5Var, "Signature must not be null");
        this.g = ko5Var;
        this.c = i;
        this.d = i2;
        ov9.d(map, "Argument must not be null");
        this.h = map;
        ov9.d(cls, "Resource class must not be null");
        this.e = cls;
        ov9.d(cls2, "Transcode class must not be null");
        this.f = cls2;
        ov9.d(xk7Var, "Argument must not be null");
        this.i = xk7Var;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof sg3) {
            sg3 sg3Var = (sg3) obj;
            if (this.b.equals(sg3Var.b) && this.g.equals(sg3Var.g) && this.d == sg3Var.d && this.c == sg3Var.c && this.h.equals(sg3Var.h) && this.e.equals(sg3Var.e) && this.f.equals(sg3Var.f) && this.i.equals(sg3Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
