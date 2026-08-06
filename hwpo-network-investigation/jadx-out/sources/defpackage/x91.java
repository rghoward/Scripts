package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x91 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlowKt", f = "ChannelFlow.kt", l = {221}, m = "withContextUndispatched", v = 1)
    public static final class a<T, V> extends u02 {
        public h72 t;
        public Object u;
        public h72 v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return x91.a(null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T, V> Object a(h72 h72Var, V v, Object obj, ci4<? super V, ? super r02<? super T>, ? extends Object> ci4Var, r02<? super T> r02Var) throws Throwable {
        a aVar;
        Object objC;
        Object objInvoke;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.y = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(r02Var);
            }
        } else {
            aVar = new a(r02Var);
        }
        Object obj2 = aVar.x;
        int i2 = aVar.y;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj3 = aVar.w;
            h72 h72Var2 = aVar.v;
            try {
                dv8.b(obj2);
                objC = obj3;
                h72Var = h72Var2;
                cla.a(h72Var, objC);
                return obj2;
            } catch (Throwable th) {
                objC = obj3;
                h72Var = h72Var2;
                th = th;
                cla.a(h72Var, objC);
                throw th;
            }
        }
        dv8.b(obj2);
        objC = cla.c(h72Var, obj);
        try {
            aVar.t = h72Var;
            aVar.u = v;
            aVar.v = h72Var;
            aVar.w = objC;
            aVar.y = 1;
            xy9 xy9Var = new xy9(aVar, h72Var);
            if (ci4Var == null) {
                objInvoke = th0.f(ci4Var, v, xy9Var);
            } else {
                fza.b(2, ci4Var);
                objInvoke = ci4Var.invoke(v, xy9Var);
            }
            obj2 = objInvoke;
            v72 v72Var = v72.t;
            if (obj2 == v72Var) {
                return v72Var;
            }
            cla.a(h72Var, objC);
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            cla.a(h72Var, objC);
            throw th;
        }
    }
}
