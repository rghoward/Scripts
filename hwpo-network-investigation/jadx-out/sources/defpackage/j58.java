package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j58 implements f58 {
    public k58 t;
    public cq8 u;
    public boolean v;
    public final b w = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final /* synthetic */ a[] w;

        static {
            a aVar = new a("Unknown", 0);
            t = aVar;
            a aVar2 = new a("Dispatching", 1);
            u = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            v = aVar3;
            w = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends l4c {
        public a b;
        public r48 c;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends wp5 implements oh4<MotionEvent, g2b> {
            public final /* synthetic */ j58 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j58 j58Var) {
                super(1);
                this.v = j58Var;
            }

            @Override // defpackage.oh4
            public final g2b invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                j58 j58Var = this.v;
                if (actionMasked == 0) {
                    b.this.b = ((Boolean) ((k58) j58Var.a()).invoke(motionEvent2)).booleanValue() ? a.u : a.v;
                } else {
                    ((k58) j58Var.a()).invoke(motionEvent2);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: renamed from: j58$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0182b extends wp5 implements oh4<MotionEvent, g2b> {
            public final /* synthetic */ j58 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182b(j58 j58Var) {
                super(1);
                this.u = j58Var;
            }

            @Override // defpackage.oh4
            public final g2b invoke(MotionEvent motionEvent) {
                ((k58) this.u.a()).invoke(motionEvent);
                return g2b.a;
            }
        }

        public b() {
            super((short) 0);
            this.b = a.t;
        }

        public final void u(r48 r48Var, boolean z) {
            List<a58> list = r48Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).b()) {
                    v(r48Var);
                    return;
                }
            }
            qq5 qq5Var = (qq5) this.a;
            if (qq5Var == null) {
                aa0.c("layoutCoordinates not set");
                return;
            }
            long jA0 = qq5Var.a0(0L);
            j58 j58Var = j58.this;
            l58.b(r48Var, jA0, new a(j58Var), false);
            if (this.b == a.u) {
                if (z) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).a();
                    }
                }
                ij5 ij5Var = r48Var.b;
                if (ij5Var != null) {
                    ij5Var.c = !j58Var.v;
                }
            }
        }

        public final void v(r48 r48Var) {
            if (this.b == a.u) {
                qq5 qq5Var = (qq5) this.a;
                if (qq5Var == null) {
                    aa0.c("layoutCoordinates not set");
                    return;
                }
                l58.b(r48Var, qq5Var.a0(0L), new C0182b(j58.this), true);
            }
            this.b = a.v;
        }
    }

    @Override // defpackage.f58
    public final b U() {
        return this.w;
    }

    public final oh4<MotionEvent, Boolean> a() {
        k58 k58Var = this.t;
        if (k58Var != null) {
            return k58Var;
        }
        xj5.e("onTouchEvent");
        throw null;
    }
}
