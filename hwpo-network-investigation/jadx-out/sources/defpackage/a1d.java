package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a1d {
    public final boolean a;
    public final List b;
    public final p0c c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ivc k;

    public a1d(boolean z, k95 k95Var, p0c p0cVar, String str, String str2, k95 k95Var2, k95 k95Var3, boolean z2, boolean z3, boolean z4, ivc ivcVar) {
        k95Var.getClass();
        p0cVar.getClass();
        str.getClass();
        str2.getClass();
        k95Var2.getClass();
        k95Var3.getClass();
        ivcVar.getClass();
        this.a = z;
        this.b = k95Var;
        this.c = p0cVar;
        this.d = str;
        this.e = str2;
        this.f = k95Var2;
        this.g = k95Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = ivcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1d)) {
            return false;
        }
        a1d a1dVar = (a1d) obj;
        return this.a == a1dVar.a && xj5.a(this.b, a1dVar.b) && xj5.a(this.c, a1dVar.c) && xj5.a(this.d, a1dVar.d) && xj5.a(this.e, a1dVar.e) && xj5.a(this.f, a1dVar.f) && xj5.a(this.g, a1dVar.g) && this.h == a1dVar.h && this.i == a1dVar.i && this.j == a1dVar.j && xj5.a(this.k, a1dVar.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        p0c p0cVar = this.c;
        int length3 = String.valueOf(p0cVar).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        ivc ivcVar = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(ivcVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(p0cVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(ivcVar);
        sb.append(")");
        return sb.toString();
    }
}
