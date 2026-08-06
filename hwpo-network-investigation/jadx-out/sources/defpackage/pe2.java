package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pe2 implements ko5 {
    public final ko5 b;
    public final ko5 c;

    public pe2(ko5 ko5Var, ko5 ko5Var2) {
        this.b = ko5Var;
        this.c = ko5Var2;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof pe2) {
            pe2 pe2Var = (pe2) obj;
            if (this.b.equals(pe2Var.b) && this.c.equals(pe2Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
