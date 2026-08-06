package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dz6 extends ec7 {
    public final zm f;
    public final zx0 g;
    public dz9 h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final a a(a aVar) {
            return new a(vf7.e(this.a, aVar.a), Math.max(this.b, aVar.b), this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return vf7.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + al.c(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) vf7.g(this.a));
            sb.append(", timeMillis=");
            sb.append(this.b);
            sb.append(", shouldApplyImmediately=");
            return pi1.a(sb, this.c, ')');
        }
    }

    public dz6(z79 z79Var, zm zmVar, l79 l79Var, tx2 tx2Var) {
        super(z79Var, l79Var, tx2Var);
        this.f = zmVar;
        this.g = da1.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0160, code lost:
    
        if (r0.invoke(r1, r10) == r2) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, yv] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, dz6$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.dz6 r19, defpackage.z79 r20, dz6.a r21, float r22, float r23, defpackage.u02 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz6.c(dz6, z79, dz6$a, float, float, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, dz6$a] */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, yv] */
    public static final Object d(dz6 dz6Var, gl8 gl8Var, dl8 dl8Var, z79 z79Var, gl8 gl8Var2, long j, u02 u02Var) throws Throwable {
        hz6 hz6Var;
        dl8 dl8Var2;
        z79 z79Var2;
        gl8 gl8Var3;
        boolean z;
        if (u02Var instanceof hz6) {
            hz6Var = (hz6) u02Var;
            int i = hz6Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz6Var.z = i - Integer.MIN_VALUE;
            } else {
                hz6Var = new hz6(u02Var);
            }
        } else {
            hz6Var = new hz6(u02Var);
        }
        Object objB = hz6Var.y;
        int i2 = hz6Var.z;
        if (i2 == 0) {
            dv8.b(objB);
            if (j < 0) {
                return Boolean.FALSE;
            }
            iz6 iz6Var = new iz6(dz6Var, null);
            hz6Var.t = dz6Var;
            hz6Var.u = gl8Var;
            hz6Var.v = dl8Var;
            hz6Var.w = z79Var;
            hz6Var.x = gl8Var2;
            hz6Var.z = 1;
            objB = yoa.b(j, iz6Var, hz6Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            dl8Var2 = dl8Var;
            z79Var2 = z79Var;
            gl8Var3 = gl8Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gl8 gl8Var4 = hz6Var.x;
            z79 z79Var3 = hz6Var.w;
            dl8Var2 = hz6Var.v;
            gl8 gl8Var5 = hz6Var.u;
            dz6 dz6Var2 = hz6Var.t;
            dv8.b(objB);
            gl8Var3 = gl8Var4;
            z79Var2 = z79Var3;
            gl8Var = gl8Var5;
            dz6Var = dz6Var2;
        }
        a aVar = (a) objB;
        if (aVar != null) {
            boolean z2 = ((a) gl8Var.t).c;
            long j2 = aVar.a;
            gl8Var.t = new a(j2, aVar.b, z2);
            dl8Var2.t = z79Var2.i(z79Var2.e(j2));
            gl8Var3.t = zv.b(0.0f, 0.0f, 30);
            r03 r03Var = dz6Var.e;
            long j3 = aVar.b;
            long j4 = aVar.a;
            ((tdb) r03Var.t).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((tdb) r03Var.u).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !y48.b(dl8Var2.t);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static a g(zx0 zx0Var) {
        a aVar = null;
        zc9 zc9VarB = xs.b(new gc7(new zx5(1, zx0Var), null));
        while (zc9VarB.hasNext()) {
            a aVarA = (a) zc9VarB.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final float e(k97 k97Var, float f) {
        z79 z79Var = this.a;
        return z79Var.g(z79Var.e(k97Var.a(z79Var.h(z79Var.d(f)))));
    }

    public final boolean f(r48 r48Var, long j) {
        long j2;
        tx2 tx2Var = this.c;
        ViewConfiguration viewConfiguration = this.f.a;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? mgb.b(viewConfiguration) : tx2Var.U0(64.0f));
        float f2 = -(i > 26 ? mgb.a(viewConfiguration) : tx2Var.U0(64.0f));
        List<a58> list = r48Var.a;
        vf7 vf7Var = new vf7(0L);
        int size = list.size();
        boolean zD = false;
        int i2 = 0;
        while (true) {
            j2 = vf7Var.a;
            if (i2 >= size) {
                break;
            }
            vf7Var = new vf7(vf7.e(j2, list.get(i2).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f)) & 4294967295L);
        z79 z79Var = this.a;
        float fI = z79Var.i(z79Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            s79 s79Var = z79Var.a;
            zD = fI > 0.0f ? s79Var.d() : s79Var.b();
        }
        if (zD) {
            return !(this.g.n(new a(jFloatToRawIntBits, ((a58) th1.y(r48Var.a)).b, false)) instanceof ga1.b);
        }
        return this.d;
    }
}
