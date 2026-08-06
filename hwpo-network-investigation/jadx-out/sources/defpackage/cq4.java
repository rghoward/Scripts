package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cq4 implements dq4 {
    public final String a;
    public final int b;

    public cq4(String str) {
        str.getClass();
        this.a = str;
        this.b = str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq4) && xj5.a(this.a, ((cq4) obj).a);
    }

    @Override // defpackage.dq4
    public final int getId() {
        return this.b;
    }

    @Override // defpackage.dq4
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sk0.c("GymFilterCountry(name=", this.a, ")");
    }
}
