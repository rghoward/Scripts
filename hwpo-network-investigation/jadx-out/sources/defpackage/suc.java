package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class suc {
    public final String a;
    public final String b;
    public final boolean c;

    public suc(String str, boolean z) {
        a78.d(str);
        this.a = str;
        a78.d("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suc)) {
            return false;
        }
        suc sucVar = (suc) obj;
        return te7.a(this.a, sucVar.a) && te7.a(this.b, sucVar.b) && te7.a(null, null) && this.c == sucVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a78.g(null);
        throw null;
    }
}
