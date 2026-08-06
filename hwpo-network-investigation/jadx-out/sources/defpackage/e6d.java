package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e6d extends k7d {
    public final ul8 a;
    public final ul8 b;
    public final UUID c;
    public final long d = -1;

    public /* synthetic */ e6d(ul8 ul8Var, ul8 ul8Var2, UUID uuid) {
        this.a = ul8Var;
        this.b = ul8Var2;
        this.c = uuid;
    }

    @Override // defpackage.k7d
    public final k95 a() {
        return this.a;
    }

    @Override // defpackage.k7d
    public final k95 b() {
        return this.b;
    }

    @Override // defpackage.k7d
    public final UUID c() {
        return this.c;
    }

    @Override // defpackage.k7d
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7d)) {
            return false;
        }
        k7d k7dVar = (k7d) obj;
        return this.a.equals(k7dVar.a()) && this.b.equals(k7dVar.b()) && this.c.equals(k7dVar.c()) && this.d == k7dVar.d();
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ (iHashCode * 1000003);
    }
}
