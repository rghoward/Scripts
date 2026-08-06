package defpackage;

import android.os.StatFs;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mz9 extends g5b<a, g2b> {
    public final xy3 a;
    public final qw3 b;
    public final bu8 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final String b;

        public a(long j, String str) {
            str.getClass();
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && xj5.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Params(fileSizeInBytes=" + this.a + ", sourceUrl=" + this.b + ")";
        }
    }

    public mz9(xy3 xy3Var, qw3 qw3Var, bu8 bu8Var) {
        xy3Var.getClass();
        qw3Var.getClass();
        bu8Var.getClass();
        this.a = xy3Var;
        this.b = qw3Var;
        this.c = bu8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        nz9 nz9Var;
        if (u02Var instanceof nz9) {
            nz9Var = (nz9) u02Var;
            int i = nz9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nz9Var.v = i - Integer.MIN_VALUE;
            } else {
                nz9Var = new nz9(this, u02Var);
            }
        } else {
            nz9Var = new nz9(this, u02Var);
        }
        Object obj = nz9Var.t;
        int i2 = nz9Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            long j = aVar.a;
            xy3 xy3Var = this.a;
            xy3Var.getClass();
            StatFs statFs = new StatFs(xy3Var.b().getPath());
            if (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() <= j) {
                aa0.c(this.c.b(R.string.no_free_space, new Object[0]));
                return null;
            }
            String str = aVar.b;
            nz9Var.v = 1;
            Object objC = this.b.c(str, nz9Var);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
