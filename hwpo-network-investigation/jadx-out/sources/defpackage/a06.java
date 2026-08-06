package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a06<T> {
    public final r54<sr7<T>> a;
    public final h72 b;
    public final a c;
    public final dt7 d;
    public final dt7 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ur7<T> {
        public final /* synthetic */ a06<T> m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a06<T> a06Var, h72 h72Var, sr7<T> sr7Var) {
            super(h72Var, sr7Var);
            this.m = a06Var;
        }

        @Override // defpackage.ur7
        public final g2b b() {
            a06<T> a06Var = this.m;
            a06Var.d.setValue(a06Var.c.c());
            return g2b.a;
        }
    }

    public a06(r54<sr7<T>> r54Var) {
        this.a = r54Var;
        h72 h72Var = k1b.a;
        this.b = h72Var;
        a aVar = new a(this, h72Var, r54Var instanceof zl9 ? (sr7) th1.A(((zl9) r54Var).a()) : null);
        this.c = aVar;
        this.d = bl7.i(aVar.c());
        jj1 jj1Var = (jj1) aVar.k.t.getValue();
        if (jj1Var == null) {
            vb6 vb6Var = d06.a;
            jj1Var = new jj1(vb6Var.a, vb6Var.b, vb6Var.c, vb6Var, null);
        }
        this.e = bl7.i(jj1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T a(int i) {
        Object value;
        Object value2;
        a aVar = this.c;
        a0a a0aVar = aVar.j;
        do {
            value = a0aVar.getValue();
            ((Boolean) value).getClass();
        } while (!a0aVar.c(value, Boolean.TRUE));
        aVar.h = true;
        aVar.i = i;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            Log.v("Paging", "Accessing item index[" + i + ']', null);
        }
        sy4 sy4Var = aVar.b;
        if (sy4Var != null) {
            sy4Var.a(aVar.d.d(i));
        }
        mp7<T> mp7Var = aVar.d;
        if (i < 0) {
            mp7Var.getClass();
        } else if (i < mp7Var.getSize()) {
            int i2 = i - mp7Var.c;
            if (i2 >= 0 && i2 < mp7Var.b) {
                mp7Var.e(i2);
            }
            a0a a0aVar2 = aVar.j;
            do {
                value2 = a0aVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!a0aVar2.c(value2, Boolean.FALSE));
            return (T) ((qk5) this.d.getValue()).get(i);
        }
        cp2.a(mp7Var.getSize(), t43.b(i, "Index: ", ", Size: "));
        return null;
    }

    public final jj1 b() {
        return (jj1) this.e.getValue();
    }

    public final void c() {
        a aVar = this.c;
        aVar.getClass();
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Refresh signal received", null);
        }
        aVar.c.a();
    }

    public final void d() {
        a aVar = this.c;
        aVar.getClass();
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Retry signal received", null);
        }
        aVar.c.c();
    }
}
