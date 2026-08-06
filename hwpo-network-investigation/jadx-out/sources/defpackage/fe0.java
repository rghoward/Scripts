package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends is3 {
    public final ee0 a;

    public fe0(ee0 ee0Var) {
        this.a = ee0Var;
    }

    @Override // defpackage.is3
    public final hs3 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof is3)) {
            return false;
        }
        is3 is3Var = (is3) obj;
        ee0 ee0Var = this.a;
        if (ee0Var == null) {
            return is3Var.a() == null;
        }
        return ee0Var.equals(is3Var.a());
    }

    public final int hashCode() {
        ee0 ee0Var = this.a;
        return (ee0Var == null ? 0 : ee0Var.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
