package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bc8 implements x23 {
    public final List<s23> A;
    public final LinkedHashSet<Integer> B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int t;
    public final yz7 u;
    public final boolean v;
    public final Integer w;
    public final String x;
    public final long y;
    public final String z;

    /* JADX WARN: Multi-variable type inference failed */
    public bc8(int i, yz7 yz7Var, boolean z, Integer num, String str, long j, String str2, List<? extends s23> list, LinkedHashSet<Integer> linkedHashSet, boolean z2, boolean z3, boolean z4) {
        this.t = i;
        this.u = yz7Var;
        this.v = z;
        this.w = num;
        this.x = str;
        this.y = j;
        this.z = str2;
        this.A = list;
        this.B = linkedHashSet;
        this.C = z2;
        this.D = z3;
        this.E = z4;
    }

    public static bc8 a(bc8 bc8Var, ArrayList arrayList, boolean z, int i) {
        int i2 = bc8Var.t;
        yz7 yz7Var = bc8Var.u;
        boolean z2 = bc8Var.v;
        Integer num = bc8Var.w;
        String str = bc8Var.x;
        long j = bc8Var.y;
        String str2 = bc8Var.z;
        LinkedHashSet<Integer> linkedHashSet = bc8Var.B;
        boolean z3 = (i & 512) != 0 ? bc8Var.C : z;
        boolean z4 = bc8Var.D;
        boolean z5 = bc8Var.E;
        bc8Var.getClass();
        return new bc8(i2, yz7Var, z2, num, str, j, str2, arrayList, linkedHashSet, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc8)) {
            return false;
        }
        bc8 bc8Var = (bc8) obj;
        return this.t == bc8Var.t && this.u.equals(bc8Var.u) && this.v == bc8Var.v && xj5.a(this.w, bc8Var.w) && xj5.a(this.x, bc8Var.x) && this.y == bc8Var.y && this.z.equals(bc8Var.z) && this.A.equals(bc8Var.A) && this.B.equals(bc8Var.B) && this.C == bc8Var.C && this.D == bc8Var.D && this.E == bc8Var.E;
    }

    public final int hashCode() {
        int iA = uo2.a((this.u.hashCode() + (Integer.hashCode(this.t) * 31)) * 31, this.v, 31);
        Integer num = this.w;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.x;
        return Boolean.hashCode(this.E) + uo2.a(uo2.a((this.B.hashCode() + ho2.a(ru3.c(al.c(this.y, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.z), 31, this.A)) * 31, this.C, 31), this.D, 31);
    }

    public final String toString() {
        return "Program(id=" + this.t + ", plan=" + this.u + ", canReschedule=" + this.v + ", day=" + this.w + ", dayText=" + this.x + ", date=" + this.y + ", dateText=" + this.z + ", sections=" + this.A + ", sectionImages=" + this.B + ", isCheckmarkVisible=" + this.C + ", canNavigateBack=" + this.D + ", canNavigateForward=" + this.E + ")";
    }
}
