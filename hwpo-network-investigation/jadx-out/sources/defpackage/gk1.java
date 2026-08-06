package defpackage;

import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 {
    public final long a;
    public final Long b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final LocalDateTime f;
    public final ps6 g;
    public final List<gr6> h;
    public final List<m89> i;
    public final xc9 j;

    public gk1(long j, Long l, String str, boolean z, boolean z2, LocalDateTime localDateTime, ps6 ps6Var, List<gr6> list, List<m89> list2, xc9 xc9Var) {
        this.a = j;
        this.b = l;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = localDateTime;
        this.g = ps6Var;
        this.h = list;
        this.i = list2;
        this.j = xc9Var;
    }

    public static gk1 a(gk1 gk1Var, Long l, boolean z, boolean z2, ArrayList arrayList, int i) {
        long j = gk1Var.a;
        if ((i & 2) != 0) {
            l = gk1Var.b;
        }
        Long l2 = l;
        String str = gk1Var.c;
        boolean z3 = (i & 8) != 0 ? gk1Var.d : z;
        boolean z4 = (i & 16) != 0 ? gk1Var.e : z2;
        LocalDateTime localDateTime = gk1Var.f;
        ps6 ps6Var = gk1Var.g;
        List<gr6> list = gk1Var.h;
        List<m89> list2 = (i & 256) != 0 ? gk1Var.i : arrayList;
        xc9 xc9Var = gk1Var.j;
        gk1Var.getClass();
        return new gk1(j, l2, str, z3, z4, localDateTime, ps6Var, list, list2, xc9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk1)) {
            return false;
        }
        gk1 gk1Var = (gk1) obj;
        return this.a == gk1Var.a && xj5.a(this.b, gk1Var.b) && xj5.a(this.c, gk1Var.c) && this.d == gk1Var.d && this.e == gk1Var.e && this.f.equals(gk1Var.f) && this.g.equals(gk1Var.g) && this.h.equals(gk1Var.h) && this.i.equals(gk1Var.i) && this.j == gk1Var.j;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return this.j.hashCode() + ho2.a(ho2.a((this.g.hashCode() + ((this.f.hashCode() + uo2.a(uo2.a((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.d, 31), this.e, 31)) * 31)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "CommentModel(id=" + this.a + ", localId=" + this.b + ", text=" + this.c + ", isMine=" + this.d + ", isRead=" + this.e + ", createdAt=" + this.f + ", author=" + this.g + ", mentions=" + this.h + ", attachments=" + this.i + ", sendingStatus=" + this.j + ")";
    }
}
