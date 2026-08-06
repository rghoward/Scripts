package defpackage;

import android.view.View;
import defpackage.t93;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t93<T extends t93<T>> implements ov.b {
    public static final c m;
    public static final d n;
    public static final e o;
    public static final f p;
    public static final g q;
    public static final a r;
    public float a;
    public float b;
    public boolean c;
    public final kk6 d;
    public final ln4 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList<i> k;
    public final ArrayList<j> l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends k {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((View) kk6Var).getAlpha();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((View) kk6Var).setAlpha(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends ln4 {
        public final /* synthetic */ a54 x;

        public b(a54 a54Var) {
            super(9);
            this.x = a54Var;
        }

        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return this.x.a;
        }

        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            this.x.a = f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends k {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((View) kk6Var).getScaleX();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((View) kk6Var).setScaleX(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends k {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((View) kk6Var).getScaleY();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((View) kk6Var).setScaleY(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends k {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((View) kk6Var).getRotation();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((View) kk6Var).setRotation(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f extends k {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((View) kk6Var).getRotationX();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((View) kk6Var).setRotationX(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g extends k {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((View) kk6Var).getRotationY();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((View) kk6Var).setRotationY(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h {
        public float a;
        public float b;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface i {
        void a(float f);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface j {
        void m(float f);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class k extends ln4 {
    }

    static {
        int i2 = 9;
        m = new c(i2);
        n = new d(i2);
        o = new e(i2);
        p = new f(i2);
        q = new g(i2);
        r = new a(i2);
    }

    public t93(kk6 kk6Var, ln4 ln4Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = kk6Var;
        this.e = ln4Var;
        if (ln4Var == o || ln4Var == p || ln4Var == q) {
            this.j = 0.1f;
            return;
        }
        if (ln4Var == r) {
            this.j = 0.00390625f;
        } else if (ln4Var == m || ln4Var == n) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }

    public static ov b() {
        ThreadLocal<ov> threadLocal = ov.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new ov(new ov.d()));
        }
        return threadLocal.get();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:32:0x010d  */
    /* JADX WARN: Code duplicated, block: B:36:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0125  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133 A[EDGE_INSN: B:47:0x0133->B:40:0x0133 BREAK  A[LOOP:0: B:34:0x0117->B:39:0x0130], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0143 A[SYNTHETIC] */
    @Override // ov.b
    public final boolean a(long j2) {
        boolean z;
        ov ovVarB;
        ArrayList<ov.b> arrayList;
        int iIndexOf;
        ArrayList<i> arrayList2;
        int size;
        long j3 = this.i;
        int i2 = 0;
        if (j3 == 0) {
            this.i = j2;
            c(this.b);
            return false;
        }
        long j4 = j2 - j3;
        this.i = j2;
        float f2 = b().g;
        long j5 = f2 == 0.0f ? 2147483647L : (long) (j4 / f2);
        qy9 qy9Var = (qy9) this;
        boolean z2 = qy9Var.u;
        float f3 = qy9Var.t;
        if (!z2) {
            ry9 ry9Var = qy9Var.s;
            float f4 = qy9Var.b;
            float f5 = qy9Var.a;
            if (f3 != Float.MAX_VALUE) {
                long j6 = j5 / 2;
                h hVarC = ry9Var.c(f4, f5, j6);
                ry9 ry9Var2 = qy9Var.s;
                ry9Var2.i = qy9Var.t;
                qy9Var.t = Float.MAX_VALUE;
                h hVarC2 = ry9Var2.c(hVarC.a, hVarC.b, j6);
                qy9Var.b = hVarC2.a;
                qy9Var.a = hVarC2.b;
            } else {
                h hVarC3 = ry9Var.c(f4, f5, j5);
                qy9Var.b = hVarC3.a;
                qy9Var.a = hVarC3.b;
            }
            float fMax = Math.max(qy9Var.b, qy9Var.h);
            qy9Var.b = fMax;
            float fMin = Math.min(fMax, qy9Var.g);
            qy9Var.b = fMin;
            float f6 = qy9Var.a;
            ry9 ry9Var3 = qy9Var.s;
            ry9Var3.getClass();
            if (Math.abs(f6) >= ry9Var3.e || Math.abs(fMin - ((float) ry9Var3.i)) >= ry9Var3.d) {
                z = false;
            } else {
                qy9Var.b = (float) qy9Var.s.i;
                qy9Var.a = 0.0f;
            }
            float fMin2 = Math.min(this.b, this.g);
            this.b = fMin2;
            float fMax2 = Math.max(fMin2, this.h);
            this.b = fMax2;
            c(fMax2);
            if (z) {
                this.f = false;
                ovVarB = b();
                ovVarB.a.remove(this);
                arrayList = ovVarB.b;
                iIndexOf = arrayList.indexOf(this);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, null);
                    ovVarB.f = true;
                }
                this.i = 0L;
                this.c = false;
                while (true) {
                    arrayList2 = this.k;
                    if (i2 < arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i2) != null) {
                        arrayList2.get(i2).a(this.b);
                    }
                    i2++;
                }
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
            }
            return z;
        }
        if (f3 != Float.MAX_VALUE) {
            qy9Var.s.i = f3;
            qy9Var.t = Float.MAX_VALUE;
        }
        qy9Var.b = (float) qy9Var.s.i;
        qy9Var.a = 0.0f;
        qy9Var.u = false;
        z = true;
        float fMin3 = Math.min(this.b, this.g);
        this.b = fMin3;
        float fMax3 = Math.max(fMin3, this.h);
        this.b = fMax3;
        c(fMax3);
        if (z) {
            this.f = false;
            ovVarB = b();
            ovVarB.a.remove(this);
            arrayList = ovVarB.b;
            iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
                ovVarB.f = true;
            }
            this.i = 0L;
            this.c = false;
            while (true) {
                arrayList2 = this.k;
                if (i2 < arrayList2.size()) {
                    break;
                    break;
                }
                if (arrayList2.get(i2) != null) {
                    arrayList2.get(i2).a(this.b);
                }
                i2++;
            }
            while (size >= 0) {
                if (arrayList2.get(size) == null) {
                    arrayList2.remove(size);
                }
            }
        }
        return z;
    }

    public final void c(float f2) {
        ArrayList<j> arrayList;
        this.e.Z0(this.d, f2);
        int i2 = 0;
        while (true) {
            arrayList = this.l;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).m(this.b);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public t93(a54 a54Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = null;
        this.e = new b(a54Var);
        this.j = 1.0f;
    }
}
