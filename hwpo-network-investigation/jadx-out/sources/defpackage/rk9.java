package defpackage;

import android.util.Log;
import io.ably.lib.transport.Defaults;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rk9 implements pk9 {
    public final h72 a;
    public final moa b;
    public final pf2<ee9> c;
    public final AtomicReference<ee9> d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        /* JADX INFO: renamed from: rk9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public /* synthetic */ class C0231a implements s54, mi4 {
            public final /* synthetic */ AtomicReference<ee9> t;

            public C0231a(AtomicReference<ee9> atomicReference) {
                this.t = atomicReference;
            }

            @Override // defpackage.mi4
            public final di4<?> b() {
                return new wa(2, this.t, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // defpackage.s54
            public final Object emit(Object obj, r02 r02Var) {
                this.t.set((ee9) obj);
                return g2b.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof s54) && (obj instanceof mi4)) {
                    return xj5.a(b(), ((mi4) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rk9.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                rk9 rk9Var = rk9.this;
                r54<ee9> data = rk9Var.c.getData();
                C0231a c0231a = new C0231a(rk9Var.d);
                this.t = 1;
                Object objCollect = data.collect(c0231a, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "invokeSuspend")
    public static final class b extends p6a implements ci4<t72, r02<? super ee9>, Object> {
        public int t;

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rk9.this.new b(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super ee9> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            r54<ee9> data = rk9.this.c.getData();
            this.t = 1;
            Object objK = yk2.k(data, this);
            v72 v72Var = v72.t;
            return objK == v72Var ? v72Var : objK;
        }
    }

    public rk9(@ci0 h72 h72Var, moa moaVar, pf2<ee9> pf2Var) {
        h72Var.getClass();
        moaVar.getClass();
        pf2Var.getClass();
        this.a = h72Var;
        this.b = moaVar;
        this.c = pf2Var;
        this.d = new AtomicReference<>();
        oy0.d(u72.a(h72Var), null, null, new a(null), 3);
    }

    @Override // defpackage.pk9
    public final Double a() {
        return f().b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pk9
    public final Object b(ee9 ee9Var, u02 u02Var) throws Throwable {
        sk9 sk9Var;
        if (u02Var instanceof sk9) {
            sk9Var = (sk9) u02Var;
            int i = sk9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk9Var.v = i - Integer.MIN_VALUE;
            } else {
                sk9Var = new sk9(this, u02Var);
            }
        } else {
            sk9Var = new sk9(this, u02Var);
        }
        Object obj = sk9Var.t;
        int i2 = sk9Var.v;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                pf2<ee9> pf2Var = this.c;
                tk9 tk9Var = new tk9(ee9Var, null);
                sk9Var.v = 1;
                Object objA = pf2Var.a(tk9Var, sk9Var);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return g2b.a;
    }

    @Override // defpackage.pk9
    public final Integer c() {
        return f().c;
    }

    @Override // defpackage.pk9
    public final boolean d() {
        Long l = f().e;
        Integer num = f().d;
        return l == null || num == null || this.b.a().c - l.longValue() >= ((long) num.intValue());
    }

    @Override // defpackage.pk9
    public final Boolean e() {
        return f().a;
    }

    public final ee9 f() throws Throwable {
        AtomicReference<ee9> atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objF = oy0.f(ff3.t, new b(null));
            while (!atomicReference.compareAndSet(null, (ee9) objF) && atomicReference.get() == null) {
            }
        }
        ee9 ee9Var = atomicReference.get();
        ee9Var.getClass();
        return ee9Var;
    }
}
