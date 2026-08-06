package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l64 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ ei4 u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {113, 120, 127}, m = "collect", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public s54 w;
        public Serializable x;
        public int y;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return l64.this.collect(null, this);
        }
    }

    public l64(r54 r54Var, ei4 ei4Var) {
        this.t = r54Var;
        this.u = ei4Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) {
        a aVar;
        int i;
        int i2;
        lla llaVar;
        kz8 kz8Var;
        kz8 kz8Var2;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i3 = aVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.u = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(r02Var);
            }
        } else {
            aVar = new a(r02Var);
        }
        Object obj = aVar.t;
        int i4 = aVar.u;
        ei4 ei4Var = this.u;
        v72 v72Var = v72.t;
        if (i4 == 0) {
            dv8.b(obj);
            i = 0;
            try {
                r54 r54Var = this.t;
                aVar.w = s54Var;
                aVar.y = 0;
                aVar.u = 1;
                if (r54Var.collect(s54Var, aVar) != v72Var) {
                    i2 = 0;
                    kz8Var = new kz8(s54Var, aVar.getContext());
                    aVar.w = null;
                    aVar.x = kz8Var;
                    aVar.y = i2;
                    aVar.u = 3;
                    if (ei4Var.invoke(kz8Var, null, aVar) != v72Var) {
                        kz8Var2 = kz8Var;
                        kz8Var2.releaseIntercepted();
                        return g2b.a;
                    }
                }
            } catch (Throwable th) {
                th = th;
                llaVar = new lla(th);
                aVar.w = null;
                aVar.x = th;
                aVar.y = i;
                aVar.u = 2;
                if (n64.b(llaVar, ei4Var, th, aVar) == v72Var) {
                    throw th;
                }
            }
            return v72Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                Throwable th2 = (Throwable) aVar.x;
                dv8.b(obj);
                throw th2;
            }
            if (i4 != 3) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kz8Var2 = (kz8) aVar.x;
            try {
                dv8.b(obj);
                kz8Var2.releaseIntercepted();
                return g2b.a;
            } catch (Throwable th3) {
                th = th3;
                kz8Var2.releaseIntercepted();
                throw th;
            }
        }
        i2 = aVar.y;
        s54Var = aVar.w;
        try {
            dv8.b(obj);
            kz8Var = new kz8(s54Var, aVar.getContext());
            try {
                aVar.w = null;
                aVar.x = kz8Var;
                aVar.y = i2;
                aVar.u = 3;
                if (ei4Var.invoke(kz8Var, null, aVar) != v72Var) {
                    kz8Var2 = kz8Var;
                    kz8Var2.releaseIntercepted();
                    return g2b.a;
                }
            } catch (Throwable th4) {
                th = th4;
                kz8Var2 = kz8Var;
                kz8Var2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th5) {
            i = i2;
            th = th5;
            llaVar = new lla(th);
            aVar.w = null;
            aVar.x = th;
            aVar.y = i;
            aVar.u = 2;
            if (n64.b(llaVar, ei4Var, th, aVar) == v72Var) {
                throw th;
            }
        }
        return v72Var;
    }
}
