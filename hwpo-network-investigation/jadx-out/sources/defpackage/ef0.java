package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 extends exa {
    public final String a;
    public final byte[] b;
    public final o98 c;

    public ef0(String str, byte[] bArr, o98 o98Var) {
        this.a = str;
        this.b = bArr;
        this.c = o98Var;
    }

    @Override // defpackage.exa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.exa
    public final byte[] b() {
        return this.b;
    }

    @Override // defpackage.exa
    public final o98 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof exa)) {
            return false;
        }
        exa exaVar = (exa) obj;
        if (this.a.equals(exaVar.a())) {
            return Arrays.equals(this.b, exaVar instanceof ef0 ? ((ef0) exaVar).b : exaVar.b()) && this.c.equals(exaVar.c());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }
}
