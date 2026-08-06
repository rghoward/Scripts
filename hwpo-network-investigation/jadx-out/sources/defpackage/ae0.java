package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0<T> {
    public final T a;
    public final o98 b;
    public final re0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public ae0(Object obj, o98 o98Var, re0 re0Var) {
        if (obj == 0) {
            ac4.c("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = o98Var;
        this.c = re0Var;
    }

    public final re0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae0)) {
            return false;
        }
        ae0 ae0Var = (ae0) obj;
        if (!this.a.equals(ae0Var.a) || !this.b.equals(ae0Var.b)) {
            return false;
        }
        re0 re0Var = this.c;
        if (re0Var == null) {
            return ae0Var.a() == null;
        }
        return re0Var.equals(ae0Var.a());
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        re0 re0Var = this.c;
        return ((re0Var == null ? 0 : re0Var.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
