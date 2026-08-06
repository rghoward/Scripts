package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eo4 {
    public final int a;
    public final LocalDate b;
    public final fo4 c;

    public eo4(int i, LocalDate localDate, fo4 fo4Var) {
        this.a = i;
        this.b = localDate;
        this.c = fo4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo4)) {
            return false;
        }
        eo4 eo4Var = (eo4) obj;
        return this.a == eo4Var.a && this.b.equals(eo4Var.b) && this.c == eo4Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "GowodLaunchArgument(programId=" + this.a + ", date=" + this.b + ", type=" + this.c + ")";
    }
}
