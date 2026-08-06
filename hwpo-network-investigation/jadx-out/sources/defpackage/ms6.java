package defpackage;

import androidx.media3.exoplayer.g;
import com.intercom.twig.BuildConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ms6 implements up6, up6.a {
    public gsa A;
    public up6[] B;
    public wt1 C;
    public final up6[] t;
    public final boolean[] u;
    public final IdentityHashMap<xz8, Integer> v;
    public final nq2 w;
    public final ArrayList<up6> x = new ArrayList<>();
    public final HashMap<esa, esa> y = new HashMap<>();
    public up6.a z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends xd4 {
        public final esa b;

        public a(fq3 fq3Var, esa esaVar) {
            super(fq3Var);
            this.b = esaVar;
        }

        @Override // defpackage.jsa
        public final esa a() {
            return this.b;
        }

        @Override // defpackage.jsa
        public final id4 b(int i) {
            return this.b.d[this.a.c(i)];
        }

        @Override // defpackage.xd4
        public final boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // defpackage.fq3
        public final id4 r() {
            return this.b.d[this.a.q()];
        }
    }

    public ms6(nq2 nq2Var, long[] jArr, up6... up6VarArr) {
        this.w = nq2Var;
        this.t = up6VarArr;
        nq2Var.getClass();
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        this.C = new wt1(ul8Var, ul8Var);
        this.v = new IdentityHashMap<>();
        this.B = new up6[0];
        this.u = new boolean[up6VarArr.length];
        for (int i = 0; i < up6VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.u[i] = true;
                this.t[i] = new wma(up6VarArr[i], j);
            }
        }
    }

    @Override // up6.a
    public final void a(up6 up6Var) {
        ArrayList<up6> arrayList = this.x;
        arrayList.remove(up6Var);
        if (arrayList.isEmpty()) {
            up6[] up6VarArr = this.t;
            int i = 0;
            for (up6 up6Var2 : up6VarArr) {
                i += up6Var2.n().a;
            }
            esa[] esaVarArr = new esa[i];
            int i2 = 0;
            for (int i3 = 0; i3 < up6VarArr.length; i3++) {
                gsa gsaVarN = up6VarArr[i3].n();
                int i4 = gsaVarN.a;
                int i5 = 0;
                while (i5 < i4) {
                    esa esaVarA = gsaVarN.a(i5);
                    int i6 = esaVarA.a;
                    id4[] id4VarArr = new id4[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        id4 id4Var = esaVarA.d[i7];
                        id4.a aVarA = id4Var.a();
                        String str = id4Var.m;
                        up6[] up6VarArr2 = up6VarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = id4Var.a;
                        if (str2 == null) {
                            str2 = BuildConfig.FLAVOR;
                        }
                        sb.append(str2);
                        aVarA.a = sb.toString();
                        if (str != null) {
                            aVarA.l = i3 + ":" + str;
                        }
                        id4VarArr[i7] = new id4(aVarA);
                        i7++;
                        up6VarArr = up6VarArr2;
                    }
                    up6[] up6VarArr3 = up6VarArr;
                    esa esaVar = new esa(i3 + ":" + esaVarA.b, id4VarArr);
                    this.y.put(esaVar, esaVarA);
                    esaVarArr[i2] = esaVar;
                    i5++;
                    i2++;
                    up6VarArr = up6VarArr3;
                }
            }
            this.A = new gsa(esaVarArr);
            up6.a aVar = this.z;
            aVar.getClass();
            aVar.a(this);
        }
    }

    @Override // bd9.a
    public final void b(bd9 bd9Var) {
        up6.a aVar = this.z;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        ArrayList<up6> arrayList = this.x;
        if (arrayList.isEmpty()) {
            return this.C.c(gVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).c(gVar);
        }
        return false;
    }

    @Override // defpackage.up6
    public final long d(fq3[] fq3VarArr, boolean[] zArr, xz8[] xz8VarArr, boolean[] zArr2, long j) {
        IdentityHashMap<xz8, Integer> identityHashMap;
        int[] iArr = new int[fq3VarArr.length];
        int[] iArr2 = new int[fq3VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = fq3VarArr.length;
            identityHashMap = this.v;
            if (i2 >= length) {
                break;
            }
            xz8 xz8Var = xz8VarArr[i2];
            Integer num = xz8Var == null ? null : identityHashMap.get(xz8Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            fq3 fq3Var = fq3VarArr[i2];
            if (fq3Var != null) {
                String str = fq3Var.a().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = fq3VarArr.length;
        xz8[] xz8VarArr2 = new xz8[length2];
        xz8[] xz8VarArr3 = new xz8[fq3VarArr.length];
        fq3[] fq3VarArr2 = new fq3[fq3VarArr.length];
        up6[] up6VarArr = this.t;
        ArrayList arrayList = new ArrayList(up6VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < up6VarArr.length) {
            int i4 = i;
            while (i4 < fq3VarArr.length) {
                xz8VarArr3[i4] = iArr[i4] == i3 ? xz8VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    fq3 fq3Var2 = fq3VarArr[i4];
                    fq3Var2.getClass();
                    esa esaVar = this.y.get(fq3Var2.a());
                    esaVar.getClass();
                    fq3VarArr2[i4] = new a(fq3Var2, esaVar);
                } else {
                    fq3VarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            up6[] up6VarArr2 = up6VarArr;
            int i5 = i3;
            long jD = up6VarArr2[i3].d(fq3VarArr2, zArr, xz8VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jD;
            } else if (jD != j2) {
                aa0.c("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < fq3VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    xz8 xz8Var2 = xz8VarArr3[i6];
                    xz8Var2.getClass();
                    xz8VarArr2[i6] = xz8VarArr3[i6];
                    identityHashMap.put(xz8Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    xl7.r(xz8VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(up6VarArr2[i5]);
            }
            i3 = i5 + 1;
            up6VarArr = up6VarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(xz8VarArr2, i7, xz8VarArr, i7, length2);
        this.B = (up6[]) arrayList.toArray(new up6[i7]);
        AbstractList abstractListB = jb6.b(arrayList, new ls6());
        this.w.getClass();
        this.C = new wt1(arrayList, abstractListB);
        return j2;
    }

    @Override // defpackage.bd9
    public final long e() {
        return this.C.e();
    }

    @Override // defpackage.up6
    public final long f(long j, u89 u89Var) {
        up6[] up6VarArr = this.B;
        return (up6VarArr.length > 0 ? up6VarArr[0] : this.t[0]).f(j, u89Var);
    }

    @Override // defpackage.up6
    public final void g() {
        for (up6 up6Var : this.t) {
            up6Var.g();
        }
    }

    @Override // defpackage.up6
    public final long i(long j) {
        long jI = this.B[0].i(j);
        int i = 1;
        while (true) {
            up6[] up6VarArr = this.B;
            if (i >= up6VarArr.length) {
                return jI;
            }
            if (up6VarArr[i].i(jI) != jI) {
                aa0.c("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.bd9
    public final boolean j() {
        return this.C.j();
    }

    @Override // defpackage.up6
    public final long l() {
        long j;
        up6 up6Var;
        up6[] up6VarArr = this.B;
        int length = up6VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            up6 up6Var2 = up6VarArr[i];
            long jL = up6Var2.l();
            if (jL == j2) {
                j = j2;
                if (j3 != j && up6Var2.i(j3) != j3) {
                    aa0.c("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                up6[] up6VarArr2 = this.B;
                int length2 = up6VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (up6Var = up6VarArr2[i2]) == up6Var2) {
                        break;
                    }
                    if (up6Var.i(jL) != jL) {
                        aa0.c("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jL;
            } else {
                j = j2;
                if (jL != j3) {
                    aa0.c("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.up6
    public final void m(up6.a aVar, long j) {
        this.z = aVar;
        ArrayList<up6> arrayList = this.x;
        up6[] up6VarArr = this.t;
        Collections.addAll(arrayList, up6VarArr);
        for (up6 up6Var : up6VarArr) {
            up6Var.m(this, j);
        }
    }

    @Override // defpackage.up6
    public final gsa n() {
        gsa gsaVar = this.A;
        gsaVar.getClass();
        return gsaVar;
    }

    @Override // defpackage.bd9
    public final long q() {
        return this.C.q();
    }

    @Override // defpackage.up6
    public final void s(long j, boolean z) {
        for (up6 up6Var : this.B) {
            up6Var.s(j, z);
        }
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        this.C.v(j);
    }
}
