package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zz8 extends g5b<a, g2b> {
    public final kd8 a;
    public final dh9 b;
    public final ih9 c;
    public final de9 d;
    public final wc8 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;
        public final bd8 d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final ArrayList h;
        public final boolean i;

        public a(int i, int i2, String str, bd8 bd8Var, boolean z, boolean z2, boolean z3, ArrayList arrayList, boolean z4) {
            str.getClass();
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = bd8Var;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = arrayList;
            this.i = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && xj5.a(this.c, aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h.equals(aVar.h) && this.i == aVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + ((this.h.hashCode() + uo2.a(uo2.a(uo2.a((this.d.hashCode() + ru3.c(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31, this.e, 31), this.f, 31), this.g, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbB = u43.b("Params(programId=", ", sectionId=", ", performanceNote=", this.a, this.b);
            sbB.append(this.c);
            sbB.append(", score=");
            sbB.append(this.d);
            sbB.append(", shouldUpdateScore=");
            e4.a(sbB, this.e, ", shouldUpdatePerformance=", this.f, ", hadInitScoreHadValue=");
            sbB.append(this.g);
            sbB.append(", attachmentIds=");
            sbB.append(this.h);
            sbB.append(", shouldClearAttachments=");
            return fz.c(sbB, this.i, ")");
        }
    }

    public zz8(kd8 kd8Var, dh9 dh9Var, ih9 ih9Var, de9 de9Var, wc8 wc8Var) {
        kd8Var.getClass();
        dh9Var.getClass();
        ih9Var.getClass();
        de9Var.getClass();
        this.a = kd8Var;
        this.b = dh9Var;
        this.c = ih9Var;
        this.d = de9Var;
        this.e = wc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0356  */
    /* JADX WARN: Code duplicated, block: B:184:0x035b A[PHI: r1 r4 r5 r6 r9
      0x035b: PHI (r1v4 int) = (r1v3 int), (r1v12 int) binds: [B:182:0x0358, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r4v5 v72) = (r4v4 v72), (r4v14 v72) binds: [B:182:0x0358, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r5v38 bd8) = (r5v37 bd8), (r5v43 bd8) binds: [B:182:0x0358, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r6v42 vc8) = (r6v41 vc8), (r6v49 vc8) binds: [B:182:0x0358, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r9v15 zz8$a) = (r9v14 zz8$a), (r9v19 zz8$a) binds: [B:182:0x0358, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x035f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0382  */
    /* JADX WARN: Code duplicated, block: B:192:0x0387  */
    /* JADX WARN: Code duplicated, block: B:194:0x0389 A[PHI: r1 r4 r5 r9
      0x0389: PHI (r1v5 int) = (r1v4 int), (r1v8 int) binds: [B:185:0x035d, B:193:0x0388] A[DONT_GENERATE, DONT_INLINE]
      0x0389: PHI (r4v7 v72) = (r4v5 v72), (r4v8 v72) binds: [B:185:0x035d, B:193:0x0388] A[DONT_GENERATE, DONT_INLINE]
      0x0389: PHI (r5v39 bd8) = (r5v38 bd8), (r5v40 bd8) binds: [B:185:0x035d, B:193:0x0388] A[DONT_GENERATE, DONT_INLINE]
      0x0389: PHI (r9v16 zz8$a) = (r9v15 zz8$a), (r9v17 zz8$a) binds: [B:185:0x035d, B:193:0x0388] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x038d  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03b2, code lost:
    
        if (r0 == r4) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zz8.a r32, defpackage.u02 r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.a(zz8$a, u02):java.lang.Object");
    }
}
