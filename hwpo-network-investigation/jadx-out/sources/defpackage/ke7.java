package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke7 implements ko5 {
    public final Object b;

    public ke7(Object obj) {
        ov9.d(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(ko5.a));
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof ke7) {
            return this.b.equals(((ke7) obj).b);
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
