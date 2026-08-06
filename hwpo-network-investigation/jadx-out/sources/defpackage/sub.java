package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sub {
    public final ux a;
    public final fu3 b;

    public /* synthetic */ sub(ux uxVar, fu3 fu3Var) {
        this.a = uxVar;
        this.b = fu3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sub)) {
            return false;
        }
        sub subVar = (sub) obj;
        return te7.a(this.a, subVar.a) && te7.a(this.b, subVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        te7.a aVar = new te7.a(this);
        aVar.a(this.a, "key");
        aVar.a(this.b, "feature");
        return aVar.toString();
    }
}
