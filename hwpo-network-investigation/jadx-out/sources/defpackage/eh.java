package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eh implements el0 {
    public static final a Companion = new a();
    public final List<u23> a;
    public final List<yp4.a> b;
    public final oq4.b c;
    public final oq4.a d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final vz7 i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eh(List<? extends u23> list, List<yp4.a> list2, oq4.b bVar, oq4.a aVar, boolean z, boolean z2, boolean z3, boolean z4, vz7 vz7Var) {
        this.a = list;
        this.b = list2;
        this.c = bVar;
        this.d = aVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = vz7Var;
    }

    public static eh a(eh ehVar, List list, List list2, oq4.b bVar, oq4.a aVar, boolean z, boolean z2, boolean z3, boolean z4, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            list = ehVar.a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = ehVar.b;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            bVar = ehVar.c;
        }
        oq4.b bVar2 = bVar;
        if ((i & 8) != 0) {
            aVar = ehVar.d;
        }
        oq4.a aVar2 = aVar;
        if ((i & 16) != 0) {
            z = ehVar.e;
        }
        boolean z5 = z;
        boolean z6 = (i & 32) != 0 ? ehVar.f : z2;
        boolean z7 = (i & 64) != 0 ? ehVar.g : z3;
        boolean z8 = (i & 128) != 0 ? ehVar.h : z4;
        vz7 vz7Var2 = (i & 256) != 0 ? ehVar.i : vz7Var;
        ehVar.getClass();
        list3.getClass();
        list4.getClass();
        return new eh(list3, list4, bVar2, aVar2, z5, z6, z7, z8, vz7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return this.a.equals(ehVar.a) && this.b.equals(ehVar.b) && xj5.a(this.c, ehVar.c) && xj5.a(this.d, ehVar.d) && this.e == ehVar.e && this.f == ehVar.f && this.g == ehVar.g && this.h == ehVar.h && this.i.equals(ehVar.i);
    }

    public final int hashCode() {
        int iA = ho2.a(this.a.hashCode() * 31, 31, this.b);
        oq4.b bVar = this.c;
        int iHashCode = (iA + (bVar == null ? 0 : bVar.t.hashCode())) * 31;
        oq4.a aVar = this.d;
        return this.i.hashCode() + uo2.a(uo2.a(uo2.a(uo2.a((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, this.e, 31), this.f, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AffiliatedGymListViewState(listItems=");
        sb.append(this.a);
        sb.append(", gyms=");
        sb.append(this.b);
        sb.append(", selectedCountryFilter=");
        sb.append(this.c);
        sb.append(", selectedCityFilter=");
        sb.append(this.d);
        sb.append(", isProgress=");
        e4.a(sb, this.e, ", isPaginationProgress=", this.f, ", hasNextPage=");
        e4.a(sb, this.g, ", cancelSearchVisibility=", this.h, ", placeholderState=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
