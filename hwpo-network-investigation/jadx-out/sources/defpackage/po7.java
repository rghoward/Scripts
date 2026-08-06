package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class po7<Key, Value> {
    public final oh4<r02<? super zr7<Key, Value>>, Object> a;
    public final qr7 b;
    public final sw1<Boolean> c = new sw1<>(0);
    public final sw1<g2b> d = new sw1<>(0);
    public final r54<sr7<Value>> e = fp9.a(new qo7(null, this));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<Key, Value> {
        public final uo7<Key, Value> a;
        public final as7<Key, Value> b;
        public final gl5 c;

        public a(uo7 uo7Var, as7 as7Var, gl5 gl5Var) {
            this.a = uo7Var;
            this.b = as7Var;
            this.c = gl5Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b<Key, Value> implements sy4 {
        public final uo7<Key, Value> a;

        public b(uo7 uo7Var) {
            this.a = uo7Var;
        }

        @Override // defpackage.sy4
        public final void a(hjb hjbVar) {
            ry4 ry4Var = this.a.e;
            ry4Var.getClass();
            ry4.b bVar = ry4Var.a;
            hjb.a aVar = hjbVar instanceof hjb.a ? (hjb.a) hjbVar : null;
            synchronized (bVar.d) {
                if (aVar != null) {
                    try {
                        bVar.c = aVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ry4.a aVar2 = bVar.a;
                ry4.a aVar3 = bVar.b;
                aVar2.getClass();
                aVar3.getClass();
                if (e9.b(hjbVar, aVar2.a, wb6.u)) {
                    aVar2.a(hjbVar);
                }
                if (e9.b(hjbVar, aVar3.a, wb6.v)) {
                    aVar3.a(hjbVar);
                }
                g2b g2bVar = g2b.a;
                g2b g2bVar2 = g2b.a;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements n1b {
        public final sw1<g2b> a;
        public final /* synthetic */ po7<Key, Value> b;

        public c(po7 po7Var, sw1<g2b> sw1Var) {
            sw1Var.getClass();
            this.b = po7Var;
            this.a = sw1Var;
        }

        @Override // defpackage.n1b
        public final void a() {
            this.b.c.a(Boolean.TRUE);
        }

        @Override // defpackage.n1b
        public final void c() {
            this.a.a(g2b.a);
        }
    }

    public po7(oh4 oh4Var, qr7 qr7Var) {
        this.a = oh4Var;
        this.b = qr7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(po7 po7Var, zr7 zr7Var, u02 u02Var) {
        ro7 ro7Var;
        zr7 zr7Var2;
        if (u02Var instanceof ro7) {
            ro7Var = (ro7) u02Var;
            int i = ro7Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro7Var.w = i - Integer.MIN_VALUE;
            } else {
                ro7Var = new ro7(po7Var, u02Var);
            }
        } else {
            ro7Var = new ro7(po7Var, u02Var);
        }
        Object objInvoke = ro7Var.u;
        int i2 = ro7Var.w;
        if (i2 == 0) {
            dv8.b(objInvoke);
            oh4<r02<? super zr7<Key, Value>>, Object> oh4Var = po7Var.a;
            ro7Var.t = zr7Var;
            ro7Var.w = 1;
            objInvoke = oh4Var.invoke(ro7Var);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
            zr7Var2 = zr7Var;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zr7 zr7Var3 = ro7Var.t;
            dv8.b(objInvoke);
            zr7Var2 = zr7Var3;
        }
        zr7 zr7Var4 = (zr7) objInvoke;
        if (zr7Var4 instanceof ap1) {
            ((ap1) zr7Var4).a();
        }
        if (zr7Var4 == zr7Var2) {
            aa0.c("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
            return null;
        }
        zr7Var4.registerInvalidatedCallback(new so7(0, po7Var, po7.class, "invalidate", "invalidate()V", 0));
        if (zr7Var2 != null) {
            zr7Var2.unregisterInvalidatedCallback(new to7(0, po7Var, po7.class, "invalidate", "invalidate()V", 0));
        }
        if (zr7Var2 != null) {
            zr7Var2.invalidate();
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Generated new PagingSource " + zr7Var4, null);
        }
        return zr7Var4;
    }
}
