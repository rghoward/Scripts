package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bw9 implements Comparable<bw9> {
    public a B;
    public boolean t;
    public float x;
    public int u = -1;
    public int v = -1;
    public int w = 0;
    public boolean y = false;
    public final float[] z = new float[9];
    public final float[] A = new float[9];
    public q30[] C = new q30[16];
    public int D = 0;
    public int E = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final /* synthetic */ a[] x;

        static {
            a aVar = new a("UNRESTRICTED", 0);
            t = aVar;
            a aVar2 = new a("CONSTANT", 1);
            a aVar3 = new a("SLACK", 2);
            u = aVar3;
            a aVar4 = new a("ERROR", 3);
            v = aVar4;
            a aVar5 = new a("UNKNOWN", 4);
            w = aVar5;
            x = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) x.clone();
        }
    }

    public bw9(a aVar) {
        this.B = aVar;
    }

    public final void a(q30 q30Var) {
        int i = 0;
        while (true) {
            int i2 = this.D;
            q30[] q30VarArr = this.C;
            if (i >= i2) {
                if (i2 >= q30VarArr.length) {
                    this.C = (q30[]) Arrays.copyOf(q30VarArr, q30VarArr.length * 2);
                }
                q30[] q30VarArr2 = this.C;
                int i3 = this.D;
                q30VarArr2[i3] = q30Var;
                this.D = i3 + 1;
                return;
            }
            if (q30VarArr[i] == q30Var) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(bw9 bw9Var) {
        return this.u - bw9Var.u;
    }

    public final void e(q30 q30Var) {
        int i = this.D;
        int i2 = 0;
        while (i2 < i) {
            if (this.C[i2] == q30Var) {
                while (i2 < i - 1) {
                    q30[] q30VarArr = this.C;
                    int i3 = i2 + 1;
                    q30VarArr[i2] = q30VarArr[i3];
                    i2 = i3;
                }
                this.D--;
                return;
            }
            i2++;
        }
    }

    public final void f() {
        this.B = a.w;
        this.w = 0;
        this.u = -1;
        this.v = -1;
        this.x = 0.0f;
        this.y = false;
        int i = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            this.C[i2] = null;
        }
        this.D = 0;
        this.E = 0;
        this.t = false;
        Arrays.fill(this.A, 0.0f);
    }

    public final void g(j86 j86Var, float f) {
        this.x = f;
        this.y = true;
        int i = this.D;
        this.v = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.C[i2].h(j86Var, this, false);
        }
        this.D = 0;
    }

    public final void h(j86 j86Var, q30 q30Var) {
        int i = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            this.C[i2].i(j86Var, q30Var, false);
        }
        this.D = 0;
    }

    public final String toString() {
        return BuildConfig.FLAVOR + this.u;
    }
}
