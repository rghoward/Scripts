package defpackage;

import j$.time.LocalDate;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mab implements lab {
    public final a0a a;
    public final j74 b;
    public LocalDate c;
    public String d;

    public mab() {
        a0a a0aVarB = b0a.b(null);
        this.a = a0aVarB;
        this.b = new j74(a0aVarB);
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        this.c = localDateNow;
        this.d = "less_or_eq";
    }

    @Override // defpackage.lab
    public final void a(ArrayList arrayList, boolean z, boolean z2) {
        ab1 ab1Var = new ab1(arrayList, z, z2);
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, ab1Var);
    }

    @Override // defpackage.lab
    public final bb1 b(c13 c13Var) {
        psa psaVar;
        psa psaVar2;
        c13Var.getClass();
        int iOrdinal = c13Var.ordinal();
        LocalDate localDateNow = null;
        a0a a0aVar = this.a;
        if (iOrdinal == 0) {
            ab1 ab1Var = (ab1) a0aVar.getValue();
            if (ab1Var != null && (psaVar = (psa) th1.H(ab1Var.a)) != null) {
                localDateNow = psaVar.j;
            }
        } else if (iOrdinal == 1) {
            ab1 ab1Var2 = (ab1) a0aVar.getValue();
            if (ab1Var2 != null && (psaVar2 = (psa) th1.A(ab1Var2.a)) != null) {
                localDateNow = psaVar2.j;
            }
        } else if (iOrdinal == 2) {
            localDateNow = LocalDate.now();
        } else {
            if (iOrdinal != 3) {
                u.b();
                return null;
            }
            localDateNow = this.c;
        }
        if (localDateNow == null) {
            localDateNow = LocalDate.now();
            localDateNow.getClass();
        }
        this.c = localDateNow;
        this.d = c13Var == c13.w ? this.d : c13Var.toString();
        String string = this.c.toString();
        string.getClass();
        return new bb1(string, this.d);
    }

    @Override // defpackage.lab
    public final j74 c() {
        return this.b;
    }
}
