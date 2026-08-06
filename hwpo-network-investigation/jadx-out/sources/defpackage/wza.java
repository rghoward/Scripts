package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wza {
    public final qa4 a;
    public final ob4 b;
    public final int c;
    public final int d;
    public final Object e;

    public wza(qa4 qa4Var, ob4 ob4Var, int i, int i2, Object obj) {
        this.a = qa4Var;
        this.b = ob4Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wza)) {
            return false;
        }
        wza wzaVar = (wza) obj;
        return xj5.a(this.a, wzaVar.a) && xj5.a(this.b, wzaVar.b) && this.c == wzaVar.c && this.d == wzaVar.d && xj5.a(this.e, wzaVar.e);
    }

    public final int hashCode() {
        qa4 qa4Var = this.a;
        int iA = os2.a(this.d, os2.a(this.c, (((qa4Var == null ? 0 : qa4Var.hashCode()) * 31) + this.b.t) * 31, 31), 31);
        Object obj = this.e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
