package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yoa {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {156}, m = "withTimeoutOrNull", v = 1)
    public static final class a<T> extends u02 {
        public gl8 t;
        public /* synthetic */ Object u;
        public int v;

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.v |= Integer.MIN_VALUE;
            return yoa.b(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(xoa<U, ? super T> xoaVar, ci4<? super t72, ? super r02<? super T>, ? extends Object> ci4Var) {
        sd.g(xoaVar, new l33(bw2.c(xoaVar.y.getContext()).K(xoaVar.z, xoaVar, xoaVar.x)));
        return wx7.d(xoaVar, false, xoaVar, ci4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, xoa] */
    public static final <T> Object b(long j, ci4<? super t72, ? super r02<? super T>, ? extends Object> ci4Var, r02<? super T> r02Var) {
        a aVar;
        gl8 gl8Var;
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
            if (j > 0) {
                gl8 gl8Var2 = new gl8();
                try {
                    aVar.t = gl8Var2;
                    aVar.v = 1;
                    ?? r1 = (T) new xoa(j, aVar);
                    gl8Var2.t = r1;
                    Object objA = a(r1, ci4Var);
                    v72 v72Var = v72.t;
                    return objA == v72Var ? v72Var : objA;
                } catch (woa e) {
                    e = e;
                    gl8Var = gl8Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gl8Var = aVar.t;
        try {
            dv8.b(obj);
            return obj;
        } catch (woa e2) {
            e = e2;
        }
        if (e.t != gl8Var.t) {
            throw e;
        }
        return null;
    }
}
