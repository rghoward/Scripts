package defpackage;

import io.intercom.android.sdk.models.carousel.BlockAlignment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yd3 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.base.domain.entity.EitherKt", f = "Either.kt", l = {101}, m = "doOnError", v = 2)
    public static final class a<R> extends u02 {
        public xd3.a t;
        public /* synthetic */ Object u;
        public int v;

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.v |= Integer.MIN_VALUE;
            return yd3.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.base.domain.entity.EitherKt", f = "Either.kt", l = {93}, m = "doOnSuccess", v = 2)
    public static final class b<R> extends u02 {
        public xd3.b t;
        public /* synthetic */ Object u;
        public int v;

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.v |= Integer.MIN_VALUE;
            return yd3.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c<T> extends pi4 implements oh4<T, xd3.b<? extends T>> {
        public c(Object obj) {
            super(1, obj, xd3.class, BlockAlignment.RIGHT, "right(Ljava/lang/Object;)Lcom/hwpo_training_app/base/domain/entity/Either$Right;", 0);
        }

        @Override // defpackage.oh4
        public final Object invoke(Object obj) {
            ((xd3) this.receiver).getClass();
            return new xd3.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object a(xd3<? extends Exception, ? extends R> xd3Var, ci4<? super Exception, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super xd3<? extends Exception, ? extends R>> r02Var) {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(r02Var);
            }
        } else {
            aVar = new a(r02Var);
        }
        Object obj = aVar.u;
        int i2 = aVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            if (!(xd3Var instanceof xd3.a)) {
                if (xd3Var instanceof xd3.b) {
                    return new xd3.b(((xd3.b) xd3Var).a);
                }
                u.b();
                return null;
            }
            xd3.a aVar2 = (xd3.a) xd3Var;
            Object obj2 = aVar2.a;
            aVar.t = aVar2;
            aVar.v = 1;
            Object objInvoke = ci4Var.invoke(obj2, aVar);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xd3Var = aVar.t;
            dv8.b(obj);
        }
        return new xd3.a(((xd3.a) xd3Var).a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object b(xd3<? extends Exception, ? extends R> xd3Var, ci4<? super R, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super xd3<? extends Exception, ? extends R>> r02Var) {
        b bVar;
        if (r02Var instanceof b) {
            bVar = (b) r02Var;
            int i = bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.v = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(r02Var);
            }
        } else {
            bVar = new b(r02Var);
        }
        Object obj = bVar.u;
        int i2 = bVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            if (xd3Var instanceof xd3.a) {
                return new xd3.a(((xd3.a) xd3Var).a);
            }
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            xd3.b bVar2 = (xd3.b) xd3Var;
            R r = bVar2.a;
            bVar.t = bVar2;
            bVar.v = 1;
            Object objInvoke = ci4Var.invoke(r, bVar);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xd3Var = bVar.t;
            dv8.b(obj);
        }
        return new xd3.b(((xd3.b) xd3Var).a);
    }

    public static final void c(xd3 xd3Var, oh4 oh4Var) {
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            oh4Var.invoke(((xd3.a) xd3Var).a);
        } else if (xd3Var instanceof xd3.b) {
            g2b g2bVar = g2b.a;
        } else {
            u.b();
        }
    }

    public static Object d(xd3 xd3Var, ci4 ci4Var, u02 u02Var) {
        et2 et2Var = i23.a;
        return oy0.g(wr2.v, new zd3(xd3Var, ci4Var, null), u02Var);
    }

    public static final Object e(xd3 xd3Var, Boolean bool) {
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            return bool;
        }
        if (xd3Var instanceof xd3.b) {
            return ((xd3.b) xd3Var).a;
        }
        u.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> R f(xd3<? extends Exception, ? extends R> xd3Var) throws Throwable {
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            throw ((Throwable) ((xd3.a) xd3Var).a);
        }
        if (xd3Var instanceof xd3.b) {
            return ((xd3.b) xd3Var).a;
        }
        u.b();
        return null;
    }

    public static final <T, L, R> xd3<L, T> g(xd3<? extends L, ? extends R> xd3Var, oh4<? super R, ? extends T> oh4Var) {
        xd3Var.getClass();
        c cVar = new c(xd3Var);
        if (xd3Var instanceof xd3.a) {
            return new xd3.a(((xd3.a) xd3Var).a);
        }
        if (xd3Var instanceof xd3.b) {
            return (xd3) cVar.invoke(oh4Var.invoke(((xd3.b) xd3Var).a));
        }
        u.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(xd3 xd3Var, oh4 oh4Var) {
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            rma.a.b((Throwable) ((xd3.a) xd3Var).a);
            g2b g2bVar = g2b.a;
        } else if (xd3Var instanceof xd3.b) {
            oh4Var.invoke(((xd3.b) xd3Var).a);
        } else {
            u.b();
        }
    }
}
